import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setMaxLifetime((-1L));
        java.lang.String str8 = hikariConfig0.getPoolName();
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAcquireIncrement(60);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-64980" + "'", str8, "HikariPool-64980");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
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
        boolean boolean18 = hikariConfig1.isReadOnly();
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-64981" + "'", str16, "HikariPool-64981");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        long long8 = hikariConfig0.getMaxLifetime();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("HikariPool-9608");
        int int16 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay((long) '#');
        hikariConfig0.setTransactionIsolation("HikariPool-8509");
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("HikariPool-2746");
        java.lang.String str9 = hikariConfig0.getCatalog();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        hikariConfig0.setDataSourceClassName("HikariPool-22483");
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setAutoCommit(false);
        hikariConfig17.setJdbcUrl("HikariPool-211");
        int int26 = hikariConfig17.getMinimumPoolSize();
        hikariConfig17.setDataSourceClassName("HikariPool-697");
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig17);
        boolean boolean31 = hikariConfig17.isReadOnly();
        java.lang.String str32 = hikariConfig17.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-211" + "'", str32, "HikariPool-211");
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        int int5 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setRegisterMbeans(true);
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        int int16 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTestQuery("HikariPool-6211");
        hikariConfig1.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-48482");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-48482' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
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
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries();
        int int16 = hikariConfig1.getMinimumPoolSize();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTimeout(600000L);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setReadOnly(false);
        hikariConfig21.setJdbcUrl("");
        long long26 = hikariConfig21.getAcquireRetryDelay();
        hikariConfig21.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig21.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isInitializationFailFast();
        boolean boolean33 = hikariConfig31.isReadOnly();
        int int34 = hikariConfig31.getAcquireIncrement();
        hikariConfig31.setConnectionCustomizerClassName("");
        boolean boolean37 = hikariConfig31.isReadOnly();
        long long38 = hikariConfig31.getMaxLifetime();
        long long39 = hikariConfig31.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean41 = hikariConfig40.isJdbc4ConnectionTest();
        long long42 = hikariConfig40.getConnectionTimeout();
        hikariConfig40.setJdbcUrl("");
        java.lang.String str45 = hikariConfig40.getConnectionCustomizerClassName();
        java.util.Properties properties46 = hikariConfig40.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig31.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig21.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 750L + "'", long26 == 750L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1800000L + "'", long39 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(52);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        long long15 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        long long10 = hikariConfig0.getConnectionTimeout();
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
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
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        int int21 = hikariConfig0.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        boolean boolean24 = hikariConfig22.isReadOnly();
        int int25 = hikariConfig22.getAcquireIncrement();
        hikariConfig22.setConnectionTestQuery("hi!");
        hikariConfig22.setConnectionInitSql("HikariPool-211");
        hikariConfig22.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties32 = hikariConfig22.getDataSourceProperties();
        boolean boolean33 = hikariConfig22.isInitializationFailFast();
        long long34 = hikariConfig22.getConnectionTimeout();
        hikariConfig22.setAcquireRetryDelay((long) '#');
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        boolean boolean39 = hikariConfig37.isReadOnly();
        int int40 = hikariConfig37.getAcquireIncrement();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig37.setDataSource(dataSource41);
        hikariConfig37.setConnectionInitSql("");
        hikariConfig37.setMaxLifetime((long) 10);
        hikariConfig37.setMinimumPoolSize((int) '4');
        java.util.Properties properties49 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig22.setDataSourceProperties(properties49);
        hikariConfig0.setDataSourceProperties(properties49);
        javax.sql.DataSource dataSource53 = null;
        hikariConfig0.setDataSource(dataSource53);
        int int55 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-2708" + "'", str20, "HikariPool-2708");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setConnectionTestQuery("HikariPool-4439");
        hikariConfig0.setReadOnly(false);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        long long16 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setDataSourceClassName("HikariPool-14076");
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
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
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setCatalog("HikariPool-17958");
        hikariConfig0.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold(1800000L);
        hikariConfig0.setJdbcUrl("HikariPool-8744");
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
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
        hikariConfig0.setDataSourceClassName("HikariPool-2735");
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
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
        int int21 = hikariConfig1.getAcquireIncrement();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig13.setDataSource(dataSource15);
        hikariConfig13.setConnectionTimeout((long) (short) 100);
        hikariConfig13.setMaxLifetime((long) 100);
        boolean boolean21 = hikariConfig13.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-137", (java.lang.Object) hikariConfig13);
        hikariConfig0.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        long long11 = hikariConfig0.getConnectionTimeout();
        java.lang.String str12 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-56452");
        long long17 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65042" + "'", str12, "HikariPool-65042");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
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
        hikariConfig0.setDataSourceClassName("HikariPool-801");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
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
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-1915");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.setPoolName("HikariPool-960");
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setConnectionTestQuery("HikariPool-8068");
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        int int8 = hikariConfig0.getTransactionIsolation();
        int int9 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-801");
        hikariConfig0.setDataSourceClassName("HikariPool-1605");
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1605" + "'", str12, "HikariPool-1605");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setPoolName("HikariPool-447");
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isJdbc4ConnectionTest();
        long long25 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setJdbcUrl("");
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isJdbc4ConnectionTest();
        long long31 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setJdbcUrl("");
        java.lang.String str34 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig23.setDataSourceProperties(properties35);
        long long39 = hikariConfig23.getLeakDetectionThreshold();
        hikariConfig23.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.addDataSourceProperty("HikariPool-9784", (java.lang.Object) (short) 1);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setLeakDetectionThreshold(2147483647L);
        hikariConfig43.setRegisterMbeans(true);
        hikariConfig43.setMaximumPoolSize(52);
        java.util.Properties properties51 = hikariConfig43.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("HikariPool-35467");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setRegisterMbeans(false);
        long long10 = hikariConfig0.getMaxLifetime();
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-211");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setIsolateInternalQueries(false);
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
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
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
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
        boolean boolean32 = hikariConfig16.isReadOnly();
        long long33 = hikariConfig16.getLeakDetectionThreshold();
        int int34 = hikariConfig16.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setConnectionInitSql("HikariPool-2459");
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setDataSourceClassName("HikariPool-61684");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(35L);
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int18 = hikariConfig1.getTransactionIsolation();
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-30236");
        java.lang.String str26 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-17660");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        javax.sql.DataSource dataSource15 = hikariConfig12.getDataSource();
        long long16 = hikariConfig12.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig12.getCatalog();
        hikariConfig12.setMaximumPoolSize((int) (byte) 100);
        boolean boolean20 = hikariConfig12.isIsolateInternalQueries();
        hikariConfig12.setRegisterMbeans(true);
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig0.addDataSourceProperty("HikariPool-2459", (java.lang.Object) hikariConfig12);
        hikariConfig0.setPoolName("HikariPool-8021");
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        boolean boolean31 = hikariConfig29.isReadOnly();
        int int32 = hikariConfig29.getAcquireIncrement();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig29.setDataSource(dataSource33);
        java.lang.String str35 = hikariConfig29.getCatalog();
        int int36 = hikariConfig29.getAcquireRetries();
        hikariConfig29.setTransactionIsolation("HikariPool-697");
        hikariConfig29.setMinimumPoolSize((int) '#');
        hikariConfig29.setConnectionCustomizerClassName("HikariPool-960");
        java.lang.String str43 = hikariConfig29.getConnectionCustomizerClassName();
        boolean boolean44 = hikariConfig29.isReadOnly();
        int int45 = hikariConfig29.getMinimumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-7525", (java.lang.Object) hikariConfig29);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-960" + "'", str43, "HikariPool-960");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-39248");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-39248 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
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
        boolean boolean32 = hikariConfig16.isReadOnly();
        long long33 = hikariConfig16.getLeakDetectionThreshold();
        java.lang.String str34 = hikariConfig16.getPoolName();
        hikariConfig16.setUseInstrumentation(true);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-65092" + "'", str34, "HikariPool-65092");
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
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
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setConnectionTestQuery("HikariPool-25205");
        hikariConfig13.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
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
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        hikariConfig0.setAcquireRetryDelay((long) 32);
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(true);
        int int23 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-65097" + "'", str5, "HikariPool-65097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-54720");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
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
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        boolean boolean16 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65100" + "'", str12, "HikariPool-65100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
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
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.lang.String str14 = hikariConfig0.getPoolName();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65101" + "'", str13, "HikariPool-65101");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65101" + "'", str14, "HikariPool-65101");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
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
        hikariConfig0.setLeakDetectionThreshold((long) 52);
        long long23 = hikariConfig0.getIdleTimeout();
        boolean boolean24 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireRetryDelay(60L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionTestQuery("HikariPool-57701");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65106" + "'", str6, "HikariPool-65106");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
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
        hikariConfig0.setAcquireRetryDelay(0L);
        long long15 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetries((int) '#');
        hikariConfig0.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
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
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireIncrement((int) '#');
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setLeakDetectionThreshold(1L);
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
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig13.setLeakDetectionThreshold(10L);
        java.lang.Class<?> wildcardClass61 = hikariConfig13.getClass();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33837");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33837 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
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
        hikariConfig1.setJdbcUrl("HikariPool-31473");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-829");
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setTransactionIsolation("HikariPool-1744");
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIdleTimeout((long) 1);
        hikariConfig0.setDataSourceClassName("HikariPool-25695");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
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
        hikariConfig21.setAcquireRetries(10);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource51 = null;
        hikariConfig50.setDataSource(dataSource51);
        int int53 = hikariConfig50.getAcquireRetries();
        boolean boolean54 = hikariConfig50.isReadOnly();
        hikariConfig21.addDataSourceProperty("HikariPool-19435", (java.lang.Object) boolean54);
        java.lang.String str56 = hikariConfig21.getConnectionTestQuery();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMinimumPoolSize(52);
        int int10 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-54804");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-54804 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
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
        boolean boolean24 = hikariConfig9.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-1631");
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long19 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        hikariConfig0.setMaxLifetime((long) (-1));
        hikariConfig0.setMaxLifetime((long) (short) -1);
        long long18 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        int int21 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        java.lang.String str14 = hikariConfig11.getJdbcUrl();
        long long15 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.setConnectionCustomizerClassName("HikariPool-377");
        java.lang.String str18 = hikariConfig11.getDataSourceClassName();
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig11.setCatalog("");
        int int23 = hikariConfig11.getMinimumPoolSize();
        hikariConfig11.setInitializationFailFast(false);
        java.lang.String str26 = hikariConfig11.getPoolName();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean33 = hikariConfig32.isJdbc4ConnectionTest();
        long long34 = hikariConfig32.getConnectionTimeout();
        hikariConfig32.setJdbcUrl("");
        java.lang.String str37 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties38 = hikariConfig32.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties38);
        java.lang.String str40 = hikariConfig29.getPoolName();
        boolean boolean41 = hikariConfig29.isJdbc4ConnectionTest();
        int int42 = hikariConfig29.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str44 = hikariConfig43.getConnectionInitSql();
        long long45 = hikariConfig43.getMaxLifetime();
        boolean boolean46 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setReadOnly(true);
        boolean boolean49 = hikariConfig43.isAutoCommit();
        java.lang.String str50 = hikariConfig43.getPoolName();
        boolean boolean51 = hikariConfig43.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean53 = hikariConfig52.isInitializationFailFast();
        boolean boolean54 = hikariConfig52.isReadOnly();
        int int55 = hikariConfig52.getAcquireIncrement();
        javax.sql.DataSource dataSource56 = null;
        hikariConfig52.setDataSource(dataSource56);
        hikariConfig52.setConnectionInitSql("");
        boolean boolean60 = hikariConfig52.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean62 = hikariConfig61.isJdbc4ConnectionTest();
        long long63 = hikariConfig61.getConnectionTimeout();
        hikariConfig61.setJdbcUrl("");
        java.lang.String str66 = hikariConfig61.getConnectionCustomizerClassName();
        java.util.Properties properties67 = hikariConfig61.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig52.setDataSourceProperties(properties67);
        hikariConfig43.setDataSourceProperties(properties67);
        hikariConfig29.setDataSourceProperties(properties67);
        hikariConfig11.addDataSourceProperty("HikariPool-35571", (java.lang.Object) properties67);
        hikariConfig0.setDataSourceProperties(properties67);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-65155" + "'", str26, "HikariPool-65155");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-65156" + "'", str40, "HikariPool-65156");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1800000L + "'", long45 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-65158" + "'", str50, "HikariPool-65158");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 5000L + "'", long63 == 5000L);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getAcquireIncrement();
        long long6 = hikariConfig0.getMaxLifetime();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("HikariPool-48272");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean35 = hikariConfig0.isAutoCommit();
        hikariConfig0.setUseInstrumentation(false);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
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
        int int11 = hikariConfig0.getAcquireIncrement();
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        int int6 = hikariConfig0.getTransactionIsolation();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setDataSourceClassName("HikariPool-20900");
        int int10 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
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
        long long14 = hikariConfig0.getIdleTimeout();
        java.lang.String str15 = hikariConfig0.getPoolName();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-65169" + "'", str15, "HikariPool-65169");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
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
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        int int19 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-3500");
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setTransactionIsolation("");
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str7 = hikariConfig0.getCatalog();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str9 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-65174" + "'", str9, "HikariPool-65174");
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
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
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setMaximumPoolSize(100);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(false);
        boolean boolean20 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65175" + "'", str10, "HikariPool-65175");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str11 = hikariConfig10.getCatalog();
        int int12 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        int int22 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig21.setAutoCommit(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig21.setDataSource(dataSource29);
        long long31 = hikariConfig21.getIdleTimeout();
        hikariConfig21.setPoolName("HikariPool-1059");
        hikariConfig21.setCatalog("HikariPool-1915");
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        javax.sql.DataSource dataSource38 = null;
        hikariConfig36.setDataSource(dataSource38);
        boolean boolean40 = hikariConfig36.isJdbc4ConnectionTest();
        hikariConfig36.setAutoCommit(false);
        javax.sql.DataSource dataSource43 = hikariConfig36.getDataSource();
        hikariConfig36.setConnectionCustomizerClassName("HikariPool-1063");
        java.util.Properties properties46 = hikariConfig36.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties46);
        hikariConfig13.setDataSourceProperties(properties46);
        hikariConfig0.setDataSourceProperties(properties46);
        java.lang.String str50 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 600000L + "'", long31 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
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
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setIdleTimeout((long) 3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
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
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setTransactionIsolation("HikariPool-57305");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setReadOnly(false);
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getMaxLifetime();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        java.util.Properties properties20 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAcquireRetryDelay(1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
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
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setIdleTimeout(1800000L);
        int int9 = hikariConfig0.getMaximumPoolSize();
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setConnectionInitSql("HikariPool-7895");
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
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
        long long19 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.setDataSource(dataSource20);
        long long22 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        long long8 = hikariConfig0.getConnectionTimeout();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setConnectionTestQuery("hi!");
        hikariConfig10.setCatalog("HikariPool-137");
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.setDataSourceClassName("hi!");
        hikariConfig10.setTransactionIsolation("");
        hikariConfig10.setDataSourceClassName("HikariPool-514");
        java.lang.String str26 = hikariConfig10.getPoolName();
        long long27 = hikariConfig10.getAcquireRetryDelay();
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
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig10.setDataSourceProperties(properties52);
        hikariConfig0.setDataSourceProperties(properties52);
        java.lang.String str59 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("HikariPool-42741");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-65210" + "'", str26, "HikariPool-65210");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 750L + "'", long27 == 750L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 5000L + "'", long48 == 5000L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45783");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45783 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        int int13 = hikariConfig0.getMaximumPoolSize();
        int int14 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setMaxLifetime((-1L));
        java.lang.String str8 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-65218" + "'", str8, "HikariPool-65218");
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
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
        hikariConfig0.setMaxLifetime(10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65219" + "'", str6, "HikariPool-65219");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setConnectionInitSql("HikariPool-6899");
        hikariConfig0.setMaxLifetime((-1L));
        int int10 = hikariConfig0.getTransactionIsolation();
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isReadOnly();
        long long8 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-61668");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        boolean boolean7 = hikariConfig0.isAutoCommit();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-12028");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        javax.sql.DataSource dataSource15 = hikariConfig12.getDataSource();
        boolean boolean16 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.setPoolName("hi!");
        javax.sql.DataSource dataSource21 = null;
        hikariConfig12.setDataSource(dataSource21);
        java.lang.String str23 = hikariConfig12.getCatalog();
        int int24 = hikariConfig12.getMinimumPoolSize();
        hikariConfig12.setMinimumPoolSize(1);
        hikariConfig0.addDataSourceProperty("HikariPool-8895", (java.lang.Object) 1);
        java.lang.String str28 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
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
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        int int15 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("HikariPool-11051");
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        hikariConfig0.setJdbcUrl("HikariPool-3101");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        boolean boolean5 = hikariConfig4.isReadOnly();
        hikariConfig4.setMaximumPoolSize((int) (short) 100);
        boolean boolean8 = hikariConfig4.isJdbc4ConnectionTest();
        java.lang.String str9 = hikariConfig4.getPoolName();
        int int10 = hikariConfig4.getTransactionIsolation();
        hikariConfig4.setAcquireIncrement(3);
        java.lang.String str13 = hikariConfig4.getConnectionInitSql();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-65229" + "'", str9, "HikariPool-65229");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
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
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setAcquireIncrement((int) '4');
        hikariConfig0.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbcUrl("HikariPool-40035");
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTimeout(750L);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("HikariPool-39321");
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        int int10 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setCatalog("HikariPool-7989");
        int int13 = hikariConfig0.getAcquireIncrement();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setIsolateInternalQueries(false);
        int int14 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-58224");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-58224 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime(100L);
        int int10 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig0.getCatalog();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-41022");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-41022' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setReadOnly(false);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig13.getConnectionInitSql();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig13.setDataSource(dataSource20);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setReadOnly(false);
        hikariConfig24.setJdbcUrl("");
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) hikariConfig24);
        hikariConfig13.setMinimumPoolSize(1);
        java.util.Properties properties32 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-43807", (java.lang.Object) properties32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
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
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        hikariConfig22.setReadOnly(false);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        boolean boolean28 = hikariConfig22.isIsolateInternalQueries();
        java.lang.String str29 = hikariConfig22.getCatalog();
        java.lang.String str30 = hikariConfig22.getConnectionInitSql();
        long long31 = hikariConfig22.getLeakDetectionThreshold();
        java.lang.String str32 = hikariConfig22.getDataSourceClassName();
        java.lang.String str33 = hikariConfig22.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-16491", (java.lang.Object) hikariConfig22);
        java.util.Properties properties35 = hikariConfig22.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
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
        long long17 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-17261");
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2845");
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-61083");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-2845" + "'", str13, "HikariPool-2845");
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-573", (java.lang.Object) "");
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
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
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setLeakDetectionThreshold(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        hikariConfig17.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig17.setIdleTimeout(0L);
        java.util.Properties properties27 = hikariConfig17.getDataSourceProperties();
        java.util.Properties properties28 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean31 = hikariConfig30.isJdbc4ConnectionTest();
        long long32 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setJdbcUrl("");
        java.lang.String str35 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties36 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setCatalog("");
        boolean boolean40 = hikariConfig37.isInitializationFailFast();
        hikariConfig17.addDataSourceProperty("HikariPool-11326", (java.lang.Object) hikariConfig37);
        hikariConfig0.addDataSourceProperty("HikariPool-11560", (java.lang.Object) "HikariPool-11326");
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        boolean boolean45 = hikariConfig43.isReadOnly();
        javax.sql.DataSource dataSource46 = hikariConfig43.getDataSource();
        int int47 = hikariConfig43.getMaximumPoolSize();
        int int48 = hikariConfig43.getAcquireRetries();
        java.util.Properties properties49 = hikariConfig43.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig51.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
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
        java.lang.String str15 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        hikariConfig1.setDataSourceClassName("HikariPool-1865");
        long long20 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-5239");
        int int17 = hikariConfig1.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-14265", (java.lang.Object) "HikariPool-9663");
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
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
        int int26 = hikariConfig0.getMinimumPoolSize();
        int int27 = hikariConfig0.getAcquireRetries();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setReadOnly(true);
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-1063");
        hikariConfig0.setDataSourceClassName("HikariPool-64605");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        long long10 = hikariConfig0.getMaxLifetime();
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("HikariPool-64178");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
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
        hikariConfig8.setUseInstrumentation(false);
        java.lang.String str36 = hikariConfig8.getCatalog();
        hikariConfig8.setJdbc4ConnectionTest(true);
        long long39 = hikariConfig8.getConnectionTimeout();
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.getMaxLifetime();
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaximumPoolSize(52);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
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
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        int int21 = hikariConfig0.getMinimumPoolSize();
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
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
        boolean boolean25 = hikariConfig23.isRegisterMbeans();
        hikariConfig23.setLeakDetectionThreshold(0L);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        hikariConfig11.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig11.setIdleTimeout(0L);
        java.util.Properties properties21 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long26 = hikariConfig25.getIdleTimeout();
        hikariConfig25.setJdbcUrl("HikariPool-16223");
        int int29 = hikariConfig25.getAcquireIncrement();
        boolean boolean30 = hikariConfig25.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setCatalog("hi!");
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.addDataSourceProperty("HikariPool-52719", (java.lang.Object) "HikariPool-20012");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        long long13 = hikariConfig0.getMaxLifetime();
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setConnectionTestQuery("HikariPool-514");
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        int int16 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
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
        int int18 = hikariConfig0.getTransactionIsolation();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("HikariPool-1062");
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        int int17 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65301" + "'", str13, "HikariPool-65301");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-65307" + "'", str7, "HikariPool-65307");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-51150");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
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
        java.lang.String str15 = hikariConfig14.getJdbcUrl();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig14.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        hikariConfig0.setIdleTimeout(600000L);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
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
        boolean boolean29 = hikariConfig0.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
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
        long long13 = hikariConfig0.getMaxLifetime();
        long long14 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-6131");
        hikariConfig0.setIdleTimeout((long) 52);
        hikariConfig0.setMinimumPoolSize(60);
        long long23 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
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
        boolean boolean19 = hikariConfig12.isReadOnly();
        javax.sql.DataSource dataSource20 = hikariConfig12.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-211");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        long long9 = hikariConfig7.getMaxLifetime();
        boolean boolean10 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setReadOnly(true);
        boolean boolean13 = hikariConfig7.isAutoCommit();
        hikariConfig7.setLeakDetectionThreshold(1L);
        hikariConfig7.setReadOnly(false);
        java.lang.String str18 = hikariConfig7.getConnectionTestQuery();
        hikariConfig0.addDataSourceProperty("HikariPool-514", (java.lang.Object) hikariConfig7);
        long long20 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setJdbcUrl("HikariPool-2037");
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
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
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
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
        boolean boolean20 = hikariConfig11.isReadOnly();
        hikariConfig11.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        boolean boolean16 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
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
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setCatalog("HikariPool-24638");
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        int int9 = hikariConfig0.getMaximumPoolSize();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1579");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2322");
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        java.lang.String str11 = hikariConfig0.getPoolName();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-21009");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-65343" + "'", str11, "HikariPool-65343");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIdleTimeout((long) 3);
        hikariConfig0.setTransactionIsolation("HikariPool-3070");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setTransactionIsolation("HikariPool-14144");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setPoolName("HikariPool-1409");
        hikariConfig1.setDataSourceClassName("HikariPool-25045");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
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
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getMaximumPoolSize();
        int int8 = hikariConfig0.getMinimumPoolSize();
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-39474");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65352" + "'", str6, "HikariPool-65352");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
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
        java.lang.String str26 = hikariConfig0.getPoolName();
        long long27 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig0.setDataSource(dataSource28);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-65353" + "'", str26, "HikariPool-65353");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        int int15 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-32877");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-32877' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-137");
        long long6 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setUseInstrumentation(true);
        boolean boolean11 = hikariConfig8.isRegisterMbeans();
        hikariConfig8.setInitializationFailFast(false);
        hikariConfig8.setTransactionIsolation("HikariPool-27535");
        int int16 = hikariConfig8.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str21 = hikariConfig20.getCatalog();
        long long22 = hikariConfig20.getMaxLifetime();
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
        hikariConfig20.setDataSourceProperties(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig0.setDataSourceProperties(properties45);
        hikariConfig0.setConnectionInitSql("HikariPool-17017");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 600000L + "'", long33 == 600000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetries(3);
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        int int16 = hikariConfig0.getMinimumPoolSize();
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        int int13 = hikariConfig0.getMinimumPoolSize();
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
        hikariConfig23.setMinimumPoolSize((int) (short) 100);
        hikariConfig0.addDataSourceProperty("HikariPool-2463", (java.lang.Object) hikariConfig23);
        java.lang.String str52 = hikariConfig23.getCatalog();
        boolean boolean53 = hikariConfig23.isInitializationFailFast();
        boolean boolean54 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setJdbcUrl("HikariPool-2073");
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean59 = hikariConfig58.isInitializationFailFast();
        boolean boolean60 = hikariConfig58.isReadOnly();
        int int61 = hikariConfig58.getAcquireIncrement();
        javax.sql.DataSource dataSource62 = null;
        hikariConfig58.setDataSource(dataSource62);
        hikariConfig58.setConnectionInitSql("");
        hikariConfig58.setMaxLifetime((long) 10);
        hikariConfig58.setRegisterMbeans(true);
        java.lang.String str70 = hikariConfig58.getCatalog();
        hikariConfig58.setAcquireIncrement((int) 'a');
        hikariConfig58.setDataSourceClassName("HikariPool-250");
        hikariConfig23.addDataSourceProperty("HikariPool-21528", (java.lang.Object) hikariConfig58);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
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
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setCatalog("");
        hikariConfig0.setMinimumPoolSize(0);
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setCatalog("HikariPool-2632");
        hikariConfig0.setAutoCommit(false);
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-2632" + "'", str15, "HikariPool-2632");
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
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
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIdleTimeout((long) (-1));
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        int int17 = hikariConfig0.getTransactionIsolation();
        long long18 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
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
        int int21 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
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
        boolean boolean20 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        java.lang.String str26 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig0.getAcquireRetries();
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getPoolName();
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65384" + "'", str12, "HikariPool-65384");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(1);
        int int11 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-47699");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        int int5 = hikariConfig0.getTransactionIsolation();
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-33195");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
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
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
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
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        hikariConfig0.setAcquireRetries((int) (short) 10);
        hikariConfig0.setCatalog("HikariPool-573");
        hikariConfig0.setLeakDetectionThreshold(0L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.lang.String str7 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        boolean boolean12 = hikariConfig8.isJdbc4ConnectionTest();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setJdbcUrl("HikariPool-211");
        int int17 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setDataSourceClassName("HikariPool-697");
        long long20 = hikariConfig8.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig24.setDataSource(dataSource26);
        boolean boolean28 = hikariConfig24.isJdbc4ConnectionTest();
        hikariConfig24.setAcquireRetryDelay(0L);
        java.util.Properties properties31 = hikariConfig24.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig8.setDataSourceProperties(properties31);
        hikariConfig0.setDataSourceProperties(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long38 = hikariConfig37.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(properties6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-65390" + "'", str7, "HikariPool-65390");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-1969");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setPoolName("HikariPool-2683");
        hikariConfig0.setDataSourceClassName("HikariPool-15422");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-20916");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
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
        hikariConfig0.setDataSourceClassName("HikariPool-829");
        hikariConfig0.setIdleTimeout((long) (short) 0);
        hikariConfig0.setConnectionInitSql("HikariPool-4457");
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33559");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33559 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
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
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-1260");
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setPoolName("HikariPool-575");
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        java.lang.String str22 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.setDataSource(dataSource9);
        hikariConfig7.setReadOnly(false);
        hikariConfig7.setReadOnly(false);
        hikariConfig0.addDataSourceProperty("HikariPool-1059", (java.lang.Object) false);
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime((long) 97);
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setReadOnly(false);
        hikariConfig17.setJdbcUrl("");
        long long22 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig17.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        boolean boolean29 = hikariConfig27.isReadOnly();
        int int30 = hikariConfig27.getAcquireIncrement();
        hikariConfig27.setConnectionCustomizerClassName("");
        boolean boolean33 = hikariConfig27.isReadOnly();
        long long34 = hikariConfig27.getMaxLifetime();
        long long35 = hikariConfig27.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        long long38 = hikariConfig36.getConnectionTimeout();
        hikariConfig36.setJdbcUrl("");
        java.lang.String str41 = hikariConfig36.getConnectionCustomizerClassName();
        java.util.Properties properties42 = hikariConfig36.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig27.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig0.setDataSourceProperties(properties42);
        java.lang.String str53 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1800000L + "'", long34 == 1800000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "HikariPool-65408" + "'", str53, "HikariPool-65408");
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
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
        int int18 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-20459");
        hikariConfig0.setJdbcUrl("HikariPool-25013");
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireIncrement(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
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
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireIncrement(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
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
        int int24 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) '#');
        hikariConfig0.setConnectionInitSql("HikariPool-10652");
        long long29 = hikariConfig0.getConnectionTimeout();
        long long30 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement(60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25312");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25312 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
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
        long long11 = hikariConfig9.getMaxLifetime();
        int int12 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.setMaximumPoolSize(60);
        java.lang.String str15 = hikariConfig9.getJdbcUrl();
        long long16 = hikariConfig9.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaxLifetime((long) 0);
        int int12 = hikariConfig0.getAcquireIncrement();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-20549");
        int int11 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        long long14 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbcUrl("HikariPool-14423");
        hikariConfig0.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        long long7 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setPoolName("HikariPool-38299");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setTransactionIsolation("HikariPool-1104");
        long long15 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-34869");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
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
        long long30 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean33 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2147483647L + "'", long30 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getTransactionIsolation();
        int int8 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-19416");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65454" + "'", str10, "HikariPool-65454");
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-6284");
        boolean boolean10 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        int int5 = hikariConfig0.getMinimumPoolSize();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        int int8 = hikariConfig0.getTransactionIsolation();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setTransactionIsolation("HikariPool-6665");
        long long14 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
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
        java.lang.String str19 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.setConnectionCustomizerClassName("HikariPool-17551");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTestQuery("HikariPool-6821");
        long long9 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1707");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setTransactionIsolation("HikariPool-447");
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-31473");
        hikariConfig0.setPoolName("HikariPool-25172");
        java.lang.String str24 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-31473" + "'", str24, "HikariPool-31473");
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
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
        java.lang.String str24 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        boolean boolean16 = hikariConfig14.isReadOnly();
        int int17 = hikariConfig14.getAcquireIncrement();
        java.lang.String str18 = hikariConfig14.getDataSourceClassName();
        boolean boolean19 = hikariConfig14.isRegisterMbeans();
        boolean boolean20 = hikariConfig14.isRegisterMbeans();
        boolean boolean21 = hikariConfig14.isRegisterMbeans();
        int int22 = hikariConfig14.getAcquireRetries();
        hikariConfig14.setIsolateInternalQueries(true);
        hikariConfig14.setMinimumPoolSize(100);
        boolean boolean27 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig9.addDataSourceProperty("HikariPool-8174", (java.lang.Object) hikariConfig14);
        java.lang.String str29 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setRegisterMbeans(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-65483" + "'", str9, "HikariPool-65483");
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        long long12 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig8.getConnectionCustomizerClassName();
        int int11 = hikariConfig8.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("HikariPool-48171");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
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
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean46 = hikariConfig45.isJdbc4ConnectionTest();
        hikariConfig45.setDataSourceClassName("HikariPool-510");
        int int49 = hikariConfig45.getMaximumPoolSize();
        long long50 = hikariConfig45.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str52 = hikariConfig51.getConnectionInitSql();
        int int53 = hikariConfig51.getMinimumPoolSize();
        int int54 = hikariConfig51.getMinimumPoolSize();
        hikariConfig51.setMaxLifetime((long) 1);
        long long57 = hikariConfig51.getAcquireRetryDelay();
        long long58 = hikariConfig51.getIdleTimeout();
        hikariConfig51.setDataSourceClassName("HikariPool-3746");
        hikariConfig51.validate();
        java.lang.String str62 = hikariConfig51.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str64 = hikariConfig63.getConnectionInitSql();
        long long65 = hikariConfig63.getMaxLifetime();
        java.lang.String str66 = hikariConfig63.getConnectionCustomizerClassName();
        int int67 = hikariConfig63.getMaximumPoolSize();
        int int68 = hikariConfig63.getMaximumPoolSize();
        long long69 = hikariConfig63.getMaxLifetime();
        hikariConfig63.setAcquireIncrement((int) (byte) 100);
        hikariConfig63.setAcquireRetryDelay(600000L);
        java.lang.String str74 = hikariConfig63.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean76 = hikariConfig75.isJdbc4ConnectionTest();
        long long77 = hikariConfig75.getConnectionTimeout();
        hikariConfig75.setJdbcUrl("");
        boolean boolean80 = hikariConfig75.isRegisterMbeans();
        hikariConfig75.setIsolateInternalQueries(false);
        hikariConfig75.setAcquireRetries((int) '4');
        java.util.Properties properties85 = hikariConfig75.getDataSourceProperties();
        hikariConfig63.setDataSourceProperties(properties85);
        hikariConfig51.setDataSourceProperties(properties85);
        hikariConfig45.setDataSourceProperties(properties85);
        com.zaxxer.hikari.HikariConfig hikariConfig89 = new com.zaxxer.hikari.HikariConfig(properties85);
        hikariConfig0.setDataSourceProperties(properties85);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5000L + "'", long50 == 5000L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 750L + "'", long57 == 750L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 600000L + "'", long58 == 600000L);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1800000L + "'", long65 == 1800000L);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 60 + "'", int67 == 60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 60 + "'", int68 == 60);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1800000L + "'", long69 == 1800000L);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 5000L + "'", long77 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(properties85);
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-801");
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-11479");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionInitSql("HikariPool-12400");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-53227");
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-801" + "'", str18, "HikariPool-801");
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize(32);
        hikariConfig0.addDataSourceProperty("HikariPool-3101", (java.lang.Object) "HikariPool-10624");
        long long17 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
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
        hikariConfig9.setMaxLifetime((long) (short) -1);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        long long17 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setJdbcUrl("");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.setJdbc4ConnectionTest(false);
        hikariConfig15.setMaxLifetime(5000L);
        hikariConfig15.setCatalog("");
        long long28 = hikariConfig15.getIdleTimeout();
        long long29 = hikariConfig15.getMaxLifetime();
        java.util.Properties properties30 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig9.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.String str34 = hikariConfig33.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        int int7 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-63681");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-63681' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setAcquireRetries(10);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isJdbc4ConnectionTest();
        long long14 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setJdbcUrl("");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str22 = hikariConfig21.getCatalog();
        hikariConfig21.setInitializationFailFast(true);
        hikariConfig21.setMaxLifetime((long) (short) -1);
        hikariConfig21.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.addDataSourceProperty("HikariPool-960", (java.lang.Object) hikariConfig21);
        long long30 = hikariConfig0.getIdleTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isJdbc4ConnectionTest();
        hikariConfig31.setReadOnly(false);
        hikariConfig31.setDataSourceClassName("");
        java.lang.String str37 = hikariConfig31.getCatalog();
        long long38 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.setTransactionIsolation("HikariPool-1454");
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        boolean boolean43 = hikariConfig41.isReadOnly();
        int int44 = hikariConfig41.getAcquireIncrement();
        java.lang.String str45 = hikariConfig41.getDataSourceClassName();
        hikariConfig41.setConnectionTimeout((long) 0);
        hikariConfig41.setAcquireRetries(60);
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig54.setConnectionInitSql("");
        hikariConfig54.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean60 = hikariConfig59.isJdbc4ConnectionTest();
        long long61 = hikariConfig59.getConnectionTimeout();
        hikariConfig59.setJdbcUrl("");
        java.lang.String str64 = hikariConfig59.getConnectionCustomizerClassName();
        java.util.Properties properties65 = hikariConfig59.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig54.setDataSourceProperties(properties65);
        hikariConfig41.setDataSourceProperties(properties65);
        hikariConfig31.setDataSourceProperties(properties65);
        hikariConfig0.setDataSourceProperties(properties65);
        java.lang.String str71 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 750L + "'", long38 == 750L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 5000L + "'", long61 == 5000L);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setIdleTimeout((long) 52);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
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
        hikariConfig0.setAutoCommit(true);
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
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
        hikariConfig0.setAcquireIncrement((int) 'a');
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
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        hikariConfig0.setCatalog("hi!");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-8148");
        boolean boolean12 = hikariConfig0.isReadOnly();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-137" + "'", str9, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
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
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
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
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
        int int17 = hikariConfig0.getMinimumPoolSize();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setCatalog("HikariPool-7928");
        hikariConfig0.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setTransactionIsolation("");
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        int int16 = hikariConfig0.getAcquireIncrement();
        java.lang.String str17 = hikariConfig0.getCatalog();
        long long18 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setPoolName("HikariPool-1949");
        int int15 = hikariConfig0.getAcquireRetries();
        boolean boolean16 = hikariConfig0.isReadOnly();
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int14 = hikariConfig0.getMaximumPoolSize();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setAutoCommit(true);
        long long8 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetryDelay(52L);
        hikariConfig0.setMaximumPoolSize((int) '4');
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 52);
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
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
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean22 = hikariConfig21.isAutoCommit();
        hikariConfig21.setJdbcUrl("HikariPool-17334");
        java.util.Properties properties25 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        hikariConfig0.setDataSourceClassName("HikariPool-8678");
        boolean boolean9 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        boolean boolean13 = hikariConfig11.isReadOnly();
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        int int15 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setRegisterMbeans(true);
        hikariConfig11.setCatalog("HikariPool-575");
        boolean boolean20 = hikariConfig11.isJdbc4ConnectionTest();
        java.util.Properties properties21 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getIdleTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-6131", (java.lang.Object) hikariConfig22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
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
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.setReadOnly(false);
        hikariConfig16.setCatalog("");
        java.lang.String str22 = hikariConfig16.getConnectionTestQuery();
        java.lang.String str23 = hikariConfig16.getDataSourceClassName();
        long long24 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setIdleTimeout(60L);
        java.util.Properties properties27 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties27);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig1.setDataSource(dataSource29);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize(0);
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-50943");
        long long14 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("HikariPool-10638");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getMaxLifetime();
        java.lang.String str18 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.setIdleTimeout((long) (-1));
        java.lang.String str21 = hikariConfig15.getConnectionTestQuery();
        int int22 = hikariConfig15.getMaximumPoolSize();
        hikariConfig15.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties25 = hikariConfig15.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties25);
        javax.sql.DataSource dataSource27 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setConnectionTimeout(5000L);
        int int32 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) '4');
        int int21 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long4 = hikariConfig0.getMaxLifetime();
        long long5 = hikariConfig0.getIdleTimeout();
        long long6 = hikariConfig0.getIdleTimeout();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-1143");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setLeakDetectionThreshold(32L);
        int int12 = hikariConfig0.getTransactionIsolation();
        java.lang.String str13 = hikariConfig0.getCatalog();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTimeout(750L);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        boolean boolean9 = hikariConfig7.isReadOnly();
        int int10 = hikariConfig7.getAcquireIncrement();
        java.lang.String str11 = hikariConfig7.getDataSourceClassName();
        hikariConfig7.setConnectionTimeout((long) 0);
        hikariConfig7.setAcquireRetries(60);
        hikariConfig7.setRegisterMbeans(false);
        long long18 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("HikariPool-564", (java.lang.Object) long18);
        int int20 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        int int23 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-903");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setConnectionInitSql("hi!");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig12.isReadOnly();
        hikariConfig12.setAcquireRetryDelay((long) (short) 1);
        hikariConfig12.setMinimumPoolSize(10);
        hikariConfig12.setLeakDetectionThreshold((long) 100);
        java.lang.String str25 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setUseInstrumentation(true);
        java.util.Properties properties28 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties28);
        long long30 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-211");
        java.util.Properties properties33 = hikariConfig0.getDataSourceProperties();
        int int34 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
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
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str23 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-9983");
        hikariConfig0.addDataSourceProperty("HikariPool-40016", (java.lang.Object) "HikariPool-9789");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setConnectionTestQuery("HikariPool-514");
        hikariConfig0.setMaxLifetime((long) 52);
        hikariConfig0.setDataSourceClassName("HikariPool-2746");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-56942");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getMaxLifetime();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
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
        java.lang.String str11 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-65566" + "'", str11, "HikariPool-65566");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-602");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8174");
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
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
        int int21 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        boolean boolean24 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("HikariPool-564");
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setPoolName("HikariPool-23588");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65569" + "'", str6, "HikariPool-65569");
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        boolean boolean10 = hikariConfig0.isReadOnly();
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
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
        int int17 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setAcquireIncrement(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
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
        hikariConfig0.setMaxLifetime((long) 'a');
        long long35 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbcUrl("HikariPool-32899");
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-19940");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetries((int) 'a');
        hikariConfig0.setJdbcUrl("HikariPool-8030");
        hikariConfig0.setJdbcUrl("HikariPool-4468");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-16504");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-16504' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
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
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-8360");
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-48912");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
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
        hikariConfig0.setAcquireRetryDelay(0L);
        long long20 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        int int5 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMaximumPoolSize();
        int int9 = hikariConfig7.getAcquireRetries();
        int int10 = hikariConfig7.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        int int13 = hikariConfig0.getMinimumPoolSize();
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-9867");
        hikariConfig0.setLeakDetectionThreshold(52L);
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        hikariConfig0.setMaxLifetime((long) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setPoolName("hi!");
        long long6 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setConnectionCustomizerClassName("");
        long long20 = hikariConfig16.getConnectionTimeout();
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setConnectionTestQuery("");
        long long24 = hikariConfig16.getIdleTimeout();
        hikariConfig16.setUseInstrumentation(false);
        long long27 = hikariConfig16.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig29.setDataSource(dataSource31);
        hikariConfig29.setConnectionTimeout((long) (short) 100);
        hikariConfig29.setMaxLifetime((long) 100);
        boolean boolean37 = hikariConfig29.isInitializationFailFast();
        hikariConfig16.addDataSourceProperty("HikariPool-137", (java.lang.Object) hikariConfig29);
        hikariConfig0.addDataSourceProperty("HikariPool-2632", (java.lang.Object) hikariConfig16);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean41 = hikariConfig40.isJdbc4ConnectionTest();
        long long42 = hikariConfig40.getConnectionTimeout();
        hikariConfig40.setJdbcUrl("");
        boolean boolean45 = hikariConfig40.isRegisterMbeans();
        hikariConfig40.setIsolateInternalQueries(false);
        hikariConfig40.setAcquireRetries((int) '4');
        java.util.Properties properties50 = hikariConfig40.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties50);
        java.lang.String str52 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-9205");
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isInitializationFailFast();
        boolean boolean8 = hikariConfig6.isReadOnly();
        javax.sql.DataSource dataSource9 = hikariConfig6.getDataSource();
        int int10 = hikariConfig6.getAcquireIncrement();
        hikariConfig6.setRegisterMbeans(true);
        hikariConfig6.setCatalog("HikariPool-575");
        boolean boolean15 = hikariConfig6.isJdbc4ConnectionTest();
        java.util.Properties properties16 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig0.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig19.setTransactionIsolation("HikariPool-2606");
        hikariConfig19.setPoolName("HikariPool-17471");
        java.util.Properties properties24 = hikariConfig19.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean6 = hikariConfig5.isJdbc4ConnectionTest();
        long long7 = hikariConfig5.getConnectionTimeout();
        hikariConfig5.setJdbcUrl("");
        boolean boolean10 = hikariConfig5.isInitializationFailFast();
        boolean boolean11 = hikariConfig5.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig5.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        int int16 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setConnectionCustomizerClassName("");
        hikariConfig13.setUseInstrumentation(true);
        java.lang.String str21 = hikariConfig13.getJdbcUrl();
        long long22 = hikariConfig13.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig5.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        int int26 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
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
        hikariConfig0.setInitializationFailFast(true);
        int int31 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-19276");
        hikariConfig0.setIsolateInternalQueries(true);
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-65599" + "'", str28, "HikariPool-65599");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-8129");
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
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
        hikariConfig1.setUseInstrumentation(false);
        int int20 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
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
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        long long20 = hikariConfig18.getMaxLifetime();
        java.lang.String str21 = hikariConfig18.getConnectionCustomizerClassName();
        int int22 = hikariConfig18.getMinimumPoolSize();
        java.util.Properties properties23 = hikariConfig18.getDataSourceProperties();
        int int24 = hikariConfig18.getMaximumPoolSize();
        boolean boolean25 = hikariConfig18.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-12060", (java.lang.Object) hikariConfig18);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig18.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-10785");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
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
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        int int18 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
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
        hikariConfig0.setMinimumPoolSize(3);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getDataSourceClassName();
        boolean boolean17 = hikariConfig15.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        int int11 = hikariConfig0.getMinimumPoolSize();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireRetryDelay(1800000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        long long16 = hikariConfig14.getConnectionTimeout();
        hikariConfig14.setJdbcUrl("");
        java.lang.String str19 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig14.getDataSourceProperties();
        hikariConfig14.setJdbc4ConnectionTest(false);
        hikariConfig14.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass25 = hikariConfig14.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-2434", (java.lang.Object) wildcardClass25);
        int int27 = hikariConfig0.getTransactionIsolation();
        int int28 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        hikariConfig0.setMaxLifetime(0L);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireIncrement(97);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(3);
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setDataSourceClassName("HikariPool-42622");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65620" + "'", str6, "HikariPool-65620");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-370");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
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
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIdleTimeout(0L);
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig0.setJdbcUrl("HikariPool-7833");
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setIdleTimeout((long) (-1));
        hikariConfig8.setMaxLifetime((-1L));
        java.lang.String str16 = hikariConfig8.getPoolName();
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.setConnectionCustomizerClassName("HikariPool-4549");
        hikariConfig0.addDataSourceProperty("HikariPool-7783", (java.lang.Object) "HikariPool-4549");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-65625" + "'", str16, "HikariPool-65625");
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
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
        hikariConfig0.setMaxLifetime((long) 'a');
        long long16 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-7932");
        int int19 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
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
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(1800000L);
        hikariConfig0.setCatalog("HikariPool-6133");
        hikariConfig0.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65628" + "'", str14, "HikariPool-65628");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        int int5 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-602");
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement(3);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
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
        hikariConfig0.setMaximumPoolSize(100);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
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
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-65632" + "'", str32, "HikariPool-65632");
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-1601");
        hikariConfig0.setMaxLifetime((long) (short) -1);
        boolean boolean13 = hikariConfig0.isReadOnly();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17290");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.lang.String str12 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.setReadOnly(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setJdbcUrl("HikariPool-573");
        int int23 = hikariConfig14.getAcquireRetries();
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-4941");
        hikariConfig0.addDataSourceProperty("HikariPool-2298", (java.lang.Object) hikariConfig14);
        java.lang.String str28 = hikariConfig0.getPoolName();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        long long31 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65649" + "'", str12, "HikariPool-65649");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-65649" + "'", str28, "HikariPool-65649");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test17291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17291");
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
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        long long11 = hikariConfig0.getConnectionTimeout();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("HikariPool-1707");
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        int int18 = hikariConfig16.getMinimumPoolSize();
        hikariConfig16.setTransactionIsolation("");
        boolean boolean21 = hikariConfig16.isRegisterMbeans();
        int int22 = hikariConfig16.getAcquireIncrement();
        boolean boolean23 = hikariConfig16.isAutoCommit();
        hikariConfig16.setCatalog("HikariPool-575");
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean28 = hikariConfig27.isJdbc4ConnectionTest();
        hikariConfig27.setReadOnly(false);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig27.setDataSource(dataSource31);
        long long33 = hikariConfig27.getLeakDetectionThreshold();
        hikariConfig27.setAcquireRetries(60);
        hikariConfig27.setInitializationFailFast(true);
        long long38 = hikariConfig27.getConnectionTimeout();
        java.lang.String str39 = hikariConfig27.getConnectionInitSql();
        hikariConfig16.addDataSourceProperty("HikariPool-2990", (java.lang.Object) hikariConfig27);
        java.util.Properties properties41 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-20787", (java.lang.Object) properties41);
        long long43 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
    }

    @Test
    public void test17292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17292");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setAutoCommit(false);
        hikariConfig17.setJdbcUrl("HikariPool-211");
        int int26 = hikariConfig17.getMinimumPoolSize();
        hikariConfig17.setDataSourceClassName("HikariPool-697");
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig17);
        boolean boolean31 = hikariConfig17.isReadOnly();
        int int32 = hikariConfig17.getTransactionIsolation();
        int int33 = hikariConfig17.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test17293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17293");
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
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.lang.String str14 = hikariConfig0.getPoolName();
        boolean boolean15 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        hikariConfig0.setPoolName("HikariPool-16639");
        hikariConfig0.setCatalog("HikariPool-16995");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65656" + "'", str13, "HikariPool-65656");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65656" + "'", str14, "HikariPool-65656");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        boolean boolean4 = hikariConfig0.isIsolateInternalQueries();
        long long5 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1865");
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetryDelay(97L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17295");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test17296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17296");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13026");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13026 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17297");
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
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str16 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setConnectionTestQuery("HikariPool-5707");
        boolean boolean21 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test17298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17298");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-18019");
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test17299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17299");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test17300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17300");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig0.getConnectionTestQuery();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTimeout((long) 100);
        hikariConfig0.setConnectionTestQuery("HikariPool-46117");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test17301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17301");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17302");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.getMaxLifetime();
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setAutoCommit(false);
        javax.sql.DataSource dataSource17 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-1063");
        boolean boolean20 = hikariConfig10.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-1301", (java.lang.Object) boolean20);
        hikariConfig0.setAcquireIncrement(100);
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        boolean boolean25 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17303");
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
        int int21 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setCatalog("HikariPool-8474");
        javax.sql.DataSource dataSource27 = null;
        hikariConfig0.setDataSource(dataSource27);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        java.util.Properties properties31 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test17304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17304");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(false);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17305");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) '4');
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test17306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17306");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        int int14 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test17307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setAcquireRetryDelay(750L);
        java.lang.String str12 = hikariConfig0.getPoolName();
        int int13 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        long long16 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65678" + "'", str12, "HikariPool-65678");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test17309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17309");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        long long11 = hikariConfig0.getConnectionTimeout();
        java.lang.String str12 = hikariConfig0.getPoolName();
        boolean boolean13 = hikariConfig0.isReadOnly();
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65679" + "'", str12, "HikariPool-65679");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test17310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17310");
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
        hikariConfig0.setMinimumPoolSize(3);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionInitSql("HikariPool-726");
        int int17 = hikariConfig0.getMinimumPoolSize();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17311");
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
        boolean boolean16 = hikariConfig12.isAutoCommit();
        hikariConfig12.setJdbcUrl("HikariPool-13651");
        javax.sql.DataSource dataSource19 = null;
        hikariConfig12.setDataSource(dataSource19);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig12.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17312");
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
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        boolean boolean25 = hikariConfig23.isReadOnly();
        int int26 = hikariConfig23.getAcquireIncrement();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        java.lang.String str29 = hikariConfig23.getCatalog();
        long long30 = hikariConfig23.getAcquireRetryDelay();
        int int31 = hikariConfig23.getMinimumPoolSize();
        hikariConfig23.setIsolateInternalQueries(true);
        hikariConfig23.setRegisterMbeans(true);
        long long36 = hikariConfig23.getMaxLifetime();
        int int37 = hikariConfig23.getAcquireIncrement();
        long long38 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setLeakDetectionThreshold(5000L);
        hikariConfig0.addDataSourceProperty("HikariPool-5146", (java.lang.Object) hikariConfig23);
        hikariConfig23.setPoolName("HikariPool-29063");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65684" + "'", str14, "HikariPool-65684");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
    }

    @Test
    public void test17313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17313");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        int int8 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getIdleTimeout();
        long long11 = hikariConfig0.getIdleTimeout();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17314");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-903");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setConnectionInitSql("hi!");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig12.isReadOnly();
        hikariConfig12.setAcquireRetryDelay((long) (short) 1);
        hikariConfig12.setMinimumPoolSize(10);
        hikariConfig12.setLeakDetectionThreshold((long) 100);
        java.lang.String str25 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setUseInstrumentation(true);
        java.util.Properties properties28 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig30.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test17315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17315");
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
        long long50 = hikariConfig15.getAcquireRetryDelay();
        boolean boolean51 = hikariConfig15.isInitializationFailFast();
        java.lang.String str52 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setAcquireIncrement((int) ' ');
        hikariConfig0.addDataSourceProperty("HikariPool-16564", (java.lang.Object) hikariConfig15);
        hikariConfig15.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 750L + "'", long50 == 750L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test17316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17316");
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
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAutoCommit(true);
        int int22 = hikariConfig0.getMaximumPoolSize();
        long long23 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test17317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17317");
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
        hikariConfig8.setMinimumPoolSize((int) (short) 100);
        boolean boolean36 = hikariConfig8.isRegisterMbeans();
        java.lang.Class<?> wildcardClass37 = hikariConfig8.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test17318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17318");
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
        java.lang.String str12 = hikariConfig9.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str15 = hikariConfig14.getConnectionInitSql();
        long long16 = hikariConfig14.getMaxLifetime();
        java.lang.String str17 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setIdleTimeout((long) (-1));
        hikariConfig14.setMaxLifetime((-1L));
        hikariConfig14.setCatalog("HikariPool-1229");
        hikariConfig9.addDataSourceProperty("HikariPool-960", (java.lang.Object) hikariConfig14);
        java.util.Properties properties25 = hikariConfig14.getDataSourceProperties();
        long long26 = hikariConfig14.getMaxLifetime();
        boolean boolean27 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.setMinimumPoolSize(1);
        hikariConfig14.setConnectionTestQuery("HikariPool-48758");
        int int32 = hikariConfig14.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test17319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17319");
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
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setMaximumPoolSize(100);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65709" + "'", str10, "HikariPool-65709");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17320");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setAcquireIncrement(3);
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65713" + "'", str13, "HikariPool-65713");
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test17321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17321");
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
        boolean boolean17 = hikariConfig0.isAutoCommit();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        int int22 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.setAutoCommit(true);
        int int25 = hikariConfig20.getMaximumPoolSize();
        java.lang.String str26 = hikariConfig20.getJdbcUrl();
        hikariConfig0.addDataSourceProperty("HikariPool-8698", (java.lang.Object) hikariConfig20);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1104" + "'", str12, "HikariPool-1104");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test17322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17322");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(false);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.lang.String str12 = hikariConfig0.getPoolName();
        int int13 = hikariConfig0.getAcquireIncrement();
        java.lang.Class<?> wildcardClass14 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65716" + "'", str12, "HikariPool-65716");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17323");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        long long5 = hikariConfig0.getIdleTimeout();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-3016");
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-55322");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-55322' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17324");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetries((int) ' ');
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-46501");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-65719" + "'", str11, "HikariPool-65719");
    }

    @Test
    public void test17325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17325");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-3746");
        hikariConfig0.validate();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getMaxLifetime();
        java.lang.String str15 = hikariConfig12.getConnectionCustomizerClassName();
        int int16 = hikariConfig12.getMaximumPoolSize();
        int int17 = hikariConfig12.getMaximumPoolSize();
        long long18 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setAcquireIncrement((int) (byte) 100);
        hikariConfig12.setAcquireRetryDelay(600000L);
        java.lang.String str23 = hikariConfig12.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isJdbc4ConnectionTest();
        long long26 = hikariConfig24.getConnectionTimeout();
        hikariConfig24.setJdbcUrl("");
        boolean boolean29 = hikariConfig24.isRegisterMbeans();
        hikariConfig24.setIsolateInternalQueries(false);
        hikariConfig24.setAcquireRetries((int) '4');
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig37.setDriverClassName("HikariPool-31258");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-31258' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test17326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17326");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        hikariConfig4.setJdbc4ConnectionTest(true);
        hikariConfig4.setPoolName("HikariPool-52631");
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test17327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17327");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout(600000L);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17328");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        hikariConfig0.setReadOnly(true);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17329");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1324");
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int13 = hikariConfig0.getAcquireRetries();
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-1324" + "'", str14, "HikariPool-1324");
    }

    @Test
    public void test17330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setRegisterMbeans(true);
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setReadOnly(false);
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17331");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        long long20 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setIsolateInternalQueries(true);
        hikariConfig13.setAutoCommit(false);
        java.lang.String str25 = hikariConfig13.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isJdbc4ConnectionTest();
        hikariConfig26.setReadOnly(false);
        hikariConfig26.setDataSourceClassName("");
        java.lang.String str32 = hikariConfig26.getCatalog();
        hikariConfig26.setAutoCommit(false);
        long long35 = hikariConfig26.getMaxLifetime();
        java.util.Properties properties36 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig13.setDataSourceProperties(properties36);
        hikariConfig0.setDataSourceProperties(properties36);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test17332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17332");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14643");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14643 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17333");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65745" + "'", str12, "HikariPool-65745");
    }

    @Test
    public void test17334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17334");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setTransactionIsolation("");
        long long14 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test17335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17335");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("HikariPool-6131");
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test17336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17336");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getMaxLifetime();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17337");
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
        hikariConfig0.setDataSourceClassName("HikariPool-23250");
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-65749" + "'", str28, "HikariPool-65749");
    }

    @Test
    public void test17338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17338");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(3L);
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17339");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-28207");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-28207 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17340");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17341");
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
        long long19 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-27187");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17342");
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
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-46401");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-46401' could not be loaded");
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
    public void test17343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17343");
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
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        long long24 = hikariConfig22.getConnectionTimeout();
        hikariConfig22.setJdbcUrl("");
        java.lang.String str27 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig19.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str36 = hikariConfig35.getPoolName();
        hikariConfig35.setJdbcUrl("HikariPool-32229");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-65778" + "'", str36, "HikariPool-65778");
    }

    @Test
    public void test17344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17344");
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
        hikariConfig0.setReadOnly(false);
        boolean boolean42 = hikariConfig0.isJdbc4ConnectionTest();
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-65779" + "'", str28, "HikariPool-65779");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test17345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17345");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(false);
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireRetryDelay(600000L);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        hikariConfig18.setConnectionInitSql("hi!");
        java.lang.String str23 = hikariConfig18.getConnectionCustomizerClassName();
        boolean boolean24 = hikariConfig18.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        int int27 = hikariConfig26.getAcquireRetries();
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig26.setAutoCommit(true);
        hikariConfig26.setConnectionTestQuery("HikariPool-137");
        long long36 = hikariConfig26.getIdleTimeout();
        int int37 = hikariConfig26.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        boolean boolean40 = hikariConfig38.isReadOnly();
        int int41 = hikariConfig38.getAcquireIncrement();
        hikariConfig38.setConnectionTestQuery("hi!");
        hikariConfig38.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig38.setAutoCommit(true);
        java.util.Properties properties48 = hikariConfig38.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties48);
        java.lang.String str50 = hikariConfig26.getConnectionCustomizerClassName();
        hikariConfig18.addDataSourceProperty("HikariPool-370", (java.lang.Object) hikariConfig26);
        hikariConfig26.setMinimumPoolSize((int) (short) 100);
        boolean boolean54 = hikariConfig26.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig55.setReadOnly(true);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        int int59 = hikariConfig58.getAcquireRetries();
        hikariConfig58.setConnectionInitSql("");
        hikariConfig58.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties64 = hikariConfig58.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig55.setDataSourceProperties(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig26.setDataSourceProperties(properties64);
        hikariConfig0.setDataSourceProperties(properties64);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 600000L + "'", long36 == 600000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test17346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17346");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetryDelay(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setAcquireRetryDelay(0L);
        java.util.Properties properties14 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig0.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int20 = hikariConfig19.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test17347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17347");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isInitializationFailFast();
        boolean boolean8 = hikariConfig6.isReadOnly();
        javax.sql.DataSource dataSource9 = hikariConfig6.getDataSource();
        int int10 = hikariConfig6.getAcquireIncrement();
        hikariConfig6.setRegisterMbeans(true);
        hikariConfig6.setCatalog("HikariPool-575");
        boolean boolean15 = hikariConfig6.isJdbc4ConnectionTest();
        java.util.Properties properties16 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig0.setDataSourceProperties(properties16);
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isJdbc4ConnectionTest();
        long long26 = hikariConfig24.getConnectionTimeout();
        hikariConfig24.setJdbcUrl("");
        java.lang.String str29 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig24.getDataSourceProperties();
        hikariConfig24.setJdbc4ConnectionTest(false);
        java.lang.String str33 = hikariConfig24.getDataSourceClassName();
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties34);
        hikariConfig0.setPoolName("HikariPool-64527");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test17348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17348");
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
        long long16 = hikariConfig9.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test17349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test17350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17350");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionTimeout(750L);
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17351");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setIdleTimeout((long) (short) 1);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-65809" + "'", str10, "HikariPool-65809");
    }

    @Test
    public void test17352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17352");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test17353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17353");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        int int11 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setConnectionInitSql("");
        hikariConfig10.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig0.setDataSourceProperties(properties16);
        long long20 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65811" + "'", str6, "HikariPool-65811");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test17354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17354");
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
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17355");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        int int11 = hikariConfig0.getAcquireIncrement();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setPoolName("HikariPool-28720");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17356");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setDataSourceClassName("HikariPool-7401");
        hikariConfig0.setDataSourceClassName("HikariPool-21617");
        long long11 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test17357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17357");
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
        hikariConfig0.setMaxLifetime((long) (byte) -1);
        int int15 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test17358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17358");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-697");
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        java.lang.String str13 = hikariConfig0.getPoolName();
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65821" + "'", str13, "HikariPool-65821");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17359");
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
        hikariConfig0.setConnectionInitSql("HikariPool-26802");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17360");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setCatalog("HikariPool-7989");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.setTransactionIsolation("HikariPool-7198");
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-65825" + "'", str15, "HikariPool-65825");
    }

    @Test
    public void test17361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17361");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        int int11 = hikariConfig0.getAcquireIncrement();
        java.lang.String str12 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65826" + "'", str12, "HikariPool-65826");
    }

    @Test
    public void test17362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17362");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17363");
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
        int int13 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test17364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17364");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaximumPoolSize((int) '4');
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17365");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-7163");
        hikariConfig1.setPoolName("HikariPool-23362");
        long long23 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
    }

    @Test
    public void test17366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17366");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getMaxLifetime();
        int int8 = hikariConfig0.getMinimumPoolSize();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMinimumPoolSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17367");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTimeout(100L);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setCatalog("HikariPool-2845");
        hikariConfig0.setCatalog("HikariPool-1631");
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig0.setTransactionIsolation("HikariPool-5333");
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionInitSql("HikariPool-25694");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17369");
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
        int int17 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 52);
        boolean boolean20 = hikariConfig0.isReadOnly();
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test17370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17370");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        hikariConfig0.setIdleTimeout((long) 1);
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test17371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17371");
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
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setConnectionInitSql("HikariPool-20099");
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test17372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17372");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isJdbc4ConnectionTest();
        long long25 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setJdbcUrl("");
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties29 = hikariConfig23.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig0.addDataSourceProperty("HikariPool-2683", (java.lang.Object) hikariConfig31);
        hikariConfig31.setJdbc4ConnectionTest(true);
        java.lang.String str35 = hikariConfig31.getJdbcUrl();
        hikariConfig31.setIdleTimeout((long) '4');
        boolean boolean38 = hikariConfig31.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test17373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17373");
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
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1042");
        hikariConfig0.setDataSourceClassName("HikariPool-3419");
        long long21 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        hikariConfig0.setAcquireIncrement((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
    }

    @Test
    public void test17374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17374");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17375");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setJdbcUrl("HikariPool-2812");
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17376");
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
        hikariConfig19.setMaximumPoolSize(10);
        java.lang.String str23 = hikariConfig19.getPoolName();
        java.lang.String str24 = hikariConfig19.getConnectionCustomizerClassName();
        hikariConfig19.setIdleTimeout(52L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-65858" + "'", str23, "HikariPool-65858");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1324");
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17378");
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
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        int int17 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-36467");
        java.lang.String str23 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17379");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setTransactionIsolation("HikariPool-7895");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setLeakDetectionThreshold(750L);
        int int18 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test17380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17380");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setIdleTimeout(1800000L);
        int int9 = hikariConfig0.getAcquireIncrement();
        long long10 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2147483647L + "'", long10 == 2147483647L);
    }

    @Test
    public void test17381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17381");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.Class<?> wildcardClass17 = hikariConfig16.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17382");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test17383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17383");
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
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.getMaxLifetime();
        java.lang.String str16 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65872" + "'", str12, "HikariPool-65872");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-65872" + "'", str16, "HikariPool-65872");
    }

    @Test
    public void test17384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17384");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setConnectionInitSql("hi!");
        java.lang.String str12 = hikariConfig7.getConnectionCustomizerClassName();
        hikariConfig7.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isJdbc4ConnectionTest();
        long long17 = hikariConfig15.getConnectionTimeout();
        hikariConfig15.setJdbcUrl("");
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig7.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig0.setDataSourceProperties(properties21);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test17385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17385");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str16 = hikariConfig15.getCatalog();
        long long17 = hikariConfig15.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        int int19 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setConnectionInitSql("");
        hikariConfig18.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig18.setAutoCommit(true);
        hikariConfig18.setConnectionTestQuery("HikariPool-137");
        long long28 = hikariConfig18.getIdleTimeout();
        int int29 = hikariConfig18.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        boolean boolean32 = hikariConfig30.isReadOnly();
        int int33 = hikariConfig30.getAcquireIncrement();
        hikariConfig30.setConnectionTestQuery("hi!");
        hikariConfig30.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig30.setAutoCommit(true);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties40);
        hikariConfig15.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig43.setAcquireRetries((int) (short) 1);
        hikariConfig0.addDataSourceProperty("HikariPool-31039", (java.lang.Object) hikariConfig43);
        hikariConfig0.setConnectionInitSql("HikariPool-29499");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test17386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17386");
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
        long long15 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17387");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMaxLifetime((long) (byte) -1);
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        long long15 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test17388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17388");
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
        java.lang.String str20 = hikariConfig0.getPoolName();
        hikariConfig0.setDataSourceClassName("HikariPool-5130");
        java.lang.String str23 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str24 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-65891" + "'", str20, "HikariPool-65891");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17389");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        int int8 = hikariConfig0.getMinimumPoolSize();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaxLifetime(32L);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-46957");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-46957' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17390");
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
        long long15 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-65893" + "'", str8, "HikariPool-65893");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test17391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17391");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        long long11 = hikariConfig0.getConnectionTimeout();
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.setIdleTimeout(60L);
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-65895" + "'", str12, "HikariPool-65895");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test17392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17393");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-65897" + "'", str5, "HikariPool-65897");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test17394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17394");
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
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setInitializationFailFast(true);
        long long32 = hikariConfig0.getConnectionTimeout();
        int int33 = hikariConfig0.getMaximumPoolSize();
        int int34 = hikariConfig0.getAcquireRetries();
        int int35 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test17395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17396");
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
        int int15 = hikariConfig9.getMinimumPoolSize();
        int int16 = hikariConfig9.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test17397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17397");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test17398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17398");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-211");
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig0.isReadOnly();
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setConnectionInitSql("");
        java.lang.String str16 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setLeakDetectionThreshold((long) (short) 1);
        long long19 = hikariConfig12.getMaxLifetime();
        hikariConfig12.setConnectionInitSql("HikariPool-21921");
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        hikariConfig22.setReadOnly(false);
        hikariConfig22.setMaximumPoolSize((int) ' ');
        boolean boolean28 = hikariConfig22.isReadOnly();
        hikariConfig22.setReadOnly(false);
        boolean boolean31 = hikariConfig22.isReadOnly();
        hikariConfig22.setConnectionTestQuery("HikariPool-8129");
        java.util.Properties properties34 = hikariConfig22.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig0.setDataSourceProperties(properties34);
        boolean boolean38 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test17399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17399");
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
        java.lang.String str14 = hikariConfig0.getPoolName();
        int int15 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65915" + "'", str14, "HikariPool-65915");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test17400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17400");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setCatalog("HikariPool-250");
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.setIdleTimeout(52L);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test17401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17401");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-15091");
        int int11 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test17402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17402");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setIdleTimeout((long) (short) 1);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-14140");
        long long15 = hikariConfig0.getIdleTimeout();
        boolean boolean16 = hikariConfig0.isAutoCommit();
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17403");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbcUrl("HikariPool-26706");
        hikariConfig0.setPoolName("HikariPool-49308");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test17404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17404");
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
        javax.sql.DataSource dataSource18 = null;
        hikariConfig9.setDataSource(dataSource18);
        int int20 = hikariConfig9.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test17405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17405");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        int int15 = hikariConfig0.getTransactionIsolation();
        java.lang.String str16 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-65924" + "'", str16, "HikariPool-65924");
    }

    @Test
    public void test17406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17406");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        int int11 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        boolean boolean13 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17407");
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
        hikariConfig0.setPoolName("HikariPool-7347");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-31955");
        int int22 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8474");
        hikariConfig0.setConnectionTestQuery("HikariPool-36814");
        long long27 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-65926" + "'", str14, "HikariPool-65926");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test17408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17408");
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
        long long31 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-58567");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2147483647L + "'", long31 == 2147483647L);
    }

    @Test
    public void test17409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17409");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setRegisterMbeans(true);
        int int11 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-2416");
        hikariConfig0.setMinimumPoolSize(0);
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17410");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIdleTimeout(750L);
        java.lang.String str13 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-65939" + "'", str6, "HikariPool-65939");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-65939" + "'", str13, "HikariPool-65939");
    }

    @Test
    public void test17411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17411");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        int int9 = hikariConfig0.getAcquireRetries();
        int int10 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17412");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setMaxLifetime((long) 52);
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test17413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17413");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig14.setDataSource(dataSource15);
        long long17 = hikariConfig14.getMaxLifetime();
        java.lang.String str18 = hikariConfig14.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test17414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17414");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setPoolName("HikariPool-26320");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test17415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17415");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetryDelay((long) '#');
        hikariConfig0.setPoolName("HikariPool-2646");
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-31680");
        int int19 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test17416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17416");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("HikariPool-52914");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17417");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setMaxLifetime((long) 1);
        java.lang.String str17 = hikariConfig9.getJdbcUrl();
        hikariConfig9.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig9.setDataSource(dataSource20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        long long24 = hikariConfig22.getConnectionTimeout();
        hikariConfig22.setJdbcUrl("");
        java.lang.String str27 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig22.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties28);
        hikariConfig7.setDataSourceProperties(properties28);
        hikariConfig7.setAutoCommit(true);
        hikariConfig7.setJdbcUrl("HikariPool-10558");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-10558");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test17418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17418");
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
        hikariConfig1.setMaximumPoolSize(52);
        java.lang.String str25 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test17419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setPoolName("HikariPool-4289");
        int int9 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setJdbcUrl("HikariPool-16140");
        java.lang.String str12 = hikariConfig5.getPoolName();
        javax.sql.DataSource dataSource13 = hikariConfig5.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        int int18 = hikariConfig15.getAcquireIncrement();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        java.lang.String str21 = hikariConfig15.getCatalog();
        long long22 = hikariConfig15.getAcquireRetryDelay();
        int int23 = hikariConfig15.getMaximumPoolSize();
        boolean boolean24 = hikariConfig15.isInitializationFailFast();
        java.lang.String str25 = hikariConfig15.getConnectionTestQuery();
        hikariConfig5.addDataSourceProperty("HikariPool-55704", (java.lang.Object) hikariConfig15);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-4289" + "'", str12, "HikariPool-4289");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test17420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17420");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        int int7 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17421");
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
        boolean boolean32 = hikariConfig16.isReadOnly();
        long long33 = hikariConfig16.getLeakDetectionThreshold();
        int int34 = hikariConfig16.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test17422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17422");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        int int16 = hikariConfig0.getTransactionIsolation();
        boolean boolean17 = hikariConfig0.isRegisterMbeans();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaxLifetime((long) 60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
    }

    @Test
    public void test17423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17423");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-211");
        hikariConfig0.setMinimumPoolSize(3);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setDataSourceClassName("HikariPool-2646");
        hikariConfig0.setMaximumPoolSize(97);
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17424");
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
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setDataSourceClassName("HikariPool-52159");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17425");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("HikariPool-951");
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test17426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17426");
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
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-3150");
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test17427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17427");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        long long13 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test17428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17428");
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
        hikariConfig7.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test17429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17429");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("HikariPool-5978");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setIdleTimeout((-1L));
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17430");
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
        hikariConfig0.setIdleTimeout((long) '4');
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test17431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17431");
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
        hikariConfig1.setAutoCommit(false);
        boolean boolean17 = hikariConfig1.isReadOnly();
        int int18 = hikariConfig1.getMaximumPoolSize();
        int int19 = hikariConfig1.getAcquireRetries();
        int int20 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource23 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test17432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17432");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.setConnectionTimeout(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17433");
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
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.setConnectionInitSql("HikariPool-26923");
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        javax.sql.DataSource dataSource30 = null;
        hikariConfig28.setDataSource(dataSource30);
        boolean boolean32 = hikariConfig28.isJdbc4ConnectionTest();
        hikariConfig28.setAutoCommit(false);
        javax.sql.DataSource dataSource35 = hikariConfig28.getDataSource();
        long long36 = hikariConfig28.getMaxLifetime();
        hikariConfig28.setAcquireRetries(3);
        hikariConfig28.setAcquireRetries((int) (byte) 1);
        hikariConfig28.setMaxLifetime((long) (byte) 100);
        java.util.Properties properties43 = hikariConfig28.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test17434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17434");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26933");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26933 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17435");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isJdbc4ConnectionTest();
        long long25 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setJdbcUrl("");
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties29 = hikariConfig23.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig0.addDataSourceProperty("HikariPool-2683", (java.lang.Object) hikariConfig31);
        boolean boolean33 = hikariConfig31.isJdbc4ConnectionTest();
        java.lang.String str34 = hikariConfig31.getPoolName();
        long long35 = hikariConfig31.getConnectionTimeout();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-65992" + "'", str34, "HikariPool-65992");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
    }

    @Test
    public void test17436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17436");
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
        javax.sql.DataSource dataSource15 = hikariConfig9.getDataSource();
        java.lang.String str16 = hikariConfig9.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig9.getPoolName();
        int int18 = hikariConfig9.getMaximumPoolSize();
        hikariConfig9.setAcquireIncrement(60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-65996" + "'", str17, "HikariPool-65996");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test17437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17437");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        int int7 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test17438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17438");
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
        boolean boolean13 = hikariConfig9.isIsolateInternalQueries();
        int int14 = hikariConfig9.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test17439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17439");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setConnectionTestQuery("HikariPool-514");
        hikariConfig0.setMaxLifetime((long) 52);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17440");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        hikariConfig0.setMaxLifetime((long) 97);
        hikariConfig0.setPoolName("");
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17441");
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
        boolean boolean11 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig9.setIdleTimeout((long) (byte) -1);
        java.util.Properties properties16 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test17442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.setPoolName("HikariPool-9772");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17443");
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
        hikariConfig0.setMaxLifetime((-1L));
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-66013" + "'", str14, "HikariPool-66013");
    }

    @Test
    public void test17444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17444");
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
        java.lang.String str22 = hikariConfig0.getConnectionInitSql();
        java.lang.Class<?> wildcardClass23 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test17445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17445");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        long long8 = hikariConfig0.getConnectionTimeout();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17446");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-18019");
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetries((int) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getMaxLifetime();
        java.lang.String str20 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setIdleTimeout((long) (-1));
        java.lang.String str23 = hikariConfig17.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        int int25 = hikariConfig24.getAcquireRetries();
        hikariConfig24.setConnectionInitSql("");
        hikariConfig24.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str30 = hikariConfig24.getDataSourceClassName();
        boolean boolean31 = hikariConfig24.isIsolateInternalQueries();
        boolean boolean32 = hikariConfig24.isReadOnly();
        boolean boolean33 = hikariConfig24.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean35 = hikariConfig34.isJdbc4ConnectionTest();
        long long36 = hikariConfig34.getConnectionTimeout();
        hikariConfig34.setJdbcUrl("");
        java.lang.String str39 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties40 = hikariConfig34.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties40);
        hikariConfig17.setDataSourceProperties(properties40);
        boolean boolean43 = hikariConfig17.isAutoCommit();
        hikariConfig17.setAcquireIncrement(100);
        hikariConfig0.addDataSourceProperty("HikariPool-17441", (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test17447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17447");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAcquireRetryDelay((long) 3);
        hikariConfig0.setJdbcUrl("HikariPool-27433");
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test17448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17448");
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
        int int16 = hikariConfig0.getAcquireIncrement();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test17449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17449");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        int int15 = hikariConfig0.getTransactionIsolation();
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17450");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setMaxLifetime((-1L));
        java.lang.String str8 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2824");
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTimeout((long) 100);
        hikariConfig0.setConnectionInitSql("HikariPool-61336");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-66027" + "'", str8, "HikariPool-66027");
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test17451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17451");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("HikariPool-1062");
        hikariConfig0.setCatalog("HikariPool-5147");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-66028" + "'", str13, "HikariPool-66028");
    }

    @Test
    public void test17452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17452");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setAcquireRetries(1);
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test17453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17453");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        hikariConfig0.setJdbcUrl("HikariPool-15136");
        hikariConfig0.setMaxLifetime((-1L));
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17454");
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
        int int22 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setReadOnly(false);
        hikariConfig24.setJdbcUrl("");
        long long29 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig24.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        boolean boolean36 = hikariConfig34.isReadOnly();
        int int37 = hikariConfig34.getAcquireIncrement();
        hikariConfig34.setConnectionCustomizerClassName("");
        boolean boolean40 = hikariConfig34.isReadOnly();
        long long41 = hikariConfig34.getMaxLifetime();
        long long42 = hikariConfig34.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean44 = hikariConfig43.isJdbc4ConnectionTest();
        long long45 = hikariConfig43.getConnectionTimeout();
        hikariConfig43.setJdbcUrl("");
        java.lang.String str48 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties49 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig34.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig24.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        int int61 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setCatalog("HikariPool-10999");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 750L + "'", long29 == 750L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1800000L + "'", long41 == 1800000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
    }

    @Test
    public void test17455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17455");
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
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        boolean boolean21 = hikariConfig19.isReadOnly();
        int int22 = hikariConfig19.getAcquireIncrement();
        hikariConfig19.setConnectionCustomizerClassName("");
        hikariConfig19.setUseInstrumentation(true);
        int int27 = hikariConfig19.getMaximumPoolSize();
        java.lang.String str28 = hikariConfig19.getConnectionTestQuery();
        java.lang.String str29 = hikariConfig19.getConnectionInitSql();
        int int30 = hikariConfig19.getAcquireRetries();
        boolean boolean31 = hikariConfig19.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-20099", (java.lang.Object) hikariConfig19);
        int int33 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setIdleTimeout(5000L);
        int int36 = hikariConfig0.getAcquireRetries();
        boolean boolean37 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test17456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17456");
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
        int int13 = hikariConfig1.getAcquireRetries();
        long long14 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(3);
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-23179");
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-23179" + "'", str20, "HikariPool-23179");
    }

    @Test
    public void test17457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17457");
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
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        int int26 = hikariConfig25.getAcquireRetries();
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig25.setAutoCommit(true);
        hikariConfig25.setConnectionTestQuery("HikariPool-137");
        long long35 = hikariConfig25.getIdleTimeout();
        java.lang.String str36 = hikariConfig25.getPoolName();
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
        hikariConfig38.setRegisterMbeans(true);
        java.lang.String str51 = hikariConfig38.getConnectionInitSql();
        java.lang.String str52 = hikariConfig38.getJdbcUrl();
        long long53 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.setPoolName("HikariPool-514");
        hikariConfig38.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig58.setConnectionInitSql("");
        hikariConfig58.setConnectionInitSql("hi!");
        java.lang.String str63 = hikariConfig58.getConnectionCustomizerClassName();
        hikariConfig58.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean67 = hikariConfig66.isJdbc4ConnectionTest();
        long long68 = hikariConfig66.getConnectionTimeout();
        hikariConfig66.setJdbcUrl("");
        java.lang.String str71 = hikariConfig66.getConnectionCustomizerClassName();
        java.util.Properties properties72 = hikariConfig66.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig58.setDataSourceProperties(properties72);
        hikariConfig38.setDataSourceProperties(properties72);
        hikariConfig25.setDataSourceProperties(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig0.setDataSourceProperties(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig82.setConnectionInitSql("HikariPool-28135");
        int int85 = hikariConfig82.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 600000L + "'", long35 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-66061" + "'", str36, "HikariPool-66061");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 750L + "'", long53 == 750L);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 5000L + "'", long68 == 5000L);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test17458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17458");
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
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test17459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17459");
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
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17460");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str11 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17461");
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
        hikariConfig0.setTransactionIsolation("HikariPool-5239");
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        hikariConfig0.setLeakDetectionThreshold(1L);
        java.lang.String str23 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-66075" + "'", str16, "HikariPool-66075");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test17462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17462");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.setRegisterMbeans(true);
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-13944");
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17463");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setTransactionIsolation("HikariPool-35296");
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17464");
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
        boolean boolean15 = hikariConfig1.isAutoCommit();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test17465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17465");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        long long24 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setPoolName("hi!");
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setCatalog("HikariPool-960");
        hikariConfig0.addDataSourceProperty("HikariPool-1631", (java.lang.Object) hikariConfig20);
        hikariConfig20.setConnectionCustomizerClassName("HikariPool-2434");
        javax.sql.DataSource dataSource34 = null;
        hikariConfig20.setDataSource(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test17466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17466");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize(60);
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17467");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-211");
        hikariConfig0.setCatalog("hi!");
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("HikariPool-10558");
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test17468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17468");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isReadOnly();
        int int11 = hikariConfig8.getAcquireIncrement();
        hikariConfig8.setConnectionCustomizerClassName("");
        hikariConfig8.setUseInstrumentation(true);
        java.lang.String str16 = hikariConfig8.getJdbcUrl();
        long long17 = hikariConfig8.getConnectionTimeout();
        java.util.Properties properties18 = hikariConfig8.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties18);
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        java.lang.String str21 = hikariConfig0.getConnectionTestQuery();
        boolean boolean22 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAutoCommit(true);
        boolean boolean25 = hikariConfig0.isInitializationFailFast();
        int int26 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test17469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17469");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-902");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        int int19 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setReadOnly(false);
        int int24 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test17470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17470");
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
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17471");
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
        long long26 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setMaxLifetime(32L);
        hikariConfig16.setConnectionTestQuery("HikariPool-25893");
        int int31 = hikariConfig16.getAcquireIncrement();
        java.lang.String str32 = hikariConfig16.getJdbcUrl();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test17472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17472");
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
        int int14 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setLeakDetectionThreshold((long) 52);
        java.lang.String str17 = hikariConfig12.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17473");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int13 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(false);
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17474");
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
        boolean boolean17 = hikariConfig0.isAutoCommit();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        int int22 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.setAutoCommit(true);
        int int25 = hikariConfig20.getMaximumPoolSize();
        java.lang.String str26 = hikariConfig20.getJdbcUrl();
        hikariConfig0.addDataSourceProperty("HikariPool-8698", (java.lang.Object) hikariConfig20);
        boolean boolean28 = hikariConfig20.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1104" + "'", str12, "HikariPool-1104");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17475");
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
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test17476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17476");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean19 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17477");
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
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(true);
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        int int21 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTestQuery("HikariPool-49006");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test17478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17478");
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
        hikariConfig0.setAcquireRetries(0);
        long long23 = hikariConfig0.getIdleTimeout();
        boolean boolean24 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test17479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17479");
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
        hikariConfig0.setAcquireRetries(0);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17480");
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
        int int20 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setMaxLifetime(0L);
        java.util.Properties properties25 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig1.setDataSourceProperties(properties25);
        hikariConfig1.setAcquireRetries(32);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test17481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17481");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        int int13 = hikariConfig0.getMinimumPoolSize();
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test17482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17482");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        long long16 = hikariConfig14.getConnectionTimeout();
        hikariConfig14.setJdbcUrl("");
        java.lang.String str19 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig14.getDataSourceProperties();
        hikariConfig14.setJdbc4ConnectionTest(false);
        hikariConfig14.setIsolateInternalQueries(false);
        java.lang.Class<?> wildcardClass25 = hikariConfig14.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-2434", (java.lang.Object) wildcardClass25);
        int int27 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig0.setTransactionIsolation("HikariPool-16945");
        java.util.Properties properties32 = hikariConfig0.getDataSourceProperties();
        java.lang.String str33 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setDataSourceClassName("HikariPool-31758");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test17483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17483");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getConnectionCustomizerClassName();
        int int12 = hikariConfig8.getMaximumPoolSize();
        int int13 = hikariConfig8.getMaximumPoolSize();
        long long14 = hikariConfig8.getMaxLifetime();
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        hikariConfig8.setAcquireRetryDelay(600000L);
        java.lang.String str19 = hikariConfig8.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setAcquireRetries((int) '4');
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean35 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test17484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17484");
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
        hikariConfig0.setJdbcUrl("HikariPool-903");
        boolean boolean27 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbcUrl("HikariPool-41220");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test17485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17485");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setDataSourceClassName("HikariPool-7895");
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
    public void test17486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17486");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("HikariPool-39925");
        java.lang.Class<?> wildcardClass15 = hikariConfig12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        hikariConfig0.setDataSourceClassName("HikariPool-6000");
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17488");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setJdbcUrl("HikariPool-564");
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17489");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean10 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17490");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        int int10 = hikariConfig0.getMinimumPoolSize();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-41449");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test17491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17491");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-3266");
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setMaximumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17492");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setIdleTimeout((long) 100);
        int int9 = hikariConfig0.getTransactionIsolation();
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("");
        int int13 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17493");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test17494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17494");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getTransactionIsolation();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test17495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17495");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getMaxLifetime();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(60L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test17496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17496");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str7 = hikariConfig0.getCatalog();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay((long) 52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17497");
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
        java.lang.String str17 = hikariConfig0.getCatalog();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-28768");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17498");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setIdleTimeout((long) 52);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-16464");
        long long14 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17499");
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
        java.lang.String str24 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-32857");
        hikariConfig0.setJdbcUrl("HikariPool-5848");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17500");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2073");
        hikariConfig0.setMaxLifetime(10L);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-66146" + "'", str12, "HikariPool-66146");
    }
}
