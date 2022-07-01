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
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        long long12 = hikariConfig1.connectionTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.setMinimumPoolSize(60);
        int int15 = hikariConfig1.acquireRetries;
        int int16 = hikariConfig1.minPoolSize;
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
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
        hikariConfig1.setIdleTimeout(97L);
        long long47 = hikariConfig1.getMaxLifetime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
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
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.transactionIsolationName = "HikariPool-336";
        hikariConfig1.minPoolSize = 'a';
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        int int20 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.poolName = "HikariPool-36";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = 0;
        int int11 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionTestQuery("HikariPool-125");
        long long14 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
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
        boolean boolean25 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer26;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-48610" + "'", str23, "HikariPool-48610");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.maxPoolSize = (short) 100;
        long long10 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.poolName;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.leakDetectionThreshold = 100;
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.transactionIsolationName;
        long long23 = hikariConfig18.getIdleTimeout();
        java.lang.String str24 = hikariConfig18.getCatalog();
        java.lang.String str25 = hikariConfig18.getConnectionTestQuery();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.dataSourceClassName = "";
        java.util.Properties properties30 = hikariConfig27.dataSourceProperties;
        hikariConfig18.setDataSourceProperties(properties30);
        hikariConfig13.dataSourceProperties = properties30;
        hikariConfig1.setDataSourceProperties(properties30);
        long long34 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-48612" + "'", str10, "HikariPool-48612");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties30);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
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
        hikariConfig1.setDataSourceClassName("HikariPool-15655");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21418");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21418 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMinimumPoolSize(97);
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isAutoCommit;
        hikariConfig7.poolName = "hi!";
        java.lang.String str11 = hikariConfig7.dataSourceClassName;
        java.lang.String str12 = hikariConfig7.dataSourceClassName;
        hikariConfig7.setJdbc4ConnectionTest(false);
        int int15 = hikariConfig7.maxPoolSize;
        hikariConfig7.idleTimeout = (byte) -1;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.dataSourceClassName = "";
        hikariConfig19.setTransactionIsolation("");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.isInitializationFailFast = true;
        int int34 = hikariConfig28.acquireRetries;
        hikariConfig28.setMaxLifetime((long) (-1));
        int int37 = hikariConfig28.getTransactionIsolation();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        int int44 = hikariConfig39.getMaximumPoolSize();
        int int45 = hikariConfig39.transactionIsolation;
        java.util.Properties properties46 = hikariConfig39.dataSourceProperties;
        hikariConfig28.setDataSourceProperties(properties46);
        hikariConfig19.dataSourceProperties = properties46;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig7.dataSourceProperties = properties46;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig0.dataSourceProperties = properties46;
        hikariConfig0.setMaximumPoolSize(0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        hikariConfig1.setDataSourceClassName("HikariPool-1069");
        int int16 = hikariConfig1.minPoolSize;
        java.lang.String str17 = hikariConfig1.connectionInitSql;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        java.lang.String str24 = hikariConfig20.dataSourceClassName;
        java.lang.String str25 = hikariConfig20.dataSourceClassName;
        hikariConfig20.setJdbc4ConnectionTest(false);
        java.lang.String str28 = hikariConfig20.transactionIsolationName;
        hikariConfig20.setMaximumPoolSize((int) (short) 0);
        java.lang.String str31 = hikariConfig20.getCatalog();
        long long32 = hikariConfig20.leakDetectionThreshold;
        hikariConfig20.setUseInstrumentation(false);
        boolean boolean35 = hikariConfig20.isInitializationFailFast();
        int int36 = hikariConfig20.minPoolSize;
        hikariConfig1.addDataSourceProperty("HikariPool-17444", (java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        long long12 = hikariConfig1.maxLifetime;
        long long13 = hikariConfig1.maxLifetime;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.poolName;
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = 3;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setIdleTimeout((long) 97);
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(3L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setIdleTimeout((long) '4');
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.poolName = "HikariPool-3058";
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-48630" + "'", str6, "HikariPool-48630");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionTestQuery("HikariPool-157");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
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
        int int15 = hikariConfig1.transactionIsolation;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        java.lang.String str22 = hikariConfig17.connectionCustomizerClassName;
        hikariConfig17.setConnectionTestQuery("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        java.lang.String str26 = hikariConfig17.connectionInitSql;
        long long27 = hikariConfig17.getIdleTimeout();
        java.lang.String str28 = hikariConfig17.transactionIsolationName;
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties29);
        hikariConfig1.setConnectionInitSql("HikariPool-37606");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.minPoolSize = (-1);
        int int11 = hikariConfig1.maxPoolSize;
        int int12 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("HikariPool-2991");
        int int15 = hikariConfig1.minPoolSize;
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.isRegisterMbeans = false;
        boolean boolean25 = hikariConfig17.isRegisterMbeans();
        java.lang.String str26 = hikariConfig17.getCatalog();
        hikariConfig17.transactionIsolation = 100;
        hikariConfig17.setMaxLifetime((long) (byte) 10);
        boolean boolean31 = hikariConfig17.isInitializationFailFast;
        long long32 = hikariConfig17.connectionTimeout;
        java.lang.String str33 = hikariConfig17.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-34159", (java.lang.Object) str33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = 60;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-48221");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.catalog = "HikariPool-204";
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
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
        int int13 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        hikariConfig1.maxPoolSize = 'a';
        hikariConfig1.maxPoolSize = (byte) 0;
        int int19 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-40545");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-40545 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
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
        hikariConfig1.leakDetectionThreshold = 3L;
        hikariConfig1.acquireRetries = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
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
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.connectionTestQuery;
        long long23 = hikariConfig18.getIdleTimeout();
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
        hikariConfig18.dataSourceProperties = properties67;
        hikariConfig1.setDataSourceProperties(properties67);
        int int74 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionTestQuery = "HikariPool-13284";
        long long77 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.dataSourceClassName = "HikariPool-2405";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
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
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionTimeout = (short) 0;
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
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
        hikariConfig1.setConnectionInitSql("HikariPool-34851");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("hi!");
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionTimeout = 100;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setIdleTimeout((long) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
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
        hikariConfig1.setConnectionInitSql("HikariPool-777");
        java.lang.String str18 = hikariConfig1.catalog;
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str21 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-48674" + "'", str21, "HikariPool-48674");
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-48675" + "'", str8, "HikariPool-48675");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setCatalog("HikariPool-3081");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.minPoolSize = (byte) -1;
        hikariConfig1.maxPoolSize = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        boolean boolean2 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean3 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.setCatalog("HikariPool-27");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-48679" + "'", str1, "HikariPool-48679");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
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
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.transactionIsolation = (byte) -1;
        hikariConfig22.setConnectionTestQuery("HikariPool-14960");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.poolName = "HikariPool-1720";
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.transactionIsolation = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-48684" + "'", str10, "HikariPool-48684");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = false;
        int int9 = hikariConfig1.getMinimumPoolSize();
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.transactionIsolationName = "HikariPool-3307";
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
        java.lang.String str62 = hikariConfig14.getConnectionCustomizerClassName();
        boolean boolean63 = hikariConfig14.isInitializationFailFast();
        long long64 = hikariConfig14.maxLifetime;
        hikariConfig14.isJdbc4connectionTest = false;
        java.util.Properties properties67 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties67);
        java.lang.String str69 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
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
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64 == 35L);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.idleTimeout = (short) 0;
        java.lang.String str10 = hikariConfig0.catalog;
        hikariConfig0.setMaximumPoolSize(32);
        int int13 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
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
        hikariConfig1.setIdleTimeout(1800000L);
        hikariConfig1.maxPoolSize = 32;
        hikariConfig1.minPoolSize = 0;
        boolean boolean21 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
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
        long long12 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
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
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
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
        boolean boolean12 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
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
        javax.sql.DataSource dataSource58 = hikariConfig1.getDataSource();
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
        org.junit.Assert.assertNull(dataSource58);
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.leakDetectionThreshold = 1L;
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.transactionIsolation = 32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
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
        int int15 = hikariConfig10.maxPoolSize;
        boolean boolean16 = hikariConfig10.isInitializationFailFast();
        long long17 = hikariConfig10.getIdleTimeout();
        long long18 = hikariConfig10.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-48707" + "'", str11, "HikariPool-48707");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
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
        hikariConfig1.poolName = "HikariPool-168";
        hikariConfig1.setDataSourceClassName("HikariPool-215");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.isInitializationFailFast = true;
        int int23 = hikariConfig17.acquireRetries;
        hikariConfig17.setMaxLifetime((long) (-1));
        int int26 = hikariConfig17.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig17.connectionCustomizer = iConnectionCustomizer27;
        java.lang.String str29 = hikariConfig17.catalog;
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.dataSourceClassName = "";
        hikariConfig31.connectionTimeout = 10L;
        hikariConfig31.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        hikariConfig39.isInitializationFailFast = true;
        int int45 = hikariConfig39.acquireRetries;
        hikariConfig39.setMaxLifetime((long) (-1));
        int int48 = hikariConfig39.getTransactionIsolation();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.transactionIsolationName;
        int int55 = hikariConfig50.getMaximumPoolSize();
        int int56 = hikariConfig50.transactionIsolation;
        java.util.Properties properties57 = hikariConfig50.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties57);
        hikariConfig31.setDataSourceProperties(properties57);
        hikariConfig17.setDataSourceProperties(properties57);
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        boolean boolean63 = hikariConfig62.isAutoCommit;
        hikariConfig62.poolName = "hi!";
        java.lang.String str66 = hikariConfig62.dataSourceClassName;
        java.lang.String str67 = hikariConfig62.dataSourceClassName;
        hikariConfig62.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer70 = hikariConfig62.connectionCustomizer;
        hikariConfig62.setInitializationFailFast(true);
        int int73 = hikariConfig62.transactionIsolation;
        java.util.Properties properties74 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties74);
        hikariConfig75.dataSourceClassName = "";
        java.util.Properties properties78 = hikariConfig75.dataSourceProperties;
        hikariConfig62.setDataSourceProperties(properties78);
        hikariConfig17.setDataSourceProperties(properties78);
        hikariConfig1.dataSourceProperties = properties78;
        hikariConfig1.connectionInitSql = "HikariPool-495";
        hikariConfig1.maxPoolSize = (short) 0;
        java.lang.String str86 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60 + "'", int55 == 60);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(iConnectionCustomizer70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getAcquireRetries();
        java.lang.String str7 = hikariConfig1.connectionInitSql;
        hikariConfig1.setDataSourceClassName("HikariPool-55");
        java.lang.String str10 = hikariConfig1.catalog;
        int int11 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        int int18 = hikariConfig13.transactionIsolation;
        java.lang.String str19 = hikariConfig13.getConnectionInitSql();
        hikariConfig13.setMaxLifetime((long) (short) 1);
        java.lang.String str22 = hikariConfig13.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource23 = hikariConfig13.getDataSource();
        boolean boolean24 = hikariConfig13.isAutoCommit();
        boolean boolean25 = hikariConfig13.isRegisterMbeans();
        long long26 = hikariConfig13.getLeakDetectionThreshold();
        java.util.Properties properties27 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
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
        int int36 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.getPoolName();
        int int17 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
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
        long long33 = hikariConfig26.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
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
        javax.sql.DataSource dataSource46 = null;
        hikariConfig1.dataSource = dataSource46;
        hikariConfig1.setMinimumPoolSize(52);
        hikariConfig1.setIdleTimeout(87L);
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.setAutoCommit(true);
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
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        int int14 = hikariConfig9.transactionIsolation;
        java.lang.String str15 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setMaxLifetime((long) (short) 1);
        int int18 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.idleTimeout = (-1);
        java.lang.String str21 = hikariConfig9.catalog;
        java.util.Properties properties22 = hikariConfig9.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setMaxLifetime(32L);
        hikariConfig1.connectionTimeout = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-48731" + "'", str7, "HikariPool-48731");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
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
        hikariConfig1.transactionIsolation = (byte) 10;
        int int17 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        long long19 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties20 = hikariConfig1.dataSourceProperties;
        java.lang.String str21 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
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
        int int51 = hikariConfig1.minPoolSize;
        boolean boolean52 = hikariConfig1.isRegisterMbeans;
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.acquireRetries = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
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
        hikariConfig1.setCatalog("HikariPool-3631");
        java.lang.String str25 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
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
        hikariConfig1.poolName = "HikariPool-910";
        long long16 = hikariConfig1.getMaxLifetime();
        long long17 = hikariConfig1.getAcquireRetryDelay();
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-134");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.dataSourceClassName = "HikariPool-35758";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-1159");
        boolean boolean9 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
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
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        int int14 = hikariConfig1.transactionIsolation;
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
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
        long long25 = hikariConfig8.getMaxLifetime();
        hikariConfig8.isAutoCommit = true;
        boolean boolean28 = hikariConfig8.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str8 = hikariConfig1.poolName;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-48749" + "'", str8, "HikariPool-48749");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        hikariConfig1.minPoolSize = (short) 10;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.connectionTestQuery;
        long long17 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.lang.String str20 = hikariConfig12.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-763", (java.lang.Object) hikariConfig12);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig12.connectionCustomizer;
        hikariConfig12.connectionCustomizerClassName = "HikariPool-581";
        hikariConfig12.setConnectionCustomizerClassName("HikariPool-24355");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
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
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean25 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaxLifetime(97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-48752" + "'", str21, "HikariPool-48752");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
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
        hikariConfig1.isAutoCommit = false;
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
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
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.leakDetectionThreshold = 100;
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.maxPoolSize = (short) -1;
        hikariConfig13.setUseInstrumentation(true);
        java.lang.String str22 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.isRegisterMbeans = false;
        int int25 = hikariConfig13.getAcquireRetries();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isAutoCommit;
        hikariConfig27.poolName = "hi!";
        java.lang.String str31 = hikariConfig27.dataSourceClassName;
        java.lang.String str32 = hikariConfig27.dataSourceClassName;
        hikariConfig27.setJdbc4ConnectionTest(false);
        int int35 = hikariConfig27.maxPoolSize;
        hikariConfig27.setIdleTimeout(52L);
        java.lang.String str38 = hikariConfig27.connectionCustomizerClassName;
        hikariConfig27.connectionTimeout = 87;
        java.util.Properties properties41 = hikariConfig27.getDataSourceProperties();
        hikariConfig13.dataSourceProperties = properties41;
        hikariConfig1.setDataSourceProperties(properties41);
        boolean boolean44 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
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
        int int16 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
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
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig64.setJdbc4ConnectionTest(true);
        java.util.Properties properties67 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        boolean boolean69 = hikariConfig68.isAutoCommit;
        hikariConfig68.poolName = "hi!";
        hikariConfig68.setTransactionIsolation("hi!");
        long long74 = hikariConfig68.connectionTimeout;
        java.lang.String str75 = hikariConfig68.getPoolName();
        boolean boolean76 = hikariConfig68.isRegisterMbeans;
        boolean boolean77 = hikariConfig68.isRegisterMbeans;
        java.lang.String str78 = hikariConfig68.dataSourceClassName;
        boolean boolean79 = hikariConfig68.isRegisterMbeans();
        java.util.Properties properties80 = hikariConfig68.dataSourceProperties;
        hikariConfig64.dataSourceProperties = properties80;
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10L + "'", long74 == 10L);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(properties80);
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.minPoolSize = (byte) -1;
        hikariConfig1.isInitializationFailFast = false;
        int int15 = hikariConfig1.maxPoolSize;
        java.lang.String str16 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-48776" + "'", str16, "HikariPool-48776");
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-597");
        int int13 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
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
        hikariConfig1.dataSourceClassName = "HikariPool-851";
        hikariConfig1.maxLifetime = (short) 1;
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
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1506");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1506 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setIdleTimeout((long) '4');
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.poolName = "HikariPool-3058";
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-48786" + "'", str6, "HikariPool-48786");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.minPoolSize;
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-523";
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
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
        hikariConfig1.idleTimeout = 87;
        int int19 = hikariConfig1.getAcquireIncrement();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.leakDetectionThreshold = ' ';
        hikariConfig1.maxLifetime = (short) 100;
        long long25 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 87L + "'", long25 == 87L);
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
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
        hikariConfig1.setCatalog("HikariPool-222");
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        int int17 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        int int19 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-222" + "'", str15, "HikariPool-222");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(false);
        long long17 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
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
        hikariConfig43.connectionTimeout = 3L;
        long long48 = hikariConfig43.maxLifetime;
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
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionTestQuery = "HikariPool-10121";
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean13 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
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
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxPoolSize = 32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
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
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.setConnectionTestQuery("HikariPool-45605");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionInitSql = "HikariPool-69";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-719");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
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
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-48802" + "'", str1, "HikariPool-48802");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
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
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        int int39 = hikariConfig38.getTransactionIsolation();
        hikariConfig38.setRegisterMbeans(false);
        java.lang.String str42 = hikariConfig38.transactionIsolationName;
        hikariConfig38.setRegisterMbeans(false);
        java.lang.String str45 = hikariConfig38.getDataSourceClassName();
        hikariConfig38.transactionIsolation = (short) 1;
        boolean boolean48 = hikariConfig38.isJdbc4connectionTest;
        java.lang.String str49 = hikariConfig38.poolName;
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        int int52 = hikariConfig51.getTransactionIsolation();
        hikariConfig51.setRegisterMbeans(false);
        hikariConfig51.dataSourceClassName = "";
        hikariConfig51.setTransactionIsolation("");
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        int int61 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setRegisterMbeans(false);
        hikariConfig60.isInitializationFailFast = true;
        int int66 = hikariConfig60.acquireRetries;
        hikariConfig60.setMaxLifetime((long) (-1));
        int int69 = hikariConfig60.getTransactionIsolation();
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        int int72 = hikariConfig71.getTransactionIsolation();
        hikariConfig71.setRegisterMbeans(false);
        java.lang.String str75 = hikariConfig71.transactionIsolationName;
        int int76 = hikariConfig71.getMaximumPoolSize();
        int int77 = hikariConfig71.transactionIsolation;
        java.util.Properties properties78 = hikariConfig71.dataSourceProperties;
        hikariConfig60.setDataSourceProperties(properties78);
        hikariConfig51.dataSourceProperties = properties78;
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties78);
        hikariConfig38.setDataSourceProperties(properties78);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties78);
        hikariConfig35.addDataSourceProperty("HikariPool-253", (java.lang.Object) hikariConfig83);
        int int85 = hikariConfig35.getTransactionIsolation();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-48808" + "'", str1, "HikariPool-48808");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-48809" + "'", str20, "HikariPool-48809");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-48813" + "'", str49, "HikariPool-48813");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 60 + "'", int76 == 60);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMaxLifetime((long) 100);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setLeakDetectionThreshold(100L);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.leakDetectionThreshold = 100;
        hikariConfig17.acquireRetries = (byte) -1;
        long long22 = hikariConfig17.getIdleTimeout();
        java.lang.String str23 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.connectionInitSql = "HikariPool-112";
        java.util.Properties properties26 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig29.setConnectionTestQuery("HikariPool-19214");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
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
        hikariConfig1.maxPoolSize = 87;
        int int22 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 87 + "'", int22 == 87);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
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
        int int17 = hikariConfig1.getTransactionIsolation();
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        int int19 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
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
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
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
        hikariConfig1.minPoolSize = 3;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        hikariConfig1.dataSourceClassName = "HikariPool-48382";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
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
        hikariConfig25.setLeakDetectionThreshold((long) (byte) 1);
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
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
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
        hikariConfig26.connectionTimeout = 35L;
        hikariConfig26.setCatalog("HikariPool-1458");
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        hikariConfig35.dataSourceClassName = "";
        hikariConfig35.isRegisterMbeans = true;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig45.leakDetectionThreshold = 100;
        hikariConfig45.setTransactionIsolation("hi!");
        int int50 = hikariConfig45.getMaximumPoolSize();
        hikariConfig35.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig45);
        int int52 = hikariConfig35.minPoolSize;
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig54.setConnectionInitSql("hi!");
        long long57 = hikariConfig54.getLeakDetectionThreshold();
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        int int60 = hikariConfig59.getTransactionIsolation();
        hikariConfig59.setRegisterMbeans(false);
        java.lang.String str63 = hikariConfig59.transactionIsolationName;
        int int64 = hikariConfig59.getMaximumPoolSize();
        int int65 = hikariConfig59.transactionIsolation;
        java.util.Properties properties66 = hikariConfig59.dataSourceProperties;
        hikariConfig54.dataSourceProperties = properties66;
        java.util.Properties properties68 = hikariConfig54.getDataSourceProperties();
        hikariConfig35.setDataSourceProperties(properties68);
        hikariConfig26.dataSourceProperties = properties68;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 60 + "'", int64 == 60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNotNull(properties68);
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2845";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-48843" + "'", str18, "HikariPool-48843");
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
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
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
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
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        long long65 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold(60L);
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
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 60L + "'", long65 == 60L);
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
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
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-490");
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-16291");
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
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
        hikariConfig1.connectionTimeout = 100L;
        hikariConfig1.setIdleTimeout((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getDataSourceClassName();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-1307";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
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
        hikariConfig1.setLeakDetectionThreshold((-1L));
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.catalog = "HikariPool-334";
        hikariConfig0.setConnectionTimeout((long) (short) 0);
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
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
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = 97L;
        java.lang.String str20 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
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
        int int34 = hikariConfig31.acquireRetries;
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        java.lang.String str36 = hikariConfig31.connectionInitSql;
        java.lang.String str37 = hikariConfig31.getConnectionTestQuery();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        java.lang.String str6 = hikariConfig0.poolName;
        hikariConfig0.dataSourceClassName = "HikariPool-25871";
        hikariConfig0.connectionInitSql = "HikariPool-92";
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-48866" + "'", str1, "HikariPool-48866");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-48866" + "'", str6, "HikariPool-48866");
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.Class<?> wildcardClass24 = properties21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
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
        hikariConfig1.setTransactionIsolation("HikariPool-2902");
        hikariConfig1.connectionInitSql = "HikariPool-38301";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
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
        hikariConfig1.setRegisterMbeans(false);
        int int17 = hikariConfig1.acquireRetries;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
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
        hikariConfig1.maxPoolSize = 'a';
        hikariConfig1.maxLifetime = 3;
        long long18 = hikariConfig1.leakDetectionThreshold;
        int int19 = hikariConfig1.transactionIsolation;
        int int20 = hikariConfig1.acquireRetries;
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties22 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionInitSql = "HikariPool-24355";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
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
        java.lang.String str16 = hikariConfig14.poolName;
        boolean boolean17 = hikariConfig14.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-48874" + "'", str16, "HikariPool-48874");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-910");
        long long18 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.transactionIsolationName;
        int int26 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.isRegisterMbeans = false;
        boolean boolean29 = hikariConfig21.isRegisterMbeans();
        long long30 = hikariConfig21.connectionTimeout;
        hikariConfig21.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource33 = hikariConfig21.getDataSource();
        long long34 = hikariConfig21.getIdleTimeout();
        int int35 = hikariConfig21.transactionIsolation;
        hikariConfig21.isAutoCommit = true;
        hikariConfig21.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig21.maxPoolSize = (short) 1;
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.leakDetectionThreshold = 100;
        boolean boolean46 = hikariConfig43.isJdbc4connectionTest;
        long long47 = hikariConfig43.getIdleTimeout();
        hikariConfig43.setUseInstrumentation(false);
        hikariConfig43.setJdbc4ConnectionTest(false);
        java.util.Properties properties52 = hikariConfig43.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig21.setDataSourceProperties(properties52);
        java.lang.String str55 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-142", (java.lang.Object) str55);
        hikariConfig1.poolName = "HikariPool-42317";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 60L + "'", long47 == 60L);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-670" + "'", str55, "HikariPool-670");
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        long long15 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionCustomizerClassName();
        hikariConfig18.transactionIsolationName = "";
        boolean boolean27 = hikariConfig18.isJdbc4connectionTest;
        long long28 = hikariConfig18.connectionTimeout;
        boolean boolean29 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-9222", (java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
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
        hikariConfig18.setTransactionIsolation("HikariPool-39234");
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
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
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
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.setAcquireRetries((int) ' ');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.catalog = "HikariPool-174";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long12 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.leakDetectionThreshold = 10;
        int int16 = hikariConfig1.minPoolSize;
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.minPoolSize = 87;
        java.lang.String str14 = hikariConfig1.catalog;
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long17 = hikariConfig1.maxLifetime;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-403");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-1469");
        hikariConfig1.catalog = "HikariPool-101";
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolationName = "HikariPool-5133";
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
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
        hikariConfig1.setAcquireRetries((int) 'a');
        long long18 = hikariConfig1.getConnectionTimeout();
        long long19 = hikariConfig1.getMaxLifetime();
        long long20 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.connectionTestQuery = "HikariPool-430";
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
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
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig30.transactionIsolationName = "";
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
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
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.setDataSourceClassName("HikariPool-514");
        hikariConfig1.idleTimeout = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-48910" + "'", str15, "HikariPool-48910");
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-410";
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        int int15 = hikariConfig10.transactionIsolation;
        java.lang.String str16 = hikariConfig10.getConnectionInitSql();
        hikariConfig10.isAutoCommit = true;
        long long19 = hikariConfig10.getIdleTimeout();
        hikariConfig10.setAutoCommit(true);
        int int22 = hikariConfig10.maxPoolSize;
        hikariConfig10.setAcquireRetries((int) (byte) 0);
        hikariConfig10.minPoolSize = 97;
        hikariConfig10.setMaximumPoolSize((int) (short) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-3108", (java.lang.Object) hikariConfig10);
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isAutoCommit;
        hikariConfig32.poolName = "hi!";
        hikariConfig32.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig32.dataSource = dataSource38;
        int int40 = hikariConfig32.minPoolSize;
        int int41 = hikariConfig32.minPoolSize;
        hikariConfig32.isInitializationFailFast = false;
        hikariConfig1.addDataSourceProperty("HikariPool-1555", (java.lang.Object) false);
        java.lang.String str45 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
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
        hikariConfig1.connectionTestQuery = "HikariPool-187";
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        boolean boolean28 = hikariConfig20.isRegisterMbeans;
        javax.sql.DataSource dataSource29 = hikariConfig20.getDataSource();
        long long30 = hikariConfig20.getIdleTimeout();
        boolean boolean31 = hikariConfig20.isAutoCommit;
        java.lang.String str32 = hikariConfig20.catalog;
        java.util.Properties properties33 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-2487", (java.lang.Object) hikariConfig20);
        hikariConfig20.dataSourceClassName = "HikariPool-493";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig20.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60L + "'", long30 == 60L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.getMaximumPoolSize();
        int int20 = hikariConfig14.transactionIsolation;
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        boolean boolean22 = hikariConfig14.isRegisterMbeans;
        javax.sql.DataSource dataSource23 = hikariConfig14.getDataSource();
        hikariConfig14.setMaxLifetime((long) 3);
        boolean boolean26 = hikariConfig14.isInitializationFailFast();
        int int27 = hikariConfig14.acquireRetries;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isAutoCommit;
        hikariConfig29.poolName = "hi!";
        java.lang.String str33 = hikariConfig29.dataSourceClassName;
        java.lang.String str34 = hikariConfig29.dataSourceClassName;
        hikariConfig29.setJdbc4ConnectionTest(false);
        int int37 = hikariConfig29.maxPoolSize;
        hikariConfig29.idleTimeout = (byte) -1;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        int int42 = hikariConfig41.getTransactionIsolation();
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.dataSourceClassName = "";
        hikariConfig41.setTransactionIsolation("");
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        hikariConfig50.isInitializationFailFast = true;
        int int56 = hikariConfig50.acquireRetries;
        hikariConfig50.setMaxLifetime((long) (-1));
        int int59 = hikariConfig50.getTransactionIsolation();
        java.util.Properties properties60 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        int int62 = hikariConfig61.getTransactionIsolation();
        hikariConfig61.setRegisterMbeans(false);
        java.lang.String str65 = hikariConfig61.transactionIsolationName;
        int int66 = hikariConfig61.getMaximumPoolSize();
        int int67 = hikariConfig61.transactionIsolation;
        java.util.Properties properties68 = hikariConfig61.dataSourceProperties;
        hikariConfig50.setDataSourceProperties(properties68);
        hikariConfig41.dataSourceProperties = properties68;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties68);
        hikariConfig29.dataSourceProperties = properties68;
        hikariConfig14.setDataSourceProperties(properties68);
        hikariConfig1.setDataSourceProperties(properties68);
        javax.sql.DataSource dataSource75 = hikariConfig1.getDataSource();
        boolean boolean76 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 60 + "'", int66 == 60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNull(dataSource75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.setAcquireRetries(100);
        int int10 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
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
        boolean boolean34 = hikariConfig17.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        int int8 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
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
        long long12 = hikariConfig1.getMaxLifetime();
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setDataSourceClassName("HikariPool-859");
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
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
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionTestQuery("HikariPool-861");
        int int19 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-48929" + "'", str14, "HikariPool-48929");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
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
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        int int49 = hikariConfig1.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
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
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.poolName = "HikariPool-22578";
        hikariConfig22.setTransactionIsolation("HikariPool-5788");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
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
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize(52);
        java.lang.String str15 = hikariConfig1.catalog;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(100L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        int int11 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-41426";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
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
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setCatalog("HikariPool-180");
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
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
        java.lang.String str25 = hikariConfig1.catalog;
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setAcquireRetries(1);
        boolean boolean29 = hikariConfig1.isInitializationFailFast;
        boolean boolean30 = hikariConfig1.isAutoCommit();
        long long31 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60L + "'", long31 == 60L);
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
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
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
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
        long long28 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.connectionTestQuery = "HikariPool-279";
        hikariConfig13.connectionInitSql = "HikariPool-110";
        java.lang.String str33 = hikariConfig13.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
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
        hikariConfig32.setMaxLifetime((long) 3);
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
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.transactionIsolationName = "HikariPool-33443";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = true;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.poolName = "HikariPool-21928";
        java.lang.String str13 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-2867");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
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
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.poolName = "hi!";
        hikariConfig35.acquireRetries = ' ';
        hikariConfig35.connectionTimeout = (byte) 1;
        hikariConfig35.setUseInstrumentation(true);
        hikariConfig35.transactionIsolation = 100;
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig31.dataSourceProperties = properties47;
        hikariConfig31.setIdleTimeout((long) ' ');
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTestQuery("HikariPool-385");
        long long10 = hikariConfig1.maxLifetime;
        long long11 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
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
        hikariConfig1.connectionTimeout = 35;
        java.lang.String str75 = hikariConfig1.dataSourceClassName;
        java.lang.String str76 = hikariConfig1.catalog;
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
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setTransactionIsolation("HikariPool-36");
        hikariConfig1.setIdleTimeout(52L);
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        int int13 = hikariConfig1.getTransactionIsolation();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-104" + "'", str14, "HikariPool-104");
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
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
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = 'a';
        boolean boolean19 = hikariConfig1.isAutoCommit;
        hikariConfig1.setMaximumPoolSize(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setTransactionIsolation("HikariPool-104");
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setCatalog("HikariPool-403");
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1431");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig16.setCatalog("HikariPool-16666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
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
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setPoolName("HikariPool-3546");
        long long20 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
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
        hikariConfig1.setAcquireRetries(100);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.leakDetectionThreshold = 3L;
        hikariConfig1.acquireRetries = 1;
        hikariConfig1.setPoolName("HikariPool-6822");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
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
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaxLifetime((long) '4');
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
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
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        java.lang.String str22 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
        hikariConfig1.transactionIsolation = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test18171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18171");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        long long12 = hikariConfig1.connectionTimeout;
        hikariConfig1.setLeakDetectionThreshold(52L);
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.setUseInstrumentation(true);
        hikariConfig18.connectionTestQuery = "HikariPool-104";
        hikariConfig18.maxPoolSize = (short) 100;
        hikariConfig18.setCatalog("HikariPool-26");
        java.lang.String str30 = hikariConfig18.transactionIsolationName;
        java.lang.String str31 = hikariConfig18.catalog;
        boolean boolean32 = hikariConfig18.isRegisterMbeans();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.transactionIsolation;
        java.lang.String str40 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.isAutoCommit = true;
        long long43 = hikariConfig34.getIdleTimeout();
        hikariConfig34.setAutoCommit(true);
        int int46 = hikariConfig34.getAcquireRetries();
        hikariConfig34.connectionCustomizerClassName = "HikariPool-292";
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.transactionIsolationName;
        int int55 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.isRegisterMbeans = false;
        boolean boolean58 = hikariConfig50.isRegisterMbeans();
        java.lang.String str59 = hikariConfig50.getCatalog();
        hikariConfig50.transactionIsolation = 100;
        java.util.Properties properties62 = hikariConfig50.dataSourceProperties;
        hikariConfig34.setDataSourceProperties(properties62);
        hikariConfig18.setDataSourceProperties(properties62);
        hikariConfig1.dataSourceProperties = properties62;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-26" + "'", str31, "HikariPool-26");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 60L + "'", long43 == 60L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(properties62);
    }

    @Test
    public void test18172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18173");
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
        long long13 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(false);
        long long17 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test18174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18174");
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
        long long15 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.isInitializationFailFast = true;
        int int23 = hikariConfig17.acquireRetries;
        boolean boolean24 = hikariConfig17.isJdbc4connectionTest;
        hikariConfig17.connectionTestQuery = "";
        java.util.Properties properties27 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties27);
        java.lang.String str29 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18175");
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
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean19 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18176");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getMinimumPoolSize();
        int int7 = hikariConfig1.getAcquireIncrement();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-5618");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test18178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18178");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionTestQuery = "HikariPool-68";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.poolName = "HikariPool-2783";
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        java.lang.String str24 = hikariConfig20.dataSourceClassName;
        java.lang.String str25 = hikariConfig20.dataSourceClassName;
        hikariConfig20.setJdbc4ConnectionTest(false);
        int int28 = hikariConfig20.maxPoolSize;
        hikariConfig20.idleTimeout = (byte) -1;
        javax.sql.DataSource dataSource31 = hikariConfig20.dataSource;
        hikariConfig20.setMaxLifetime((long) (short) 0);
        hikariConfig20.setDataSourceClassName("HikariPool-106");
        javax.sql.DataSource dataSource36 = null;
        hikariConfig20.setDataSource(dataSource36);
        long long38 = hikariConfig20.connectionTimeout;
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        java.lang.String str44 = hikariConfig40.transactionIsolationName;
        long long45 = hikariConfig40.getIdleTimeout();
        java.lang.String str46 = hikariConfig40.getCatalog();
        java.util.Properties properties47 = hikariConfig40.getDataSourceProperties();
        hikariConfig40.setRegisterMbeans(true);
        hikariConfig40.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        int int54 = hikariConfig53.getTransactionIsolation();
        hikariConfig53.setRegisterMbeans(false);
        java.lang.String str57 = hikariConfig53.transactionIsolationName;
        int int58 = hikariConfig53.getMaximumPoolSize();
        int int59 = hikariConfig53.transactionIsolation;
        java.util.Properties properties60 = hikariConfig53.dataSourceProperties;
        hikariConfig40.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig20.dataSourceProperties = properties60;
        hikariConfig1.setDataSourceProperties(properties60);
        boolean boolean65 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60L + "'", long45 == 60L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test18179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18179");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str5 = hikariConfig0.getPoolName();
        int int6 = hikariConfig0.getAcquireRetries();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        long long8 = hikariConfig0.maxLifetime;
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.setConnectionTestQuery("HikariPool-143");
        hikariConfig0.poolName = "HikariPool-11500";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-49007" + "'", str5, "HikariPool-49007");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18180");
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
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-490");
        int int18 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test18181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        hikariConfig1.poolName = "HikariPool-581";
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-42188";
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18182");
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
        boolean boolean20 = hikariConfig1.isAutoCommit;
        hikariConfig1.dataSourceClassName = "HikariPool-6049";
        hikariConfig1.setPoolName("HikariPool-5255");
        java.lang.String str25 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test18183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.idleTimeout = (byte) 10;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isInitializationFailFast = true;
        hikariConfig12.dataSourceClassName = "HikariPool-249";
        hikariConfig12.connectionTestQuery = "HikariPool-6";
        long long22 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setAcquireRetries((int) (short) 10);
        boolean boolean25 = hikariConfig12.isRegisterMbeans;
        javax.sql.DataSource dataSource26 = hikariConfig12.dataSource;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setConnectionInitSql("hi!");
        int int31 = hikariConfig28.getMinimumPoolSize();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isAutoCommit;
        hikariConfig33.poolName = "hi!";
        hikariConfig33.setJdbc4ConnectionTest(true);
        hikariConfig33.setAutoCommit(true);
        java.util.Properties properties41 = hikariConfig33.getDataSourceProperties();
        hikariConfig28.dataSourceProperties = properties41;
        hikariConfig12.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test18184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18184");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.connectionTestQuery = "HikariPool-7306";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.setDataSourceClassName("HikariPool-35");
        long long13 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test18186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18186");
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
        hikariConfig8.setUseInstrumentation(false);
        int int24 = hikariConfig8.transactionIsolation;
        boolean boolean25 = hikariConfig8.isRegisterMbeans();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig8.setDataSource(dataSource26);
        long long28 = hikariConfig8.idleTimeout;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60L + "'", long28 == 60L);
    }

    @Test
    public void test18187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18187");
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
        hikariConfig1.setPoolName("");
        hikariConfig1.transactionIsolationName = "HikariPool-1242";
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18188");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        long long10 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        int int18 = hikariConfig13.getMaximumPoolSize();
        int int19 = hikariConfig13.transactionIsolation;
        hikariConfig13.setJdbc4ConnectionTest(false);
        hikariConfig13.setMaximumPoolSize((int) (byte) 0);
        boolean boolean24 = hikariConfig13.isInitializationFailFast;
        hikariConfig13.idleTimeout = 35L;
        java.lang.String str27 = hikariConfig13.connectionTestQuery;
        hikariConfig13.minPoolSize = (short) 0;
        hikariConfig13.leakDetectionThreshold = 100L;
        hikariConfig13.setMinimumPoolSize(0);
        hikariConfig1.addDataSourceProperty("HikariPool-39067", (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test18189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18189");
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
        long long36 = hikariConfig32.connectionTimeout;
        boolean boolean37 = hikariConfig32.isJdbc4connectionTest;
        long long38 = hikariConfig32.getConnectionTimeout();
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
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
    }

    @Test
    public void test18190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        long long16 = hikariConfig11.getIdleTimeout();
        java.lang.String str17 = hikariConfig11.getCatalog();
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer20;
        long long22 = hikariConfig11.connectionTimeout;
        hikariConfig11.setLeakDetectionThreshold(52L);
        java.util.Properties properties25 = hikariConfig11.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.dataSource = dataSource27;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test18191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.idleTimeout;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18192");
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
        hikariConfig1.transactionIsolationName = "HikariPool-950";
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18193");
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
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test18194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18194");
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
        int int39 = hikariConfig1.minPoolSize;
        java.lang.String str40 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-690";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-409";
        long long45 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str46 = hikariConfig1.connectionInitSql;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test18195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18195");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.connectionInitSql = "HikariPool-164";
        hikariConfig1.transactionIsolation = 'a';
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18196");
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
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-489" + "'", str17, "HikariPool-489");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18197");
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
        int int34 = hikariConfig31.acquireRetries;
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        long long36 = hikariConfig31.maxLifetime;
        boolean boolean37 = hikariConfig31.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3L + "'", long36 == 3L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test18198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18198");
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
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        long long23 = hikariConfig1.getConnectionTimeout();
        int int24 = hikariConfig1.minPoolSize;
        long long25 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-10719";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test18199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18199");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.transactionIsolation = (byte) 1;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxLifetime = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.catalog = "HikariPool-617";
        hikariConfig1.setTransactionIsolation("HikariPool-1097");
        hikariConfig1.setMaxLifetime((long) 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test18201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18201");
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
        int int13 = hikariConfig1.getAcquireRetries();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        long long15 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
    }

    @Test
    public void test18202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18202");
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
        hikariConfig8.setUseInstrumentation(false);
        long long24 = hikariConfig8.getAcquireRetryDelay();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig8.setDataSource(dataSource25);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test18203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18203");
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
        hikariConfig1.catalog = "HikariPool-134";
        hikariConfig1.isAutoCommit = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig1.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = iConnectionCustomizer26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
    }

    @Test
    public void test18204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.leakDetectionThreshold = 0L;
        java.lang.String str15 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test18205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str15 = hikariConfig1.catalog;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-6" + "'", str17, "HikariPool-6");
    }

    @Test
    public void test18206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18206");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.getPoolName();
        long long13 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test18207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18207");
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
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.leakDetectionThreshold = 100;
        java.lang.String str25 = hikariConfig22.connectionTestQuery;
        hikariConfig22.setMaximumPoolSize(87);
        java.lang.String str28 = hikariConfig22.connectionCustomizerClassName;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setConnectionInitSql("hi!");
        long long33 = hikariConfig30.getLeakDetectionThreshold();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        java.lang.String str39 = hikariConfig35.transactionIsolationName;
        int int40 = hikariConfig35.getMaximumPoolSize();
        int int41 = hikariConfig35.transactionIsolation;
        java.util.Properties properties42 = hikariConfig35.dataSourceProperties;
        hikariConfig30.dataSourceProperties = properties42;
        java.util.Properties properties44 = hikariConfig30.getDataSourceProperties();
        hikariConfig22.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig47.setTransactionIsolation("HikariPool-130");
        hikariConfig1.addDataSourceProperty("HikariPool-429", (java.lang.Object) hikariConfig47);
        hikariConfig1.transactionIsolationName = "HikariPool-41103";
        java.lang.String str53 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setDataSourceClassName("HikariPool-48077");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test18208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        long long10 = hikariConfig1.maxLifetime;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        long long12 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.maxLifetime = (short) 1;
        long long15 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionInitSql("HikariPool-2459");
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        int int8 = hikariConfig1.acquireRetries;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test18211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        hikariConfig0.maxPoolSize = (byte) -1;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test18212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.poolName = "HikariPool-197";
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.maxPoolSize = (short) -1;
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.acquireRetries = (short) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test18213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18213");
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
        long long22 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isAutoCommit;
        int int26 = hikariConfig24.getAcquireIncrement();
        int int27 = hikariConfig24.getAcquireIncrement();
        java.lang.String str28 = hikariConfig24.connectionCustomizerClassName;
        hikariConfig24.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig24.connectionCustomizer;
        hikariConfig24.transactionIsolation = (byte) 100;
        long long34 = hikariConfig24.getIdleTimeout();
        hikariConfig24.setCatalog("HikariPool-6");
        boolean boolean37 = hikariConfig24.isInitializationFailFast;
        java.util.Properties properties38 = hikariConfig24.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties38);
        java.lang.String str40 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test18214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18214");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        int int12 = hikariConfig1.getTransactionIsolation();
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-49072" + "'", str8, "HikariPool-49072");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18216");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-104");
        hikariConfig1.isAutoCommit = true;
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setPoolName("HikariPool-1145");
        int int18 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long22 = hikariConfig21.getIdleTimeout();
        int int23 = hikariConfig21.acquireRetries;
        long long24 = hikariConfig21.getConnectionTimeout();
        int int25 = hikariConfig21.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig21.connectionCustomizer = iConnectionCustomizer26;
        hikariConfig21.leakDetectionThreshold = ' ';
        hikariConfig21.setMaximumPoolSize((int) (short) 10);
        hikariConfig21.setAcquireRetries(0);
        hikariConfig1.addDataSourceProperty("HikariPool-41981", (java.lang.Object) hikariConfig21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test18217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18217");
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
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setUseInstrumentation(true);
        long long16 = hikariConfig1.maxLifetime;
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionTestQuery = "HikariPool-39217";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18218");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isInitializationFailFast = false;
        int int9 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.poolName = "HikariPool-40706";
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test18219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18219");
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
        boolean boolean31 = hikariConfig18.isInitializationFailFast();
        javax.sql.DataSource dataSource32 = null;
        hikariConfig18.setDataSource(dataSource32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18220");
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
        hikariConfig32.setMaximumPoolSize((int) 'a');
        int int38 = hikariConfig32.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test18221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setCatalog("HikariPool-870");
        hikariConfig1.leakDetectionThreshold = '#';
        boolean boolean13 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolationName = "HikariPool-32981";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18222");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = ' ';
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.maxLifetime = 3;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(iConnectionCustomizer5);
    }

    @Test
    public void test18224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18224");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1951");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1951 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18225");
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
        boolean boolean19 = hikariConfig1.isAutoCommit;
        java.lang.String str20 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-49088" + "'", str13, "HikariPool-49088");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-49087" + "'", str20, "HikariPool-49087");
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18226");
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
        hikariConfig1.dataSourceClassName = "HikariPool-416";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-416" + "'", str15, "HikariPool-416");
    }

    @Test
    public void test18227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18229");
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
        java.lang.String str12 = hikariConfig1.catalog;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18230");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-413";
        hikariConfig1.catalog = "HikariPool-707";
        hikariConfig1.acquireRetries = ' ';
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        hikariConfig1.setDataSourceClassName("HikariPool-38466");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long10 = hikariConfig9.connectionTimeout;
        int int11 = hikariConfig9.getAcquireRetries();
        hikariConfig9.leakDetectionThreshold = 3L;
        java.lang.String str14 = hikariConfig9.getPoolName();
        hikariConfig9.catalog = "HikariPool-2335";
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-49095" + "'", str14, "HikariPool-49095");
    }

    @Test
    public void test18232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18232");
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
        hikariConfig1.catalog = "HikariPool-3227";
        hikariConfig1.acquireRetries = 0;
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
    public void test18233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.setCatalog("HikariPool-765");
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setIdleTimeout(5000L);
        hikariConfig1.transactionIsolation = '4';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18234");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int20 = hikariConfig19.getAcquireIncrement();
        hikariConfig19.setCatalog("HikariPool-10970");
        long long23 = hikariConfig19.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test18235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMaxLifetime((long) 100);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-112";
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        java.lang.String str24 = hikariConfig20.dataSourceClassName;
        java.lang.String str25 = hikariConfig20.dataSourceClassName;
        hikariConfig20.setJdbc4ConnectionTest(false);
        int int28 = hikariConfig20.maxPoolSize;
        hikariConfig20.idleTimeout = (byte) -1;
        javax.sql.DataSource dataSource31 = hikariConfig20.dataSource;
        hikariConfig20.setMaxLifetime((long) (short) 0);
        java.lang.String str34 = hikariConfig20.catalog;
        hikariConfig20.dataSourceClassName = "HikariPool-277";
        java.util.Properties properties37 = hikariConfig20.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties37;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test18236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        java.lang.String str19 = hikariConfig15.dataSourceClassName;
        java.lang.String str20 = hikariConfig15.dataSourceClassName;
        hikariConfig15.setJdbc4ConnectionTest(false);
        java.lang.String str23 = hikariConfig15.transactionIsolationName;
        hikariConfig15.setMaximumPoolSize((int) (short) 0);
        long long26 = hikariConfig15.getConnectionTimeout();
        java.lang.String str27 = hikariConfig15.getDataSourceClassName();
        java.lang.String str28 = hikariConfig15.dataSourceClassName;
        long long29 = hikariConfig15.getConnectionTimeout();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.setUseInstrumentation(true);
        hikariConfig31.setConnectionInitSql("");
        hikariConfig31.setRegisterMbeans(true);
        long long41 = hikariConfig31.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig43.setDataSourceClassName("");
        hikariConfig43.validate();
        long long47 = hikariConfig43.getLeakDetectionThreshold();
        hikariConfig43.setIdleTimeout((long) '4');
        java.lang.String str50 = hikariConfig43.connectionCustomizerClassName;
        hikariConfig43.idleTimeout = (short) 0;
        hikariConfig31.addDataSourceProperty("HikariPool-222", (java.lang.Object) (short) 0);
        hikariConfig31.setIdleTimeout((long) (byte) 10);
        hikariConfig31.setPoolName("HikariPool-756");
        java.util.Properties properties58 = hikariConfig31.dataSourceProperties;
        hikariConfig15.setDataSourceProperties(properties58);
        java.util.Properties properties60 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test18237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18237");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2236");
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test18238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setMaximumPoolSize(3);
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        hikariConfig15.setTransactionIsolation("hi!");
        long long21 = hikariConfig15.connectionTimeout;
        long long22 = hikariConfig15.idleTimeout;
        hikariConfig15.setConnectionTestQuery("HikariPool-204");
        hikariConfig15.catalog = "HikariPool-204";
        java.lang.String str27 = hikariConfig15.connectionInitSql;
        hikariConfig15.maxPoolSize = '4';
        hikariConfig1.addDataSourceProperty("HikariPool-761", (java.lang.Object) hikariConfig15);
        hikariConfig1.acquireRetries = (byte) 100;
        int int33 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
    }

    @Test
    public void test18239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18239");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setPoolName("HikariPool-87");
        long long17 = hikariConfig1.getConnectionTimeout();
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-104" + "'", str13, "HikariPool-104");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18240");
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
        java.lang.String str18 = hikariConfig11.getDataSourceClassName();
        int int19 = hikariConfig11.getAcquireRetries();
        hikariConfig11.maxLifetime = '#';
        hikariConfig11.connectionInitSql = "HikariPool-1864";
        hikariConfig11.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test18241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18241");
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
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean25 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean26 = hikariConfig1.isAutoCommit;
        java.lang.String str27 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2998");
        hikariConfig1.minPoolSize = 97;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-49119" + "'", str21, "HikariPool-49119");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test18242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18242");
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
        int int24 = hikariConfig1.maxPoolSize;
        java.lang.String str25 = hikariConfig1.poolName;
        int int26 = hikariConfig1.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test18243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18243");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        int int13 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test18244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.connectionTestQuery = "HikariPool-12384";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18245");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setDataSourceClassName("HikariPool-252");
        long long12 = hikariConfig1.maxLifetime;
        hikariConfig1.isAutoCommit = true;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-252" + "'", str16, "HikariPool-252");
    }

    @Test
    public void test18246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18246");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1040");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18247");
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
        java.util.Properties properties85 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig86 = new com.zaxxer.hikari.HikariConfig(properties85);
        hikariConfig86.leakDetectionThreshold = 100;
        hikariConfig86.acquireRetries = (byte) -1;
        hikariConfig86.setLeakDetectionThreshold((long) (short) 1);
        long long93 = hikariConfig86.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) long93);
        java.lang.String str95 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(false);
        int int98 = hikariConfig1.transactionIsolation;
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
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test18248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18248");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
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
    public void test18249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18249");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTestQuery = "HikariPool-577";
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-577" + "'", str14, "HikariPool-577");
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test18250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize(100);
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        long long12 = hikariConfig1.getIdleTimeout();
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test18251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test18252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18252");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.connectionTimeout;
        int int7 = hikariConfig0.minPoolSize;
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-49143" + "'", str1, "HikariPool-49143");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.idleTimeout = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test18254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-49145" + "'", str8, "HikariPool-49145");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18255");
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
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long17 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
    }

    @Test
    public void test18256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18256");
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
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-823";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test18257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18257");
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
        hikariConfig1.setPoolName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test18258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18258");
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
        hikariConfig1.setAcquireRetries((int) (short) 0);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18259");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        hikariConfig1.connectionTimeout = '4';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test18260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18260");
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
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        long long20 = hikariConfig1.maxLifetime;
        java.util.Properties properties21 = null;
        hikariConfig1.dataSourceProperties = properties21;
        int int23 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
    }

    @Test
    public void test18261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18261");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setCatalog("HikariPool-15520");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18262");
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
        int int31 = hikariConfig11.getMaximumPoolSize();
        java.lang.String str32 = hikariConfig11.getPoolName();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        hikariConfig34.setUseInstrumentation(true);
        hikariConfig34.setConnectionInitSql("");
        hikariConfig34.setConnectionCustomizerClassName("hi!");
        boolean boolean44 = hikariConfig34.isInitializationFailFast;
        hikariConfig34.maxPoolSize = ' ';
        int int47 = hikariConfig34.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig48.setDataSourceClassName("");
        hikariConfig48.validate();
        long long52 = hikariConfig48.getLeakDetectionThreshold();
        hikariConfig48.setIdleTimeout((long) '4');
        java.lang.String str55 = hikariConfig48.connectionCustomizerClassName;
        java.util.Properties properties56 = hikariConfig48.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig34.setDataSourceProperties(properties56);
        hikariConfig11.dataSourceProperties = properties56;
        long long61 = hikariConfig11.getIdleTimeout();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-49164" + "'", str32, "HikariPool-49164");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 60L + "'", long61 == 60L);
    }

    @Test
    public void test18263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18263");
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
        hikariConfig11.setCatalog("HikariPool-1159");
        javax.sql.DataSource dataSource32 = null;
        hikariConfig11.setDataSource(dataSource32);
        int int34 = hikariConfig11.minPoolSize;
        long long35 = hikariConfig11.maxLifetime;
        java.lang.String str36 = hikariConfig11.poolName;
        java.lang.String str37 = hikariConfig11.poolName;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-49171" + "'", str36, "HikariPool-49171");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-49171" + "'", str37, "HikariPool-49171");
    }

    @Test
    public void test18264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("HikariPool-32981");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-403");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-1469");
        hikariConfig1.catalog = "HikariPool-101";
        hikariConfig1.idleTimeout = 3L;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        hikariConfig17.setTransactionIsolation("hi!");
        boolean boolean23 = hikariConfig17.isRegisterMbeans();
        java.lang.String str24 = hikariConfig17.catalog;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        java.lang.String str31 = hikariConfig26.connectionCustomizerClassName;
        hikariConfig26.setConnectionTestQuery("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        int int35 = hikariConfig26.acquireRetries;
        hikariConfig26.setAutoCommit(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig26.setDataSource(dataSource38);
        hikariConfig26.setConnectionTimeout(2147483647L);
        java.util.Properties properties42 = hikariConfig26.dataSourceProperties;
        hikariConfig17.setDataSourceProperties(properties42);
        hikariConfig1.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.lang.String str46 = hikariConfig45.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test18266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18266");
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
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.poolName = "HikariPool-38";
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.connectionTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18267");
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
        hikariConfig16.setDataSourceClassName("HikariPool-466");
        java.lang.String str20 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18268");
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
        int int19 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "HikariPool-29262";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-49184" + "'", str14, "HikariPool-49184");
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test18269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.transactionIsolationName = "";
        int int16 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setAcquireRetries((int) (byte) 1);
        java.lang.String str19 = hikariConfig10.getConnectionInitSql();
        javax.sql.DataSource dataSource20 = hikariConfig10.getDataSource();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig10);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setPoolName("HikariPool-1145");
        hikariConfig1.addDataSourceProperty("HikariPool-1527", (java.lang.Object) "HikariPool-2644");
        hikariConfig1.idleTimeout = 'a';
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime((long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test18270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18270");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-29279");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-29279 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18271");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.connectionTimeout;
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18272");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1136";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        boolean boolean19 = hikariConfig1.isAutoCommit();
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-1293");
        int int23 = hikariConfig1.maxPoolSize;
        hikariConfig1.setPoolName("HikariPool-14359");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test18273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18273");
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
        long long15 = hikariConfig10.leakDetectionThreshold;
        java.lang.String str16 = hikariConfig10.connectionTestQuery;
        hikariConfig10.setMaximumPoolSize(3);
        long long19 = hikariConfig10.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49191" + "'", str11, "HikariPool-49191");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18274");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test18275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18275");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionInitSql = "HikariPool-1293";
        boolean boolean14 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18276");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-38757";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test18277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18277");
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
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.connectionInitSql = "HikariPool-633";
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
        hikariConfig1.dataSourceProperties = properties76;
        hikariConfig1.setPoolName("HikariPool-22");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer86 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer86;
        hikariConfig1.setCatalog("HikariPool-25445");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
    }

    @Test
    public void test18278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18278");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test18279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18279");
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
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-5278");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test18280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18280");
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
        long long36 = hikariConfig22.getIdleTimeout();
        int int37 = hikariConfig22.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-49205" + "'", str15, "HikariPool-49205");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-49206" + "'", str29, "HikariPool-49206");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 60L + "'", long36 == 60L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test18281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18281");
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
        hikariConfig1.catalog = "HikariPool-26";
        int int20 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test18282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18282");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        long long6 = hikariConfig1.getConnectionTimeout();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.leakDetectionThreshold = 87;
        hikariConfig1.setRegisterMbeans(true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int7 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.poolName = "HikariPool-394";
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.connectionTimeout = 0;
        hikariConfig1.setConnectionTestQuery("HikariPool-9521");
        hikariConfig1.setIdleTimeout(97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18284");
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
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-14452");
        hikariConfig1.setCatalog("HikariPool-23519");
        hikariConfig1.maxLifetime = 0L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-49210" + "'", str7, "HikariPool-49210");
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-49210" + "'", str15, "HikariPool-49210");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test18285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18285");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.idleTimeout = 60L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test18286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionInitSql("HikariPool-356");
        long long12 = hikariConfig1.idleTimeout;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18287");
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
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        long long19 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test18288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18288");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-403");
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setAcquireRetries(97);
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-403" + "'", str11, "HikariPool-403");
    }

    @Test
    public void test18289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18289");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-21703";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18290");
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
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit;
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.catalog = "HikariPool-3394";
        java.lang.String str19 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18291");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("HikariPool-39047");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig1.transactionIsolation = ' ';
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test18292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18292");
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
        long long18 = hikariConfig1.getMaxLifetime();
        int int19 = hikariConfig1.getMinimumPoolSize();
        int int20 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.minPoolSize = ' ';
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test18293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18293");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMaxLifetime((long) 100);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-112";
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer19;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.leakDetectionThreshold = 100;
        boolean boolean25 = hikariConfig22.isJdbc4connectionTest;
        long long26 = hikariConfig22.getIdleTimeout();
        hikariConfig22.setCatalog("HikariPool-104");
        hikariConfig22.setMaxLifetime(52L);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig22.dataSource = dataSource31;
        long long33 = hikariConfig22.leakDetectionThreshold;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        hikariConfig35.isInitializationFailFast = true;
        java.lang.String str41 = hikariConfig35.getConnectionCustomizerClassName();
        hikariConfig35.transactionIsolationName = "";
        boolean boolean44 = hikariConfig35.isJdbc4connectionTest;
        long long45 = hikariConfig35.connectionTimeout;
        java.lang.String str46 = hikariConfig35.connectionInitSql;
        boolean boolean47 = hikariConfig35.isRegisterMbeans();
        java.util.Properties properties48 = hikariConfig35.getDataSourceProperties();
        hikariConfig22.dataSourceProperties = properties48;
        hikariConfig1.setDataSourceProperties(properties48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60L + "'", long26 == 60L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test18294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18294");
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
        java.util.Properties properties88 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-179");
        javax.sql.DataSource dataSource91 = null;
        hikariConfig1.dataSource = dataSource91;
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
        org.junit.Assert.assertNotNull(properties88);
    }

    @Test
    public void test18295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18295");
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
        hikariConfig1.setMinimumPoolSize(97);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18296");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireRetries = (byte) -1;
        long long12 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.connectionCustomizerClassName;
        java.lang.String str12 = hikariConfig10.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-49235" + "'", str12, "HikariPool-49235");
    }

    @Test
    public void test18298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.isAutoCommit = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        int int11 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test18299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        int int14 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18300");
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
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str26 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-761" + "'", str26, "HikariPool-761");
    }

    @Test
    public void test18301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18301");
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
        long long26 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str29 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.idleTimeout = (-1L);
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.maxLifetime = 87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test18303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setMaximumPoolSize((int) '4');
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-481";
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        int int23 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-481" + "'", str22, "HikariPool-481");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test18304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setPoolName("HikariPool-31372");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18305");
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
        java.lang.String str22 = hikariConfig16.getCatalog();
        boolean boolean23 = hikariConfig16.isAutoCommit();
        hikariConfig16.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-461" + "'", str22, "HikariPool-461");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18306");
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
        boolean boolean31 = hikariConfig13.isJdbc4connectionTest;
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test18307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setPoolName("HikariPool-8692");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isAutoCommit;
        hikariConfig18.poolName = "hi!";
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.setAcquireRetries((int) 'a');
        hikariConfig18.setCatalog("HikariPool-385");
        java.lang.String str28 = hikariConfig18.connectionTestQuery;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-1522", (java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-49250" + "'", str13, "HikariPool-49250");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test18308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolation = (byte) 0;
        hikariConfig0.transactionIsolation = (byte) 10;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-649");
        java.lang.String str10 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-649" + "'", str10, "HikariPool-649");
    }

    @Test
    public void test18309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18309");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int11 = hikariConfig1.getAcquireRetries();
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18310");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getConnectionCustomizerClassName();
        hikariConfig10.setCatalog("HikariPool-1997");
        int int14 = hikariConfig10.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test18311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        java.lang.String str11 = hikariConfig1.getPoolName();
        long long12 = hikariConfig1.getConnectionTimeout();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-8194");
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49256" + "'", str11, "HikariPool-49256");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test18312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18312");
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
        hikariConfig1.maxPoolSize = 0;
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        int int16 = hikariConfig1.transactionIsolation;
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-49257" + "'", str12, "HikariPool-49257");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18313");
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
        hikariConfig15.maxPoolSize = (byte) 1;
        hikariConfig15.setConnectionTestQuery("HikariPool-453");
        hikariConfig15.minPoolSize = 1;
        java.lang.String str22 = hikariConfig15.getConnectionTestQuery();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig15.dataSource = dataSource23;
        javax.sql.DataSource dataSource25 = null;
        hikariConfig15.setDataSource(dataSource25);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig15.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-453" + "'", str22, "HikariPool-453");
    }

    @Test
    public void test18314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18314");
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
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.dataSourceClassName = "HikariPool-5150";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test18315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        hikariConfig1.dataSourceClassName = "HikariPool-13489";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        int int15 = hikariConfig1.maxPoolSize;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "HikariPool-216";
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        int int20 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test18317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18317");
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
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        int int17 = hikariConfig1.getTransactionIsolation();
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test18318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18318");
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
        hikariConfig10.setIdleTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18319");
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
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionTestQuery = "HikariPool-20885";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        int int13 = hikariConfig1.getMaximumPoolSize();
        long long14 = hikariConfig1.idleTimeout;
        long long15 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49269" + "'", str11, "HikariPool-49269");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test18321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18321");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxLifetime = (short) 0;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test18323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18323");
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
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        boolean boolean27 = hikariConfig1.isAutoCommit;
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-49272" + "'", str21, "HikariPool-49272");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test18324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18324");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23589");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23589 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18325");
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
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties47);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig50.setDataSource(dataSource51);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer53 = hikariConfig50.connectionCustomizer;
        java.lang.String str54 = hikariConfig50.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertNull(iConnectionCustomizer53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test18326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18326");
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
        int int12 = hikariConfig1.transactionIsolation;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18327");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-481");
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        long long14 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-481" + "'", str13, "HikariPool-481");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test18328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18328");
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
        hikariConfig1.poolName = "HikariPool-8456";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-163");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18329");
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
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig63.dataSourceClassName = "";
        hikariConfig63.connectionTimeout = 10L;
        hikariConfig63.connectionTestQuery = "HikariPool-104";
        int int70 = hikariConfig63.transactionIsolation;
        hikariConfig63.setRegisterMbeans(false);
        hikariConfig63.setUseInstrumentation(true);
        hikariConfig1.addDataSourceProperty("HikariPool-33", (java.lang.Object) hikariConfig63);
        boolean boolean76 = hikariConfig63.isAutoCommit;
        int int77 = hikariConfig63.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig63.setAcquireIncrement((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test18330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18330");
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
        java.lang.String str33 = hikariConfig31.getCatalog();
        boolean boolean34 = hikariConfig31.isJdbc4connectionTest;
        long long35 = hikariConfig31.connectionTimeout;
        hikariConfig31.setJdbc4ConnectionTest(false);
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
    }

    @Test
    public void test18331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18331");
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
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionTestQuery = "HikariPool-719";
        int int18 = hikariConfig1.minPoolSize;
        int int19 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str20 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18332");
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
        long long15 = hikariConfig1.maxLifetime;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test18333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.dataSourceClassName = "HikariPool-7804";
        hikariConfig1.transactionIsolationName = "HikariPool-44938";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18334");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.lang.String str7 = hikariConfig1.poolName;
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setPoolName("HikariPool-1041");
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-49301" + "'", str6, "HikariPool-49301");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-49301" + "'", str7, "HikariPool-49301");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test18335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18335");
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
        long long14 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test18336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18336");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        int int6 = hikariConfig1.getAcquireRetries();
        hikariConfig1.transactionIsolationName = "HikariPool-27";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.connectionTestQuery;
        long long16 = hikariConfig11.getIdleTimeout();
        hikariConfig11.setJdbc4ConnectionTest(false);
        java.lang.String str19 = hikariConfig11.getCatalog();
        javax.sql.DataSource dataSource20 = hikariConfig11.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer21;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer23;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isAutoCommit;
        hikariConfig26.poolName = "hi!";
        hikariConfig26.setTransactionIsolation("hi!");
        boolean boolean32 = hikariConfig26.isRegisterMbeans();
        java.lang.String str33 = hikariConfig26.poolName;
        int int34 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setConnectionInitSql("hi!");
        hikariConfig37.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource42 = hikariConfig37.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig37.connectionCustomizer;
        hikariConfig37.setPoolName("HikariPool-104");
        long long46 = hikariConfig37.connectionTimeout;
        hikariConfig37.setConnectionTestQuery("HikariPool-500");
        hikariConfig37.isAutoCommit = true;
        hikariConfig26.addDataSourceProperty("HikariPool-453", (java.lang.Object) true);
        java.util.Properties properties52 = hikariConfig26.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties52;
        hikariConfig1.setDataSourceProperties(properties52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(properties52);
    }

    @Test
    public void test18337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18337");
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
        int int22 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test18338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-105";
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.connectionTimeout;
        int int13 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.transactionIsolation;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig16.dataSource = dataSource22;
        boolean boolean24 = hikariConfig16.isAutoCommit();
        hikariConfig16.setMaximumPoolSize((int) '#');
        hikariConfig16.connectionInitSql = "HikariPool-260";
        boolean boolean29 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.connectionCustomizerClassName = "HikariPool-730";
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str33 = hikariConfig32.poolName;
        hikariConfig32.setMinimumPoolSize((int) '4');
        hikariConfig32.minPoolSize = (byte) 0;
        long long38 = hikariConfig32.connectionTimeout;
        int int39 = hikariConfig32.minPoolSize;
        int int40 = hikariConfig32.getMaximumPoolSize();
        hikariConfig32.setDataSourceClassName("HikariPool-3106");
        java.util.Properties properties43 = hikariConfig32.getDataSourceProperties();
        hikariConfig16.dataSourceProperties = properties43;
        hikariConfig1.setDataSourceProperties(properties43);
        hikariConfig1.leakDetectionThreshold = 0L;
        java.lang.String str48 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-49312" + "'", str33, "HikariPool-49312");
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test18339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18339");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1251");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1251 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18340");
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
        boolean boolean40 = hikariConfig31.isRegisterMbeans();
        java.lang.String str41 = hikariConfig31.connectionTestQuery;
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test18341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18341");
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
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isAutoCommit;
        hikariConfig18.poolName = "hi!";
        java.lang.String str22 = hikariConfig18.dataSourceClassName;
        java.lang.String str23 = hikariConfig18.dataSourceClassName;
        hikariConfig18.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig18.connectionCustomizer;
        hikariConfig18.setMaxLifetime((long) (short) 0);
        hikariConfig18.setAcquireRetries(100);
        long long31 = hikariConfig18.getIdleTimeout();
        java.lang.String str32 = hikariConfig18.dataSourceClassName;
        long long33 = hikariConfig18.getMaxLifetime();
        long long34 = hikariConfig18.getLeakDetectionThreshold();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str40 = hikariConfig36.transactionIsolationName;
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig36.getDataSourceClassName();
        hikariConfig36.transactionIsolation = (short) 1;
        boolean boolean46 = hikariConfig36.isJdbc4connectionTest;
        java.lang.String str47 = hikariConfig36.poolName;
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
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties76);
        hikariConfig36.setDataSourceProperties(properties76);
        hikariConfig18.dataSourceProperties = properties76;
        hikariConfig1.setDataSourceProperties(properties76);
        hikariConfig1.maxPoolSize = (byte) 1;
        javax.sql.DataSource dataSource85 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60L + "'", long31 == 60L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-49320" + "'", str47, "HikariPool-49320");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNull(dataSource85);
    }

    @Test
    public void test18342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18342");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.connectionInitSql = "HikariPool-472";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer28;
        long long30 = hikariConfig1.getConnectionTimeout();
        boolean boolean31 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49325" + "'", str11, "HikariPool-49325");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18343");
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
        javax.sql.DataSource dataSource44 = null;
        hikariConfig25.setDataSource(dataSource44);
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
    }

    @Test
    public void test18344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18344");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = (short) 1;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetries = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test18345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18345");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.catalog = "HikariPool-1125";
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18346");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setJdbc4ConnectionTest(false);
        java.lang.String str14 = hikariConfig11.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18347");
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
        int int38 = hikariConfig1.maxPoolSize;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
    }

    @Test
    public void test18348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18348");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        int int13 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49340" + "'", str11, "HikariPool-49340");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18349");
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
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        int int17 = hikariConfig1.getTransactionIsolation();
        boolean boolean18 = hikariConfig1.isAutoCommit;
        java.lang.String str19 = hikariConfig1.poolName;
        hikariConfig1.minPoolSize = 87;
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        long long23 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
    }

    @Test
    public void test18350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18350");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-230");
        hikariConfig1.acquireRetries = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-49342" + "'", str10, "HikariPool-49342");
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-49342" + "'", str12, "HikariPool-49342");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        int int8 = hikariConfig1.getAcquireRetries();
        int int9 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test18352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getMaxLifetime();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.poolName = "HikariPool-893";
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test18353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        long long10 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-30331");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test18354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.dataSourceClassName = "";
        hikariConfig12.isRegisterMbeans = true;
        hikariConfig12.minPoolSize = (short) 1;
        hikariConfig12.isJdbc4connectionTest = false;
        java.util.Properties properties24 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties24);
        java.lang.String str26 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test18355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18355");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setCatalog("HikariPool-3718");
        hikariConfig1.minPoolSize = (-1);
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-17833");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test18356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setTransactionIsolation("HikariPool-104");
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.transactionIsolation = (short) 1;
        hikariConfig1.setMinimumPoolSize(0);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.maxPoolSize = '#';
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18358");
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
        hikariConfig8.setPoolName("HikariPool-1549");
        hikariConfig8.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig8.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
    }

    @Test
    public void test18359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18359");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.acquireRetries = '4';
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test18360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.poolName = "HikariPool-852";
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-39368");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test18361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18361");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18362");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test18363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18363");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18364");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = 60;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(5000L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test18365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18365");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.maxLifetime = 60L;
        hikariConfig1.maxLifetime = (-1);
        int int15 = hikariConfig1.transactionIsolation;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.transactionIsolationName = "HikariPool-24891";
        hikariConfig1.maxPoolSize = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test18366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18366");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-356";
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        long long15 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test18367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionInitSql("HikariPool-1619");
        hikariConfig1.setAutoCommit(true);
        long long18 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test18368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMaxLifetime((long) (short) 1);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-192");
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.catalog = "HikariPool-8010";
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.connectionTestQuery;
        int int22 = hikariConfig17.getAcquireIncrement();
        java.util.Properties properties23 = hikariConfig17.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties23);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-49362" + "'", str1, "HikariPool-49362");
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-49362" + "'", str13, "HikariPool-49362");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test18369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18369");
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
        java.lang.String str28 = hikariConfig13.getConnectionCustomizerClassName();
        boolean boolean29 = hikariConfig13.isInitializationFailFast;
        hikariConfig13.setMaximumPoolSize(0);
        java.lang.String str32 = hikariConfig13.connectionCustomizerClassName;
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test18370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.poolName = "HikariPool-17650";
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties20 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setLeakDetectionThreshold(0L);
        hikariConfig1.addDataSourceProperty("HikariPool-8980", (java.lang.Object) hikariConfig16);
        java.lang.String str24 = hikariConfig1.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-5449", (java.lang.Object) "HikariPool-3317");
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test18371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18371");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        int int13 = hikariConfig1.acquireRetries;
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-45277");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18372");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        boolean boolean6 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.acquireRetries;
        hikariConfig1.isAutoCommit = false;
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.leakDetectionThreshold = (short) 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test18373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18373");
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
        hikariConfig1.idleTimeout = (byte) 0;
        long long33 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireRetries = '#';
        hikariConfig1.setInitializationFailFast(false);
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
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test18374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18374");
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
        hikariConfig8.setUseInstrumentation(false);
        int int24 = hikariConfig8.transactionIsolation;
        boolean boolean25 = hikariConfig8.isRegisterMbeans();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig8.setDataSource(dataSource26);
        hikariConfig8.poolName = "HikariPool-574";
        java.lang.Class<?> wildcardClass30 = hikariConfig8.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test18375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18375");
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
        hikariConfig1.leakDetectionThreshold = (short) 100;
        boolean boolean19 = hikariConfig1.isAutoCommit;
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18376");
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
        int int20 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxLifetime = 100L;
        hikariConfig1.minPoolSize = 32;
        int int25 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test18377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18377");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.idleTimeout = 32;
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-33291");
        int int14 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test18378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18378");
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
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionInitSql = "HikariPool-173";
        boolean boolean18 = hikariConfig1.isAutoCommit();
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-173" + "'", str19, "HikariPool-173");
    }

    @Test
    public void test18379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        java.lang.String str11 = hikariConfig1.poolName;
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-39692");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49380" + "'", str11, "HikariPool-49380");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test18380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18380");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolation = (byte) 0;
        hikariConfig0.transactionIsolation = (byte) 10;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-649");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-512");
        hikariConfig0.catalog = "HikariPool-3146";
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18381");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = false;
        long long11 = hikariConfig1.connectionTimeout;
        long long12 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isAutoCommit;
        hikariConfig15.poolName = "hi!";
        java.lang.String str19 = hikariConfig15.dataSourceClassName;
        java.lang.String str20 = hikariConfig15.dataSourceClassName;
        hikariConfig15.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig15.connectionCustomizer;
        hikariConfig15.setMaxLifetime((long) (short) 0);
        hikariConfig15.setAcquireRetries(100);
        long long28 = hikariConfig15.getIdleTimeout();
        java.lang.String str29 = hikariConfig15.dataSourceClassName;
        long long30 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setAcquireRetries(0);
        boolean boolean33 = hikariConfig15.isAutoCommit;
        boolean boolean34 = hikariConfig15.isAutoCommit;
        hikariConfig1.addDataSourceProperty("HikariPool-3412", (java.lang.Object) boolean34);
        long long36 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60L + "'", long28 == 60L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
    }

    @Test
    public void test18382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18382");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "HikariPool-232";
        hikariConfig1.isInitializationFailFast = false;
    }

    @Test
    public void test18383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18383");
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
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.dataSourceClassName = "HikariPool-315";
        long long17 = hikariConfig1.connectionTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-1774";
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test18384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18384");
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
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-34794");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test18385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18385");
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
        long long30 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.dataSourceClassName = "HikariPool-584";
        long long33 = hikariConfig11.maxLifetime;
        java.lang.String str34 = hikariConfig11.getConnectionCustomizerClassName();
        int int35 = hikariConfig11.getMinimumPoolSize();
        java.lang.String str36 = hikariConfig11.getConnectionCustomizerClassName();
        hikariConfig11.connectionTimeout = 0L;
        hikariConfig11.connectionTestQuery = "HikariPool-44025";
        hikariConfig11.catalog = "HikariPool-29892";
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test18386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setAcquireRetries(0);
        int int13 = hikariConfig10.getAcquireIncrement();
        java.lang.String str14 = hikariConfig10.connectionTestQuery;
        java.lang.String str15 = hikariConfig10.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18387");
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
        java.lang.String str21 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isAutoCommit;
        int int26 = hikariConfig24.getAcquireIncrement();
        int int27 = hikariConfig24.getAcquireIncrement();
        java.lang.String str28 = hikariConfig24.connectionCustomizerClassName;
        hikariConfig24.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig24.connectionCustomizer;
        hikariConfig24.transactionIsolation = (byte) 100;
        long long34 = hikariConfig24.getIdleTimeout();
        hikariConfig24.setCatalog("HikariPool-6");
        java.lang.String str37 = hikariConfig24.dataSourceClassName;
        hikariConfig24.setTransactionIsolation("HikariPool-893");
        long long40 = hikariConfig24.getConnectionTimeout();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int43 = hikariConfig42.getTransactionIsolation();
        hikariConfig42.setRegisterMbeans(false);
        java.lang.String str46 = hikariConfig42.transactionIsolationName;
        int int47 = hikariConfig42.getMaximumPoolSize();
        int int48 = hikariConfig42.transactionIsolation;
        java.util.Properties properties49 = hikariConfig42.dataSourceProperties;
        boolean boolean50 = hikariConfig42.isRegisterMbeans;
        boolean boolean51 = hikariConfig42.isInitializationFailFast;
        hikariConfig42.isRegisterMbeans = false;
        hikariConfig42.setIdleTimeout(1L);
        java.lang.String str56 = hikariConfig42.getConnectionCustomizerClassName();
        hikariConfig42.setConnectionInitSql("HikariPool-777");
        java.lang.String str59 = hikariConfig42.catalog;
        java.util.Properties properties60 = hikariConfig42.dataSourceProperties;
        hikariConfig24.dataSourceProperties = properties60;
        hikariConfig1.setDataSourceProperties(properties60);
        java.lang.String str63 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
        org.junit.Assert.assertNull(str37);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test18388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setCatalog("HikariPool-707");
        hikariConfig1.minPoolSize = '#';
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        int int18 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test18389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaximumPoolSize(0);
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.catalog = "HikariPool-9";
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test18390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18390");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str10 = hikariConfig0.catalog;
        int int11 = hikariConfig0.transactionIsolation;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-49399" + "'", str1, "HikariPool-49399");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-49399" + "'", str7, "HikariPool-49399");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test18391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18391");
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
        hikariConfig31.isInitializationFailFast = false;
        java.lang.String str35 = hikariConfig31.dataSourceClassName;
        int int36 = hikariConfig31.getAcquireIncrement();
        javax.sql.DataSource dataSource37 = hikariConfig31.getDataSource();
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test18392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18392");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-472");
        hikariConfig1.setInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test18393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18393");
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
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionInitSql = "HikariPool-413";
        hikariConfig1.catalog = "HikariPool-707";
        hikariConfig1.acquireRetries = ' ';
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig1.catalog;
        java.lang.String str19 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-707" + "'", str18, "HikariPool-707");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-707" + "'", str19, "HikariPool-707");
    }

    @Test
    public void test18395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        hikariConfig0.connectionTestQuery = "HikariPool-292";
        int int4 = hikariConfig0.acquireRetries;
        long long5 = hikariConfig0.leakDetectionThreshold;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18396");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18397");
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
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18398");
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
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18399");
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
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        long long22 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test18400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18400");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionTimeout = 3;
        int int7 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test18401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18401");
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
        int int27 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource28 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTestQuery("HikariPool-3346");
        int int32 = hikariConfig1.minPoolSize;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test18402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18402");
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
        java.lang.String str37 = hikariConfig10.connectionCustomizerClassName;
        hikariConfig10.setMaxLifetime(10L);
        hikariConfig10.isInitializationFailFast = true;
        hikariConfig10.setMaximumPoolSize(0);
        hikariConfig10.setCatalog("HikariPool-31553");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-49417" + "'", str1, "HikariPool-49417");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-49418" + "'", str20, "HikariPool-49418");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test18403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18403");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setIdleTimeout((long) (short) -1);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize((int) ' ');
        long long14 = hikariConfig0.connectionTimeout;
        hikariConfig0.connectionTestQuery = "HikariPool-3508";
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test18404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.connectionInitSql = "HikariPool-472";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer28;
        long long30 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = 100;
        boolean boolean33 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-49422" + "'", str11, "HikariPool-49422");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test18405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18405");
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
        hikariConfig1.connectionInitSql = "HikariPool-657";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.dataSource = dataSource19;
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test18406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18406");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.connectionTestQuery;
        long long14 = hikariConfig9.getIdleTimeout();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        java.lang.String str21 = hikariConfig16.connectionCustomizerClassName;
        hikariConfig16.setConnectionTestQuery("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig16.connectionCustomizer;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setConnectionInitSql("hi!");
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.dataSourceClassName = "";
        hikariConfig31.setTransactionIsolation("");
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
        hikariConfig31.dataSourceProperties = properties58;
        hikariConfig27.dataSourceProperties = properties58;
        hikariConfig16.setDataSourceProperties(properties58);
        hikariConfig9.dataSourceProperties = properties58;
        hikariConfig1.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig65.setJdbc4ConnectionTest(false);
        long long68 = hikariConfig65.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties58);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 60L + "'", long68 == 60L);
    }

    @Test
    public void test18407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18407");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isInitializationFailFast = false;
        long long10 = hikariConfig1.maxLifetime;
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        long long13 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test18408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18408");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionInitSql = "HikariPool-1293";
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18409");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.lang.String str8 = hikariConfig1.getCatalog();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getIdleTimeout();
        int int12 = hikariConfig10.acquireRetries;
        long long13 = hikariConfig10.getConnectionTimeout();
        int int14 = hikariConfig10.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig10.leakDetectionThreshold = ' ';
        hikariConfig10.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.leakDetectionThreshold = 100;
        hikariConfig22.minPoolSize = (byte) 1;
        hikariConfig22.catalog = "";
        boolean boolean29 = hikariConfig22.isRegisterMbeans;
        java.lang.String str30 = hikariConfig22.transactionIsolationName;
        boolean boolean31 = hikariConfig22.isRegisterMbeans;
        hikariConfig22.setDataSourceClassName("HikariPool-168");
        hikariConfig22.isAutoCommit = true;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.minPoolSize;
        hikariConfig37.leakDetectionThreshold = 1800000L;
        long long46 = hikariConfig37.maxLifetime;
        long long47 = hikariConfig37.maxLifetime;
        java.util.Properties properties48 = hikariConfig37.getDataSourceProperties();
        hikariConfig22.dataSourceProperties = properties48;
        hikariConfig10.setDataSourceProperties(properties48);
        hikariConfig1.dataSourceProperties = properties48;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test18410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18410");
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
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18411");
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
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getMinimumPoolSize();
        int int7 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18413");
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
        hikariConfig1.connectionTestQuery = "HikariPool-517";
        java.lang.String str17 = hikariConfig1.catalog;
        int int18 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.maxLifetime = 3;
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-49443" + "'", str21, "HikariPool-49443");
    }

    @Test
    public void test18414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        java.lang.String str10 = hikariConfig1.getCatalog();
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.setLeakDetectionThreshold(5000L);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test18416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18416");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int11 = hikariConfig1.minPoolSize;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        int int13 = hikariConfig1.transactionIsolation;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.acquireRetries = (short) 10;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.leakDetectionThreshold = (byte) 0;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.setMaximumPoolSize(1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        long long19 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.maxLifetime = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setMaximumPoolSize((int) '4');
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-481";
        boolean boolean17 = hikariConfig1.isAutoCommit();
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18419");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setUseInstrumentation(false);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        int int9 = hikariConfig0.getTransactionIsolation();
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test18421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18421");
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
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource21 = hikariConfig1.dataSource;
        hikariConfig1.setPoolName("HikariPool-33042");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test18422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18422");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        hikariConfig1.maxPoolSize = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test18423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18423");
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
        hikariConfig1.acquireRetries = '#';
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18424");
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
        hikariConfig31.connectionInitSql = "HikariPool-2739";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig31.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test18425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18425");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setCatalog("HikariPool-707");
        hikariConfig1.minPoolSize = '#';
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.dataSourceClassName = "HikariPool-770";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18426");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18427");
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
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18428");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.poolName = "HikariPool-410";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        long long16 = hikariConfig11.getIdleTimeout();
        java.lang.String str17 = hikariConfig11.getConnectionTestQuery();
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        long long20 = hikariConfig1.idleTimeout;
        hikariConfig1.maxLifetime = 3L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
    }

    @Test
    public void test18429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18429");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.minPoolSize = (-1);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        long long19 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-44672");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
    }

    @Test
    public void test18430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18430");
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
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig29.setAutoCommit(true);
        int int32 = hikariConfig29.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test18431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18431");
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
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18432");
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
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-3031";
        int int17 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        int int20 = hikariConfig1.acquireRetries;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setTransactionIsolation("HikariPool-44672");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test18433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18433");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isInitializationFailFast = true;
        int int18 = hikariConfig12.acquireRetries;
        hikariConfig12.setMaxLifetime((long) (-1));
        hikariConfig12.setIdleTimeout((long) (-1));
        hikariConfig12.catalog = "HikariPool-489";
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setDataSourceClassName("");
        hikariConfig25.validate();
        java.util.Properties properties29 = hikariConfig25.getDataSourceProperties();
        hikariConfig12.dataSourceProperties = properties29;
        hikariConfig12.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig1.addDataSourceProperty("HikariPool-42880", (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test18434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18434");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.transactionIsolation = (byte) 1;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setIdleTimeout((long) ' ');
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        int int16 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test18435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18435");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.poolName;
        hikariConfig15.setMinimumPoolSize((int) '4');
        hikariConfig15.minPoolSize = (byte) 0;
        long long21 = hikariConfig15.maxLifetime;
        hikariConfig1.addDataSourceProperty("HikariPool-294", (java.lang.Object) long21);
        java.lang.String str23 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-49475" + "'", str16, "HikariPool-49475");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.maxPoolSize = (byte) 1;
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18437");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireRetries = (-1);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.dataSourceClassName = "";
        hikariConfig11.connectionTimeout = 10L;
        hikariConfig11.connectionTestQuery = "HikariPool-104";
        int int18 = hikariConfig11.transactionIsolation;
        hikariConfig11.setAutoCommit(false);
        int int21 = hikariConfig11.getMaximumPoolSize();
        hikariConfig11.connectionInitSql = "HikariPool-220";
        hikariConfig11.connectionInitSql = "HikariPool-312";
        java.util.Properties properties26 = hikariConfig11.dataSourceProperties;
        hikariConfig11.setTransactionIsolation("HikariPool-4817");
        java.util.Properties properties29 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties29);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test18438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("HikariPool-1159");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.transactionIsolation = 60;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18439");
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
        java.lang.String str46 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str49 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource52 = hikariConfig1.dataSource;
        int int53 = hikariConfig1.acquireRetries;
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
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-49481" + "'", str45, "HikariPool-49481");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-55" + "'", str49, "HikariPool-55");
        org.junit.Assert.assertNull(dataSource52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test18440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18440");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18441");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.maxLifetime;
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        int int12 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test18442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18442");
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
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18443");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.dataSourceClassName = "HikariPool-966";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18444");
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
        hikariConfig1.dataSourceClassName = "HikariPool-2190";
        long long22 = hikariConfig1.idleTimeout;
        hikariConfig1.maxPoolSize = 35;
        java.lang.String str25 = hikariConfig1.connectionTestQuery;
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setTransactionIsolation("HikariPool-8267");
        hikariConfig1.connectionTestQuery = "HikariPool-859";
        java.util.Properties properties34 = hikariConfig1.dataSourceProperties;
        int int35 = hikariConfig1.acquireRetries;
        java.lang.String str36 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-859" + "'", str36, "HikariPool-859");
    }

    @Test
    public void test18445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18445");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-17976");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18446");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        long long13 = hikariConfig1.connectionTimeout;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        long long15 = hikariConfig1.idleTimeout;
        long long16 = hikariConfig1.idleTimeout;
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test18447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18447");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test18448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18448");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.isJdbc4connectionTest = true;
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxLifetime = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18449");
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
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxLifetime = 2147483647L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18450");
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
        hikariConfig1.setTransactionIsolation("HikariPool-483");
        hikariConfig1.leakDetectionThreshold = 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18451");
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
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize(87);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig1.connectionCustomizer;
        java.lang.String str22 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        hikariConfig1.minPoolSize = '4';
        hikariConfig1.setIdleTimeout(5000L);
    }

    @Test
    public void test18453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test18454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 1800000L;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.catalog = "HikariPool-2673";
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3849");
        hikariConfig1.idleTimeout = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-49501" + "'", str14, "HikariPool-49501");
    }

    @Test
    public void test18455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.minPoolSize = ' ';
        hikariConfig1.setPoolName("HikariPool-995");
        java.lang.String str13 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-995" + "'", str13, "HikariPool-995");
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test18456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-449");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-49503" + "'", str8, "HikariPool-49503");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-449" + "'", str16, "HikariPool-449");
    }

    @Test
    public void test18457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18457");
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
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        java.lang.String str22 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-49505" + "'", str20, "HikariPool-49505");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18458");
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
        java.lang.String str64 = hikariConfig63.getConnectionCustomizerClassName();
        long long65 = hikariConfig63.getAcquireRetryDelay();
        hikariConfig63.setAcquireRetries(0);
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
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test18459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(true);
        long long12 = hikariConfig1.idleTimeout;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18460");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.idleTimeout = 32L;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-114" + "'", str10, "HikariPool-114");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-114" + "'", str11, "HikariPool-114");
    }

    @Test
    public void test18461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18461");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18462");
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
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig49.connectionInitSql = "HikariPool-106";
        java.lang.String str52 = hikariConfig49.getConnectionInitSql();
        javax.sql.DataSource dataSource53 = null;
        hikariConfig49.dataSource = dataSource53;
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "HikariPool-106" + "'", str52, "HikariPool-106");
    }

    @Test
    public void test18463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18463");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = null;
        hikariConfig26.connectionCustomizer = iConnectionCustomizer30;
        java.lang.String str32 = hikariConfig26.getCatalog();
        java.util.Properties properties33 = hikariConfig26.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test18464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18464");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.getAcquireRetries();
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18465");
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
        hikariConfig1.dataSourceClassName = "HikariPool-851";
        hikariConfig1.acquireRetries = (byte) 0;
        hikariConfig1.setTransactionIsolation("");
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
    }

    @Test
    public void test18466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18466");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.maxPoolSize = 97;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 52);
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        long long11 = hikariConfig1.getIdleTimeout();
        int int12 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-24664");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-49536" + "'", str13, "HikariPool-49536");
    }

    @Test
    public void test18469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18469");
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
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        int int21 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18471");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-41932");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-41932 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18472");
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
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAcquireRetries(97);
        hikariConfig1.catalog = "HikariPool-6572";
        int int19 = hikariConfig1.minPoolSize;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long12 = hikariConfig1.getConnectionTimeout();
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        long long14 = hikariConfig1.connectionTimeout;
        long long15 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.catalog = "HikariPool-4124";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18474");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18475");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.poolName = "HikariPool-2761";
        java.lang.String str16 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-2761" + "'", str16, "HikariPool-2761");
    }

    @Test
    public void test18476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionTimeout = 87L;
        hikariConfig1.setIdleTimeout((-1L));
        hikariConfig1.setConnectionTestQuery("HikariPool-34683");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18477");
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
        long long21 = hikariConfig11.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig11.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test18478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18478");
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
        boolean boolean47 = hikariConfig1.isRegisterMbeans;
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test18479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18479");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-27922";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18480");
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
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-308");
        hikariConfig1.minPoolSize = '#';
        boolean boolean30 = hikariConfig1.isInitializationFailFast;
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.connectionTimeout;
        long long33 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-308" + "'", str31, "HikariPool-308");
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test18481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18481");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-1503");
        hikariConfig1.setInitializationFailFast(true);
        int int21 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test18482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18482");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.transactionIsolation = '#';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.maxLifetime = 0L;
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-551";
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-49560" + "'", str9, "HikariPool-49560");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-49560" + "'", str12, "HikariPool-49560");
    }

    @Test
    public void test18484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18484");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        hikariConfig1.setPoolName("HikariPool-657");
        int int12 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.setAutoCommit(true);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.leakDetectionThreshold = (short) 0;
        hikariConfig1.setTransactionIsolation("HikariPool-5821");
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18485");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        int int13 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test18486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-472");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.maxLifetime = 60L;
        long long14 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test18487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18487");
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
        hikariConfig1.acquireRetries = 97;
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isInitializationFailFast = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setIdleTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18488");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.maxPoolSize = (-1);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test18489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18489");
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
        int int50 = hikariConfig1.getAcquireRetries();
        hikariConfig1.transactionIsolationName = "HikariPool-1952";
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
    }

    @Test
    public void test18490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.maxLifetime = 52L;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test18491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize(3);
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        boolean boolean19 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-42603";
        hikariConfig1.setDataSourceClassName("HikariPool-44120");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18492");
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
        hikariConfig1.idleTimeout = (short) 1;
        hikariConfig1.maxLifetime = (short) 0;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18493");
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
        hikariConfig1.setPoolName("HikariPool-2270");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-49577" + "'", str15, "HikariPool-49577");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18494");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18495");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        hikariConfig1.setPoolName("HikariPool-253");
        hikariConfig1.setAutoCommit(false);
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test18496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18496");
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
        hikariConfig18.setLeakDetectionThreshold((long) (short) 1);
        int int35 = hikariConfig18.minPoolSize;
        hikariConfig18.maxPoolSize = (byte) 10;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test18497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18497");
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
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45197");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18498");
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
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-320" + "'", str19, "HikariPool-320");
    }

    @Test
    public void test18499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18499");
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
        hikariConfig31.idleTimeout = 32;
        java.lang.String str41 = hikariConfig31.poolName;
        int int42 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.transactionIsolationName = "HikariPool-1362";
        javax.sql.DataSource dataSource45 = hikariConfig31.getDataSource();
        long long46 = hikariConfig31.getMaxLifetime();
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
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-49589" + "'", str41, "HikariPool-49589");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(dataSource45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
    }

    @Test
    public void test18500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18500");
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
        hikariConfig1.setConnectionInitSql("HikariPool-6586");
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}
