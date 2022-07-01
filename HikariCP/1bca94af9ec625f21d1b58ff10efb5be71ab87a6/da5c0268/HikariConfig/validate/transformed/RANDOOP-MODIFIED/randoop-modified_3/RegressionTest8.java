import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
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
        java.lang.String str17 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3774");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3774 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-7356" + "'", str17, "HikariPool-7356");
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
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
        int int18 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionInitSql = "HikariPool-300";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
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
        int int19 = hikariConfig10.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
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
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-70");
        hikariConfig1.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.transactionIsolationName = "HikariPool-154";
        java.lang.String str12 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
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
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig25.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
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
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.connectionInitSql = "hi!";
        hikariConfig23.acquireIncrement = (byte) 100;
        hikariConfig23.setMinimumPoolSize((int) (short) 0);
        hikariConfig23.setCatalog("hi!");
        java.lang.String str33 = hikariConfig23.getConnectionCustomizerClassName();
        long long34 = hikariConfig23.getMaxLifetime();
        hikariConfig23.isRegisterMbeans = false;
        hikariConfig23.maxPoolSize = 35;
        hikariConfig23.setDataSourceClassName("HikariPool-283");
        long long41 = hikariConfig23.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-6826", (java.lang.Object) long41);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        long long8 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionTimeout = (byte) 0;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIsolateInternalQueries(false);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setIsolateInternalQueries(true);
        int int14 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
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
        long long17 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5531");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5531 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
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
        hikariConfig1.isJdbc4connectionTest = true;
        long long24 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = (short) 100;
        java.lang.String str10 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-7421" + "'", str10, "HikariPool-7421");
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
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
        int int20 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str21 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
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
        hikariConfig1.isAutoCommit = true;
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7424" + "'", str9, "HikariPool-7424");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
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
        hikariConfig1.setAcquireRetries((int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-791");
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setTransactionIsolation("HikariPool-100");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
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
        hikariConfig10.setCatalog("HikariPool-214");
        java.lang.String str20 = hikariConfig10.connectionInitSql;
        int int21 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setConnectionTestQuery("HikariPool-2210");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
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
        int int32 = hikariConfig31.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-697";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7455" + "'", str9, "HikariPool-7455");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-7455" + "'", str13, "HikariPool-7455");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5678");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5678 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
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
        java.lang.String str15 = hikariConfig1.getCatalog();
        int int16 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaximumPoolSize(35);
        hikariConfig1.setMaxLifetime(5000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
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
        java.lang.String str11 = hikariConfig10.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3338";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
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
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
        boolean boolean19 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-7464" + "'", str17, "HikariPool-7464");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
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
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.acquireIncrement = (byte) 100;
        long long34 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
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
        boolean boolean13 = hikariConfig12.isRegisterMbeans();
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 10);
        int int18 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
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
        hikariConfig19.setRegisterMbeans(true);
        hikariConfig19.connectionTestQuery = "HikariPool-1620";
        hikariConfig19.setTransactionIsolation("HikariPool-1011");
        long long26 = hikariConfig19.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
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
        hikariConfig1.catalog = "HikariPool-1057";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7481" + "'", str9, "HikariPool-7481");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.acquireIncrement = (short) 100;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setTransactionIsolation("HikariPool-823");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
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
        hikariConfig1.jdbcUrl = "HikariPool-283";
        java.lang.String str22 = hikariConfig1.getPoolName();
        hikariConfig1.isAutoCommit = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-7495" + "'", str22, "HikariPool-7495");
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
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
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7496" + "'", str9, "HikariPool-7496");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1847");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1847 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
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
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        long long16 = hikariConfig1.leakDetectionThreshold;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) 1);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-7508" + "'", str10, "HikariPool-7508");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-77" + "'", str13, "HikariPool-77");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
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
        java.lang.String str19 = hikariConfig1.getPoolName();
        hikariConfig1.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-7515" + "'", str19, "HikariPool-7515");
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
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
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.idleTimeout = '#';
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7521" + "'", str9, "HikariPool-7521");
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
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
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
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
        hikariConfig1.maxPoolSize = 3;
        hikariConfig1.setTransactionIsolation("HikariPool-4759");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
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
        hikariConfig1.jdbcUrl = "HikariPool-241";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = (short) 100;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
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
        long long18 = hikariConfig1.leakDetectionThreshold;
        long long19 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        long long8 = hikariConfig1.connectionTimeout;
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-168");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-284";
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.connectionInitSql = "HikariPool-18";
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.setTransactionIsolation("HikariPool-2479");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig1.connectionCustomizer;
        int int37 = hikariConfig1.minPoolSize;
        boolean boolean38 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7569" + "'", str9, "HikariPool-7569");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
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
        hikariConfig5.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
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
        hikariConfig14.setIdleTimeout((long) (short) -1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
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
        hikariConfig1.minPoolSize = '4';
        long long57 = hikariConfig1.getAcquireRetryDelay();
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
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
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
        boolean boolean23 = hikariConfig1.isInitializationFailFast;
        long long24 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        int int8 = hikariConfig5.maxPoolSize;
        java.lang.String str9 = hikariConfig5.connectionInitSql;
        int int10 = hikariConfig5.getAcquireIncrement();
        int int11 = hikariConfig5.getMaximumPoolSize();
        boolean boolean12 = hikariConfig5.isInitializationFailFast;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig5.dataSource = dataSource13;
        hikariConfig5.setReadOnly(false);
        int int17 = hikariConfig5.acquireIncrement;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
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
        int int14 = hikariConfig1.acquireRetries;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-646");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-646' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
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
        long long15 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-21";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6791");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6791 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-683");
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.isReadOnly = true;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        long long15 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
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
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.connectionInitSql = "hi!";
        hikariConfig31.acquireIncrement = (byte) 100;
        hikariConfig31.setMinimumPoolSize((int) (short) 0);
        hikariConfig31.setJdbcUrl("hi!");
        long long41 = hikariConfig31.getLeakDetectionThreshold();
        int int42 = hikariConfig31.minPoolSize;
        hikariConfig31.setPoolName("HikariPool-154");
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig46.maxPoolSize = (byte) 0;
        java.util.Properties properties49 = hikariConfig46.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        java.lang.String str51 = hikariConfig50.transactionIsolationName;
        hikariConfig50.leakDetectionThreshold = (short) 100;
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        long long56 = hikariConfig55.getAcquireRetryDelay();
        hikariConfig55.connectionInitSql = "hi!";
        hikariConfig55.acquireIncrement = (byte) 100;
        hikariConfig55.setMinimumPoolSize((int) (short) 0);
        hikariConfig55.connectionTestQuery = "";
        hikariConfig55.jdbcUrl = "HikariPool-45";
        hikariConfig55.dataSourceClassName = "hi!";
        hikariConfig55.setIdleTimeout((long) (short) 100);
        int int71 = hikariConfig55.minPoolSize;
        java.util.Properties properties72 = hikariConfig55.dataSourceProperties;
        hikariConfig50.dataSourceProperties = properties72;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig31.setDataSourceProperties(properties72);
        hikariConfig1.dataSourceProperties = properties72;
        hikariConfig1.setAcquireRetries((int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNull(str51);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(properties72);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.maxPoolSize;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxPoolSize = (byte) 10;
        hikariConfig1.poolName = "HikariPool-486";
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
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
        java.util.Properties properties29 = null;
        hikariConfig1.dataSourceProperties = properties29;
        hikariConfig1.maxPoolSize = 'a';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7647" + "'", str9, "HikariPool-7647");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
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
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        long long30 = hikariConfig28.maxLifetime;
        java.util.Properties properties31 = hikariConfig28.getDataSourceProperties();
        hikariConfig28.isIsolateInternalQueries = false;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        long long37 = hikariConfig35.maxLifetime;
        java.util.Properties properties38 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig28.setDataSourceProperties(properties38);
        hikariConfig1.dataSourceProperties = properties38;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer42 = hikariConfig1.connectionCustomizer;
        java.lang.String str43 = hikariConfig1.getConnectionCustomizerClassName();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(iConnectionCustomizer42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
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
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
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
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.jdbcUrl = "HikariPool-4644";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-7667" + "'", str10, "HikariPool-7667");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
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
        boolean boolean14 = hikariConfig1.isReadOnly;
        java.lang.String str15 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
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
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean17 = hikariConfig1.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
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
        hikariConfig1.catalog = "HikariPool-177";
        long long28 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.lang.String str34 = hikariConfig33.getDataSourceClassName();
        hikariConfig33.setTransactionIsolation("hi!");
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.connectionInitSql = "hi!";
        hikariConfig38.acquireIncrement = (byte) 100;
        hikariConfig38.setMinimumPoolSize((int) (short) 0);
        java.lang.String str46 = hikariConfig38.dataSourceClassName;
        long long47 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.idleTimeout = (byte) -1;
        java.util.Properties properties50 = hikariConfig38.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties50;
        java.lang.String str52 = hikariConfig33.getConnectionTestQuery();
        hikariConfig33.setIdleTimeout(52L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer55 = null;
        hikariConfig33.connectionCustomizer = iConnectionCustomizer55;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-3040", (java.lang.Object) iConnectionCustomizer55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-7673" + "'", str17, "HikariPool-7673");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-7672" + "'", str21, "HikariPool-7672");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.acquireRetryDelay = 750L;
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-127" + "'", str12, "HikariPool-127");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-921";
        hikariConfig1.maxPoolSize = '#';
        hikariConfig1.transactionIsolation = (short) -1;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionInitSql = "hi!";
        hikariConfig18.acquireIncrement = (byte) 100;
        hikariConfig18.setMinimumPoolSize((int) (short) 0);
        java.lang.String str26 = hikariConfig18.dataSourceClassName;
        long long27 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionTimeout = (byte) 10;
        hikariConfig18.leakDetectionThreshold = 1L;
        java.lang.String str32 = hikariConfig18.connectionCustomizerClassName;
        java.lang.String str33 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setUseInstrumentation(false);
        java.lang.String str36 = hikariConfig18.getPoolName();
        javax.sql.DataSource dataSource37 = null;
        hikariConfig18.setDataSource(dataSource37);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-1192", (java.lang.Object) dataSource37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-7679" + "'", str36, "HikariPool-7679");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.connectionInitSql = "hi!";
        hikariConfig9.acquireIncrement = (byte) 100;
        hikariConfig9.setMinimumPoolSize((int) (short) 0);
        hikariConfig9.connectionTestQuery = "";
        long long19 = hikariConfig9.getConnectionTimeout();
        int int20 = hikariConfig9.getMaximumPoolSize();
        long long21 = hikariConfig9.maxLifetime;
        hikariConfig9.setDataSourceClassName("HikariPool-117");
        boolean boolean24 = hikariConfig9.isAutoCommit;
        javax.sql.DataSource dataSource25 = null;
        hikariConfig9.dataSource = dataSource25;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (-1);
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        long long33 = hikariConfig28.maxLifetime;
        hikariConfig28.setLeakDetectionThreshold(750L);
        int int36 = hikariConfig28.getMinimumPoolSize();
        hikariConfig28.acquireRetries = 'a';
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        long long41 = hikariConfig40.getAcquireRetryDelay();
        hikariConfig40.connectionInitSql = "hi!";
        hikariConfig40.acquireIncrement = (byte) 100;
        hikariConfig40.setMinimumPoolSize((int) (short) 0);
        java.lang.String str48 = hikariConfig40.dataSourceClassName;
        long long49 = hikariConfig40.getAcquireRetryDelay();
        hikariConfig40.idleTimeout = (byte) -1;
        java.util.Properties properties52 = hikariConfig40.dataSourceProperties;
        hikariConfig28.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig9.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig1.dataSourceProperties = properties52;
        java.lang.String str58 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolation = 52;
        hikariConfig1.minPoolSize = 1;
        java.lang.String str63 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNull(str48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 32L + "'", long49 == 32L);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
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
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTimeout((long) 100);
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
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
        hikariConfig1.jdbcUrl = "HikariPool-7515";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7112");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7112 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
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
        hikariConfig1.maxLifetime = 5000L;
        hikariConfig1.leakDetectionThreshold = 600000L;
        hikariConfig1.acquireIncrement = 358;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.jdbcUrl = "HikariPool-266";
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.connectionInitSql = "HikariPool-1613";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
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
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        int int19 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
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
        hikariConfig1.setCatalog("HikariPool-4187");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
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
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
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
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-335" + "'", str23, "HikariPool-335");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        java.lang.String str8 = hikariConfig1.getCatalog();
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-139" + "'", str10, "HikariPool-139");
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig10.dataSource = dataSource16;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
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
        hikariConfig1.setMaximumPoolSize(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setDataSourceClassName("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
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
        java.lang.String str26 = hikariConfig1.poolName;
        boolean boolean27 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-7739" + "'", str26, "HikariPool-7739");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
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
        boolean boolean48 = hikariConfig29.isJdbc4ConnectionTest();
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
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
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
        hikariConfig1.isAutoCommit = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setIdleTimeout((long) (-1));
        int int18 = hikariConfig1.getAcquireRetries();
        java.lang.String str19 = hikariConfig1.connectionTestQuery;
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
        long long21 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7771" + "'", str9, "HikariPool-7771");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-45" + "'", str19, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
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
        hikariConfig30.connectionTestQuery = "HikariPool-116";
        java.lang.String str37 = hikariConfig30.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
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
        boolean boolean54 = hikariConfig28.isReadOnly();
        long long55 = hikariConfig28.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2147483647L + "'", long38 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2147483647L + "'", long44 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer45);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 2147483647L + "'", long55 == 2147483647L);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-789");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-789' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7790" + "'", str9, "HikariPool-7790");
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
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
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1532");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1532 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
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
        hikariConfig1.setIsolateInternalQueries(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
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
        boolean boolean26 = hikariConfig20.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7829" + "'", str9, "HikariPool-7829");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize(358);
        hikariConfig1.setAcquireRetryDelay((long) 52);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        boolean boolean13 = hikariConfig1.isReadOnly;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
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
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean23 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1475");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1475 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
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
        int int34 = hikariConfig1.maxPoolSize;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isIsolateInternalQueries = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
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
        boolean boolean13 = hikariConfig1.isAutoCommit();
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.lang.String str15 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.idleTimeout = 600000L;
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.transactionIsolationName = "HikariPool-218";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
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
        hikariConfig1.isRegisterMbeans = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-1716");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1716' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
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
        hikariConfig22.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        int int19 = hikariConfig1.minPoolSize;
        java.lang.String str20 = hikariConfig1.connectionInitSql;
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setTransactionIsolation("HikariPool-1519");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7771");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7771 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
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
        hikariConfig1.connectionInitSql = "HikariPool-2021";
        hikariConfig1.setMaximumPoolSize(97);
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
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
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
        hikariConfig1.setPoolName("");
        long long16 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1518";
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(properties11);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
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
        boolean boolean21 = hikariConfig5.isAutoCommit();
        hikariConfig5.acquireRetryDelay = 10L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
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
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getAcquireRetries();
        boolean boolean20 = hikariConfig18.isIsolateInternalQueries;
        hikariConfig18.connectionCustomizerClassName = "HikariPool-474";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
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
        hikariConfig1.setIdleTimeout((long) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
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
        hikariConfig10.setConnectionTestQuery("HikariPool-84");
        java.lang.String str19 = hikariConfig10.connectionTestQuery;
        hikariConfig10.setCatalog("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-84" + "'", str19, "HikariPool-84");
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setJdbc4ConnectionTest(true);
        int int8 = hikariConfig5.maxPoolSize;
        hikariConfig5.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        int int6 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isIsolateInternalQueries();
        hikariConfig9.setIsolateInternalQueries(false);
        long long13 = hikariConfig9.acquireRetryDelay;
        boolean boolean14 = hikariConfig9.isInitializationFailFast();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig9);
        hikariConfig9.setInitializationFailFast(true);
        java.lang.String str18 = hikariConfig9.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
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
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        long long14 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
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
        hikariConfig1.setConnectionInitSql("HikariPool-333");
        long long22 = hikariConfig1.getAcquireRetryDelay();
        int int23 = hikariConfig1.transactionIsolation;
        hikariConfig1.setPoolName("HikariPool-85");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.dataSourceClassName = "HikariPool-739";
        hikariConfig1.setDataSourceClassName("HikariPool-124");
        hikariConfig1.poolName = "HikariPool-5047";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
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
        hikariConfig1.setMaximumPoolSize(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
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
        hikariConfig1.catalog = "HikariPool-85";
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime(1800000L);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7937" + "'", str9, "HikariPool-7937");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-7937" + "'", str13, "HikariPool-7937");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
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
        long long18 = hikariConfig15.getIdleTimeout();
        boolean boolean19 = hikariConfig15.isAutoCommit();
        hikariConfig15.maxPoolSize = '4';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
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
        hikariConfig1.setAcquireRetryDelay((long) 60);
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionTimeout = (byte) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
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
        boolean boolean15 = hikariConfig1.isReadOnly;
        hikariConfig1.setAcquireRetries(10);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7942" + "'", str9, "HikariPool-7942");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
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
        java.lang.String str29 = hikariConfig25.getConnectionInitSql();
        javax.sql.DataSource dataSource30 = null;
        hikariConfig25.dataSource = dataSource30;
        boolean boolean32 = hikariConfig25.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
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
        hikariConfig1.dataSourceClassName = "HikariPool-2293";
        boolean boolean16 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-54");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-54 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-6892");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
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
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-273" + "'", str13, "HikariPool-273");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-123");
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.dataSourceClassName = "HikariPool-3298";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-7968" + "'", str9, "HikariPool-7968");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
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
        hikariConfig16.setIsolateInternalQueries(false);
        long long25 = hikariConfig16.getIdleTimeout();
        hikariConfig16.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
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
        hikariConfig1.setIdleTimeout((long) ' ');
        long long20 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
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
        java.lang.String str17 = hikariConfig14.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-7977" + "'", str17, "HikariPool-7977");
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-28");
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3970 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4327");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4327 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig16.maxPoolSize = 52;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5449");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5449 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAutoCommit(true);
        int int7 = hikariConfig1.transactionIsolation;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.poolName = "HikariPool-268";
        java.lang.String str11 = hikariConfig1.poolName;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = 35;
        int int15 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-268" + "'", str11, "HikariPool-268");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.connectionTimeout = 750L;
        hikariConfig1.setJdbc4ConnectionTest(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-8004" + "'", str11, "HikariPool-8004");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5355");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5355 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isReadOnly = true;
        hikariConfig1.poolName = "HikariPool-167";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8007" + "'", str9, "HikariPool-8007");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1203");
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        long long16 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-1203" + "'", str15, "HikariPool-1203");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
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
        hikariConfig13.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
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
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str14 = hikariConfig1.catalog;
        hikariConfig1.maxPoolSize = 60;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
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
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        hikariConfig1.minPoolSize = 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        hikariConfig1.catalog = "HikariPool-426";
        int int10 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setJdbcUrl("HikariPool-581");
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
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
        hikariConfig1.isIsolateInternalQueries = false;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTimeout(1800000L);
        hikariConfig1.connectionTimeout = 'a';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
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
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setIdleTimeout((long) 32);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
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
        int int15 = hikariConfig1.transactionIsolation;
        long long16 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
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
        boolean boolean31 = hikariConfig19.isAutoCommit;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.lang.String str34 = hikariConfig33.getDataSourceClassName();
        hikariConfig33.setTransactionIsolation("hi!");
        hikariConfig33.acquireRetryDelay = '4';
        boolean boolean39 = hikariConfig33.isRegisterMbeans;
        java.util.Properties properties40 = hikariConfig33.getDataSourceProperties();
        hikariConfig19.dataSourceProperties = properties40;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
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
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.acquireRetries = 10;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
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
        boolean boolean56 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 97L + "'", long49 == 97L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
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
        hikariConfig1.transactionIsolation = 0;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.transactionIsolationName = "HikariPool-125";
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8068" + "'", str9, "HikariPool-8068");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8068" + "'", str13, "HikariPool-8068");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        long long11 = hikariConfig1.connectionTimeout;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-279";
        int int15 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        com.zaxxer.hikari.HikariConfig.IDLE_TIMEOUT = 3;
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
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
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMinimumPoolSize(100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        int int20 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionTestQuery = "HikariPool-7194";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
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
        hikariConfig1.setIsolateInternalQueries(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
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
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-425");
        hikariConfig1.idleTimeout = 97;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8081" + "'", str9, "HikariPool-8081");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8081" + "'", str13, "HikariPool-8081");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long20 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setTransactionIsolation("HikariPool-186");
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries(1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
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
        hikariConfig10.isAutoCommit = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
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
        hikariConfig1.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-8086" + "'", str11, "HikariPool-8086");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
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
        hikariConfig1.connectionInitSql = "HikariPool-644";
        long long21 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-8096" + "'", str17, "HikariPool-8096");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
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
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        long long20 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.isJdbc4connectionTest = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-45" + "'", str19, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-152");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-152 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
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
        boolean boolean23 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.String str26 = hikariConfig1.connectionInitSql;
        hikariConfig1.setAcquireRetries(358);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-8109" + "'", str17, "HikariPool-8109");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
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
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.setConnectionInitSql("HikariPool-7725");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-8113" + "'", str15, "HikariPool-8113");
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
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
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.minPoolSize = (short) 0;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str23 = hikariConfig22.getDataSourceClassName();
        hikariConfig22.setTransactionIsolation("hi!");
        hikariConfig22.acquireRetryDelay = '4';
        hikariConfig22.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.jdbcUrl = "HikariPool-281";
        hikariConfig31.idleTimeout = (short) 0;
        int int36 = hikariConfig31.maxPoolSize;
        java.util.Properties properties37 = hikariConfig31.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties37);
        hikariConfig1.setMaxLifetime(5000L);
        java.lang.String str41 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
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
        long long20 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.connectionTimeout = 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2420");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2420 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-335";
        hikariConfig1.acquireRetries = (short) 10;
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaximumPoolSize(100);
        int int11 = hikariConfig1.maxPoolSize;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
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
        hikariConfig1.setAcquireRetryDelay(60L);
        java.lang.String str28 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-575";
        boolean boolean31 = hikariConfig1.isJdbc4connectionTest;
        int int32 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
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
        hikariConfig1.setTransactionIsolation("HikariPool-614");
        int int14 = hikariConfig1.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
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
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2626");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2626 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.idleTimeout = (byte) -1;
        int int13 = hikariConfig1.getAcquireRetries();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8185" + "'", str9, "HikariPool-8185");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-8185" + "'", str10, "HikariPool-8185");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
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
        hikariConfig16.setRegisterMbeans(true);
        hikariConfig16.maxPoolSize = (byte) 10;
        hikariConfig16.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
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
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
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
        hikariConfig1.acquireRetryDelay = 100L;
        int int20 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbcUrl("HikariPool-1151");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5916");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5916 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
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
        int int21 = hikariConfig15.getAcquireRetries();
        hikariConfig15.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3801");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-495" + "'", str14, "HikariPool-495");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
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
        hikariConfig1.setTransactionIsolation("HikariPool-1124");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
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
        java.lang.String str22 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
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
        hikariConfig1.idleTimeout = 10;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 60);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
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
        hikariConfig1.catalog = "HikariPool-213";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-8244" + "'", str17, "HikariPool-8244");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
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
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.dataSourceClassName = "HikariPool-739";
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTimeout = 3L;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
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
        java.lang.String str21 = hikariConfig14.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
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
        java.lang.String str17 = hikariConfig10.dataSourceClassName;
        java.lang.String str18 = hikariConfig10.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
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
        java.lang.String str16 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-568");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-568 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = (short) 0;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-620");
        long long12 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(1L);
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        long long7 = hikariConfig1.getConnectionTimeout();
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.acquireIncrement = (byte) 0;
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.maxPoolSize = 'a';
        java.lang.String str22 = hikariConfig1.poolName;
        java.lang.String str23 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-8280" + "'", str22, "HikariPool-8280");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-8280" + "'", str23, "HikariPool-8280");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
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
        hikariConfig1.leakDetectionThreshold = 100L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
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
        boolean boolean23 = hikariConfig18.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        int int5 = hikariConfig1.getTransactionIsolation();
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
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
        hikariConfig1.acquireRetries = 0;
        int int36 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = 60;
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
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
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8290" + "'", str9, "HikariPool-8290");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8290" + "'", str13, "HikariPool-8290");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNull(str57);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32L + "'", long58 == 32L);
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
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
        hikariConfig1.poolName = "HikariPool-2000";
        int int16 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        boolean boolean9 = hikariConfig1.isReadOnly;
        hikariConfig1.setMaxLifetime(750L);
        long long12 = hikariConfig1.getMaxLifetime();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        long long14 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.poolName = "HikariPool-5034";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3916");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3916 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
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
        hikariConfig1.acquireIncrement = (-1);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2975";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
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
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig23.setMaximumPoolSize((int) (short) 10);
        hikariConfig23.leakDetectionThreshold = 600000L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-1414");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-493");
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setConnectionTestQuery("HikariPool-4644");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
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
        hikariConfig1.acquireRetries = 52;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
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
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isAutoCommit;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-1381");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1381' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.catalog = "HikariPool-2470";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig11.isReadOnly = true;
        hikariConfig11.connectionCustomizerClassName = "HikariPool-105";
        java.lang.String str16 = hikariConfig11.poolName;
        hikariConfig11.transactionIsolationName = "HikariPool-386";
        long long19 = hikariConfig11.connectionTimeout;
        hikariConfig11.setTransactionIsolation("HikariPool-216");
        long long22 = hikariConfig11.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-8354" + "'", str16, "HikariPool-8354");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isReadOnly = true;
        hikariConfig1.poolName = "HikariPool-167";
        hikariConfig1.maxLifetime = 1;
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.isAutoCommit = false;
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8370" + "'", str9, "HikariPool-8370");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
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
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        long long16 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
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
        hikariConfig1.setPoolName("HikariPool-28");
        hikariConfig1.setCatalog("HikariPool-91");
        int int17 = hikariConfig1.acquireIncrement;
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        hikariConfig1.setPoolName("HikariPool-2072");
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
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
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold(1L);
        hikariConfig1.isReadOnly = false;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8379" + "'", str9, "HikariPool-8379");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer4;
        boolean boolean6 = hikariConfig1.isInitializationFailFast;
        int int7 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
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
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
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
        long long17 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAutoCommit(false);
        int int9 = hikariConfig1.maxPoolSize;
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-183";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
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
        long long27 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolationName = "HikariPool-2794";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
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
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1989");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1989 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig10.acquireRetryDelay = 35;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-177");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-177 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.minPoolSize = 'a';
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setPoolName("HikariPool-2194");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.minPoolSize = '#';
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
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
        boolean boolean23 = hikariConfig17.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
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
        long long20 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-291";
        hikariConfig1.setJdbcUrl("HikariPool-2411");
        hikariConfig1.acquireIncrement = (short) 10;
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
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
        hikariConfig1.leakDetectionThreshold = (short) 100;
        int int16 = hikariConfig1.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        java.lang.String str33 = hikariConfig25.dataSourceClassName;
        long long34 = hikariConfig25.getAcquireRetryDelay();
        boolean boolean35 = hikariConfig25.isRegisterMbeans;
        int int36 = hikariConfig25.transactionIsolation;
        java.util.Properties properties37 = hikariConfig25.dataSourceProperties;
        hikariConfig25.setIdleTimeout(1800000L);
        hikariConfig25.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-713", (java.lang.Object) hikariConfig25);
        java.lang.String str43 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1124");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1124 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setMaxLifetime((long) 97);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.leakDetectionThreshold = (short) 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.setMaxLifetime((long) 3);
        long long14 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8454" + "'", str9, "HikariPool-8454");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        hikariConfig1.catalog = "HikariPool-426";
        hikariConfig1.setPoolName("HikariPool-279");
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
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
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setMinimumPoolSize((int) (short) 0);
        hikariConfig24.connectionTestQuery = "";
        long long34 = hikariConfig24.getConnectionTimeout();
        int int35 = hikariConfig24.getMaximumPoolSize();
        long long36 = hikariConfig24.maxLifetime;
        hikariConfig24.setDataSourceClassName("HikariPool-117");
        boolean boolean39 = hikariConfig24.isAutoCommit;
        javax.sql.DataSource dataSource40 = null;
        hikariConfig24.dataSource = dataSource40;
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        long long44 = hikariConfig43.getAcquireRetryDelay();
        hikariConfig43.idleTimeout = (-1);
        java.util.Properties properties47 = hikariConfig43.getDataSourceProperties();
        long long48 = hikariConfig43.maxLifetime;
        hikariConfig43.setLeakDetectionThreshold(750L);
        int int51 = hikariConfig43.getMinimumPoolSize();
        hikariConfig43.acquireRetries = 'a';
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        long long56 = hikariConfig55.getAcquireRetryDelay();
        hikariConfig55.connectionInitSql = "hi!";
        hikariConfig55.acquireIncrement = (byte) 100;
        hikariConfig55.setMinimumPoolSize((int) (short) 0);
        java.lang.String str63 = hikariConfig55.dataSourceClassName;
        long long64 = hikariConfig55.getAcquireRetryDelay();
        hikariConfig55.idleTimeout = (byte) -1;
        java.util.Properties properties67 = hikariConfig55.dataSourceProperties;
        hikariConfig43.dataSourceProperties = properties67;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig24.dataSourceProperties = properties67;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig1.dataSourceProperties = properties67;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig75.setTransactionIsolation("HikariPool-5678");
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8464" + "'", str9, "HikariPool-8464");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8464" + "'", str13, "HikariPool-8464");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(properties47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNull(str63);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 32L + "'", long64 == 32L);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setReadOnly(true);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setIdleTimeout((long) 358);
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        hikariConfig1.acquireIncrement = 97;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-8324");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8324' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8482" + "'", str9, "HikariPool-8482");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
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
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
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
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.setLeakDetectionThreshold(1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
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
        hikariConfig1.transactionIsolation = 'a';
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
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
        hikariConfig1.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.connectionTimeout = (short) -1;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
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
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isIsolateInternalQueries = true;
        int int21 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
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
        hikariConfig14.setTransactionIsolation("");
        hikariConfig14.maxPoolSize = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
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
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-1223" + "'", str18, "HikariPool-1223");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
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
        hikariConfig1.setMaximumPoolSize(10);
        boolean boolean29 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
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
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8517" + "'", str9, "HikariPool-8517");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
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
        java.lang.String str15 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
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
        long long16 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
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
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-841");
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.maxPoolSize = 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
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
        boolean boolean71 = hikariConfig1.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNull(dataSource37);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
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
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        hikariConfig1.connectionInitSql = "HikariPool-781";
        long long19 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8556" + "'", str9, "HikariPool-8556");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.minPoolSize = 60;
        hikariConfig1.transactionIsolation = '4';
        hikariConfig1.leakDetectionThreshold = (byte) 0;
        boolean boolean21 = hikariConfig1.isReadOnly();
        boolean boolean22 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
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
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setMinimumPoolSize((int) (short) 0);
        java.lang.String str27 = hikariConfig19.dataSourceClassName;
        long long28 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (byte) -1;
        java.util.Properties properties31 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        java.lang.String str33 = hikariConfig32.catalog;
        boolean boolean34 = hikariConfig32.isJdbc4ConnectionTest();
        hikariConfig32.isRegisterMbeans = false;
        hikariConfig1.addDataSourceProperty("HikariPool-44", (java.lang.Object) false);
        hikariConfig1.idleTimeout = (byte) 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        java.lang.String str10 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-8562" + "'", str10, "HikariPool-8562");
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
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
        hikariConfig1.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
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
        hikariConfig1.setConnectionTimeout(0L);
        long long21 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
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
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.setConnectionInitSql("HikariPool-429");
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8573" + "'", str9, "HikariPool-8573");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
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
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        java.lang.String str23 = hikariConfig21.jdbcUrl;
        java.lang.String str24 = hikariConfig21.poolName;
        java.util.Properties properties25 = hikariConfig21.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-8575" + "'", str24, "HikariPool-8575");
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
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
        int int17 = hikariConfig1.acquireRetries;
        long long18 = hikariConfig1.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8576" + "'", str9, "HikariPool-8576");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.jdbcUrl = "HikariPool-1160";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
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
        java.lang.String str22 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
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
        java.lang.String str15 = hikariConfig1.poolName;
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-8590" + "'", str15, "HikariPool-8590");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8269");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8269 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.connectionInitSql = "HikariPool-415";
        hikariConfig1.transactionIsolationName = "HikariPool-1531";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-452");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setUseInstrumentation(false);
        long long11 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
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
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setIdleTimeout((long) 10);
        java.lang.String str23 = hikariConfig1.getPoolName();
        long long24 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-293");
        long long27 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        long long31 = hikariConfig30.getAcquireRetryDelay();
        hikariConfig30.idleTimeout = (-1);
        java.util.Properties properties34 = hikariConfig30.getDataSourceProperties();
        long long35 = hikariConfig30.maxLifetime;
        hikariConfig30.setLeakDetectionThreshold(750L);
        int int38 = hikariConfig30.getMinimumPoolSize();
        hikariConfig30.acquireRetries = 'a';
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
        hikariConfig30.dataSourceProperties = properties54;
        java.lang.String str56 = hikariConfig30.connectionInitSql;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-2117", (java.lang.Object) str56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-8609" + "'", str23, "HikariPool-8609");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1015");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1015 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
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
        hikariConfig10.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = (short) 0;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-620");
        long long12 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setPoolName("HikariPool-946");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
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
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
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
        hikariConfig1.maxLifetime = 5000L;
        boolean boolean31 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean32 = hikariConfig1.isAutoCommit();
        boolean boolean33 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.dataSourceClassName = "HikariPool-164";
        java.lang.String str36 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-8632" + "'", str36, "HikariPool-8632");
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        java.lang.String str4 = hikariConfig1.getPoolName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.acquireRetryDelay = (-1);
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.isInitializationFailFast = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-8639" + "'", str4, "HikariPool-8639");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7194");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7194 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setConnectionTestQuery("HikariPool-3161");
        java.lang.String str14 = hikariConfig1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-8648" + "'", str11, "HikariPool-8648");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-8648" + "'", str14, "HikariPool-8648");
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig1.connectionCustomizer;
        hikariConfig1.connectionInitSql = "HikariPool-344";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-353");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-353' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8649" + "'", str9, "HikariPool-8649");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8649" + "'", str13, "HikariPool-8649");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.maxLifetime = 3L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
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
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-5399");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5399' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5146");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5146 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
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
        long long23 = hikariConfig17.getLeakDetectionThreshold();
        java.lang.String str24 = hikariConfig17.catalog;
        long long25 = hikariConfig17.maxLifetime;
        hikariConfig17.dataSourceClassName = "HikariPool-114";
        hikariConfig17.setMaximumPoolSize(0);
        long long30 = hikariConfig17.leakDetectionThreshold;
        java.util.Properties properties31 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-8660" + "'", str15, "HikariPool-8660");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
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
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        int int19 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setDataSourceClassName("HikariPool-250");
        long long16 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-801");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-801 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.acquireRetries = 358;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
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
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2434";
        hikariConfig1.maxLifetime = ' ';
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8675" + "'", str9, "HikariPool-8675");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
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
        hikariConfig1.setPoolName("HikariPool-63");
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        int int19 = hikariConfig1.minPoolSize;
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
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
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-347");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-347 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
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
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        java.lang.String str22 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-334");
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        java.lang.String str17 = hikariConfig1.catalog;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (short) 0;
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        int int6 = hikariConfig1.acquireRetries;
        hikariConfig1.isReadOnly = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-894");
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionInitSql = "HikariPool-519";
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.acquireIncrement;
        hikariConfig1.setJdbcUrl("HikariPool-336");
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        int int5 = hikariConfig1.acquireIncrement;
        hikariConfig1.transactionIsolationName = "HikariPool-1710";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
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
        hikariConfig1.maxPoolSize = 3;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8718" + "'", str9, "HikariPool-8718");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-8718" + "'", str13, "HikariPool-8718");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        hikariConfig1.setLeakDetectionThreshold(358L);
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
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
        long long19 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-8726" + "'", str22, "HikariPool-8726");
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
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
        int int42 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = '4';
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
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
        hikariConfig1.setAcquireRetryDelay(60L);
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1989";
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        long long35 = hikariConfig34.getAcquireRetryDelay();
        hikariConfig34.connectionInitSql = "hi!";
        hikariConfig34.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean40 = hikariConfig34.isRegisterMbeans();
        hikariConfig34.setDataSourceClassName("HikariPool-77");
        boolean boolean43 = hikariConfig34.isReadOnly();
        hikariConfig34.leakDetectionThreshold = (byte) -1;
        hikariConfig34.setMaximumPoolSize((int) (short) 1);
        long long48 = hikariConfig34.idleTimeout;
        int int49 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-189", (java.lang.Object) hikariConfig34);
        hikariConfig1.acquireRetries = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer53 = hikariConfig1.connectionCustomizer;
        hikariConfig1.maxPoolSize = (byte) 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3L + "'", long48 == 3L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer53);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
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
        int int13 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionInitSql("HikariPool-644");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = '#';
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionInitSql("HikariPool-547");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
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
        hikariConfig30.connectionTestQuery = "HikariPool-116";
        hikariConfig30.transactionIsolation = 1;
        boolean boolean39 = hikariConfig30.isAutoCommit();
        java.lang.String str40 = hikariConfig30.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-116" + "'", str40, "HikariPool-116");
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        int int11 = hikariConfig1.transactionIsolation;
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-8753" + "'", str16, "HikariPool-8753");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.transactionIsolation = (byte) 0;
        hikariConfig1.setCatalog("HikariPool-574");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        long long12 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig30.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
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
        int int27 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
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
        long long24 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
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
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        long long18 = hikariConfig1.idleTimeout;
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6132");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1810");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1810 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        hikariConfig1.maxPoolSize = 100;
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig11.isReadOnly = true;
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        int int15 = hikariConfig11.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
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
        int int27 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        hikariConfig1.connectionInitSql = "HikariPool-2403";
        hikariConfig1.setCatalog("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2207");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2207 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
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
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        boolean boolean49 = hikariConfig48.isInitializationFailFast();
        long long50 = hikariConfig48.maxLifetime;
        java.util.Properties properties51 = hikariConfig48.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        hikariConfig1.leakDetectionThreshold = (short) 1;
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 97L + "'", long50 == 97L);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.maxLifetime = '#';
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str14 = hikariConfig1.jdbcUrl;
        hikariConfig1.setMinimumPoolSize(97);
        hikariConfig1.connectionTestQuery = "HikariPool-1571";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8805" + "'", str9, "HikariPool-8805");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.acquireRetryDelay;
        int int5 = hikariConfig1.transactionIsolation;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        long long7 = hikariConfig1.getIdleTimeout();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.connectionTestQuery = "HikariPool-3783";
        hikariConfig1.transactionIsolationName = "HikariPool-302";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
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
        long long36 = hikariConfig1.acquireRetryDelay;
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
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = 3;
        long long15 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str7 = hikariConfig1.poolName;
        long long8 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-8817" + "'", str7, "HikariPool-8817");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
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
        int int14 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
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
        hikariConfig1.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
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
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-8824" + "'", str14, "HikariPool-8824");
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
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
        hikariConfig1.setAutoCommit(false);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = 1;
        hikariConfig1.setPoolName("HikariPool-189");
        long long14 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
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
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8845" + "'", str9, "HikariPool-8845");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
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
        javax.sql.DataSource dataSource17 = null;
        hikariConfig5.dataSource = dataSource17;
        hikariConfig5.connectionTimeout = 35;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
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
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig24.catalog = "HikariPool-4003";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
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
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-8858" + "'", str14, "HikariPool-8858");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireRetries = 35;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1381");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1381 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1553");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1553 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
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
        hikariConfig1.acquireIncrement = 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
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
        int int21 = hikariConfig16.transactionIsolation;
        hikariConfig16.transactionIsolation = (short) -1;
        hikariConfig16.setIdleTimeout((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
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
        hikariConfig1.maxLifetime = 1L;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1141");
        hikariConfig1.setCatalog("HikariPool-532");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
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
        boolean boolean20 = hikariConfig1.isAutoCommit;
        hikariConfig1.setJdbcUrl("HikariPool-669");
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.leakDetectionThreshold = 2147483647L;
        hikariConfig1.setConnectionTestQuery("HikariPool-1166");
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.maxPoolSize = 358;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-1745");
        hikariConfig1.setCatalog("HikariPool-1858");
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3956");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3956 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
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
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3338");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
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
        java.lang.String str24 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-8925" + "'", str17, "HikariPool-8925");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-8924" + "'", str21, "HikariPool-8924");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
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
        java.lang.String str24 = hikariConfig1.getCatalog();
        int int25 = hikariConfig1.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        hikariConfig1.leakDetectionThreshold = (-1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
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
        boolean boolean51 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetryDelay((long) 0);
        int int8 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        long long11 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
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
        int int49 = hikariConfig48.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
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
        hikariConfig1.connectionTimeout = 358L;
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        java.lang.String str19 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
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
        java.lang.String str14 = hikariConfig1.jdbcUrl;
        hikariConfig1.acquireRetryDelay = (-1);
        hikariConfig1.minPoolSize = ' ';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-77" + "'", str14, "HikariPool-77");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
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
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTestQuery = "";
        long long8 = hikariConfig1.acquireRetryDelay;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-8969" + "'", str5, "HikariPool-8969");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setIsolateInternalQueries(false);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.isIsolateInternalQueries = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
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
        hikariConfig14.setMaxLifetime(60L);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.idleTimeout = (-1);
        java.util.Properties properties27 = hikariConfig23.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig14.dataSourceProperties = properties27;
        hikariConfig14.minPoolSize = (short) 100;
        long long34 = hikariConfig14.connectionTimeout;
        int int35 = hikariConfig14.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNotNull(properties27);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
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
        hikariConfig1.acquireRetryDelay = 10L;
        hikariConfig1.maxLifetime = 750L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.jdbcUrl;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        hikariConfig10.acquireIncrement = 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer32;
        long long34 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setTransactionIsolation("HikariPool-100");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
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
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        int int17 = hikariConfig1.acquireRetries;
        int int18 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
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
        hikariConfig1.acquireIncrement = (-1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        java.lang.String str20 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
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
        long long19 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-90";
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolationName = "HikariPool-4175";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        int int5 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
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
        boolean boolean13 = hikariConfig12.isRegisterMbeans();
        hikariConfig12.setConnectionTestQuery("HikariPool-780");
        long long16 = hikariConfig12.leakDetectionThreshold;
        java.lang.String str17 = hikariConfig12.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
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
        java.lang.String str25 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetries(97);
        long long28 = hikariConfig1.acquireRetryDelay;
        long long29 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-56" + "'", str22, "HikariPool-56");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-56" + "'", str25, "HikariPool-56");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
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
        long long18 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireRetries = 0;
        long long12 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-911");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-911 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetryDelay = 10L;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getCatalog();
        hikariConfig10.maxLifetime = 3;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.isReadOnly = true;
        hikariConfig1.acquireIncrement = (byte) 10;
        hikariConfig1.jdbcUrl = "HikariPool-613";
        int int13 = hikariConfig1.getAcquireRetries();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setDataSourceClassName("HikariPool-340");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTimeout = 3L;
        long long12 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
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
        java.lang.String str31 = hikariConfig19.getCatalog();
        boolean boolean32 = hikariConfig19.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
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
        hikariConfig1.addDataSourceProperty("HikariPool-1162", (java.lang.Object) "HikariPool-267");
        long long16 = hikariConfig1.idleTimeout;
        hikariConfig1.setTransactionIsolation("HikariPool-3176");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        hikariConfig1.leakDetectionThreshold = 750L;
        hikariConfig1.setConnectionTestQuery("HikariPool-594");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
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
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isIsolateInternalQueries = true;
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.setTransactionIsolation("HikariPool-200");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
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
        hikariConfig16.isIsolateInternalQueries = false;
        long long20 = hikariConfig16.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
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
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.leakDetectionThreshold = (byte) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
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
        hikariConfig5.setConnectionTestQuery("HikariPool-108");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-134");
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9093" + "'", str9, "HikariPool-9093");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
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
        hikariConfig1.setReadOnly(false);
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
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
        hikariConfig10.setCatalog("HikariPool-214");
        long long20 = hikariConfig10.getIdleTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        long long17 = hikariConfig15.maxLifetime;
        java.util.Properties properties18 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.isIsolateInternalQueries = false;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        long long24 = hikariConfig22.maxLifetime;
        java.util.Properties properties25 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig15.setDataSourceProperties(properties25);
        hikariConfig1.dataSourceProperties = properties25;
        hikariConfig1.setMaximumPoolSize((int) ' ');
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
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
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.isInitializationFailFast = true;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long36 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.connectionInitSql = "hi!";
        hikariConfig35.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig35.transactionIsolation = (byte) 0;
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        long long45 = hikariConfig44.getAcquireRetryDelay();
        hikariConfig44.idleTimeout = (-1);
        java.util.Properties properties48 = hikariConfig44.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig35.setDataSourceProperties(properties48);
        hikariConfig26.setDataSourceProperties(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties48);
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.String str57 = hikariConfig56.getDataSourceClassName();
        hikariConfig56.setTransactionIsolation("hi!");
        hikariConfig56.acquireRetryDelay = '4';
        hikariConfig56.setConnectionTimeout((long) (short) 0);
        hikariConfig56.setConnectionTestQuery("HikariPool-45");
        long long66 = hikariConfig56.connectionTimeout;
        hikariConfig56.setMaxLifetime(1L);
        java.lang.String str69 = hikariConfig56.getJdbcUrl();
        hikariConfig56.setUseInstrumentation(true);
        hikariConfig56.setConnectionInitSql("HikariPool-195");
        hikariConfig56.connectionTimeout = 3L;
        java.util.Properties properties76 = hikariConfig56.getDataSourceProperties();
        hikariConfig54.dataSourceProperties = properties76;
        hikariConfig54.setMaximumPoolSize(100);
        hikariConfig1.addDataSourceProperty("HikariPool-1416", (java.lang.Object) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 2147483647L + "'", long66 == 2147483647L);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(properties76);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
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
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.maxPoolSize = (byte) 1;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9133" + "'", str9, "HikariPool-9133");
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        java.lang.String str7 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        int int10 = hikariConfig1.getAcquireIncrement();
        boolean boolean11 = hikariConfig1.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIsolateInternalQueries(false);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setIsolateInternalQueries(true);
        long long14 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1014");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1014 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
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
        java.lang.String str20 = hikariConfig1.connectionInitSql;
        hikariConfig1.isAutoCommit = false;
        java.lang.String str23 = hikariConfig1.poolName;
        boolean boolean24 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-400" + "'", str20, "HikariPool-400");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-55" + "'", str23, "HikariPool-55");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setTransactionIsolation("hi!");
        hikariConfig10.acquireRetryDelay = '4';
        hikariConfig10.setConnectionTimeout((long) (short) 0);
        hikariConfig10.setConnectionTestQuery("HikariPool-45");
        java.lang.String str20 = hikariConfig10.connectionCustomizerClassName;
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
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
        hikariConfig24.setPoolName("HikariPool-129");
        hikariConfig24.setAcquireRetryDelay((long) (short) 100);
        boolean boolean71 = hikariConfig24.isAutoCommit();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9155" + "'", str9, "HikariPool-9155");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-9155" + "'", str13, "HikariPool-9155");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNull(str57);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32L + "'", long58 == 32L);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
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
        hikariConfig23.isRegisterMbeans = false;
        hikariConfig23.setTransactionIsolation("HikariPool-288");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
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
        long long14 = hikariConfig10.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
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
        hikariConfig1.setPoolName("HikariPool-2605");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-49" + "'", str18, "HikariPool-49");
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
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
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        int int8 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
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
        hikariConfig1.acquireIncrement = (short) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
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
        hikariConfig5.setMaximumPoolSize((int) ' ');
        hikariConfig5.minPoolSize = 97;
        java.lang.String str22 = hikariConfig5.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-9224" + "'", str22, "HikariPool-9224");
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
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
        javax.sql.DataSource dataSource62 = null;
        hikariConfig1.dataSource = dataSource62;
        hikariConfig1.setInitializationFailFast(false);
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
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-9230" + "'", str45, "HikariPool-9230");
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNull(str55);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireIncrement(97);
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.isReadOnly = false;
        long long13 = hikariConfig1.maxLifetime;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        int int16 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
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
        javax.sql.DataSource dataSource22 = hikariConfig1.dataSource;
        hikariConfig1.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-9236" + "'", str18, "HikariPool-9236");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-249" + "'", str21, "HikariPool-249");
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(true);
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.maxLifetime = (-1L);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionInitSql("HikariPool-414");
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireRetries((int) 'a');
        int int19 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
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
        java.lang.String str16 = hikariConfig14.getJdbcUrl();
        boolean boolean17 = hikariConfig14.isInitializationFailFast();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isIsolateInternalQueries();
        long long22 = hikariConfig20.getConnectionTimeout();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setMinimumPoolSize((int) (short) 0);
        java.lang.String str32 = hikariConfig24.dataSourceClassName;
        long long33 = hikariConfig24.getAcquireRetryDelay();
        boolean boolean34 = hikariConfig24.isRegisterMbeans;
        int int35 = hikariConfig24.transactionIsolation;
        java.util.Properties properties36 = hikariConfig24.dataSourceProperties;
        hikariConfig20.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig14.addDataSourceProperty("HikariPool-1184", (java.lang.Object) properties36);
        java.lang.String str42 = hikariConfig14.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6381");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6381 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str13 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        int int5 = hikariConfig1.acquireIncrement;
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.leakDetectionThreshold = 5000L;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
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
        int int22 = hikariConfig1.getMinimumPoolSize();
        boolean boolean23 = hikariConfig1.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
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
        hikariConfig1.connectionCustomizerClassName = "";
        boolean boolean25 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
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
        long long20 = hikariConfig1.connectionTimeout;
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionInitSql("HikariPool-2150");
        long long24 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9282" + "'", str9, "HikariPool-9282");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-9282" + "'", str13, "HikariPool-9282");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
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
        boolean boolean34 = hikariConfig1.isAutoCommit;
        long long35 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setAutoCommit(true);
        int int38 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
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
        long long19 = hikariConfig1.getConnectionTimeout();
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIdleTimeout((long) (short) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
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
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        boolean boolean13 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
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
        hikariConfig1.setRegisterMbeans(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.maxPoolSize;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.getMaxLifetime();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getDataSourceClassName();
        int int17 = hikariConfig15.getAcquireRetries();
        hikariConfig15.connectionTimeout = 100;
        boolean boolean20 = hikariConfig15.isInitializationFailFast();
        java.lang.String str21 = hikariConfig15.connectionTestQuery;
        hikariConfig15.setJdbcUrl("HikariPool-300");
        hikariConfig15.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig15.setLeakDetectionThreshold(600000L);
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
        hikariConfig15.dataSourceProperties = properties46;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties46);
        int int51 = hikariConfig50.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
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
        hikariConfig1.addDataSourceProperty("HikariPool-1162", (java.lang.Object) "HikariPool-267");
        hikariConfig1.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.lang.String str6 = hikariConfig5.transactionIsolationName;
        hikariConfig5.leakDetectionThreshold = (short) 100;
        hikariConfig5.setMinimumPoolSize((int) ' ');
        long long11 = hikariConfig5.getIdleTimeout();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setConnectionInitSql("HikariPool-258");
        hikariConfig1.poolName = "";
        hikariConfig1.connectionTestQuery = "HikariPool-223";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        com.zaxxer.hikari.HikariConfig.ACQUIRE_RETRY_DELAY = (byte) 100;
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        int int15 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.connectionTimeout = (-1L);
        hikariConfig1.acquireRetryDelay = 0L;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
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
        java.lang.String str15 = hikariConfig1.getPoolName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-9324" + "'", str15, "HikariPool-9324");
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setDataSourceClassName("HikariPool-291");
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.acquireRetries = 97;
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaximumPoolSize(358);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionInitSql = "HikariPool-1936";
        java.lang.String str12 = hikariConfig1.poolName;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-9326" + "'", str12, "HikariPool-9326");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
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
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.acquireIncrement = (byte) -1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-9328" + "'", str11, "HikariPool-9328");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
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
        hikariConfig1.catalog = "HikariPool-302";
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
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
        hikariConfig1.leakDetectionThreshold = '#';
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.acquireIncrement = (byte) 0;
        java.lang.String str24 = hikariConfig1.poolName;
        hikariConfig1.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-9335" + "'", str24, "HikariPool-9335");
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1749");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1749 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean7 = hikariConfig6.isInitializationFailFast();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
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
        boolean boolean15 = hikariConfig1.isReadOnly();
        hikariConfig1.idleTimeout = (short) 10;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
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
        hikariConfig1.setMaxLifetime(358L);
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        int int14 = hikariConfig1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
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
        hikariConfig1.setTransactionIsolation("HikariPool-7051");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str13 = hikariConfig1.jdbcUrl;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-2564");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2564' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setIdleTimeout((long) 358);
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9353" + "'", str9, "HikariPool-9353");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
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
        long long14 = hikariConfig1.connectionTimeout;
        boolean boolean15 = hikariConfig1.isAutoCommit;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        java.util.Properties properties23 = hikariConfig19.getDataSourceProperties();
        long long24 = hikariConfig19.maxLifetime;
        hikariConfig19.setLeakDetectionThreshold(750L);
        int int27 = hikariConfig19.getMinimumPoolSize();
        hikariConfig19.acquireRetries = 'a';
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
        hikariConfig19.dataSourceProperties = properties43;
        java.util.Properties properties45 = null;
        hikariConfig19.dataSourceProperties = properties45;
        java.lang.String str47 = hikariConfig19.connectionTestQuery;
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
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        java.lang.String str63 = hikariConfig62.getPoolName();
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        long long66 = hikariConfig65.getAcquireRetryDelay();
        hikariConfig65.connectionInitSql = "hi!";
        hikariConfig65.acquireIncrement = (byte) 100;
        hikariConfig65.setMinimumPoolSize((int) (short) 0);
        java.lang.String str73 = hikariConfig65.dataSourceClassName;
        long long74 = hikariConfig65.getAcquireRetryDelay();
        hikariConfig65.idleTimeout = (byte) -1;
        java.util.Properties properties77 = hikariConfig65.dataSourceProperties;
        hikariConfig62.setDataSourceProperties(properties77);
        hikariConfig19.dataSourceProperties = properties77;
        javax.sql.DataSource dataSource80 = null;
        hikariConfig19.dataSource = dataSource80;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-931", (java.lang.Object) dataSource80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
        org.junit.Assert.assertNotNull(properties61);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "HikariPool-9358" + "'", str63, "HikariPool-9358");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 100L + "'", long74 == 100L);
        org.junit.Assert.assertNotNull(properties77);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
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
        hikariConfig1.maxPoolSize = 60;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-9362" + "'", str17, "HikariPool-9362");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-9361" + "'", str21, "HikariPool-9361");
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
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
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        long long12 = hikariConfig1.acquireRetryDelay;
        long long13 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
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
        boolean boolean15 = hikariConfig1.isReadOnly;
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setMinimumPoolSize((int) (short) 0);
        java.lang.String str27 = hikariConfig19.dataSourceClassName;
        long long28 = hikariConfig19.getAcquireRetryDelay();
        boolean boolean29 = hikariConfig19.isRegisterMbeans;
        int int30 = hikariConfig19.transactionIsolation;
        java.util.Properties properties31 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-9378" + "'", str9, "HikariPool-9378");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
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
        hikariConfig1.setMinimumPoolSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        boolean boolean7 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
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
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.transactionIsolation = (short) -1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
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
        boolean boolean17 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolation = 358;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
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
        boolean boolean18 = hikariConfig17.isIsolateInternalQueries();
        long long19 = hikariConfig17.getConnectionTimeout();
        long long20 = hikariConfig17.getAcquireRetryDelay();
        boolean boolean21 = hikariConfig17.isAutoCommit;
        hikariConfig17.connectionTimeout = 35;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
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
        java.lang.String str19 = hikariConfig1.poolName;
        boolean boolean20 = hikariConfig1.isReadOnly;
        boolean boolean21 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-541" + "'", str19, "HikariPool-541");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1862");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1862 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
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
        hikariConfig1.poolName = "HikariPool-73";
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int44 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
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
        hikariConfig1.acquireRetryDelay = 3L;
        hikariConfig1.transactionIsolationName = "HikariPool-1028";
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
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
        hikariConfig1.transactionIsolation = 'a';
        hikariConfig1.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2846");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2846 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        long long8 = hikariConfig1.connectionTimeout;
        long long9 = hikariConfig1.idleTimeout;
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
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
        boolean boolean23 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}
