import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getPoolName();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass20 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-10372" + "'", str14, "HikariPool-10372");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize((int) '4');
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.setDriverClassName("HikariPool-1631");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1631' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-514");
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIsolateInternalQueries(true);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties15 = hikariConfig9.getDataSourceProperties();
        long long16 = hikariConfig9.getMaxLifetime();
        hikariConfig9.setJdbc4ConnectionTest(false);
        hikariConfig0.addDataSourceProperty("HikariPool-2632", (java.lang.Object) false);
        java.lang.String str20 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        int int18 = hikariConfig0.getAcquireRetries();
        java.lang.String str19 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2747");
        long long12 = hikariConfig0.getMaxLifetime();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        int int12 = hikariConfig0.getAcquireRetries();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-1511");
        hikariConfig0.setMinimumPoolSize((int) 'a');
        long long18 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("hi!");
        int int10 = hikariConfig0.getAcquireIncrement();
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-452");
        hikariConfig0.setIdleTimeout((long) 0);
        hikariConfig0.setJdbcUrl("HikariPool-8363");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9176");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9176 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        long long17 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setJdbcUrl("");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig9.setDataSourceProperties(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        hikariConfig15.setConnectionInitSql("hi!");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        boolean boolean21 = hikariConfig15.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        int int24 = hikariConfig23.getAcquireRetries();
        hikariConfig23.setConnectionInitSql("");
        hikariConfig23.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig23.setAutoCommit(true);
        hikariConfig23.setConnectionTestQuery("HikariPool-137");
        long long33 = hikariConfig23.getIdleTimeout();
        int int34 = hikariConfig23.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean36 = hikariConfig35.isInitializationFailFast();
        boolean boolean37 = hikariConfig35.isReadOnly();
        int int38 = hikariConfig35.getAcquireIncrement();
        hikariConfig35.setConnectionTestQuery("hi!");
        hikariConfig35.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig35.setAutoCommit(true);
        java.util.Properties properties45 = hikariConfig35.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties45);
        java.lang.String str47 = hikariConfig23.getConnectionCustomizerClassName();
        hikariConfig15.addDataSourceProperty("HikariPool-370", (java.lang.Object) hikariConfig23);
        java.util.Properties properties49 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties49);
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-370");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-10481" + "'", str12, "HikariPool-10481");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 600000L + "'", long33 == 600000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        hikariConfig9.setTransactionIsolation("HikariPool-1744");
        boolean boolean13 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setReadOnly(true);
        hikariConfig9.setDataSourceClassName("HikariPool-6076");
        hikariConfig9.setIdleTimeout((long) 52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setIdleTimeout((-1L));
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        int int13 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTimeout(100L);
        hikariConfig0.setPoolName("HikariPool-801");
        boolean boolean13 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setTransactionIsolation("HikariPool-1063");
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-8509");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8509' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setDataSourceClassName("HikariPool-370");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setIdleTimeout((long) 3);
        int int14 = hikariConfig0.getAcquireIncrement();
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setAcquireRetryDelay(750L);
        int int12 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.Class<?> wildcardClass18 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        int int8 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig7.getDataSourceClassName();
        boolean boolean14 = hikariConfig7.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig7.isReadOnly();
        boolean boolean16 = hikariConfig7.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        boolean boolean4 = hikariConfig0.isIsolateInternalQueries();
        long long5 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        long long12 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1579");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1579' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8411");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8411 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(10);
        hikariConfig0.setAcquireRetryDelay(0L);
        java.lang.String str11 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setTransactionIsolation("HikariPool-5182");
        hikariConfig0.setPoolName("HikariPool-3897");
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        hikariConfig0.setConnectionTestQuery("HikariPool-6458");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        int int4 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8678");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setCatalog("HikariPool-510");
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setConnectionTestQuery("HikariPool-8068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setUseInstrumentation(false);
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2735");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2735 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-2632");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-1631");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) 52);
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-514");
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        boolean boolean5 = hikariConfig4.isReadOnly();
        hikariConfig4.setMaximumPoolSize((int) (short) 100);
        boolean boolean8 = hikariConfig4.isJdbc4ConnectionTest();
        int int9 = hikariConfig4.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        int int9 = hikariConfig8.getAcquireRetries();
        hikariConfig8.setConnectionInitSql("");
        hikariConfig8.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig8.setAutoCommit(true);
        hikariConfig8.setConnectionTestQuery("HikariPool-137");
        long long18 = hikariConfig8.getIdleTimeout();
        int int19 = hikariConfig8.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setConnectionTestQuery("hi!");
        hikariConfig20.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig20.setAutoCommit(true);
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties30);
        java.lang.String str32 = hikariConfig8.getConnectionCustomizerClassName();
        hikariConfig0.addDataSourceProperty("HikariPool-370", (java.lang.Object) hikariConfig8);
        java.util.Properties properties34 = hikariConfig0.getDataSourceProperties();
        long long35 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str36 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 750L + "'", long35 == 750L);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        hikariConfig0.setUseInstrumentation(false);
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-10287");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getMaximumPoolSize();
        int int13 = hikariConfig0.getAcquireIncrement();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10706");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10706 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setMaxLifetime(1L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-10846" + "'", str7, "HikariPool-10846");
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        int int8 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig7.getDataSourceClassName();
        boolean boolean14 = hikariConfig7.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig7.isReadOnly();
        boolean boolean16 = hikariConfig7.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str30 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean33 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-2978");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setReadOnly(true);
        long long8 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8335");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8335 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-137");
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("HikariPool-1932");
        long long19 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-137");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setMaxLifetime((long) 0);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-447");
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-6653");
        java.lang.String str16 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setReadOnly(true);
        int int8 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1949");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1949 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str3 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAutoCommit(false);
        long long21 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.setMaxLifetime((long) '#');
        long long11 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMinimumPoolSize(97);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-10905" + "'", str6, "HikariPool-10905");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setPoolName("HikariPool-1707");
        hikariConfig0.setPoolName("HikariPool-1059");
        int int23 = hikariConfig0.getMinimumPoolSize();
        long long24 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize(3);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        long long14 = hikariConfig12.getConnectionTimeout();
        java.lang.String str15 = hikariConfig12.getDataSourceClassName();
        java.lang.String str16 = hikariConfig12.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2459");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMinimumPoolSize(10);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getMaxLifetime();
        boolean boolean14 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setReadOnly(true);
        boolean boolean17 = hikariConfig11.isAutoCommit();
        hikariConfig11.setLeakDetectionThreshold(1L);
        hikariConfig11.setIdleTimeout((long) (short) 100);
        java.lang.String str22 = hikariConfig11.getJdbcUrl();
        hikariConfig11.setLeakDetectionThreshold(600000L);
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig11.setCatalog("HikariPool-2711");
        java.lang.String str29 = hikariConfig11.getCatalog();
        boolean boolean30 = hikariConfig11.isAutoCommit();
        hikariConfig11.setMaxLifetime((long) ' ');
        hikariConfig11.setIdleTimeout((long) ' ');
        hikariConfig0.addDataSourceProperty("HikariPool-1260", (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-2711" + "'", str29, "HikariPool-2711");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-697");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(false);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-697" + "'", str11, "HikariPool-697");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        int int9 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetries(97);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-10930" + "'", str11, "HikariPool-10930");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(5000L);
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getMaxLifetime();
        java.lang.String str16 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setIdleTimeout((long) (-1));
        java.lang.String str19 = hikariConfig13.getConnectionTestQuery();
        int int20 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceClassName("HikariPool-7584");
        java.lang.Class<?> wildcardClass28 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-10956" + "'", str6, "HikariPool-10956");
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMaxLifetime(5000L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIdleTimeout((-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-447");
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        long long11 = hikariConfig9.getMaxLifetime();
        java.lang.Class<?> wildcardClass12 = hikariConfig9.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-510", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        hikariConfig0.setUseInstrumentation(false);
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold(600000L);
        int int10 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-564");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = dataSource11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        int int12 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-9109");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-9109' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2463");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2463' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setIdleTimeout(750L);
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        int int17 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.Class<?> wildcardClass20 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setInitializationFailFast(true);
        long long11 = hikariConfig0.getConnectionTimeout();
        int int12 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5159");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        int int12 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setAutoCommit(true);
        hikariConfig10.setMaxLifetime((long) (short) 0);
        hikariConfig0.addDataSourceProperty("HikariPool-3911", (java.lang.Object) (short) 0);
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        long long19 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        long long17 = hikariConfig0.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4549");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4549 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize(3);
        int int10 = hikariConfig1.getMinimumPoolSize();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setInitializationFailFast(false);
        long long21 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        boolean boolean2 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isReadOnly();
        int int11 = hikariConfig8.getAcquireIncrement();
        hikariConfig8.setConnectionTestQuery("hi!");
        boolean boolean14 = hikariConfig8.isIsolateInternalQueries();
        hikariConfig1.addDataSourceProperty("HikariPool-250", (java.lang.Object) hikariConfig8);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setJdbcUrl("HikariPool-1865");
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        hikariConfig15.setReadOnly(false);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        long long21 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.setConnectionTimeout((long) (byte) 100);
        hikariConfig15.setUseInstrumentation(true);
        hikariConfig15.setRegisterMbeans(true);
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig0.setDataSource(dataSource29);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-11093" + "'", str7, "HikariPool-11093");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setTransactionIsolation("HikariPool-377");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        java.lang.String str16 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setConnectionTimeout((long) 0);
        hikariConfig12.setIdleTimeout((long) 100);
        int int21 = hikariConfig12.getTransactionIsolation();
        hikariConfig0.addDataSourceProperty("HikariPool-1601", (java.lang.Object) hikariConfig12);
        java.lang.Class<?> wildcardClass23 = hikariConfig12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        int int5 = hikariConfig0.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-5707");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5707' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        long long12 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setUseInstrumentation(true);
        int int13 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-2735");
        hikariConfig0.validate();
        hikariConfig0.setConnectionTestQuery("HikariPool-9341");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig0.setTransactionIsolation("HikariPool-4190");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getPoolName();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-11159" + "'", str14, "HikariPool-11159");
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7700");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7700 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        java.lang.Class<?> wildcardClass10 = properties9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        int int13 = hikariConfig1.getTransactionIsolation();
        long long14 = hikariConfig1.getConnectionTimeout();
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        java.lang.String str11 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-11180" + "'", str11, "HikariPool-11180");
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        long long11 = hikariConfig9.getMaxLifetime();
        java.lang.Class<?> wildcardClass12 = hikariConfig9.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-510", (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-9983");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAcquireRetryDelay(1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setTransactionIsolation("HikariPool-4438");
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("hi!");
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime((long) 0);
        hikariConfig0.setRegisterMbeans(false);
        int int15 = hikariConfig0.getAcquireIncrement();
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-8274");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("HikariPool-564");
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        int int7 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMinimumPoolSize((int) ' ');
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        int int11 = hikariConfig9.getMinimumPoolSize();
        int int12 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.setMaxLifetime((long) 1);
        long long15 = hikariConfig9.getAcquireRetryDelay();
        int int16 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig19.setDriverClassName("HikariPool-8678");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8678' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getMaximumPoolSize();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        long long11 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setConnectionTestQuery("HikariPool-5414");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        hikariConfig0.setPoolName("HikariPool-1932");
        java.lang.String str22 = hikariConfig0.getPoolName();
        long long23 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-1932" + "'", str22, "HikariPool-1932");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-2959");
        java.lang.Class<?> wildcardClass16 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        hikariConfig10.setJdbcUrl("");
        hikariConfig10.setAutoCommit(true);
        hikariConfig0.addDataSourceProperty("HikariPool-1707", (java.lang.Object) hikariConfig10);
        hikariConfig10.setConnectionInitSql("HikariPool-3448");
        java.lang.Class<?> wildcardClass20 = hikariConfig10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setRegisterMbeans(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1104" + "'", str12, "HikariPool-1104");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-1104" + "'", str13, "HikariPool-1104");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-1104" + "'", str14, "HikariPool-1104");
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setJdbcUrl("HikariPool-1915");
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-3827");
        hikariConfig0.setTransactionIsolation("HikariPool-10234");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setPoolName("HikariPool-1059");
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean12 = hikariConfig0.isReadOnly();
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("HikariPool-2649");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-1059" + "'", str9, "HikariPool-1059");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-370");
        hikariConfig0.setAutoCommit(false);
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-10706");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setAutoCommit(false);
        javax.sql.DataSource dataSource17 = hikariConfig10.getDataSource();
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties18);
        hikariConfig0.setDataSourceClassName("");
        long long22 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8509");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8509 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        hikariConfig0.setPoolName("HikariPool-1932");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1042");
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean28 = hikariConfig27.isJdbc4ConnectionTest();
        long long29 = hikariConfig27.getConnectionTimeout();
        hikariConfig27.setJdbcUrl("");
        boolean boolean32 = hikariConfig27.isRegisterMbeans();
        hikariConfig27.setIsolateInternalQueries(false);
        hikariConfig27.setAcquireRetries((int) '4');
        hikariConfig27.setCatalog("hi!");
        java.lang.String str39 = hikariConfig27.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-1062", (java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("hi!");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        java.lang.String str24 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str25 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        long long28 = hikariConfig0.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 750L + "'", long28 == 750L);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-829");
        hikariConfig0.setConnectionTimeout(750L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str14 = hikariConfig13.getCatalog();
        long long15 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setIdleTimeout(1L);
        java.lang.String str18 = hikariConfig13.getDataSourceClassName();
        boolean boolean19 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setCatalog("HikariPool-10730");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setIdleTimeout(0L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-573");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-573' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        long long10 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-1104");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMinimumPoolSize(0);
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setMinimumPoolSize(10);
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-11544" + "'", str9, "HikariPool-11544");
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '#');
        boolean boolean13 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setDriverClassName("HikariPool-10078");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10078' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1104");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setDataSourceClassName("HikariPool-2322");
        hikariConfig1.setTransactionIsolation("HikariPool-8337");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getPoolName();
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-11560" + "'", str12, "HikariPool-11560");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize(0);
        int int6 = hikariConfig0.getMinimumPoolSize();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-11600" + "'", str7, "HikariPool-11600");
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        hikariConfig0.setAcquireRetries((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3741");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3741 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setTransactionIsolation("HikariPool-1104");
        hikariConfig0.setPoolName("");
        long long12 = hikariConfig0.getMaxLifetime();
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-1969");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setReadOnly(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str15 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-11680" + "'", str15, "HikariPool-11680");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setDataSourceClassName("hi!");
        long long8 = hikariConfig0.getIdleTimeout();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setTransactionIsolation("HikariPool-2092");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setMaxLifetime((long) 0);
        hikariConfig7.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("HikariPool-951");
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str7 = hikariConfig6.getConnectionInitSql();
        long long8 = hikariConfig6.getMaxLifetime();
        java.lang.String str9 = hikariConfig6.getConnectionCustomizerClassName();
        hikariConfig6.setAcquireIncrement(100);
        hikariConfig6.setIsolateInternalQueries(false);
        hikariConfig6.setDataSourceClassName("");
        long long16 = hikariConfig6.getIdleTimeout();
        java.util.Properties properties17 = hikariConfig6.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-1631", (java.lang.Object) properties17);
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setJdbcUrl("HikariPool-11149");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setConnectionInitSql("HikariPool-250");
        hikariConfig0.setDataSourceClassName("HikariPool-2619");
        hikariConfig0.setDataSourceClassName("HikariPool-8822");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setAcquireRetries(100);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIsolateInternalQueries(true);
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        int int12 = hikariConfig10.getMinimumPoolSize();
        boolean boolean13 = hikariConfig10.isIsolateInternalQueries();
        long long14 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties15);
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setCatalog("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setReadOnly(false);
        int int10 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.addDataSourceProperty("HikariPool-1301", (java.lang.Object) 60);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-4439");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        long long14 = hikariConfig12.getConnectionTimeout();
        java.lang.String str15 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setMaxLifetime(0L);
        int int18 = hikariConfig12.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        long long6 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        long long16 = hikariConfig14.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        hikariConfig8.setReadOnly(false);
        hikariConfig8.setDataSourceClassName("");
        java.lang.String str14 = hikariConfig8.getCatalog();
        hikariConfig8.setAutoCommit(false);
        long long17 = hikariConfig8.getMaxLifetime();
        java.util.Properties properties18 = hikariConfig8.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties18);
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        int int4 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setConnectionInitSql("");
        hikariConfig6.setConnectionInitSql("hi!");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        boolean boolean12 = hikariConfig6.isReadOnly();
        hikariConfig6.setTransactionIsolation("HikariPool-211");
        javax.sql.DataSource dataSource15 = hikariConfig6.getDataSource();
        long long16 = hikariConfig6.getIdleTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-3572", (java.lang.Object) hikariConfig6);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        int int11 = hikariConfig9.getMinimumPoolSize();
        int int12 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.setMaxLifetime((long) 1);
        long long15 = hikariConfig9.getAcquireRetryDelay();
        int int16 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig19.setConnectionInitSql("HikariPool-3016");
        hikariConfig19.setMaximumPoolSize(32);
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig19.addDataSourceProperty("HikariPool-7881", obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10117");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10117 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties19);
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        hikariConfig0.setReadOnly(true);
        long long20 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("HikariPool-1969");
        java.lang.Class<?> wildcardClass23 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        int int9 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11479");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11479 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9828");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9828 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setDataSourceClassName("HikariPool-514");
        int int9 = hikariConfig1.getAcquireRetries();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-514");
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.Class<?> wildcardClass19 = hikariConfig18.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isJdbc4ConnectionTest();
        long long14 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setJdbcUrl("");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig0.setDataSourceProperties(properties18);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        int int26 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        hikariConfig0.setIdleTimeout((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionInitSql("HikariPool-2708");
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAcquireIncrement((int) '4');
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean25 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-6653");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-447");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-447' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        int int21 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionTestQuery("hi!");
        boolean boolean24 = hikariConfig18.isIsolateInternalQueries();
        hikariConfig16.addDataSourceProperty("HikariPool-211", (java.lang.Object) boolean24);
        hikariConfig16.setUseInstrumentation(true);
        hikariConfig16.setDataSourceClassName("HikariPool-726");
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int34 = hikariConfig16.getMaximumPoolSize();
        hikariConfig16.setMaximumPoolSize(0);
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean42 = hikariConfig41.isJdbc4ConnectionTest();
        long long43 = hikariConfig41.getConnectionTimeout();
        hikariConfig41.setJdbcUrl("");
        java.lang.String str46 = hikariConfig41.getConnectionCustomizerClassName();
        java.util.Properties properties47 = hikariConfig41.getDataSourceProperties();
        hikariConfig38.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig16.setDataSourceProperties(properties47);
        int int51 = hikariConfig16.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setAcquireIncrement(52);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setIdleTimeout(10L);
        java.lang.String str19 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetries(100);
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setRegisterMbeans(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11451");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11451' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 97);
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5147");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5147 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        long long13 = hikariConfig0.getMaxLifetime();
        java.lang.String str14 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        int int8 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig7.getDataSourceClassName();
        boolean boolean14 = hikariConfig7.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig7.isReadOnly();
        boolean boolean16 = hikariConfig7.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str28 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str31 = hikariConfig30.getConnectionInitSql();
        long long32 = hikariConfig30.getMaxLifetime();
        java.lang.String str33 = hikariConfig30.getDataSourceClassName();
        hikariConfig30.setIdleTimeout((long) (-1));
        java.lang.String str36 = hikariConfig30.getConnectionTestQuery();
        int int37 = hikariConfig30.getMaximumPoolSize();
        java.lang.String str38 = hikariConfig30.getJdbcUrl();
        hikariConfig0.addDataSourceProperty("HikariPool-1915", (java.lang.Object) hikariConfig30);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig30.setDriverClassName("HikariPool-7337");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-7337' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-11988" + "'", str28, "HikariPool-11988");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMaximumPoolSize();
        hikariConfig7.setTransactionIsolation("HikariPool-452");
        long long11 = hikariConfig7.getMaxLifetime();
        int int12 = hikariConfig7.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setIdleTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setReadOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-1969");
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setDataSourceClassName("HikariPool-10680");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setRegisterMbeans(false);
        int int9 = hikariConfig0.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9754");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9754 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("HikariPool-1409");
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getCatalog();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-211");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setDataSourceClassName("HikariPool-4364");
        long long12 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setUseInstrumentation(true);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-12060" + "'", str6, "HikariPool-12060");
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTestQuery("HikariPool-1104");
        hikariConfig0.setMaximumPoolSize(100);
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long16 = hikariConfig0.getMaxLifetime();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("HikariPool-4278");
        hikariConfig0.setAcquireRetries((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireIncrement(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetries(3);
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str18 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-12070" + "'", str18, "HikariPool-12070");
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize(1);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2848");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2848' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setMinimumPoolSize((int) (byte) 10);
        long long11 = hikariConfig8.getIdleTimeout();
        java.lang.Class<?> wildcardClass12 = hikariConfig8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        long long9 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setJdbcUrl("");
        java.lang.String str12 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties13 = hikariConfig7.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties13);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        long long19 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3070");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3070 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setIdleTimeout((long) (byte) -1);
        java.lang.String str8 = hikariConfig5.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig5.setDriverClassName("HikariPool-8509");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8509' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        long long13 = hikariConfig0.getMaxLifetime();
        long long14 = hikariConfig0.getIdleTimeout();
        int int15 = hikariConfig0.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10722");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10722' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        int int18 = hikariConfig15.getAcquireIncrement();
        hikariConfig15.setConnectionCustomizerClassName("");
        boolean boolean21 = hikariConfig15.isReadOnly();
        long long22 = hikariConfig15.getMaxLifetime();
        long long23 = hikariConfig15.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isJdbc4ConnectionTest();
        long long26 = hikariConfig24.getConnectionTimeout();
        hikariConfig24.setJdbcUrl("");
        java.lang.String str29 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig15.setDataSourceProperties(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        long long37 = hikariConfig0.getMaxLifetime();
        long long38 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setUseInstrumentation(true);
        javax.sql.DataSource dataSource43 = null;
        hikariConfig0.setDataSource(dataSource43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1800000L + "'", long37 == 1800000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 750L + "'", long38 == 750L);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-573");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries(0);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMaxLifetime(2147483647L);
        long long18 = hikariConfig1.getMaxLifetime();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2147483647L + "'", long18 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setMaxLifetime((long) (short) -1);
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean15 = hikariConfig0.isAutoCommit();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setReadOnly(false);
        hikariConfig11.setJdbcUrl("");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        hikariConfig0.setMinimumPoolSize(10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11215");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11215' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setDriverClassName("HikariPool-10645");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10645' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMaxLifetime(10L);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setAcquireRetries(10);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setConnectionTimeout((long) (byte) 0);
        hikariConfig0.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-3491");
        hikariConfig0.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        int int11 = hikariConfig0.getTransactionIsolation();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries(3);
        int int15 = hikariConfig0.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setJdbcUrl("HikariPool-1059");
        hikariConfig0.setAutoCommit(true);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-1059" + "'", str18, "HikariPool-1059");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("hi!");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.setDataSource(dataSource25);
        int int27 = hikariConfig0.getMinimumPoolSize();
        int int28 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-10234");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        boolean boolean13 = hikariConfig11.isReadOnly();
        int int14 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setConnectionCustomizerClassName("");
        boolean boolean17 = hikariConfig11.isReadOnly();
        long long18 = hikariConfig11.getMaxLifetime();
        long long19 = hikariConfig11.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        java.lang.String str25 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig11.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        boolean boolean35 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        hikariConfig0.setDataSourceClassName("HikariPool-12134");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setCatalog("");
        long long13 = hikariConfig0.getIdleTimeout();
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        int int19 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setConnectionInitSql("");
        hikariConfig18.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str24 = hikariConfig18.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setConnectionInitSql("hi!");
        java.lang.String str30 = hikariConfig25.getConnectionCustomizerClassName();
        hikariConfig25.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        java.lang.String str38 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig25.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig18.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        int int47 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        java.lang.String str10 = hikariConfig0.getCatalog();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireRetries((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        hikariConfig0.setReadOnly(true);
        long long12 = hikariConfig0.getAcquireRetryDelay();
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1104");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.Class<?> wildcardClass21 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setLeakDetectionThreshold(750L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getAcquireRetries();
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireRetryDelay((long) 52);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-6245");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-6245' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-7700");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.lang.String str17 = hikariConfig1.getCatalog();
        int int18 = hikariConfig1.getAcquireIncrement();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionInitSql("HikariPool-2708");
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAcquireIncrement((int) '4');
        javax.sql.DataSource dataSource23 = null;
        hikariConfig0.setDataSource(dataSource23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        hikariConfig9.setTransactionIsolation("");
        hikariConfig9.setMaxLifetime(0L);
        long long15 = hikariConfig9.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        long long12 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        int int12 = hikariConfig10.getMinimumPoolSize();
        boolean boolean13 = hikariConfig10.isIsolateInternalQueries();
        long long14 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties15);
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-2683");
        long long22 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        long long14 = hikariConfig12.getConnectionTimeout();
        java.lang.String str15 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setMaxLifetime(0L);
        int int18 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setCatalog("HikariPool-10282");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '4');
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getConnectionTimeout();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-8951");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8951' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isReadOnly();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        int int5 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-602");
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        int int16 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setConnectionCustomizerClassName("");
        java.lang.String str19 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig0.addDataSourceProperty("HikariPool-697", (java.lang.Object) str19);
        java.lang.Class<?> wildcardClass21 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11981");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11981' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        boolean boolean9 = hikariConfig7.isReadOnly();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) boolean9);
        hikariConfig1.setTransactionIsolation("HikariPool-447");
        int int13 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-1969");
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str11 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1969" + "'", str11, "HikariPool-1969");
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9921");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9921 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-3746");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-3746' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        int int11 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMaximumPoolSize(100);
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean6 = hikariConfig5.isJdbc4ConnectionTest();
        long long7 = hikariConfig5.getConnectionTimeout();
        hikariConfig5.setJdbcUrl("");
        java.lang.String str10 = hikariConfig5.getConnectionCustomizerClassName();
        java.util.Properties properties11 = hikariConfig5.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig0.setDataSourceProperties(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig14.setJdbcUrl("HikariPool-7928");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setJdbcUrl("HikariPool-1915");
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5082");
        hikariConfig0.setConnectionInitSql("HikariPool-11767");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setDataSourceClassName("HikariPool-370");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setIdleTimeout((long) 3);
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        long long10 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setReadOnly(false);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetries(1);
        hikariConfig17.setLeakDetectionThreshold(5000L);
        hikariConfig17.setAcquireRetries(0);
        hikariConfig17.setReadOnly(true);
        hikariConfig17.setTransactionIsolation("HikariPool-5182");
        hikariConfig17.setPoolName("HikariPool-3897");
        hikariConfig0.addDataSourceProperty("HikariPool-9341", (java.lang.Object) "HikariPool-3897");
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean38 = hikariConfig37.isJdbc4ConnectionTest();
        hikariConfig37.setMinimumPoolSize(60);
        java.lang.String str41 = hikariConfig37.getCatalog();
        hikariConfig37.setLeakDetectionThreshold((long) 60);
        hikariConfig0.addDataSourceProperty("HikariPool-2535", (java.lang.Object) 60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        long long10 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("HikariPool-2848");
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.setPoolName("HikariPool-960");
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        int int14 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long16 = hikariConfig0.getMaxLifetime();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("HikariPool-3699");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5278");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-3070");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-7874");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-7874' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8274");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8274 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setMaxLifetime(0L);
        java.util.Properties properties21 = hikariConfig18.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        hikariConfig0.setCatalog("HikariPool-1062");
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize(1);
        int int19 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-377");
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str28 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-2824");
        long long13 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("HikariPool-11072");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setTransactionIsolation("HikariPool-12028");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1104");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-575");
        hikariConfig1.setTransactionIsolation("HikariPool-10730");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long4 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12305");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12305 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getAcquireRetries();
        java.lang.String str9 = hikariConfig7.getCatalog();
        hikariConfig7.setPoolName("HikariPool-1230");
        long long12 = hikariConfig7.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAcquireRetries((int) (byte) 0);
        hikariConfig8.setMinimumPoolSize(32);
        boolean boolean16 = hikariConfig8.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig8.setConnectionTimeout(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaxLifetime((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-9754");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-9754' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        long long17 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setJdbcUrl("");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig9.setDataSourceProperties(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1104");
        hikariConfig1.setRegisterMbeans(false);
        int int21 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        int int23 = hikariConfig1.getAcquireIncrement();
        java.lang.String str24 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getIdleTimeout();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        long long12 = hikariConfig0.getConnectionTimeout();
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        int int12 = hikariConfig0.getAcquireRetries();
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-564");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        long long13 = hikariConfig0.getMaxLifetime();
        long long14 = hikariConfig0.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        int int11 = hikariConfig0.getMaximumPoolSize();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        int int18 = hikariConfig15.getAcquireIncrement();
        java.lang.String str19 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.setConnectionTimeout((long) 0);
        hikariConfig15.setAcquireRetries(60);
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig28.setConnectionInitSql("");
        hikariConfig28.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        java.lang.String str38 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig28.setDataSourceProperties(properties39);
        hikariConfig15.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        java.lang.Class<?> wildcardClass44 = properties39.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize(52);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setDataSourceClassName("HikariPool-2683");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setCatalog("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-6211");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setTransactionIsolation("HikariPool-1744");
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-829");
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setUseInstrumentation(false);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-8612", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-829" + "'", str9, "HikariPool-829");
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-514");
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str22 = hikariConfig21.getConnectionInitSql();
        long long23 = hikariConfig21.getMaxLifetime();
        java.lang.String str24 = hikariConfig21.getConnectionCustomizerClassName();
        int int25 = hikariConfig21.getMaximumPoolSize();
        int int26 = hikariConfig21.getMaximumPoolSize();
        long long27 = hikariConfig21.getMaxLifetime();
        java.lang.String str28 = hikariConfig21.getConnectionCustomizerClassName();
        int int29 = hikariConfig21.getTransactionIsolation();
        java.util.Properties properties30 = hikariConfig21.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties30);
        boolean boolean32 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize(0);
        int int6 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3746");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("hi!");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("HikariPool-1143");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getMaxLifetime();
        boolean boolean15 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setReadOnly(true);
        boolean boolean18 = hikariConfig12.isAutoCommit();
        hikariConfig12.setLeakDetectionThreshold(1L);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig12.setDataSource(dataSource21);
        hikariConfig12.setConnectionCustomizerClassName("HikariPool-137");
        boolean boolean25 = hikariConfig12.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        boolean boolean28 = hikariConfig26.isReadOnly();
        int int29 = hikariConfig26.getAcquireIncrement();
        hikariConfig26.setConnectionTestQuery("hi!");
        hikariConfig26.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig26.setAutoCommit(true);
        java.util.Properties properties36 = hikariConfig26.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties36);
        hikariConfig0.setDataSourceProperties(properties36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-2824");
        long long13 = hikariConfig0.getMaxLifetime();
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties15 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig0.setDataSourceProperties(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setConnectionInitSql("hi!");
        java.lang.String str30 = hikariConfig25.getConnectionCustomizerClassName();
        hikariConfig25.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        java.lang.String str38 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig25.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig23.setDataSourceProperties(properties39);
        hikariConfig21.setDataSourceProperties(properties39);
        long long47 = hikariConfig21.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig21.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        long long14 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setUseInstrumentation(true);
        int int17 = hikariConfig12.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-1301");
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        int int12 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setAutoCommit(true);
        hikariConfig10.setMaxLifetime((long) (short) 0);
        hikariConfig0.addDataSourceProperty("HikariPool-3911", (java.lang.Object) (short) 0);
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        long long18 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getMaxLifetime();
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-5990");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5990' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-2735");
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig20.setUseInstrumentation(false);
        long long23 = hikariConfig20.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass5 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-573");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-7337", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        int int8 = hikariConfig0.getAcquireIncrement();
        long long9 = hikariConfig0.getMaxLifetime();
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setTransactionIsolation("HikariPool-1301");
        java.util.Properties properties11 = hikariConfig7.getDataSourceProperties();
        java.lang.Class<?> wildcardClass12 = hikariConfig7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-575");
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.lang.String str13 = hikariConfig0.getCatalog();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-575" + "'", str13, "HikariPool-575");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-575" + "'", str15, "HikariPool-575");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-370" + "'", str11, "HikariPool-370");
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setReadOnly(false);
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireIncrement(60);
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig1.getPoolName();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        int int18 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        boolean boolean21 = hikariConfig19.isReadOnly();
        int int22 = hikariConfig19.getAcquireIncrement();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig19.setDataSource(dataSource23);
        hikariConfig19.setConnectionInitSql("");
        hikariConfig19.setMaxLifetime((long) 10);
        hikariConfig19.setMinimumPoolSize((int) '4');
        java.util.Properties properties31 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-13074" + "'", str16, "HikariPool-13074");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        long long9 = hikariConfig7.getConnectionTimeout();
        boolean boolean10 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig0.addDataSourceProperty("HikariPool-1631", (java.lang.Object) boolean10);
        int int12 = hikariConfig0.getAcquireRetries();
        boolean boolean13 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-13078" + "'", str5, "HikariPool-13078");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6654");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6654 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass13 = hikariConfig10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getMaxLifetime();
        boolean boolean10 = hikariConfig0.isReadOnly();
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        int int4 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        java.lang.String str11 = hikariConfig9.getDataSourceClassName();
        long long12 = hikariConfig9.getAcquireRetryDelay();
        long long13 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setDataSourceClassName("HikariPool-4029");
        hikariConfig9.setPoolName("");
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isJdbc4ConnectionTest();
        long long21 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setJdbcUrl("");
        java.lang.String str24 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.setJdbc4ConnectionTest(false);
        hikariConfig19.setMaxLifetime(5000L);
        hikariConfig19.setCatalog("");
        long long32 = hikariConfig19.getIdleTimeout();
        int int33 = hikariConfig19.getMinimumPoolSize();
        hikariConfig19.setUseInstrumentation(false);
        java.lang.String str36 = hikariConfig19.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        int int38 = hikariConfig37.getAcquireRetries();
        hikariConfig37.setConnectionInitSql("");
        hikariConfig37.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str43 = hikariConfig37.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig44.setConnectionInitSql("");
        hikariConfig44.setConnectionInitSql("hi!");
        java.lang.String str49 = hikariConfig44.getConnectionCustomizerClassName();
        hikariConfig44.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean53 = hikariConfig52.isJdbc4ConnectionTest();
        long long54 = hikariConfig52.getConnectionTimeout();
        hikariConfig52.setJdbcUrl("");
        java.lang.String str57 = hikariConfig52.getConnectionCustomizerClassName();
        java.util.Properties properties58 = hikariConfig52.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig44.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig37.setDataSourceProperties(properties58);
        hikariConfig19.setDataSourceProperties(properties58);
        hikariConfig9.addDataSourceProperty("HikariPool-452", (java.lang.Object) hikariConfig19);
        hikariConfig9.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 5000L + "'", long54 == 5000L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setIdleTimeout((long) 0);
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1805");
        hikariConfig0.setDataSourceClassName("HikariPool-2619");
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTimeout(5000L);
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("HikariPool-250");
        java.lang.String str4 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setTransactionIsolation("HikariPool-7881");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-250" + "'", str4, "HikariPool-250");
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        long long27 = hikariConfig25.getMaxLifetime();
        java.lang.String str28 = hikariConfig25.getConnectionCustomizerClassName();
        long long29 = hikariConfig25.getAcquireRetryDelay();
        long long30 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-3562", (java.lang.Object) hikariConfig25);
        long long32 = hikariConfig25.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-6284");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-6284' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10809");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10809 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        hikariConfig0.setPoolName("HikariPool-514");
        hikariConfig0.setMinimumPoolSize(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setLeakDetectionThreshold(52L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        java.lang.String str14 = hikariConfig10.getDataSourceClassName();
        boolean boolean15 = hikariConfig10.isRegisterMbeans();
        boolean boolean16 = hikariConfig10.isRegisterMbeans();
        boolean boolean17 = hikariConfig10.isRegisterMbeans();
        int int18 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setIsolateInternalQueries(true);
        hikariConfig10.setMinimumPoolSize(100);
        boolean boolean23 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-5978", (java.lang.Object) hikariConfig10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        long long16 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean12 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setCatalog("HikariPool-1059");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-1458");
        int int21 = hikariConfig0.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass22 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement(3);
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setPoolName("HikariPool-3827");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaximumPoolSize(100);
        hikariConfig0.setConnectionTestQuery("HikariPool-3587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isJdbc4ConnectionTest();
        hikariConfig21.setReadOnly(false);
        hikariConfig21.setDataSourceClassName("");
        java.lang.String str27 = hikariConfig21.getCatalog();
        hikariConfig21.setAutoCommit(false);
        boolean boolean30 = hikariConfig21.isReadOnly();
        hikariConfig21.setIdleTimeout((long) 0);
        hikariConfig21.setMaximumPoolSize(0);
        long long35 = hikariConfig21.getIdleTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-5182", (java.lang.Object) hikariConfig21);
        boolean boolean37 = hikariConfig21.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean12 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7833");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7833 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        java.lang.String str11 = hikariConfig9.getDataSourceClassName();
        long long12 = hikariConfig9.getAcquireRetryDelay();
        long long13 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setMaximumPoolSize((int) (byte) 0);
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig9.getConnectionCustomizerClassName();
        boolean boolean19 = hikariConfig9.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.getAcquireRetries();
        int int8 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-10324");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties15 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig0.setDataSourceProperties(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setCatalog("HikariPool-12593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5978");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5978 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) 'a');
        hikariConfig0.setDataSourceClassName("HikariPool-250");
        long long17 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMaxLifetime((long) 3);
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement(10);
        hikariConfig0.setAcquireRetryDelay((long) 60);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1579");
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-11159");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isJdbc4ConnectionTest();
        long long21 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setJdbcUrl("");
        java.lang.String str24 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig13.setDataSourceProperties(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setCatalog("HikariPool-2282");
        java.lang.String str9 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-13334" + "'", str9, "HikariPool-13334");
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setDataSourceClassName("HikariPool-2967");
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setPoolName("HikariPool-3533");
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-9769");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-9769' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig12.setAcquireRetryDelay((long) (short) 10);
        boolean boolean15 = hikariConfig12.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        java.lang.String str17 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        int int9 = hikariConfig0.getAcquireRetries();
        int int10 = hikariConfig0.getAcquireRetries();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5463");
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbcUrl("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setDataSourceClassName("HikariPool-1062");
        hikariConfig0.setUseInstrumentation(false);
        int int14 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-137");
        long long6 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-7740");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12070");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12070 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        long long17 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setJdbcUrl("");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig9.setDataSourceProperties(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig26.setConnectionTimeout(0L);
        hikariConfig26.setAcquireRetries((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig26.setMaximumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetryDelay((long) 10);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        int int12 = hikariConfig10.getMinimumPoolSize();
        boolean boolean13 = hikariConfig10.isIsolateInternalQueries();
        long long14 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties15);
        java.lang.String str17 = hikariConfig0.getCatalog();
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-11940");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-564");
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-13464" + "'", str17, "HikariPool-13464");
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("hi!");
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime((long) 0);
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries(0);
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setIdleTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setJdbcUrl("HikariPool-12070");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int12 = hikariConfig0.getMaximumPoolSize();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMinimumPoolSize(1);
        hikariConfig0.setConnectionInitSql("HikariPool-11159");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setConnectionTestQuery("HikariPool-7525");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13475");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13475 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries(0);
        long long8 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        int int13 = hikariConfig0.getMinimumPoolSize();
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-1605");
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-2632");
        hikariConfig0.setAutoCommit(false);
        long long14 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean6 = hikariConfig5.isJdbc4ConnectionTest();
        long long7 = hikariConfig5.getConnectionTimeout();
        hikariConfig5.setJdbcUrl("");
        java.lang.String str10 = hikariConfig5.getConnectionCustomizerClassName();
        java.util.Properties properties11 = hikariConfig5.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.lang.String str15 = hikariConfig14.getCatalog();
        int int16 = hikariConfig14.getAcquireIncrement();
        boolean boolean17 = hikariConfig14.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-2322", (java.lang.Object) hikariConfig14);
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        long long10 = hikariConfig8.getConnectionTimeout();
        hikariConfig8.setJdbcUrl("");
        java.lang.String str13 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties14 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig0.setDataSourceProperties(properties14);
        hikariConfig0.setIdleTimeout((long) (short) 0);
        long long21 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIdleTimeout(0L);
        java.lang.Class<?> wildcardClass24 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getPoolName();
        long long7 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-13561" + "'", str6, "HikariPool-13561");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setReadOnly(false);
        hikariConfig13.setDataSourceClassName("");
        java.lang.String str19 = hikariConfig13.getCatalog();
        boolean boolean20 = hikariConfig13.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str22 = hikariConfig21.getConnectionInitSql();
        long long23 = hikariConfig21.getMaxLifetime();
        java.lang.String str24 = hikariConfig21.getConnectionCustomizerClassName();
        int int25 = hikariConfig21.getMaximumPoolSize();
        int int26 = hikariConfig21.getMaximumPoolSize();
        long long27 = hikariConfig21.getMaxLifetime();
        hikariConfig21.setAcquireIncrement((int) (byte) 100);
        hikariConfig21.setAcquireRetryDelay(600000L);
        java.lang.String str32 = hikariConfig21.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        boolean boolean38 = hikariConfig33.isRegisterMbeans();
        hikariConfig33.setIsolateInternalQueries(false);
        hikariConfig33.setAcquireRetries((int) '4');
        java.util.Properties properties43 = hikariConfig33.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties43);
        hikariConfig13.setDataSourceProperties(properties43);
        hikariConfig0.setDataSourceProperties(properties43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        int int7 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2847");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2847' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getPoolName();
        java.lang.String str10 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-13575" + "'", str9, "HikariPool-13575");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetries(52);
        int int10 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionInitSql("HikariPool-1260");
        hikariConfig0.setIdleTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12823");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12823 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        hikariConfig8.setInitializationFailFast(false);
        hikariConfig8.setReadOnly(true);
        hikariConfig8.setMaximumPoolSize((int) 'a');
        hikariConfig8.setConnectionCustomizerClassName("HikariPool-1605");
        boolean boolean20 = hikariConfig8.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-4278", (java.lang.Object) boolean20);
        java.lang.Class<?> wildcardClass22 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        long long4 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize((int) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-1059");
        hikariConfig0.setPoolName("HikariPool-3979");
        hikariConfig0.setTransactionIsolation("HikariPool-13569");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setDataSourceClassName("HikariPool-1062");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-6821");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionInitSql("HikariPool-452");
        hikariConfig1.setTransactionIsolation("HikariPool-3979");
        int int19 = hikariConfig1.getTransactionIsolation();
        long long20 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout(600000L);
        int int8 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str7 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-13624" + "'", str7, "HikariPool-13624");
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9205");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9205 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.setJdbcUrl("HikariPool-510");
        java.lang.String str13 = hikariConfig9.getJdbcUrl();
        javax.sql.DataSource dataSource14 = hikariConfig9.getDataSource();
        java.lang.String str15 = hikariConfig9.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-510" + "'", str13, "HikariPool-510");
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetries((int) ' ');
        long long6 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2322");
        hikariConfig0.setMaxLifetime((-1L));
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-697");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-960");
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        hikariConfig0.setJdbcUrl("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getCatalog();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        int int11 = hikariConfig0.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setReadOnly(false);
        hikariConfig7.setMinimumPoolSize(0);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig7.setDataSource(dataSource12);
        hikariConfig7.setDataSourceClassName("HikariPool-2646");
        hikariConfig7.setLeakDetectionThreshold((long) 0);
        hikariConfig7.setConnectionTestQuery("HikariPool-4439");
        hikariConfig7.setConnectionTestQuery("HikariPool-1260");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isJdbc4ConnectionTest();
        long long20 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setJdbcUrl("");
        java.lang.String str23 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig13.setDataSourceProperties(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        hikariConfig0.setReadOnly(false);
        int int30 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.util.Properties properties33 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig14.setConnectionInitSql("HikariPool-3572");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setDataSourceClassName("HikariPool-514");
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-11093");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-13698" + "'", str16, "HikariPool-13698");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize(1);
        hikariConfig0.setRegisterMbeans(true);
        long long21 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        boolean boolean24 = hikariConfig22.isReadOnly();
        javax.sql.DataSource dataSource25 = hikariConfig22.getDataSource();
        int int26 = hikariConfig22.getAcquireIncrement();
        hikariConfig22.setRegisterMbeans(true);
        hikariConfig22.setCatalog("HikariPool-575");
        boolean boolean31 = hikariConfig22.isJdbc4ConnectionTest();
        java.util.Properties properties32 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig0.setDataSourceProperties(properties32);
        java.lang.String str35 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setAutoCommit(true);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setCatalog("HikariPool-10668");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.lang.String str17 = hikariConfig1.getCatalog();
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionInitSql("HikariPool-8688");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-11093");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11093' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setUseInstrumentation(false);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMaxLifetime((long) 60);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMinimumPoolSize(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setTransactionIsolation("");
        hikariConfig7.setTransactionIsolation("HikariPool-13188");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setConnectionTestQuery("HikariPool-211");
        boolean boolean16 = hikariConfig0.isReadOnly();
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig11.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setCatalog("HikariPool-2708");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setJdbcUrl("HikariPool-3070");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-1104");
        int int11 = hikariConfig0.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-801");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-801' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-3419");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-3419' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        hikariConfig0.setAcquireIncrement(1);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-2434");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setJdbcUrl("HikariPool-1059");
        java.lang.String str15 = hikariConfig0.getCatalog();
        java.lang.Class<?> wildcardClass16 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        java.lang.String str7 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-13813" + "'", str7, "HikariPool-13813");
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setDataSourceClassName("HikariPool-4807");
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-6819");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-447");
        hikariConfig0.setCatalog("HikariPool-1458");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-801");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setReadOnly(false);
        hikariConfig11.setJdbcUrl("");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        int int17 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setAcquireRetryDelay((long) 52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        long long4 = hikariConfig0.getMaxLifetime();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTimeout((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay(1800000L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionInitSql("HikariPool-5130");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-564");
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setTransactionIsolation("HikariPool-902");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1969");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-137");
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        boolean boolean16 = hikariConfig14.isReadOnly();
        int int17 = hikariConfig14.getAcquireIncrement();
        hikariConfig14.setConnectionTestQuery("hi!");
        hikariConfig14.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig14.setAutoCommit(true);
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties24);
        java.lang.String str26 = hikariConfig0.getCatalog();
        long long27 = hikariConfig0.getLeakDetectionThreshold();
        int int28 = hikariConfig0.getTransactionIsolation();
        long long29 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-1631");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setTransactionIsolation("HikariPool-11479");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-829");
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        int int16 = hikariConfig0.getMinimumPoolSize();
        long long17 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-1631");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        long long13 = hikariConfig0.getMaxLifetime();
        long long14 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setConnectionTestQuery("hi!");
        hikariConfig10.setConnectionInitSql("HikariPool-211");
        hikariConfig10.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties20 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties20);
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-7111");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-7111' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-2969");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        hikariConfig0.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-1143");
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12593");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12593 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        int int13 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11423");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11423' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-13604");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-13604' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIsolateInternalQueries(true);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        int int9 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbcUrl("HikariPool-1744");
        hikariConfig0.setPoolName("HikariPool-3728");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10999");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10999' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }
}
