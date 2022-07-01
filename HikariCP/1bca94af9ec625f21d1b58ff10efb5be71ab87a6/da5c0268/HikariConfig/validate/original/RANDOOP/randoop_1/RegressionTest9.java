import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
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
        int int13 = hikariConfig0.getAcquireRetries();
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
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
        hikariConfig0.setIdleTimeout((long) 'a');
        long long18 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setLeakDetectionThreshold((long) 32);
        int int9 = hikariConfig5.getAcquireIncrement();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8148 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
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
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setIdleTimeout((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
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
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean38 = hikariConfig37.isJdbc4ConnectionTest();
        long long39 = hikariConfig37.getConnectionTimeout();
        hikariConfig37.setJdbcUrl("");
        java.lang.String str42 = hikariConfig37.getConnectionCustomizerClassName();
        java.util.Properties properties43 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        java.lang.String str47 = hikariConfig46.getCatalog();
        long long48 = hikariConfig46.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        int int50 = hikariConfig49.getAcquireRetries();
        hikariConfig49.setConnectionInitSql("");
        hikariConfig49.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig49.setAutoCommit(true);
        hikariConfig49.setConnectionTestQuery("HikariPool-137");
        long long59 = hikariConfig49.getIdleTimeout();
        int int60 = hikariConfig49.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean62 = hikariConfig61.isInitializationFailFast();
        boolean boolean63 = hikariConfig61.isReadOnly();
        int int64 = hikariConfig61.getAcquireIncrement();
        hikariConfig61.setConnectionTestQuery("hi!");
        hikariConfig61.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig61.setAutoCommit(true);
        java.util.Properties properties71 = hikariConfig61.getDataSourceProperties();
        hikariConfig49.setDataSourceProperties(properties71);
        hikariConfig46.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig0.setDataSourceProperties(properties71);
        java.lang.String str76 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str79 = hikariConfig0.getJdbcUrl();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1800000L + "'", long48 == 1800000L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 600000L + "'", long59 == 600000L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(properties71);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "HikariPool-29160" + "'", str76, "HikariPool-29160");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig9.setReadOnly(false);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetries(1);
        hikariConfig9.setMaxLifetime((long) (short) 1);
        hikariConfig9.setConnectionInitSql("HikariPool-250");
        hikariConfig0.addDataSourceProperty("HikariPool-2459", (java.lang.Object) hikariConfig9);
        int int22 = hikariConfig9.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setDriverClassName("HikariPool-22383");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-22383' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2282");
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-23973");
        hikariConfig0.setPoolName("HikariPool-11501");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-29196" + "'", str11, "HikariPool-29196");
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
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
            hikariConfig0.setDriverClassName("HikariPool-17962");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-17962' could not be loaded");
        } catch (java.lang.RuntimeException e) {
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
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
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
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig0.isAutoCommit();
        hikariConfig0.setPoolName("HikariPool-5333");
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
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
        hikariConfig0.setPoolName("HikariPool-1544");
        hikariConfig0.setJdbcUrl("HikariPool-12813");
        boolean boolean18 = hikariConfig0.isAutoCommit();
        java.lang.String str19 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
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
        hikariConfig9.setPoolName("HikariPool-11093");
        javax.sql.DataSource dataSource15 = hikariConfig9.getDataSource();
        hikariConfig9.setAcquireRetries(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-27246");
        hikariConfig0.setJdbcUrl("HikariPool-21954");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
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
        long long13 = hikariConfig9.getConnectionTimeout();
        int int14 = hikariConfig9.getTransactionIsolation();
        java.lang.Class<?> wildcardClass15 = hikariConfig9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionInitSql("HikariPool-3562");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-29249" + "'", str13, "HikariPool-29249");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setInitializationFailFast(false);
        int int14 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-2812");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        java.lang.Class<?> wildcardClass14 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-7462");
        hikariConfig0.setConnectionInitSql("HikariPool-6211");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setInitializationFailFast(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setDataSourceClassName("HikariPool-6769");
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        int int6 = hikariConfig0.getAcquireIncrement();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTestQuery("HikariPool-10308");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setRegisterMbeans(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
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
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-29277" + "'", str14, "HikariPool-29277");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
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
        java.lang.String str11 = hikariConfig9.getCatalog();
        hikariConfig9.setConnectionCustomizerClassName("HikariPool-4941");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig9.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean6 = hikariConfig5.isJdbc4ConnectionTest();
        long long7 = hikariConfig5.getConnectionTimeout();
        hikariConfig5.setJdbcUrl("");
        java.lang.String str10 = hikariConfig5.getConnectionCustomizerClassName();
        java.util.Properties properties11 = hikariConfig5.getDataSourceProperties();
        long long12 = hikariConfig5.getMaxLifetime();
        hikariConfig5.setIsolateInternalQueries(true);
        long long15 = hikariConfig5.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.setReadOnly(false);
        hikariConfig16.setDataSourceClassName("");
        java.lang.String str22 = hikariConfig16.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        int int24 = hikariConfig23.getAcquireRetries();
        hikariConfig23.setConnectionInitSql("");
        hikariConfig23.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str29 = hikariConfig23.getDataSourceClassName();
        boolean boolean30 = hikariConfig23.isIsolateInternalQueries();
        boolean boolean31 = hikariConfig23.isReadOnly();
        boolean boolean32 = hikariConfig23.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        java.lang.String str38 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties39);
        hikariConfig16.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig5.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        long long45 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        int int11 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setReadOnly(true);
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime(10L);
        hikariConfig0.setIdleTimeout(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
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
        hikariConfig1.setDataSourceClassName("");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.setAcquireRetryDelay((long) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("HikariPool-6116");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long4 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setCatalog("HikariPool-2708");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        boolean boolean9 = hikariConfig7.isReadOnly();
        int int10 = hikariConfig7.getAcquireIncrement();
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig7.setAutoCommit(true);
        java.util.Properties properties17 = hikariConfig7.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int20 = hikariConfig19.getMaximumPoolSize();
        boolean boolean21 = hikariConfig19.isReadOnly();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig19.setDataSource(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-211");
        hikariConfig0.setMinimumPoolSize(3);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getConnectionCustomizerClassName();
        int int12 = hikariConfig8.getMinimumPoolSize();
        java.util.Properties properties13 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig0.setDataSourceProperties(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setConnectionCustomizerClassName("");
        long long20 = hikariConfig16.getConnectionTimeout();
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig16.setConnectionCustomizerClassName("");
        hikariConfig16.setRegisterMbeans(false);
        java.util.Properties properties28 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
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
        hikariConfig0.setPoolName("HikariPool-1260");
        hikariConfig0.setJdbcUrl("HikariPool-5162");
        boolean boolean22 = hikariConfig0.isReadOnly();
        long long23 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
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
        hikariConfig0.setCatalog("HikariPool-1230");
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setCatalog("HikariPool-15305");
        boolean boolean22 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
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
        hikariConfig0.setPoolName("HikariPool-24471");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
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
        java.lang.String str13 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getMaxLifetime();
        java.lang.String str18 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setMinimumPoolSize(100);
        boolean boolean21 = hikariConfig15.isJdbc4ConnectionTest();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) boolean21);
        long long23 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setConnectionCustomizerClassName("");
        long long30 = hikariConfig26.getConnectionTimeout();
        java.util.Properties properties31 = hikariConfig26.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5027");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5027 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-7684");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        boolean boolean4 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-19227");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setJdbcUrl("HikariPool-4426");
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        int int8 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        long long9 = hikariConfig0.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
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
        java.lang.String str37 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.setTransactionIsolation("HikariPool-3150");
        boolean boolean40 = hikariConfig16.isAutoCommit();
        hikariConfig16.setTransactionIsolation("HikariPool-1236");
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 10);
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setDataSourceClassName("HikariPool-1062");
        hikariConfig0.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-29301");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-29301 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
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
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig26.setDataSource(dataSource29);
        long long31 = hikariConfig26.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setPoolName("HikariPool-1733");
        hikariConfig0.setPoolName("HikariPool-16800");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionInitSql("hi!");
        int int12 = hikariConfig0.getAcquireIncrement();
        java.lang.String str13 = hikariConfig0.getPoolName();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.validate();
        hikariConfig0.setDataSourceClassName("HikariPool-12368");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-29428" + "'", str13, "HikariPool-29428");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
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
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
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
        long long21 = hikariConfig1.getMaxLifetime();
        long long22 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setTransactionIsolation("");
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-8612");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8612' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
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
        hikariConfig0.validate();
        long long20 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-29465" + "'", str6, "HikariPool-29465");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setTransactionIsolation("HikariPool-1301");
        boolean boolean11 = hikariConfig7.isRegisterMbeans();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig7.setDataSource(dataSource12);
        long long14 = hikariConfig7.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig7.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
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
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-1579");
        hikariConfig0.setCatalog("HikariPool-2845");
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getMaxLifetime();
        boolean boolean18 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setReadOnly(true);
        boolean boolean21 = hikariConfig15.isAutoCommit();
        hikariConfig15.setLeakDetectionThreshold(1L);
        hikariConfig15.setConnectionCustomizerClassName("");
        long long26 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.setTransactionIsolation("HikariPool-137");
        hikariConfig15.setInitializationFailFast(false);
        java.lang.String str31 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setUseInstrumentation(true);
        hikariConfig15.setPoolName("HikariPool-1707");
        int int36 = hikariConfig15.getMaximumPoolSize();
        boolean boolean37 = hikariConfig15.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean39 = hikariConfig38.isJdbc4ConnectionTest();
        hikariConfig38.setReadOnly(false);
        hikariConfig38.setDataSourceClassName("");
        java.lang.String str44 = hikariConfig38.getCatalog();
        hikariConfig38.setAutoCommit(false);
        boolean boolean47 = hikariConfig38.isReadOnly();
        hikariConfig38.setIdleTimeout((long) 0);
        boolean boolean50 = hikariConfig38.isRegisterMbeans();
        java.util.Properties properties51 = hikariConfig38.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig15.setDataSourceProperties(properties51);
        hikariConfig0.setDataSourceProperties(properties51);
        int int56 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 750L + "'", long26 == 750L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setMaxLifetime(5000L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-29487" + "'", str13, "HikariPool-29487");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        boolean boolean7 = hikariConfig0.isReadOnly();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
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
        hikariConfig11.setUseInstrumentation(false);
        long long20 = hikariConfig11.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
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
        hikariConfig0.validate();
        java.lang.String str20 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26154");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26154 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
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
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-23887");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) '4');
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-7991");
        hikariConfig13.setConnectionInitSql("HikariPool-10736");
        hikariConfig13.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig0.getConnectionTestQuery();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTimeout((long) 100);
        hikariConfig0.setCatalog("HikariPool-24265");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setTransactionIsolation("HikariPool-16463");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setRegisterMbeans(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement(97);
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-29544" + "'", str9, "HikariPool-29544");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        hikariConfig0.setAcquireRetryDelay((long) '4');
        java.lang.String str6 = hikariConfig0.getPoolName();
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-7462");
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-29545" + "'", str6, "HikariPool-29545");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
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
        hikariConfig0.setTransactionIsolation("HikariPool-2580");
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
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
        hikariConfig11.setConnectionInitSql("HikariPool-250");
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        int int21 = hikariConfig19.getMinimumPoolSize();
        int int22 = hikariConfig19.getMinimumPoolSize();
        hikariConfig19.setMaxLifetime((long) 1);
        long long25 = hikariConfig19.getAcquireRetryDelay();
        int int26 = hikariConfig19.getTransactionIsolation();
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties27);
        hikariConfig11.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str33 = hikariConfig32.getConnectionInitSql();
        long long34 = hikariConfig32.getMaxLifetime();
        java.lang.String str35 = hikariConfig32.getConnectionCustomizerClassName();
        int int36 = hikariConfig32.getMinimumPoolSize();
        java.lang.String str37 = hikariConfig32.getConnectionCustomizerClassName();
        hikariConfig32.setLeakDetectionThreshold((long) '#');
        java.lang.String str40 = hikariConfig32.getCatalog();
        boolean boolean41 = hikariConfig32.isIsolateInternalQueries();
        hikariConfig11.addDataSourceProperty("HikariPool-13348", (java.lang.Object) boolean41);
        hikariConfig11.setIdleTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1800000L + "'", long34 == 1800000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.validate();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(0L);
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig9.getCatalog();
        int int16 = hikariConfig9.getAcquireRetries();
        hikariConfig9.setTransactionIsolation("HikariPool-697");
        hikariConfig0.addDataSourceProperty("HikariPool-960", (java.lang.Object) "HikariPool-697");
        int int20 = hikariConfig0.getAcquireRetries();
        boolean boolean21 = hikariConfig0.isReadOnly();
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-960");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-19790");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-19790' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-5159");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
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
        boolean boolean12 = hikariConfig0.isReadOnly();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("HikariPool-12147");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
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
        hikariConfig0.setJdbcUrl("HikariPool-1744");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
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
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
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
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(5000L);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("HikariPool-447");
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-17441");
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
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
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setRegisterMbeans(false);
        int int21 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("hi!");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionTestQuery("HikariPool-10630");
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1104" + "'", str12, "HikariPool-1104");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbcUrl("HikariPool-4439");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        int int10 = hikariConfig0.getAcquireRetries();
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        long long15 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3885");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
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
        boolean boolean16 = hikariConfig0.isAutoCommit();
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-17017");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-29610" + "'", str7, "HikariPool-29610");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("HikariPool-1409");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
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
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
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
        long long14 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("HikariPool-10853");
        hikariConfig16.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
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
        boolean boolean36 = hikariConfig0.isInitializationFailFast();
        java.lang.String str37 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig39.setDataSource(dataSource41);
        boolean boolean43 = hikariConfig39.isJdbc4ConnectionTest();
        boolean boolean44 = hikariConfig39.isJdbc4ConnectionTest();
        hikariConfig39.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-5668", (java.lang.Object) hikariConfig39);
        hikariConfig39.addDataSourceProperty("HikariPool-1409", (java.lang.Object) "HikariPool-11923");
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setCatalog("HikariPool-3587");
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireIncrement(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-29489");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-29489 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-4426");
        hikariConfig0.setInitializationFailFast(false);
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1544");
        java.lang.String str18 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionInitSql("HikariPool-10660");
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setConnectionInitSql("hi!");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        boolean boolean27 = hikariConfig21.isReadOnly();
        long long28 = hikariConfig21.getConnectionTimeout();
        hikariConfig21.setConnectionTestQuery("HikariPool-452");
        boolean boolean31 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setConnectionInitSql("HikariPool-2606");
        java.util.Properties properties34 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        java.lang.String str37 = hikariConfig0.getCatalog();
        java.lang.String str38 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-575" + "'", str18, "HikariPool-575");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-137" + "'", str37, "HikariPool-137");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-137" + "'", str38, "HikariPool-137");
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-1579");
        int int12 = hikariConfig0.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-1949");
        long long13 = hikariConfig0.getConnectionTimeout();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2147483647L + "'", long13 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(3);
        java.lang.String str9 = hikariConfig0.getCatalog();
        long long10 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-29676" + "'", str6, "HikariPool-29676");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbcUrl("HikariPool-5463");
        hikariConfig0.setTransactionIsolation("HikariPool-3955");
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        int int20 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
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
        int int14 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11058");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11058' could not be loaded");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
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
        hikariConfig9.setCatalog("HikariPool-1865");
        int int15 = hikariConfig9.getAcquireRetries();
        hikariConfig9.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setAcquireRetryDelay((long) (byte) 0);
        int int12 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.setReadOnly(true);
        java.lang.String str15 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18656");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18656 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig10.isAutoCommit();
        hikariConfig8.addDataSourceProperty("hi!", (java.lang.Object) boolean16);
        hikariConfig8.setDataSourceClassName("HikariPool-697");
        int int20 = hikariConfig8.getMaximumPoolSize();
        java.lang.String str21 = hikariConfig8.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
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
        int int14 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-697");
        hikariConfig0.setAutoCommit(false);
        long long20 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(false);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
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
        hikariConfig0.setConnectionTimeout(2147483647L);
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        int int20 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str23 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        long long26 = hikariConfig24.getMaxLifetime();
        java.lang.String str27 = hikariConfig24.getConnectionCustomizerClassName();
        hikariConfig24.setAcquireIncrement(100);
        hikariConfig24.setIsolateInternalQueries(false);
        hikariConfig24.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource34 = hikariConfig24.getDataSource();
        hikariConfig24.setMaximumPoolSize(0);
        boolean boolean37 = hikariConfig24.isJdbc4ConnectionTest();
        int int38 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setPoolName("HikariPool-514");
        javax.sql.DataSource dataSource41 = hikariConfig24.getDataSource();
        hikariConfig24.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig24.setCatalog("HikariPool-903");
        java.util.Properties properties46 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig0.setDataSourceProperties(properties46);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
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
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        int int15 = hikariConfig0.getAcquireIncrement();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
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
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
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
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
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
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
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
        int int14 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        long long16 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetries((int) ' ');
        int int13 = hikariConfig0.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMinimumPoolSize(10);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("");
        hikariConfig0.setPoolName("HikariPool-14783");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10161");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10161' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
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
        long long14 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-29733" + "'", str5, "HikariPool-29733");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setIdleTimeout((long) 0);
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setConnectionInitSql("HikariPool-1458");
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setConnectionTimeout(0L);
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
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
        hikariConfig0.setLeakDetectionThreshold(1L);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setLeakDetectionThreshold(750L);
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay(750L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
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
        hikariConfig7.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass16 = hikariConfig7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
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
        long long21 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(true);
        int int24 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
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
        long long14 = hikariConfig0.getIdleTimeout();
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
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
        long long21 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaxLifetime((long) '#');
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        long long10 = hikariConfig0.getAcquireRetryDelay();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement(3);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
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
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireIncrement(3);
        int int21 = hikariConfig0.getAcquireIncrement();
        int int22 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("");
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig0.setDataSource(dataSource26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setTransactionIsolation("HikariPool-2535");
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setIdleTimeout((long) (short) 1);
        java.util.Properties properties12 = hikariConfig7.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties12);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-726");
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-14967");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long18 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetryDelay(1800000L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2147483647L + "'", long18 == 2147483647L);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        hikariConfig0.setPoolName("HikariPool-2967");
        hikariConfig0.setConnectionTimeout((long) 100);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMinimumPoolSize(10);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(false);
        int int27 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout((long) ' ');
        hikariConfig0.setMinimumPoolSize(52);
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
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
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-2298");
        java.lang.String str21 = hikariConfig0.getConnectionTestQuery();
        int int22 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        int int9 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbcUrl("HikariPool-1744");
        int int12 = hikariConfig0.getTransactionIsolation();
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
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
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-21572");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-21572' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setIdleTimeout((long) (short) 100);
        long long9 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25605");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25605 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getDataSourceClassName();
        javax.sql.DataSource dataSource11 = hikariConfig9.getDataSource();
        hikariConfig9.setLeakDetectionThreshold((long) 97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-1932" + "'", str22, "HikariPool-1932");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        int int6 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
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
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setJdbcUrl("HikariPool-9769");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-1454");
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        java.lang.String str14 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setConnectionTimeout((long) 0);
        hikariConfig10.setAcquireRetries(60);
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig23.setConnectionInitSql("");
        hikariConfig23.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean29 = hikariConfig28.isJdbc4ConnectionTest();
        long long30 = hikariConfig28.getConnectionTimeout();
        hikariConfig28.setJdbcUrl("");
        java.lang.String str33 = hikariConfig28.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig23.setDataSourceProperties(properties34);
        hikariConfig10.setDataSourceProperties(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        boolean boolean39 = hikariConfig0.isInitializationFailFast();
        int int40 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
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
        boolean boolean18 = hikariConfig10.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
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
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean15 = hikariConfig0.isReadOnly();
        int int16 = hikariConfig0.getMinimumPoolSize();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-960" + "'", str14, "HikariPool-960");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setReadOnly(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        long long13 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) long13);
        hikariConfig0.setMaxLifetime(600000L);
        long long17 = hikariConfig0.getConnectionTimeout();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-2459");
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionTestQuery("HikariPool-10357");
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
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
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setPoolName("HikariPool-5707");
        int int21 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetries(3);
        boolean boolean12 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-29872" + "'", str6, "HikariPool-29872");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-4438");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        hikariConfig0.setUseInstrumentation(false);
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5275");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5275 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
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
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        hikariConfig0.setMaxLifetime(750L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setTransactionIsolation("HikariPool-4364");
        int int11 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        long long5 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-11657");
        hikariConfig0.setAcquireIncrement((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAcquireRetries(3);
        hikariConfig0.setJdbcUrl("HikariPool-14260");
        hikariConfig0.setTransactionIsolation("HikariPool-18445");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetries(3);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setConnectionTestQuery("HikariPool-11847");
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5848");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setCatalog("HikariPool-16194");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
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
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.setDataSource(dataSource21);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionInitSql("HikariPool-11782");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-10078");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        int int13 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAutoCommit(true);
        int int16 = hikariConfig0.getMaximumPoolSize();
        long long17 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        int int8 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig7.setAutoCommit(true);
        hikariConfig7.setConnectionTestQuery("HikariPool-137");
        long long17 = hikariConfig7.getIdleTimeout();
        boolean boolean18 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig0.addDataSourceProperty("HikariPool-377", (java.lang.Object) boolean18);
        hikariConfig0.setConnectionInitSql("HikariPool-8474");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
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
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        boolean boolean26 = hikariConfig20.isJdbc4ConnectionTest();
        hikariConfig20.setMaximumPoolSize((int) (byte) 1);
        hikariConfig20.setJdbcUrl("HikariPool-3101");
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties31);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-29926" + "'", str6, "HikariPool-29926");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setConnectionInitSql("HikariPool-1104");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-1104" + "'", str9, "HikariPool-1104");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        long long10 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetryDelay((long) 3);
        java.lang.String str13 = hikariConfig0.getCatalog();
        long long14 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getIdleTimeout();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setIdleTimeout((long) (-1));
        hikariConfig8.setMaxLifetime((-1L));
        java.lang.String str16 = hikariConfig8.getPoolName();
        hikariConfig8.setMaximumPoolSize((int) 'a');
        hikariConfig0.addDataSourceProperty("HikariPool-2708", (java.lang.Object) hikariConfig8);
        hikariConfig8.setConnectionCustomizerClassName("HikariPool-510");
        long long22 = hikariConfig8.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        boolean boolean26 = hikariConfig24.isReadOnly();
        int int27 = hikariConfig24.getAcquireIncrement();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        java.lang.String str30 = hikariConfig24.getCatalog();
        long long31 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.setAutoCommit(true);
        hikariConfig24.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig8.addDataSourceProperty("HikariPool-14967", (java.lang.Object) "HikariPool-1104");
        hikariConfig8.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-29947" + "'", str16, "HikariPool-29947");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 750L + "'", long31 == 750L);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
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
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-29950" + "'", str15, "HikariPool-29950");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-1707");
        hikariConfig0.setDataSourceClassName("HikariPool-9881");
        hikariConfig0.setDataSourceClassName("HikariPool-18974");
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize(60);
        java.lang.String str14 = hikariConfig0.getPoolName();
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long18 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        java.lang.String str24 = hikariConfig20.getDataSourceClassName();
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        boolean boolean26 = hikariConfig20.isRegisterMbeans();
        boolean boolean27 = hikariConfig20.isIsolateInternalQueries();
        java.lang.String str28 = hikariConfig20.getConnectionInitSql();
        boolean boolean29 = hikariConfig20.isAutoCommit();
        boolean boolean30 = hikariConfig20.isReadOnly();
        hikariConfig20.setCatalog("HikariPool-4919");
        java.util.Properties properties33 = hikariConfig20.getDataSourceProperties();
        java.lang.String str34 = hikariConfig20.getPoolName();
        hikariConfig0.addDataSourceProperty("HikariPool-22894", (java.lang.Object) str34);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-29955" + "'", str14, "HikariPool-29955");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-29956" + "'", str34, "HikariPool-29956");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-903");
        int int12 = hikariConfig0.getAcquireRetries();
        java.lang.String str13 = hikariConfig0.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-29958" + "'", str13, "HikariPool-29958");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-2459");
        java.lang.String str16 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getMaxLifetime();
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        hikariConfig17.setAcquireIncrement(100);
        hikariConfig17.setIsolateInternalQueries(false);
        hikariConfig17.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource27 = hikariConfig17.getDataSource();
        hikariConfig17.setMinimumPoolSize((int) ' ');
        hikariConfig17.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean33 = hikariConfig32.isJdbc4ConnectionTest();
        long long34 = hikariConfig32.getConnectionTimeout();
        java.lang.String str35 = hikariConfig32.getJdbcUrl();
        long long36 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig32.setMinimumPoolSize((int) '#');
        java.lang.String str41 = hikariConfig32.getDataSourceClassName();
        javax.sql.DataSource dataSource42 = null;
        hikariConfig32.setDataSource(dataSource42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean45 = hikariConfig44.isInitializationFailFast();
        boolean boolean46 = hikariConfig44.isReadOnly();
        javax.sql.DataSource dataSource47 = hikariConfig44.getDataSource();
        int int48 = hikariConfig44.getMaximumPoolSize();
        boolean boolean49 = hikariConfig44.isInitializationFailFast();
        hikariConfig44.setLeakDetectionThreshold(0L);
        long long52 = hikariConfig44.getMaxLifetime();
        hikariConfig44.setReadOnly(false);
        java.util.Properties properties55 = hikariConfig44.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean63 = hikariConfig62.isJdbc4ConnectionTest();
        long long64 = hikariConfig62.getConnectionTimeout();
        hikariConfig62.setJdbcUrl("");
        java.lang.String str67 = hikariConfig62.getConnectionCustomizerClassName();
        java.util.Properties properties68 = hikariConfig62.getDataSourceProperties();
        hikariConfig59.setDataSourceProperties(properties68);
        java.lang.String str70 = hikariConfig59.getConnectionTestQuery();
        hikariConfig59.setReadOnly(false);
        hikariConfig59.setConnectionTimeout(0L);
        hikariConfig59.setReadOnly(false);
        hikariConfig59.setAcquireIncrement((int) (short) 1);
        long long79 = hikariConfig59.getAcquireRetryDelay();
        hikariConfig59.setLeakDetectionThreshold((long) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean83 = hikariConfig82.isInitializationFailFast();
        boolean boolean84 = hikariConfig82.isReadOnly();
        int int85 = hikariConfig82.getAcquireIncrement();
        hikariConfig82.setConnectionTestQuery("hi!");
        hikariConfig82.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig82.setAutoCommit(true);
        int int92 = hikariConfig82.getAcquireIncrement();
        boolean boolean93 = hikariConfig82.isIsolateInternalQueries();
        java.util.Properties properties94 = hikariConfig82.getDataSourceProperties();
        hikariConfig59.setDataSourceProperties(properties94);
        hikariConfig57.setDataSourceProperties(properties94);
        hikariConfig17.setDataSourceProperties(properties94);
        hikariConfig0.setDataSourceProperties(properties94);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-211" + "'", str16, "HikariPool-211");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 750L + "'", long36 == 750L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1800000L + "'", long52 == 1800000L);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 5000L + "'", long64 == 5000L);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 750L + "'", long79 == 750L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(properties94);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
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
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setPoolName("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setTransactionIsolation("HikariPool-22378");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-1932");
        hikariConfig0.setTransactionIsolation("HikariPool-1863");
        hikariConfig0.setConnectionInitSql("HikariPool-6859");
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getMaxLifetime();
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        hikariConfig17.setAcquireIncrement(100);
        hikariConfig17.setIsolateInternalQueries(false);
        hikariConfig17.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource27 = hikariConfig17.getDataSource();
        hikariConfig17.setMaximumPoolSize(0);
        boolean boolean30 = hikariConfig17.isJdbc4ConnectionTest();
        int int31 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setPoolName("HikariPool-514");
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        hikariConfig17.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str39 = hikariConfig38.getConnectionInitSql();
        long long40 = hikariConfig38.getMaxLifetime();
        java.lang.String str41 = hikariConfig38.getConnectionCustomizerClassName();
        int int42 = hikariConfig38.getMaximumPoolSize();
        int int43 = hikariConfig38.getMaximumPoolSize();
        long long44 = hikariConfig38.getMaxLifetime();
        java.lang.String str45 = hikariConfig38.getConnectionCustomizerClassName();
        int int46 = hikariConfig38.getTransactionIsolation();
        java.util.Properties properties47 = hikariConfig38.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig0.setDataSourceProperties(properties47);
        long long51 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1800000L + "'", long40 == 1800000L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1800000L + "'", long44 == 1800000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setMinimumPoolSize((int) (byte) 10);
        boolean boolean11 = hikariConfig8.isRegisterMbeans();
        int int12 = hikariConfig8.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig8.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15501");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15501 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.setPoolName("");
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        int int16 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setConnectionCustomizerClassName("");
        int int19 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setCatalog("HikariPool-697");
        hikariConfig13.setMaxLifetime((long) (byte) 1);
        hikariConfig13.setCatalog("HikariPool-1229");
        long long28 = hikariConfig13.getLeakDetectionThreshold();
        long long29 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig0.addDataSourceProperty("HikariPool-726", (java.lang.Object) hikariConfig13);
        boolean boolean31 = hikariConfig0.isAutoCommit();
        java.lang.String str32 = hikariConfig0.getPoolName();
        java.lang.String str33 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-29989" + "'", str32, "HikariPool-29989");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setPoolName("HikariPool-9983");
        java.lang.Class<?> wildcardClass14 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setPoolName("HikariPool-25191");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) 100);
        java.lang.String str8 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-30001" + "'", str8, "HikariPool-30001");
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
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
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = hikariConfig16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
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
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement(3);
        int int10 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(52);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setTransactionIsolation("HikariPool-14044");
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setUseInstrumentation(false);
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
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
        java.lang.String str22 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-9921");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-9921' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setReadOnly(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        hikariConfig0.addDataSourceProperty("HikariPool-14140", (java.lang.Object) "HikariPool-14201");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
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
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setTransactionIsolation("HikariPool-137");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3572");
        hikariConfig1.setJdbcUrl("HikariPool-3741");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMinimumPoolSize((int) '4');
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getCatalog();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetries((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-575");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-575' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
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
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean23 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setConnectionInitSql("HikariPool-4948");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
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
        long long13 = hikariConfig9.getConnectionTimeout();
        int int14 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setTransactionIsolation("HikariPool-4969");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setReadOnly(true);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        int int4 = hikariConfig3.getAcquireRetries();
        hikariConfig3.setConnectionInitSql("");
        hikariConfig3.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties9 = hikariConfig3.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig0.setDataSourceProperties(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig13.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
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
        hikariConfig0.validate();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(true);
        int int21 = hikariConfig0.getAcquireRetries();
        int int22 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        java.lang.String str12 = hikariConfig0.getCatalog();
        java.lang.String str13 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        hikariConfig0.setAcquireRetries(35);
        hikariConfig0.setConnectionInitSql("HikariPool-15136");
        int int15 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
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
        hikariConfig0.setCatalog("HikariPool-211");
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
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
        int int20 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-8951");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        long long14 = hikariConfig0.getAcquireRetryDelay();
        long long15 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig0.getAcquireRetries();
        int int11 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int16 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(true);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetryDelay((long) 32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
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
        hikariConfig9.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig9.getPoolName();
        hikariConfig9.setConnectionInitSql("HikariPool-25013");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-30081" + "'", str15, "HikariPool-30081");
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        java.lang.String str10 = hikariConfig0.getCatalog();
        int int11 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
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
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21192");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21192 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("HikariPool-14155");
        hikariConfig0.validate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetryDelay(100L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30100" + "'", str7, "HikariPool-30100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
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
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean15 = hikariConfig0.isReadOnly();
        int int16 = hikariConfig0.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-29249");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-29249' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-960" + "'", str14, "HikariPool-960");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
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
        hikariConfig0.setConnectionTimeout(2147483647L);
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        long long19 = hikariConfig0.getMaxLifetime();
        boolean boolean20 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setConnectionInitSql("HikariPool-250");
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
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
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-1361");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        long long4 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setCatalog("HikariPool-28027");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
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
        hikariConfig0.setMinimumPoolSize(52);
        boolean boolean30 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
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
        hikariConfig0.setMaxLifetime((long) (short) 100);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str20 = hikariConfig0.getCatalog();
        java.lang.String str21 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionInitSql("HikariPool-18701");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
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
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        long long8 = hikariConfig0.getMaxLifetime();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.validate();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-3048");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-19697");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isReadOnly();
        int int11 = hikariConfig8.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        java.lang.String str14 = hikariConfig8.getCatalog();
        long long15 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.setConnectionInitSql("hi!");
        int int18 = hikariConfig8.getAcquireIncrement();
        int int19 = hikariConfig8.getAcquireIncrement();
        hikariConfig8.setMinimumPoolSize(3);
        java.util.Properties properties22 = hikariConfig8.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        java.lang.String str24 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-11288");
        java.lang.String str27 = hikariConfig0.getJdbcUrl();
        long long28 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-11288" + "'", str27, "HikariPool-11288");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setConnectionCustomizerClassName("");
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setConnectionTestQuery("");
        long long17 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setUseInstrumentation(false);
        long long20 = hikariConfig9.getLeakDetectionThreshold();
        java.lang.String str21 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setConnectionInitSql("HikariPool-564");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        long long26 = hikariConfig24.getMaxLifetime();
        java.lang.String str27 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setIdleTimeout((long) (-1));
        java.lang.String str30 = hikariConfig24.getConnectionTestQuery();
        int int31 = hikariConfig24.getMaximumPoolSize();
        hikariConfig24.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties34);
        hikariConfig0.addDataSourceProperty("HikariPool-1733", (java.lang.Object) properties34);
        boolean boolean37 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-1805");
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-2970");
        hikariConfig0.setMaxLifetime((long) (short) 0);
        int int14 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
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
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        boolean boolean26 = hikariConfig20.isJdbc4ConnectionTest();
        hikariConfig20.setMaximumPoolSize((int) (byte) 1);
        hikariConfig20.setJdbcUrl("HikariPool-3101");
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig33.setDataSource(dataSource34);
        long long36 = hikariConfig33.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize(0);
        int int6 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2845");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.validate();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
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
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setDataSourceClassName("HikariPool-2847");
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setConnectionTimeout(1800000L);
        int int10 = hikariConfig0.getAcquireIncrement();
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setReadOnly(true);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        int int4 = hikariConfig3.getAcquireRetries();
        hikariConfig3.setConnectionInitSql("");
        hikariConfig3.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties9 = hikariConfig3.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig0.setDataSourceProperties(properties9);
        hikariConfig0.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15757");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15757 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str8 = hikariConfig0.getPoolName();
        hikariConfig0.setPoolName("");
        hikariConfig0.setConnectionTestQuery("HikariPool-5441");
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        hikariConfig0.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-30196" + "'", str8, "HikariPool-30196");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAutoCommit(true);
        long long11 = hikariConfig0.getIdleTimeout();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(false);
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        long long16 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-8690");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8690' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        int int8 = hikariConfig0.getTransactionIsolation();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig0.setMaxLifetime((long) 60);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(true);
        long long13 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        boolean boolean18 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setMaxLifetime((long) (byte) 100);
        hikariConfig15.setReadOnly(false);
        hikariConfig15.setConnectionTestQuery("HikariPool-2812");
        hikariConfig0.addDataSourceProperty("HikariPool-2463", (java.lang.Object) hikariConfig15);
        boolean boolean26 = hikariConfig0.isAutoCommit();
        long long27 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setTransactionIsolation("");
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(false);
        long long13 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
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
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isJdbc4ConnectionTest();
        long long31 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setJdbcUrl("");
        java.lang.String str34 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties35);
        java.lang.String str37 = hikariConfig26.getConnectionTestQuery();
        hikariConfig26.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        boolean boolean43 = hikariConfig41.isReadOnly();
        int int44 = hikariConfig41.getAcquireIncrement();
        javax.sql.DataSource dataSource45 = null;
        hikariConfig41.setDataSource(dataSource45);
        hikariConfig41.setMaxLifetime((long) 1);
        java.lang.String str49 = hikariConfig41.getJdbcUrl();
        hikariConfig41.setJdbc4ConnectionTest(false);
        int int52 = hikariConfig41.getMaximumPoolSize();
        hikariConfig41.setIdleTimeout(0L);
        hikariConfig41.setConnectionInitSql("HikariPool-1601");
        java.lang.String str57 = hikariConfig41.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean59 = hikariConfig58.isInitializationFailFast();
        boolean boolean60 = hikariConfig58.isReadOnly();
        int int61 = hikariConfig58.getAcquireIncrement();
        javax.sql.DataSource dataSource62 = null;
        hikariConfig58.setDataSource(dataSource62);
        hikariConfig58.setConnectionInitSql("");
        boolean boolean66 = hikariConfig58.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean69 = hikariConfig68.isInitializationFailFast();
        boolean boolean70 = hikariConfig68.isReadOnly();
        int int71 = hikariConfig68.getAcquireIncrement();
        javax.sql.DataSource dataSource72 = null;
        hikariConfig68.setDataSource(dataSource72);
        boolean boolean74 = hikariConfig68.isIsolateInternalQueries();
        hikariConfig68.setAcquireIncrement((int) (byte) 1);
        java.lang.Class<?> wildcardClass77 = hikariConfig68.getClass();
        hikariConfig58.addDataSourceProperty("", (java.lang.Object) hikariConfig68);
        java.util.Properties properties79 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig80.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean84 = hikariConfig83.isJdbc4ConnectionTest();
        long long85 = hikariConfig83.getConnectionTimeout();
        hikariConfig83.setJdbcUrl("");
        java.lang.String str88 = hikariConfig83.getConnectionCustomizerClassName();
        java.util.Properties properties89 = hikariConfig83.getDataSourceProperties();
        hikariConfig80.setDataSourceProperties(properties89);
        hikariConfig58.setDataSourceProperties(properties89);
        hikariConfig41.setDataSourceProperties(properties89);
        java.lang.String str93 = hikariConfig41.getConnectionInitSql();
        hikariConfig26.addDataSourceProperty("HikariPool-3728", (java.lang.Object) hikariConfig41);
        hikariConfig26.setJdbcUrl("HikariPool-5980");
        hikariConfig1.addDataSourceProperty("HikariPool-15000", (java.lang.Object) hikariConfig26);
        boolean boolean98 = hikariConfig26.isIsolateInternalQueries();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 5000L + "'", long85 == 5000L);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(properties89);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "HikariPool-1601" + "'", str93, "HikariPool-1601");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-250");
        long long10 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
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
        int int17 = hikariConfig0.getTransactionIsolation();
        long long18 = hikariConfig0.getIdleTimeout();
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        long long21 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("");
        javax.sql.DataSource dataSource24 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.addDataSourceProperty("HikariPool-564", (java.lang.Object) hikariConfig19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        hikariConfig22.setMaxLifetime((long) '4');
        hikariConfig0.addDataSourceProperty("HikariPool-1059", (java.lang.Object) hikariConfig22);
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        java.util.Properties properties29 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 97);
        hikariConfig0.setAcquireRetryDelay(10L);
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setDataSourceClassName("HikariPool-11093");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        boolean boolean9 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.setDataSource(dataSource13);
        hikariConfig11.setInitializationFailFast(false);
        hikariConfig11.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        int int27 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setTransactionIsolation("HikariPool-697");
        hikariConfig11.addDataSourceProperty("HikariPool-960", (java.lang.Object) "HikariPool-697");
        int int31 = hikariConfig11.getAcquireRetries();
        boolean boolean32 = hikariConfig11.isReadOnly();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        java.lang.String str34 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        java.lang.String str11 = hikariConfig0.getPoolName();
        int int12 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-30235" + "'", str11, "HikariPool-30235");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setPoolName("HikariPool-15939");
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        int int5 = hikariConfig1.getMinimumPoolSize();
        int int6 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isJdbc4ConnectionTest();
        long long14 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setJdbcUrl("");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig0.setDataSourceProperties(properties18);
        hikariConfig0.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbcUrl("HikariPool-1042");
        hikariConfig0.setMaximumPoolSize((int) '#');
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-7991");
        long long16 = hikariConfig0.getConnectionTimeout();
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        hikariConfig0.setTransactionIsolation("HikariPool-1063");
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getCatalog();
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(false);
        int int13 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
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
        hikariConfig9.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        int int15 = hikariConfig14.getAcquireRetries();
        hikariConfig14.setConnectionInitSql("");
        boolean boolean18 = hikariConfig14.isReadOnly();
        hikariConfig14.setRegisterMbeans(false);
        int int21 = hikariConfig14.getAcquireRetries();
        long long22 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig9.addDataSourceProperty("", (java.lang.Object) hikariConfig14);
        hikariConfig14.setUseInstrumentation(true);
        int int26 = hikariConfig14.getMinimumPoolSize();
        java.util.Properties properties27 = hikariConfig14.getDataSourceProperties();
        hikariConfig14.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout(10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setLeakDetectionThreshold(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.setReadOnly(false);
        hikariConfig14.setDataSourceClassName("");
        hikariConfig14.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.setDataSource(dataSource22);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig14.setDataSource(dataSource24);
        java.util.Properties properties26 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig9.setDataSourceProperties(properties26);
        hikariConfig9.setCatalog("HikariPool-5562");
        boolean boolean31 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setPoolName("HikariPool-11600");
        hikariConfig9.setLeakDetectionThreshold(52L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig19.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        long long8 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 10);
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
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
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-2970");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setDataSourceClassName("HikariPool-5876");
        hikariConfig0.setIdleTimeout(100L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
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
        hikariConfig0.setMaximumPoolSize(60);
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("HikariPool-6665");
        int int18 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setCatalog("HikariPool-1361");
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean3 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize(0);
        int int6 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setPoolName("HikariPool-1932");
        hikariConfig0.setDataSourceClassName("HikariPool-16124");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str6 = hikariConfig5.getConnectionInitSql();
        int int7 = hikariConfig5.getMinimumPoolSize();
        boolean boolean8 = hikariConfig5.isIsolateInternalQueries();
        hikariConfig5.setIdleTimeout((long) (short) 10);
        java.lang.String str11 = hikariConfig5.getPoolName();
        hikariConfig5.setAcquireRetryDelay(10L);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) 10L);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay((long) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-30318" + "'", str11, "HikariPool-30318");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setReadOnly(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        long long13 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) long13);
        hikariConfig0.setMaxLifetime(600000L);
        long long17 = hikariConfig0.getConnectionTimeout();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        java.lang.String str21 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-18926");
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetryDelay((long) 3);
        hikariConfig0.setTransactionIsolation("HikariPool-11159");
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
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
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        int int18 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireIncrement(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
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
        int int28 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-15863");
        long long31 = hikariConfig0.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18229");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18229 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str9 = hikariConfig0.getPoolName();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setDataSourceClassName("HikariPool-5734");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setAcquireRetryDelay((long) 60);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-30342" + "'", str9, "HikariPool-30342");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.lang.String str11 = hikariConfig0.getPoolName();
        boolean boolean12 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30345" + "'", str7, "HikariPool-30345");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-30345" + "'", str11, "HikariPool-30345");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
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
        long long24 = hikariConfig1.getIdleTimeout();
        long long25 = hikariConfig1.getMaxLifetime();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
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
        hikariConfig0.validate();
        hikariConfig0.setMaxLifetime((long) '#');
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setAcquireRetries((int) '4');
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties30);
        int int32 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties33 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
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
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-30355" + "'", str15, "HikariPool-30355");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(0L);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setPoolName("HikariPool-3955");
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
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
        hikariConfig0.setDataSourceClassName("HikariPool-8951");
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-11159");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setMaxLifetime(5000L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize(3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setInitializationFailFast(true);
        long long11 = hikariConfig0.getConnectionTimeout();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        hikariConfig0.setAcquireIncrement((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        long long9 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-25650");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean11 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setConnectionCustomizerClassName("");
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setConnectionTestQuery("");
        long long17 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setUseInstrumentation(false);
        long long20 = hikariConfig9.getLeakDetectionThreshold();
        java.lang.String str21 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setConnectionInitSql("HikariPool-564");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        long long26 = hikariConfig24.getMaxLifetime();
        java.lang.String str27 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setIdleTimeout((long) (-1));
        java.lang.String str30 = hikariConfig24.getConnectionTestQuery();
        int int31 = hikariConfig24.getMaximumPoolSize();
        hikariConfig24.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties34);
        hikariConfig0.addDataSourceProperty("HikariPool-1733", (java.lang.Object) properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.lang.String str38 = hikariConfig37.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2845");
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-12294");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-12294' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean6 = hikariConfig0.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        int int10 = hikariConfig0.getAcquireRetries();
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
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
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setConnectionTestQuery("HikariPool-6918");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
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
        java.lang.String str17 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.setRegisterMbeans(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig11.setDataSource(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setDataSourceClassName("HikariPool-2711");
        hikariConfig0.setMaxLifetime(600000L);
        hikariConfig0.setDataSourceClassName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
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
        long long16 = hikariConfig9.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setDataSourceClassName("HikariPool-6767");
        java.lang.String str16 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-30410" + "'", str16, "HikariPool-30410");
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-602");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        long long12 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setJdbcUrl("");
        java.lang.String str15 = hikariConfig10.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isJdbc4ConnectionTest();
        long long18 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setJdbcUrl("");
        java.lang.String str21 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig10.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig0.setDataSourceProperties(properties22);
        int int28 = hikariConfig0.getAcquireIncrement();
        long long29 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIdleTimeout(750L);
        hikariConfig0.setMaximumPoolSize(97);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
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
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
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
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setRegisterMbeans(true);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str18 = hikariConfig1.getJdbcUrl();
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setConnectionInitSql("HikariPool-12944");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        hikariConfig0.setJdbcUrl("HikariPool-7751");
        hikariConfig0.setMaximumPoolSize(100);
        long long16 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-19318");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-19318' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime(32L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-22406");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-22406 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30438" + "'", str7, "HikariPool-30438");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
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
        hikariConfig7.setJdbcUrl("HikariPool-7881");
        hikariConfig7.setAcquireRetries((int) '#');
        long long22 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setAcquireRetries(0);
        long long25 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig7.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
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
        hikariConfig1.setLeakDetectionThreshold((long) 35);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        int int9 = hikariConfig0.getAcquireIncrement();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setCatalog("");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAutoCommit(false);
        long long17 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setReadOnly(false);
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-30456" + "'", str9, "HikariPool-30456");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-18595");
        hikariConfig0.setAcquireIncrement((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean12 = hikariConfig0.isAutoCommit();
        long long13 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        int int5 = hikariConfig0.getAcquireRetries();
        int int6 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
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
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        long long17 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2845");
        hikariConfig0.setAcquireRetries((int) (short) 1);
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
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
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
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
        hikariConfig0.setTransactionIsolation("HikariPool-2580");
        hikariConfig0.setConnectionTestQuery("HikariPool-3519");
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        long long18 = hikariConfig0.getIdleTimeout();
        int int19 = hikariConfig0.getTransactionIsolation();
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        java.lang.String str25 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str30 = hikariConfig29.getCatalog();
        boolean boolean31 = hikariConfig29.isInitializationFailFast();
        int int32 = hikariConfig29.getMaximumPoolSize();
        hikariConfig29.setPoolName("HikariPool-1042");
        hikariConfig29.setIdleTimeout((long) 52);
        hikariConfig29.setAcquireRetryDelay(100L);
        java.util.Properties properties39 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        java.lang.Class<?> wildcardClass42 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isInitializationFailFast();
        boolean boolean6 = hikariConfig4.isReadOnly();
        int int7 = hikariConfig4.getAcquireIncrement();
        java.lang.String str8 = hikariConfig4.getDataSourceClassName();
        java.lang.Class<?> wildcardClass9 = hikariConfig4.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-6519", (java.lang.Object) hikariConfig4);
        boolean boolean11 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        long long9 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        long long8 = hikariConfig0.getMaxLifetime();
        boolean boolean9 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
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
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
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
        java.lang.String str15 = hikariConfig13.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-30513" + "'", str15, "HikariPool-30513");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime((long) ' ');
        hikariConfig0.setMaximumPoolSize(35);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        long long18 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getMaxLifetime();
        boolean boolean23 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setReadOnly(true);
        boolean boolean26 = hikariConfig20.isAutoCommit();
        hikariConfig20.setLeakDetectionThreshold((long) '4');
        hikariConfig20.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isJdbc4ConnectionTest();
        long long33 = hikariConfig31.getConnectionTimeout();
        hikariConfig31.setJdbcUrl("");
        java.lang.String str36 = hikariConfig31.getConnectionCustomizerClassName();
        java.util.Properties properties37 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig20.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        int int41 = hikariConfig40.getAcquireIncrement();
        hikariConfig40.setAcquireRetryDelay((long) 3);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean46 = hikariConfig45.isJdbc4ConnectionTest();
        hikariConfig45.setReadOnly(false);
        hikariConfig45.setDataSourceClassName("");
        hikariConfig45.setCatalog("");
        hikariConfig45.setConnectionTimeout(0L);
        hikariConfig40.addDataSourceProperty("HikariPool-903", (java.lang.Object) hikariConfig45);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean57 = hikariConfig56.isInitializationFailFast();
        boolean boolean58 = hikariConfig56.isReadOnly();
        int int59 = hikariConfig56.getAcquireIncrement();
        hikariConfig56.setConnectionCustomizerClassName("");
        boolean boolean62 = hikariConfig56.isReadOnly();
        long long63 = hikariConfig56.getMaxLifetime();
        long long64 = hikariConfig56.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean66 = hikariConfig65.isJdbc4ConnectionTest();
        long long67 = hikariConfig65.getConnectionTimeout();
        hikariConfig65.setJdbcUrl("");
        java.lang.String str70 = hikariConfig65.getConnectionCustomizerClassName();
        java.util.Properties properties71 = hikariConfig65.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig56.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig40.setDataSourceProperties(properties71);
        hikariConfig7.setDataSourceProperties(properties71);
        boolean boolean80 = hikariConfig7.isRegisterMbeans();
        hikariConfig7.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1800000L + "'", long63 == 1800000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1800000L + "'", long64 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 5000L + "'", long67 == 5000L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
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
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
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
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setJdbcUrl("HikariPool-1361");
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        int int20 = hikariConfig19.getAcquireRetries();
        hikariConfig19.setConnectionInitSql("");
        hikariConfig19.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig19.setAutoCommit(true);
        hikariConfig19.setConnectionTestQuery("HikariPool-137");
        long long29 = hikariConfig19.getIdleTimeout();
        int int30 = hikariConfig19.getAcquireRetries();
        hikariConfig0.addDataSourceProperty("HikariPool-30483", (java.lang.Object) int30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 600000L + "'", long29 == 600000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str15 = hikariConfig14.getConnectionInitSql();
        int int16 = hikariConfig14.getMinimumPoolSize();
        int int17 = hikariConfig14.getMinimumPoolSize();
        hikariConfig12.addDataSourceProperty("HikariPool-1969", (java.lang.Object) int17);
        hikariConfig12.setJdbcUrl("HikariPool-1104");
        hikariConfig12.setJdbcUrl("HikariPool-7401");
        hikariConfig12.setMaxLifetime(1L);
        long long25 = hikariConfig12.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
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
        hikariConfig9.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig9.addDataSourceProperty("HikariPool-510", (java.lang.Object) "HikariPool-1042");
        hikariConfig9.setUseInstrumentation(false);
        boolean boolean19 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setJdbcUrl("HikariPool-14957");
        hikariConfig9.setIsolateInternalQueries(true);
        java.util.Properties properties24 = hikariConfig9.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig7.getJdbcUrl();
        java.lang.Class<?> wildcardClass10 = hikariConfig7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setMaxLifetime(600000L);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
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
        hikariConfig0.setAcquireRetries((int) (short) 0);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
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
        hikariConfig0.setAutoCommit(false);
        int int23 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-1059");
        int int8 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
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
        hikariConfig9.setCatalog("HikariPool-13448");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setTransactionIsolation("HikariPool-1361");
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        int int4 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
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
        hikariConfig0.setPoolName("HikariPool-8274");
        int int15 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAcquireRetries((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        long long9 = hikariConfig0.getIdleTimeout();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-13483");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-13483' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout(600000L);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setMaxLifetime(52L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setTransactionIsolation("HikariPool-4021");
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isAutoCommit();
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbcUrl("HikariPool-6576");
        hikariConfig0.setPoolName("HikariPool-8021");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
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
        java.lang.Class<?> wildcardClass13 = hikariConfig7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-452");
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean7 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
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
        int int13 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-24445");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-24445' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        hikariConfig11.setDataSourceClassName("");
        int int16 = hikariConfig11.getMaximumPoolSize();
        java.lang.String str17 = hikariConfig11.getPoolName();
        int int18 = hikariConfig11.getMaximumPoolSize();
        hikariConfig11.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.addDataSourceProperty("HikariPool-452", (java.lang.Object) hikariConfig11);
        hikariConfig11.setConnectionTestQuery("HikariPool-17559");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-30647" + "'", str17, "HikariPool-30647");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setCatalog("HikariPool-510");
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-211" + "'", str13, "HikariPool-211");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMinimumPoolSize();
        hikariConfig7.setConnectionTestQuery("HikariPool-28782");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        hikariConfig0.setPoolName("HikariPool-3562");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-30663" + "'", str6, "HikariPool-30663");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
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
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout((long) (short) -1);
        hikariConfig0.setMaximumPoolSize(97);
        boolean boolean22 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setTransactionIsolation("HikariPool-11875");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setMaxLifetime((long) ' ');
        int int13 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-23676");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-23676' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setCatalog("HikariPool-1059");
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setAcquireRetryDelay(1L);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        long long27 = hikariConfig25.getMaxLifetime();
        java.lang.String str28 = hikariConfig25.getDataSourceClassName();
        hikariConfig25.setIdleTimeout((long) (-1));
        java.lang.String str31 = hikariConfig25.getConnectionTestQuery();
        int int32 = hikariConfig25.getMaximumPoolSize();
        hikariConfig25.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties35 = hikariConfig25.getDataSourceProperties();
        hikariConfig25.setPoolName("HikariPool-447");
        hikariConfig25.setCatalog("HikariPool-1458");
        hikariConfig25.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        boolean boolean45 = hikariConfig43.isReadOnly();
        int int46 = hikariConfig43.getAcquireIncrement();
        hikariConfig43.setConnectionCustomizerClassName("");
        hikariConfig43.setUseInstrumentation(true);
        java.lang.String str51 = hikariConfig43.getJdbcUrl();
        long long52 = hikariConfig43.getConnectionTimeout();
        java.util.Properties properties53 = hikariConfig43.getDataSourceProperties();
        hikariConfig25.addDataSourceProperty("HikariPool-2037", (java.lang.Object) hikariConfig43);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig25);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 5000L + "'", long52 == 5000L);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-8360");
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        long long16 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        long long11 = hikariConfig0.getMaxLifetime();
        int int12 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
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
        hikariConfig9.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig9.addDataSourceProperty("HikariPool-510", (java.lang.Object) "HikariPool-1042");
        hikariConfig9.setJdbcUrl("HikariPool-2848");
        int int19 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setPoolName("HikariPool-7932");
        java.lang.String str22 = hikariConfig9.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-30696" + "'", str12, "HikariPool-30696");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
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
        boolean boolean16 = hikariConfig0.isAutoCommit();
        java.lang.String str17 = hikariConfig0.getPoolName();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-30697" + "'", str17, "HikariPool-30697");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-18824");
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-30711" + "'", str10, "HikariPool-30711");
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-3491");
        boolean boolean9 = hikariConfig0.isAutoCommit();
        long long10 = hikariConfig0.getConnectionTimeout();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-19435", obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getMaxLifetime();
        boolean boolean14 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setReadOnly(true);
        boolean boolean17 = hikariConfig11.isAutoCommit();
        hikariConfig11.setLeakDetectionThreshold(1L);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig11.setDataSource(dataSource20);
        hikariConfig11.setConnectionCustomizerClassName("HikariPool-137");
        boolean boolean24 = hikariConfig11.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        boolean boolean27 = hikariConfig25.isReadOnly();
        int int28 = hikariConfig25.getAcquireIncrement();
        hikariConfig25.setConnectionTestQuery("hi!");
        hikariConfig25.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig25.setAutoCommit(true);
        java.util.Properties properties35 = hikariConfig25.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties35);
        java.lang.String str37 = hikariConfig11.getCatalog();
        hikariConfig11.setCatalog("HikariPool-2322");
        boolean boolean40 = hikariConfig11.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-3806", (java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26507");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26507 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
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
        hikariConfig9.setAcquireRetryDelay((long) (byte) 1);
        boolean boolean14 = hikariConfig9.isReadOnly();
        boolean boolean15 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig9.setMinimumPoolSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
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
        hikariConfig0.setAcquireIncrement(52);
        hikariConfig0.setPoolName("HikariPool-1458");
        hikariConfig0.setIdleTimeout((long) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setIdleTimeout(1800000L);
        hikariConfig0.setUseInstrumentation(true);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        int int15 = hikariConfig13.getMinimumPoolSize();
        hikariConfig13.setTransactionIsolation("");
        hikariConfig13.setIdleTimeout((long) (short) 100);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig13.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig13.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-7833", (java.lang.Object) hikariConfig13);
        long long24 = hikariConfig13.getConnectionTimeout();
        java.lang.String str25 = hikariConfig13.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-30729" + "'", str25, "HikariPool-30729");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-1949");
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        int int17 = hikariConfig15.getMinimumPoolSize();
        int int18 = hikariConfig15.getMinimumPoolSize();
        hikariConfig15.setMaxLifetime((long) 1);
        long long21 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.setJdbcUrl("HikariPool-801");
        hikariConfig0.addDataSourceProperty("HikariPool-8274", (java.lang.Object) hikariConfig15);
        int int25 = hikariConfig0.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-29645");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-29645' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
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
        hikariConfig1.setDataSourceClassName("");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-4190");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-30752" + "'", str7, "HikariPool-30752");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
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
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbcUrl("HikariPool-1458");
        boolean boolean18 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-2322");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
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
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig47.setMaximumPoolSize(60);
        hikariConfig47.setConnectionCustomizerClassName("HikariPool-10234");
        boolean boolean52 = hikariConfig47.isAutoCommit();
        hikariConfig47.setLeakDetectionThreshold(1L);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long8 = hikariConfig0.getIdleTimeout();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        long long10 = hikariConfig0.getIdleTimeout();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3150");
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireIncrement();
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-510" + "'", str6, "HikariPool-510");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1932");
        boolean boolean10 = hikariConfig0.isReadOnly();
        long long11 = hikariConfig0.getIdleTimeout();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIsolateInternalQueries(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isInitializationFailFast();
        boolean boolean6 = hikariConfig4.isReadOnly();
        int int7 = hikariConfig4.getAcquireIncrement();
        java.lang.String str8 = hikariConfig4.getDataSourceClassName();
        java.lang.Class<?> wildcardClass9 = hikariConfig4.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-6519", (java.lang.Object) hikariConfig4);
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetryDelay(5000L);
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        long long17 = hikariConfig0.getIdleTimeout();
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        int int19 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-30796" + "'", str12, "HikariPool-30796");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        boolean boolean9 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig11.setDataSource(dataSource13);
        hikariConfig11.setInitializationFailFast(false);
        hikariConfig11.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        int int27 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setTransactionIsolation("HikariPool-697");
        hikariConfig11.addDataSourceProperty("HikariPool-960", (java.lang.Object) "HikariPool-697");
        int int31 = hikariConfig11.getAcquireRetries();
        boolean boolean32 = hikariConfig11.isReadOnly();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        java.lang.String str34 = hikariConfig0.getPoolName();
        long long35 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-30797" + "'", str34, "HikariPool-30797");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 600000L + "'", long35 == 600000L);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-6653");
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setDataSourceClassName("HikariPool-10871");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
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
        hikariConfig0.setCatalog("HikariPool-211");
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(false);
        long long15 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        int int12 = hikariConfig0.getTransactionIsolation();
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1605");
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-2746");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
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
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(3L);
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
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
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
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        int int16 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-30854" + "'", str11, "HikariPool-30854");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        int int19 = hikariConfig15.getAcquireIncrement();
        hikariConfig15.setRegisterMbeans(true);
        hikariConfig15.setCatalog("HikariPool-575");
        java.lang.String str24 = hikariConfig15.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        boolean boolean29 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.setAutoCommit(false);
        javax.sql.DataSource dataSource32 = hikariConfig25.getDataSource();
        java.util.Properties properties33 = hikariConfig25.getDataSourceProperties();
        hikariConfig15.setDataSourceProperties(properties33);
        hikariConfig15.setDataSourceClassName("");
        java.util.Properties properties37 = hikariConfig15.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties37);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
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
        hikariConfig0.setAcquireRetries((int) (short) 0);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setReadOnly(false);
        hikariConfig16.setJdbcUrl("");
        long long21 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig16.setRegisterMbeans(false);
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties26);
        int int28 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-29095");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-29095 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
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
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireIncrement(3);
        int int21 = hikariConfig0.getAcquireIncrement();
        int int22 = hikariConfig0.getMaximumPoolSize();
        long long23 = hikariConfig0.getIdleTimeout();
        long long24 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.setTransactionIsolation("HikariPool-1230");
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout(0L);
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setConnectionCustomizerClassName("");
        long long27 = hikariConfig23.getConnectionTimeout();
        java.lang.String str28 = hikariConfig23.getConnectionTestQuery();
        hikariConfig23.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str31 = hikariConfig23.getCatalog();
        long long32 = hikariConfig23.getAcquireRetryDelay();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig23.setDataSource(dataSource33);
        boolean boolean35 = hikariConfig23.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-30355", (java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 750L + "'", long32 == 750L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTimeout((long) (byte) 0);
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setRegisterMbeans(true);
        int int11 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
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
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean14 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize(3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9184");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9184 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setCatalog("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-6211");
        int int14 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-11607");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
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
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getCatalog();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setRegisterMbeans(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement(97);
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-30892" + "'", str9, "HikariPool-30892");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str6 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-30897" + "'", str6, "HikariPool-30897");
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str19 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setConnectionInitSql("");
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig10.isAutoCommit();
        hikariConfig8.addDataSourceProperty("hi!", (java.lang.Object) boolean16);
        long long18 = hikariConfig8.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource19 = hikariConfig8.getDataSource();
        int int20 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-5082");
        long long12 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-2459");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setInitializationFailFast(true);
        long long20 = hikariConfig0.getMaxLifetime();
        long long21 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
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
        int int21 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setAcquireRetryDelay((long) 3);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.setReadOnly(false);
        hikariConfig25.setDataSourceClassName("");
        hikariConfig25.setCatalog("");
        hikariConfig25.setConnectionTimeout(0L);
        hikariConfig20.addDataSourceProperty("HikariPool-903", (java.lang.Object) hikariConfig25);
        javax.sql.DataSource dataSource36 = hikariConfig25.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig25.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource36);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(false);
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.setMaxLifetime((long) ' ');
        int int24 = hikariConfig13.getMaximumPoolSize();
        long long25 = hikariConfig13.getAcquireRetryDelay();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig13.setDataSource(dataSource26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        boolean boolean30 = hikariConfig28.isReadOnly();
        int int31 = hikariConfig28.getAcquireIncrement();
        java.lang.String str32 = hikariConfig28.getDataSourceClassName();
        hikariConfig28.setConnectionTimeout((long) 0);
        hikariConfig28.setAcquireRetries(60);
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig41.setConnectionInitSql("");
        hikariConfig41.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean47 = hikariConfig46.isJdbc4ConnectionTest();
        long long48 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setJdbcUrl("");
        java.lang.String str51 = hikariConfig46.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig46.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig41.setDataSourceProperties(properties52);
        hikariConfig28.setDataSourceProperties(properties52);
        hikariConfig13.setDataSourceProperties(properties52);
        hikariConfig0.addDataSourceProperty("HikariPool-1707", (java.lang.Object) hikariConfig13);
        java.lang.String str58 = hikariConfig0.getConnectionTestQuery();
        long long59 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 5000L + "'", long48 == 5000L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1800000L + "'", long59 == 1800000L);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getMaximumPoolSize();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        boolean boolean13 = hikariConfig11.isReadOnly();
        int int14 = hikariConfig11.getAcquireIncrement();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setConnectionInitSql("");
        boolean boolean19 = hikariConfig11.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        java.lang.String str25 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig11.setDataSourceProperties(properties26);
        hikariConfig0.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig31.setAutoCommit(true);
        java.lang.Class<?> wildcardClass34 = hikariConfig31.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
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
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMinimumPoolSize((int) (short) 10);
        int int23 = hikariConfig0.getMinimumPoolSize();
        int int24 = hikariConfig0.getMaximumPoolSize();
        int int25 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        long long12 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setJdbcUrl("");
        java.lang.String str15 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        long long8 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        int int5 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-602");
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        int int11 = hikariConfig0.getAcquireIncrement();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
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
        hikariConfig0.setPoolName("HikariPool-211");
        int int16 = hikariConfig0.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        boolean boolean19 = hikariConfig17.isReadOnly();
        int int20 = hikariConfig17.getAcquireIncrement();
        hikariConfig17.setConnectionTestQuery("hi!");
        hikariConfig17.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig17.setAutoCommit(true);
        int int27 = hikariConfig17.getAcquireIncrement();
        java.util.Properties properties28 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties28);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
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
        java.lang.String str18 = hikariConfig1.getCatalog();
        int int19 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-1143");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-12115");
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
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
        hikariConfig1.setConnectionInitSql("HikariPool-1042");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
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
        int int17 = hikariConfig0.getTransactionIsolation();
        long long18 = hikariConfig0.getIdleTimeout();
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireRetries((int) (short) 10);
        java.lang.String str22 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-377" + "'", str22, "HikariPool-377");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-697");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetries((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbcUrl("HikariPool-12926");
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
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
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean20 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(true);
        long long23 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(false);
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.setMaxLifetime((long) ' ');
        int int24 = hikariConfig13.getMaximumPoolSize();
        long long25 = hikariConfig13.getAcquireRetryDelay();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig13.setDataSource(dataSource26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        boolean boolean30 = hikariConfig28.isReadOnly();
        int int31 = hikariConfig28.getAcquireIncrement();
        java.lang.String str32 = hikariConfig28.getDataSourceClassName();
        hikariConfig28.setConnectionTimeout((long) 0);
        hikariConfig28.setAcquireRetries(60);
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig41.setConnectionInitSql("");
        hikariConfig41.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean47 = hikariConfig46.isJdbc4ConnectionTest();
        long long48 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setJdbcUrl("");
        java.lang.String str51 = hikariConfig46.getConnectionCustomizerClassName();
        java.util.Properties properties52 = hikariConfig46.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig41.setDataSourceProperties(properties52);
        hikariConfig28.setDataSourceProperties(properties52);
        hikariConfig13.setDataSourceProperties(properties52);
        hikariConfig0.addDataSourceProperty("HikariPool-1707", (java.lang.Object) hikariConfig13);
        java.lang.String str58 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("HikariPool-5082");
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        boolean boolean63 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 5000L + "'", long48 == 5000L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
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
        hikariConfig0.setLeakDetectionThreshold(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        int int21 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionCustomizerClassName("");
        hikariConfig18.setUseInstrumentation(true);
        java.lang.String str26 = hikariConfig18.getJdbcUrl();
        long long27 = hikariConfig18.getConnectionTimeout();
        java.util.Properties properties28 = hikariConfig18.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-2037", (java.lang.Object) hikariConfig18);
        java.lang.String str30 = hikariConfig18.getConnectionInitSql();
        hikariConfig18.setTransactionIsolation("HikariPool-11288");
        int int33 = hikariConfig18.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(true);
        int int8 = hikariConfig0.getMinimumPoolSize();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setReadOnly(false);
        int int10 = hikariConfig7.getAcquireRetries();
        boolean boolean11 = hikariConfig7.isAutoCommit();
        java.lang.String str12 = hikariConfig7.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long5 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean15 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-31031" + "'", str7, "HikariPool-31031");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5463");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        java.lang.Class<?> wildcardClass15 = properties14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setRegisterMbeans(true);
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-137" + "'", str12, "HikariPool-137");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2845");
        hikariConfig0.setAcquireRetries((int) (short) 1);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setAutoCommit(true);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        int int14 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-6473");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str15 = hikariConfig14.getConnectionInitSql();
        int int16 = hikariConfig14.getMinimumPoolSize();
        int int17 = hikariConfig14.getMinimumPoolSize();
        hikariConfig12.addDataSourceProperty("HikariPool-1969", (java.lang.Object) int17);
        long long19 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.setUseInstrumentation(false);
        java.lang.String str22 = hikariConfig12.getConnectionCustomizerClassName();
        int int23 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
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
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-1601");
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str14 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-31061" + "'", str14, "HikariPool-31061");
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getMaximumPoolSize();
        int int4 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
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
        int int21 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setAcquireRetryDelay((long) 3);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.setReadOnly(false);
        hikariConfig25.setDataSourceClassName("");
        hikariConfig25.setCatalog("");
        hikariConfig25.setConnectionTimeout(0L);
        hikariConfig20.addDataSourceProperty("HikariPool-903", (java.lang.Object) hikariConfig25);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        boolean boolean38 = hikariConfig36.isReadOnly();
        int int39 = hikariConfig36.getAcquireIncrement();
        hikariConfig36.setConnectionCustomizerClassName("");
        boolean boolean42 = hikariConfig36.isReadOnly();
        long long43 = hikariConfig36.getMaxLifetime();
        long long44 = hikariConfig36.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean46 = hikariConfig45.isJdbc4ConnectionTest();
        long long47 = hikariConfig45.getConnectionTimeout();
        hikariConfig45.setJdbcUrl("");
        java.lang.String str50 = hikariConfig45.getConnectionCustomizerClassName();
        java.util.Properties properties51 = hikariConfig45.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig36.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig20.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        boolean boolean62 = hikariConfig60.isReadOnly();
        int int63 = hikariConfig60.getAcquireIncrement();
        java.lang.String str64 = hikariConfig60.getDataSourceClassName();
        hikariConfig60.setConnectionTimeout((long) 0);
        hikariConfig60.setAcquireRetries(60);
        hikariConfig60.setPoolName("HikariPool-211");
        boolean boolean71 = hikariConfig60.isIsolateInternalQueries();
        int int72 = hikariConfig60.getMaximumPoolSize();
        int int73 = hikariConfig60.getAcquireIncrement();
        boolean boolean74 = hikariConfig60.isIsolateInternalQueries();
        hikariConfig20.addDataSourceProperty("HikariPool-7337", (java.lang.Object) hikariConfig60);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig20.setDriverClassName("HikariPool-29582");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-29582' could not be loaded");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1800000L + "'", long44 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 60 + "'", int72 == 60);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-564");
        java.lang.String str17 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-31086" + "'", str17, "HikariPool-31086");
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean10 = hikariConfig0.isReadOnly();
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setCatalog("HikariPool-8059");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getIdleTimeout();
        int int8 = hikariConfig0.getTransactionIsolation();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTestQuery("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-5182");
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAutoCommit(true);
        long long11 = hikariConfig0.getIdleTimeout();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        long long13 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        java.lang.String str17 = hikariConfig15.getJdbcUrl();
        hikariConfig15.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
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
        hikariConfig0.setReadOnly(true);
        boolean boolean19 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("HikariPool-250");
        java.lang.String str4 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        int int6 = hikariConfig0.getMaximumPoolSize();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-12651");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-14110");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-14110' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-250" + "'", str4, "HikariPool-250");
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig0.getPoolName();
        boolean boolean11 = hikariConfig0.isReadOnly();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-31113" + "'", str10, "HikariPool-31113");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
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
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getCatalog();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTestQuery("HikariPool-1104");
        hikariConfig0.setMaximumPoolSize(60);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getConnectionTimeout();
        long long12 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(true);
        int int8 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
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
        hikariConfig0.setTransactionIsolation("HikariPool-5275");
        long long17 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setIdleTimeout((long) (short) 1);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime(3L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMinimumPoolSize(32);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("HikariPool-1409");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setAcquireRetryDelay((long) 35);
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setAutoCommit(true);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-829");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-250");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }
}
