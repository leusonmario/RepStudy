import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireIncrement(60);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean17 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-41952");
        int int20 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean14 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        int int17 = hikariConfig0.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getMaxLifetime();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setDataSourceClassName("HikariPool-1561");
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setMaximumPoolSize(3);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        java.lang.String str16 = hikariConfig1.getPoolName();
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-70056" + "'", str16, "HikariPool-70056");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-1164");
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig5.setConnectionInitSql("");
        boolean boolean8 = hikariConfig5.isJdbc4ConnectionTest();
        hikariConfig5.setJdbcUrl("hi!");
        boolean boolean11 = hikariConfig5.isJdbc4ConnectionTest();
        long long12 = hikariConfig5.getLeakDetectionThreshold();
        hikariConfig5.setAcquireIncrement(100);
        hikariConfig5.setMaximumPoolSize(0);
        java.lang.String str17 = hikariConfig5.getJdbcUrl();
        boolean boolean18 = hikariConfig5.isReadOnly();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig5);
        int int20 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-16390");
        hikariConfig0.setCatalog("HikariPool-23990");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setJdbcUrl("HikariPool-159");
        hikariConfig1.setDataSourceClassName("HikariPool-130");
        hikariConfig1.setDataSourceClassName("HikariPool-2875");
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-69892");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setIsolateInternalQueries(true);
        int int22 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        int int25 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str28 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig1.setDataSource(dataSource31);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-40976");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-40976 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-761");
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-159");
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-70066" + "'", str6, "HikariPool-70066");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setJdbcUrl("");
        hikariConfig21.setConnectionTestQuery("hi!");
        hikariConfig15.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig21);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setConnectionInitSql("");
        hikariConfig30.setJdbcUrl("");
        hikariConfig30.setConnectionTestQuery("hi!");
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.setTransactionIsolation("");
        javax.sql.DataSource dataSource41 = hikariConfig38.getDataSource();
        long long42 = hikariConfig38.getConnectionTimeout();
        java.lang.String str43 = hikariConfig38.getCatalog();
        hikariConfig38.setInitializationFailFast(false);
        java.util.Properties properties46 = hikariConfig38.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig30.setDataSourceProperties(properties46);
        hikariConfig15.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig0.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties46);
        hikariConfig0.setAcquireRetries((int) (short) 0);
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig57.setConnectionInitSql("");
        hikariConfig57.setJdbcUrl("");
        hikariConfig57.setConnectionTestQuery("hi!");
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig65.setTransactionIsolation("");
        javax.sql.DataSource dataSource68 = hikariConfig65.getDataSource();
        long long69 = hikariConfig65.getConnectionTimeout();
        java.lang.String str70 = hikariConfig65.getCatalog();
        hikariConfig65.setInitializationFailFast(false);
        java.util.Properties properties73 = hikariConfig65.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties73);
        hikariConfig57.setDataSourceProperties(properties73);
        boolean boolean77 = hikariConfig57.isRegisterMbeans();
        hikariConfig57.setConnectionTimeout(1800000L);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig80.setConnectionInitSql("");
        boolean boolean83 = hikariConfig80.isJdbc4ConnectionTest();
        java.lang.String str84 = hikariConfig80.getCatalog();
        java.lang.String str85 = hikariConfig80.getCatalog();
        hikariConfig80.setIsolateInternalQueries(true);
        hikariConfig80.setPoolName("HikariPool-130");
        java.util.Properties properties90 = hikariConfig80.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig91 = new com.zaxxer.hikari.HikariConfig(properties90);
        hikariConfig57.setDataSourceProperties(properties90);
        hikariConfig0.setDataSourceProperties(properties90);
        com.zaxxer.hikari.HikariConfig hikariConfig94 = new com.zaxxer.hikari.HikariConfig(properties90);
        hikariConfig94.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 5000L + "'", long69 == 5000L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(properties90);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-158", (java.lang.Object) (byte) 100);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbcUrl("HikariPool-158");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setReadOnly(false);
        java.lang.String str25 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9308");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9308 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        long long18 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        boolean boolean21 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long16 = hikariConfig0.getAcquireRetryDelay();
        long long17 = hikariConfig0.getConnectionTimeout();
        long long18 = hikariConfig0.getMaxLifetime();
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        long long24 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig7.getCatalog();
        hikariConfig7.setReadOnly(false);
        java.lang.String str14 = hikariConfig7.getConnectionInitSql();
        hikariConfig7.setIsolateInternalQueries(false);
        java.util.Properties properties17 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig19.getCatalog();
        java.lang.String str24 = hikariConfig19.getCatalog();
        hikariConfig19.setPoolName("");
        java.lang.String str27 = hikariConfig19.getConnectionInitSql();
        java.util.Properties properties28 = hikariConfig19.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig31.setTransactionIsolation("HikariPool-658");
        hikariConfig31.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1604");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setUseInstrumentation(true);
        int int9 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig2.setConnectionInitSql("");
        boolean boolean5 = hikariConfig2.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig2.getCatalog();
        java.lang.String str7 = hikariConfig2.getConnectionTestQuery();
        hikariConfig2.setLeakDetectionThreshold((long) '4');
        long long10 = hikariConfig2.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        hikariConfig2.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str30 = hikariConfig29.getConnectionInitSql();
        boolean boolean31 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setMaxLifetime(0L);
        int int34 = hikariConfig29.getAcquireRetries();
        hikariConfig0.addDataSourceProperty("HikariPool-3831", (java.lang.Object) int34);
        hikariConfig0.setDataSourceClassName("HikariPool-38577");
        hikariConfig0.setCatalog("HikariPool-627");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setConnectionInitSql("");
        boolean boolean9 = hikariConfig6.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig6.getCatalog();
        java.util.Properties properties11 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig5.setDataSourceProperties(properties11);
        long long16 = hikariConfig5.getIdleTimeout();
        int int17 = hikariConfig5.getAcquireRetries();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig5.setDataSource(dataSource18);
        hikariConfig5.setJdbc4ConnectionTest(false);
        hikariConfig5.setAcquireRetries(97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setJdbcUrl("");
        hikariConfig20.setConnectionTestQuery("hi!");
        hikariConfig14.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig20);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setConnectionInitSql("");
        hikariConfig29.setJdbcUrl("");
        hikariConfig29.setConnectionTestQuery("hi!");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setTransactionIsolation("");
        javax.sql.DataSource dataSource40 = hikariConfig37.getDataSource();
        long long41 = hikariConfig37.getConnectionTimeout();
        java.lang.String str42 = hikariConfig37.getCatalog();
        hikariConfig37.setInitializationFailFast(false);
        java.util.Properties properties45 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig29.setDataSourceProperties(properties45);
        hikariConfig14.setDataSourceProperties(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig51.setReadOnly(false);
        java.util.Properties properties54 = hikariConfig51.getDataSourceProperties();
        javax.sql.DataSource dataSource55 = null;
        hikariConfig51.setDataSource(dataSource55);
        java.lang.String str57 = hikariConfig51.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-21855", (java.lang.Object) str57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireIncrement(3);
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("HikariPool-24911");
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25703");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25703 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("HikariPool-12593");
        long long11 = hikariConfig0.getIdleTimeout();
        int int12 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIsolateInternalQueries(false);
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-40504");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries(97);
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        java.lang.String str20 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-102");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-159");
        boolean boolean20 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(true);
        long long23 = hikariConfig0.getConnectionTimeout();
        int int24 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireRetryDelay(10L);
        hikariConfig7.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig7.setConnectionTestQuery("HikariPool-2594");
        hikariConfig7.setMaxLifetime(600000L);
        boolean boolean31 = hikariConfig7.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setAcquireRetryDelay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig7.getCatalog();
        hikariConfig7.setReadOnly(false);
        java.lang.String str14 = hikariConfig7.getConnectionInitSql();
        hikariConfig7.setIsolateInternalQueries(false);
        java.util.Properties properties17 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long20 = hikariConfig19.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setConnectionInitSql("");
        boolean boolean25 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str26 = hikariConfig22.getCatalog();
        java.lang.String str27 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.setLeakDetectionThreshold((long) '4');
        long long30 = hikariConfig22.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig31.setConnectionInitSql("");
        boolean boolean34 = hikariConfig31.isJdbc4ConnectionTest();
        java.lang.String str35 = hikariConfig31.getCatalog();
        java.lang.String str36 = hikariConfig31.getConnectionTestQuery();
        hikariConfig31.setLeakDetectionThreshold((long) '4');
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.setAutoCommit(false);
        java.util.Properties properties43 = hikariConfig31.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties43);
        int int45 = hikariConfig22.getMaximumPoolSize();
        boolean boolean46 = hikariConfig22.isInitializationFailFast();
        long long47 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.setAcquireRetryDelay(600000L);
        hikariConfig19.addDataSourceProperty("HikariPool-23678", (java.lang.Object) 600000L);
        java.lang.String str51 = hikariConfig19.getPoolName();
        int int52 = hikariConfig19.getTransactionIsolation();
        java.lang.Class<?> wildcardClass53 = hikariConfig19.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 60 + "'", int45 == 60);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 750L + "'", long47 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "HikariPool-70134" + "'", str51, "HikariPool-70134");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout(750L);
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("HikariPool-102");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setJdbcUrl("HikariPool-13535");
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        int int17 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        long long15 = hikariConfig0.getMaxLifetime();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbcUrl("HikariPool-13535");
        hikariConfig1.addDataSourceProperty("HikariPool-19529", (java.lang.Object) "HikariPool-26963");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMaxLifetime(600000L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setLeakDetectionThreshold((long) '4');
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setAutoCommit(false);
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig25.setAutoCommit(false);
        java.lang.String str28 = hikariConfig25.getDataSourceClassName();
        long long29 = hikariConfig25.getConnectionTimeout();
        hikariConfig25.setDataSourceClassName("HikariPool-51308");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-919");
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setJdbcUrl("");
        hikariConfig13.setConnectionTestQuery("hi!");
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig13.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig0.setDataSourceProperties(properties29);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-52745");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-52745' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        java.lang.String str15 = hikariConfig0.getCatalog();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.getAcquireRetries();
        int int9 = hikariConfig0.getMinimumPoolSize();
        int int10 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setCatalog("HikariPool-3114");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-158", (java.lang.Object) (byte) 100);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbcUrl("HikariPool-158");
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str26 = hikariConfig21.getConnectionInitSql();
        hikariConfig21.setJdbcUrl("");
        hikariConfig21.setReadOnly(true);
        hikariConfig21.setMinimumPoolSize((int) '#');
        boolean boolean33 = hikariConfig21.isRegisterMbeans();
        boolean boolean34 = hikariConfig21.isJdbc4ConnectionTest();
        int int35 = hikariConfig21.getMinimumPoolSize();
        java.lang.String str36 = hikariConfig21.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-2875", (java.lang.Object) hikariConfig21);
        long long38 = hikariConfig1.getConnectionTimeout();
        boolean boolean39 = hikariConfig1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-158");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-102");
        hikariConfig1.setRegisterMbeans(true);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMaxLifetime(10L);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setMinimumPoolSize(0);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        int int12 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setAcquireRetryDelay((long) 0);
        hikariConfig11.setReadOnly(true);
        hikariConfig11.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig11.getJdbcUrl();
        java.lang.String str20 = hikariConfig11.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setConnectionInitSql("");
        boolean boolean25 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str26 = hikariConfig22.getCatalog();
        java.lang.String str27 = hikariConfig22.getConnectionTestQuery();
        hikariConfig22.setLeakDetectionThreshold((long) '4');
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.setAutoCommit(false);
        java.util.Properties properties34 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig22);
        boolean boolean36 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setJdbcUrl("HikariPool-1177");
        hikariConfig7.addDataSourceProperty("HikariPool-9045", (java.lang.Object) hikariConfig11);
        javax.sql.DataSource dataSource40 = hikariConfig7.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setDriverClassName("HikariPool-14200");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-14200' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dataSource40);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        hikariConfig1.setPoolName("HikariPool-44729");
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setJdbcUrl("");
        hikariConfig12.setConnectionTestQuery("hi!");
        long long19 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str22 = hikariConfig12.getConnectionTestQuery();
        boolean boolean23 = hikariConfig12.isAutoCommit();
        boolean boolean24 = hikariConfig12.isReadOnly();
        int int25 = hikariConfig12.getMaximumPoolSize();
        int int26 = hikariConfig12.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-9875", (java.lang.Object) hikariConfig12);
        boolean boolean28 = hikariConfig12.isRegisterMbeans();
        java.lang.String str29 = hikariConfig12.getJdbcUrl();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setConnectionInitSql("");
        boolean boolean9 = hikariConfig6.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig6.getCatalog();
        java.util.Properties properties11 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig5.setDataSourceProperties(properties11);
        long long16 = hikariConfig5.getIdleTimeout();
        int int17 = hikariConfig5.getAcquireRetries();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig5.setDataSource(dataSource18);
        int int20 = hikariConfig5.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setTransactionIsolation("HikariPool-658");
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-5014");
        int int22 = hikariConfig1.getTransactionIsolation();
        boolean boolean23 = hikariConfig1.isReadOnly();
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-59832");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-59832 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45270");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45270 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-58468");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-58468 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties6 = hikariConfig5.getDataSourceProperties();
        int int7 = hikariConfig5.getMinimumPoolSize();
        hikariConfig5.setConnectionInitSql("HikariPool-12198");
        long long10 = hikariConfig5.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str8 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-70203" + "'", str8, "HikariPool-70203");
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setJdbcUrl("hi!");
        boolean boolean15 = hikariConfig10.isReadOnly();
        hikariConfig10.setTransactionIsolation("HikariPool-158");
        hikariConfig10.setUseInstrumentation(false);
        java.util.Properties properties20 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean26 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setCatalog("HikariPool-67011");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireRetryDelay(10L);
        hikariConfig7.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig7.setConnectionTestQuery("HikariPool-2594");
        hikariConfig7.setMaxLifetime(600000L);
        boolean boolean31 = hikariConfig7.isInitializationFailFast();
        int int32 = hikariConfig7.getMinimumPoolSize();
        int int33 = hikariConfig7.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-2639");
        long long13 = hikariConfig1.getConnectionTimeout();
        int int14 = hikariConfig1.getAcquireRetries();
        long long15 = hikariConfig1.getConnectionTimeout();
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setCatalog("HikariPool-57823");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setCatalog("HikariPool-2431");
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig5.setConnectionInitSql("");
        boolean boolean8 = hikariConfig5.isJdbc4ConnectionTest();
        hikariConfig5.setJdbcUrl("hi!");
        boolean boolean11 = hikariConfig5.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig5.getDataSourceClassName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setConnectionInitSql("");
        hikariConfig14.setJdbcUrl("");
        hikariConfig14.setConnectionTestQuery("hi!");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setTransactionIsolation("");
        javax.sql.DataSource dataSource25 = hikariConfig22.getDataSource();
        long long26 = hikariConfig22.getConnectionTimeout();
        java.lang.String str27 = hikariConfig22.getCatalog();
        hikariConfig22.setInitializationFailFast(false);
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig14.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig5.setDataSourceProperties(properties30);
        hikariConfig5.setUseInstrumentation(true);
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig0.addDataSourceProperty("HikariPool-5423", (java.lang.Object) hikariConfig5);
        int int41 = hikariConfig5.getTransactionIsolation();
        javax.sql.DataSource dataSource42 = null;
        hikariConfig5.setDataSource(dataSource42);
        hikariConfig5.setIdleTimeout(600000L);
        hikariConfig5.setConnectionInitSql("HikariPool-7714");
        hikariConfig5.setConnectionTestQuery("HikariPool-62553");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize(32);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-14129");
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setTransactionIsolation("HikariPool-658");
        hikariConfig1.setIdleTimeout((long) 3);
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4454");
        hikariConfig1.setMaxLifetime(5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-70223" + "'", str18, "HikariPool-70223");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        boolean boolean19 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("");
        hikariConfig9.setJdbcUrl("");
        hikariConfig9.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(false);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig32.setAutoCommit(true);
        boolean boolean35 = hikariConfig32.isJdbc4ConnectionTest();
        boolean boolean36 = hikariConfig32.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireIncrement(3);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        hikariConfig10.setCatalog("");
        java.lang.String str15 = hikariConfig10.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isReadOnly();
        java.lang.String str19 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setIsolateInternalQueries(false);
        java.util.Properties properties22 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig10.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties22);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionInitSql("HikariPool-159");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig0.getCatalog();
        long long17 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAcquireIncrement(32);
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireRetries((int) (byte) 100);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-66423");
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setConnectionTimeout((long) 100);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-10327");
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        int int14 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        hikariConfig16.setCatalog("");
        hikariConfig16.setInitializationFailFast(false);
        hikariConfig16.setAutoCommit(true);
        java.lang.String str25 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig0.setDataSourceProperties(properties26);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-46379");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setReadOnly(false);
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-30351");
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        int int17 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setConnectionInitSql("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((-1L));
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setReadOnly(true);
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-102" + "'", str16, "HikariPool-102");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig6.setConnectionTestQuery("");
        java.lang.String str10 = hikariConfig6.getConnectionCustomizerClassName();
        java.lang.String str11 = hikariConfig6.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setMaxLifetime((long) (short) 100);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        hikariConfig0.setAcquireRetries(0);
        long long14 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.lang.String str23 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setLeakDetectionThreshold((long) '4');
        hikariConfig18.setMaxLifetime(5000L);
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties30 = hikariConfig18.getDataSourceProperties();
        java.lang.String str31 = hikariConfig18.getDataSourceClassName();
        boolean boolean32 = hikariConfig18.isInitializationFailFast();
        java.util.Properties properties33 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig0.addDataSourceProperty("HikariPool-8650", (java.lang.Object) hikariConfig34);
        hikariConfig34.setIdleTimeout((long) 1);
        long long38 = hikariConfig34.getMaxLifetime();
        java.lang.String str39 = hikariConfig34.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-70275" + "'", str39, "HikariPool-70275");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setJdbcUrl("hi!");
        boolean boolean18 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig12.getDataSourceClassName();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setJdbcUrl("");
        hikariConfig21.setConnectionTestQuery("hi!");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setTransactionIsolation("");
        javax.sql.DataSource dataSource32 = hikariConfig29.getDataSource();
        long long33 = hikariConfig29.getConnectionTimeout();
        java.lang.String str34 = hikariConfig29.getCatalog();
        hikariConfig29.setInitializationFailFast(false);
        java.util.Properties properties37 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig21.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        hikariConfig0.setIsolateInternalQueries(false);
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 10);
        int int19 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        long long7 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.setJdbcUrl("HikariPool-151");
        java.util.Properties properties20 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getAcquireRetries();
        java.util.Properties properties23 = hikariConfig21.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-382");
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setMaxLifetime((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-40826");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-40826' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setPoolName("HikariPool-919");
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-32778");
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        int int14 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-29855");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-29855 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setRegisterMbeans(true);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetryDelay((long) '4');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1068");
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        long long9 = hikariConfig8.getMaxLifetime();
        int int10 = hikariConfig8.getAcquireIncrement();
        long long11 = hikariConfig8.getIdleTimeout();
        hikariConfig8.setRegisterMbeans(false);
        java.util.Properties properties14 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig19.setLeakDetectionThreshold((long) 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getPoolName();
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-70302" + "'", str6, "HikariPool-70302");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-70302" + "'", str7, "HikariPool-70302");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long16 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-5848");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        int int22 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setJdbcUrl("HikariPool-11876");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setUseInstrumentation(true);
        int int11 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-70307" + "'", str8, "HikariPool-70307");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1561");
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        hikariConfig1.setMaxLifetime(10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setAcquireRetryDelay((long) (short) 100);
        hikariConfig9.setMinimumPoolSize((int) (byte) 100);
        hikariConfig9.setJdbcUrl("hi!");
        java.lang.String str16 = hikariConfig9.getJdbcUrl();
        java.lang.String str17 = hikariConfig9.getDataSourceClassName();
        boolean boolean18 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setPoolName("HikariPool-998");
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig25.setCatalog("HikariPool-49794");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig9.addDataSourceProperty("HikariPool-51801", (java.lang.Object) "HikariPool-4031");
        java.util.Properties properties13 = hikariConfig9.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setCatalog("HikariPool-25812");
        hikariConfig0.setAcquireIncrement((int) ' ');
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setLeakDetectionThreshold((long) 35);
        hikariConfig1.setConnectionInitSql("HikariPool-30901");
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        long long14 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setJdbcUrl("HikariPool-130");
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setJdbcUrl("hi!");
        boolean boolean23 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig17.getDataSourceClassName();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setJdbcUrl("");
        hikariConfig26.setConnectionTestQuery("hi!");
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setTransactionIsolation("");
        javax.sql.DataSource dataSource37 = hikariConfig34.getDataSource();
        long long38 = hikariConfig34.getConnectionTimeout();
        java.lang.String str39 = hikariConfig34.getCatalog();
        hikariConfig34.setInitializationFailFast(false);
        java.util.Properties properties42 = hikariConfig34.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig26.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        hikariConfig9.setDataSourceProperties(properties42);
        hikariConfig0.setDataSourceProperties(properties42);
        hikariConfig0.setAcquireRetryDelay(35L);
        boolean boolean52 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaxLifetime(5000L);
        int int11 = hikariConfig0.getAcquireIncrement();
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-7217");
        hikariConfig1.setAcquireRetryDelay(5000L);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig1.getCatalog();
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries();
        int int18 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-1637");
        hikariConfig1.setAcquireIncrement(60);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig1.setDataSource(dataSource25);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long16 = hikariConfig0.getAcquireRetryDelay();
        long long17 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setRegisterMbeans(true);
        long long20 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        long long22 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str14 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setReadOnly(true);
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        boolean boolean18 = hikariConfig13.isReadOnly();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setMinimumPoolSize(0);
        hikariConfig13.setCatalog("HikariPool-25114");
        long long24 = hikariConfig13.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-102");
        boolean boolean5 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        int int7 = hikariConfig6.getAcquireRetries();
        hikariConfig6.setJdbcUrl("hi!");
        hikariConfig6.setAutoCommit(true);
        hikariConfig6.setIdleTimeout(1L);
        hikariConfig6.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isReadOnly();
        java.lang.String str19 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setJdbcUrl("hi!");
        boolean boolean22 = hikariConfig17.isReadOnly();
        hikariConfig17.setTransactionIsolation("HikariPool-158");
        hikariConfig17.setUseInstrumentation(false);
        java.util.Properties properties27 = hikariConfig17.getDataSourceProperties();
        hikariConfig6.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        java.lang.String str31 = hikariConfig1.getDataSourceClassName();
        java.lang.String str32 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        int int17 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6979");
        java.lang.String str20 = hikariConfig1.getPoolName();
        java.lang.String str21 = hikariConfig1.getCatalog();
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-70347" + "'", str12, "HikariPool-70347");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-70347" + "'", str20, "HikariPool-70347");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45994");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45994 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-61504");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-61504 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.lang.String str16 = hikariConfig15.getCatalog();
        boolean boolean17 = hikariConfig15.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig15.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig15.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((-1L));
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        int int22 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setJdbcUrl("hi!");
        hikariConfig21.setAutoCommit(true);
        hikariConfig21.setIdleTimeout(1L);
        hikariConfig21.setConnectionTestQuery("hi!");
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isReadOnly();
        java.lang.String str34 = hikariConfig32.getDataSourceClassName();
        hikariConfig32.setJdbcUrl("hi!");
        boolean boolean37 = hikariConfig32.isReadOnly();
        hikariConfig32.setTransactionIsolation("HikariPool-158");
        hikariConfig32.setUseInstrumentation(false);
        java.util.Properties properties42 = hikariConfig32.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig0.addDataSourceProperty("HikariPool-12654", (java.lang.Object) properties42);
        java.lang.Class<?> wildcardClass47 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setReadOnly(true);
        int int12 = hikariConfig1.getAcquireIncrement();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetryDelay((long) 3);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-998");
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setRegisterMbeans(true);
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-998" + "'", str21, "HikariPool-998");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setPoolName("HikariPool-382");
        hikariConfig0.setJdbcUrl("HikariPool-151");
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-2635");
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean17 = hikariConfig16.isAutoCommit();
        java.lang.String str18 = hikariConfig16.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setPoolName("HikariPool-46726");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        javax.sql.DataSource dataSource19 = hikariConfig16.getDataSource();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setConnectionInitSql("");
        hikariConfig22.setJdbcUrl("");
        hikariConfig22.setConnectionTestQuery("hi!");
        hikariConfig16.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig22);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.setConnectionInitSql("");
        hikariConfig31.setJdbcUrl("");
        hikariConfig31.setConnectionTestQuery("hi!");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setTransactionIsolation("");
        javax.sql.DataSource dataSource42 = hikariConfig39.getDataSource();
        long long43 = hikariConfig39.getConnectionTimeout();
        java.lang.String str44 = hikariConfig39.getCatalog();
        hikariConfig39.setInitializationFailFast(false);
        java.util.Properties properties47 = hikariConfig39.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig31.setDataSourceProperties(properties47);
        hikariConfig16.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig0.setDataSourceProperties(properties47);
        long long54 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 600000L + "'", long54 == 600000L);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getIdleTimeout();
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-3204");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        int int14 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        int int17 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setJdbcUrl("hi!");
        hikariConfig16.setAutoCommit(true);
        hikariConfig16.setIdleTimeout(1L);
        hikariConfig16.setConnectionTestQuery("hi!");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isReadOnly();
        java.lang.String str29 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setJdbcUrl("hi!");
        boolean boolean32 = hikariConfig27.isReadOnly();
        hikariConfig27.setTransactionIsolation("HikariPool-158");
        hikariConfig27.setUseInstrumentation(false);
        java.util.Properties properties37 = hikariConfig27.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties37);
        hikariConfig0.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.util.Properties properties41 = hikariConfig40.getDataSourceProperties();
        hikariConfig40.setIdleTimeout(52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        java.lang.String str7 = hikariConfig0.getPoolName();
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        long long16 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-70386" + "'", str7, "HikariPool-70386");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isReadOnly();
        java.lang.String str15 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean18 = hikariConfig13.isAutoCommit();
        long long19 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-1561", (java.lang.Object) hikariConfig13);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setTransactionIsolation("");
        long long25 = hikariConfig22.getLeakDetectionThreshold();
        hikariConfig22.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig22.setAcquireIncrement(100);
        hikariConfig22.setReadOnly(true);
        hikariConfig22.setJdbcUrl("HikariPool-151");
        hikariConfig22.setDataSourceClassName("HikariPool-674");
        java.lang.String str36 = hikariConfig22.getDataSourceClassName();
        hikariConfig22.setMaxLifetime((long) (short) -1);
        boolean boolean39 = hikariConfig22.isJdbc4ConnectionTest();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.setTransactionIsolation("");
        javax.sql.DataSource dataSource44 = hikariConfig41.getDataSource();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig47.setConnectionInitSql("");
        hikariConfig47.setJdbcUrl("");
        hikariConfig47.setConnectionTestQuery("hi!");
        hikariConfig41.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig47);
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig56.setConnectionInitSql("");
        hikariConfig56.setJdbcUrl("");
        hikariConfig56.setConnectionTestQuery("hi!");
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        hikariConfig64.setTransactionIsolation("");
        javax.sql.DataSource dataSource67 = hikariConfig64.getDataSource();
        long long68 = hikariConfig64.getConnectionTimeout();
        java.lang.String str69 = hikariConfig64.getCatalog();
        hikariConfig64.setInitializationFailFast(false);
        java.util.Properties properties72 = hikariConfig64.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig56.setDataSourceProperties(properties72);
        hikariConfig41.setDataSourceProperties(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig22.setDataSourceProperties(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig13.setDataSourceProperties(properties72);
        hikariConfig13.setAcquireIncrement(60);
        long long87 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-674" + "'", str36, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNull(dataSource67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 5000L + "'", long68 == 5000L);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 100L + "'", long87 == 100L);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig15.setIdleTimeout((long) (short) -1);
        long long18 = hikariConfig15.getIdleTimeout();
        hikariConfig15.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionInitSql("HikariPool-1637");
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        int int9 = hikariConfig8.getAcquireRetries();
        hikariConfig8.setAcquireRetryDelay((long) 0);
        hikariConfig8.setReadOnly(true);
        hikariConfig8.setInitializationFailFast(true);
        hikariConfig8.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig8.setCatalog("hi!");
        javax.sql.DataSource dataSource20 = hikariConfig8.getDataSource();
        hikariConfig8.setAutoCommit(true);
        hikariConfig1.addDataSourceProperty("HikariPool-11388", (java.lang.Object) true);
        hikariConfig1.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource26 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        boolean boolean12 = hikariConfig1.isReadOnly();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        int int14 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(5000L);
        boolean boolean10 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig14.setCatalog("HikariPool-919");
        hikariConfig14.setMinimumPoolSize(32);
        long long19 = hikariConfig14.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig14.getCatalog();
        javax.sql.DataSource dataSource21 = hikariConfig14.getDataSource();
        hikariConfig14.setRegisterMbeans(true);
        hikariConfig14.setIdleTimeout((-1L));
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-919" + "'", str20, "HikariPool-919");
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        int int6 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setTransactionIsolation("HikariPool-658");
        hikariConfig1.setIdleTimeout((long) 3);
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4454");
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireIncrement(32);
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        int int27 = hikariConfig1.getAcquireIncrement();
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-47009");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-70437" + "'", str18, "HikariPool-70437");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-4454" + "'", str23, "HikariPool-4454");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        hikariConfig0.setUseInstrumentation(true);
        int int15 = hikariConfig0.getTransactionIsolation();
        int int16 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig9.setJdbcUrl("hi!");
        boolean boolean15 = hikariConfig9.isJdbc4ConnectionTest();
        long long16 = hikariConfig9.getLeakDetectionThreshold();
        hikariConfig9.setAcquireIncrement(100);
        boolean boolean19 = hikariConfig9.isReadOnly();
        boolean boolean20 = hikariConfig9.isIsolateInternalQueries();
        int int21 = hikariConfig9.getAcquireRetries();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isReadOnly();
        java.lang.String str25 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setJdbcUrl("hi!");
        boolean boolean28 = hikariConfig23.isReadOnly();
        hikariConfig23.setTransactionIsolation("HikariPool-158");
        hikariConfig23.setUseInstrumentation(false);
        java.util.Properties properties33 = hikariConfig23.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        hikariConfig1.setReadOnly(false);
        int int40 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-14032");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-1993");
        long long13 = hikariConfig1.getMaxLifetime();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.getMaximumPoolSize();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig1.isReadOnly();
        java.lang.String str16 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-14564");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-70446" + "'", str16, "HikariPool-70446");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-42831");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-42831 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-55979");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-55979 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setPoolName("HikariPool-159");
        hikariConfig1.setMaximumPoolSize(3);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setConnectionInitSql("HikariPool-1177");
        java.lang.String str21 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setAcquireRetryDelay(60L);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-159" + "'", str21, "HikariPool-159");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean15 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionTestQuery("HikariPool-2503");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setConnectionInitSql("");
        hikariConfig19.setJdbcUrl("");
        hikariConfig19.setConnectionTestQuery("hi!");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setTransactionIsolation("");
        javax.sql.DataSource dataSource30 = hikariConfig27.getDataSource();
        long long31 = hikariConfig27.getConnectionTimeout();
        java.lang.String str32 = hikariConfig27.getCatalog();
        hikariConfig27.setInitializationFailFast(false);
        java.util.Properties properties35 = hikariConfig27.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig19.setDataSourceProperties(properties35);
        hikariConfig0.setDataSourceProperties(properties35);
        int int40 = hikariConfig0.getAcquireRetries();
        long long41 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setAcquireRetryDelay((long) (short) 100);
        hikariConfig43.setMinimumPoolSize((int) (byte) 100);
        hikariConfig43.setJdbcUrl("hi!");
        int int50 = hikariConfig43.getAcquireIncrement();
        hikariConfig43.setAcquireRetryDelay((long) 60);
        hikariConfig43.setDataSourceClassName("HikariPool-3114");
        java.util.Properties properties55 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig0.setDataSourceProperties(properties55);
        long long58 = hikariConfig0.getIdleTimeout();
        int int59 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 600000L + "'", long58 == 600000L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setLeakDetectionThreshold((-1L));
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str26 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        java.lang.String str29 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-1676");
        long long17 = hikariConfig1.getMaxLifetime();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setConnectionInitSql("");
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setConnectionTestQuery("hi!");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        long long28 = hikariConfig24.getConnectionTimeout();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setInitializationFailFast(false);
        java.util.Properties properties32 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig16.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig40.setLeakDetectionThreshold((long) (short) 1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) '#');
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-16518");
        hikariConfig1.setConnectionInitSql("HikariPool-64487");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("HikariPool-9312");
        hikariConfig19.setAcquireRetries((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig19.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setDataSourceClassName("HikariPool-1076");
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setAcquireRetryDelay((long) (short) 100);
        hikariConfig8.setMinimumPoolSize((int) (byte) 100);
        hikariConfig8.setJdbcUrl("hi!");
        int int15 = hikariConfig8.getAcquireIncrement();
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-1164");
        hikariConfig0.setAutoCommit(false);
        long long6 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime(0L);
        java.lang.String str13 = hikariConfig1.getCatalog();
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        boolean boolean13 = hikariConfig1.isReadOnly();
        hikariConfig1.setCatalog("HikariPool-2875");
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean8 = hikariConfig1.isReadOnly();
        int int9 = hikariConfig1.getAcquireIncrement();
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetryDelay(100L);
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-70490" + "'", str10, "HikariPool-70490");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3926");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3926 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-32273");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-32273 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        boolean boolean17 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.setConnectionTestQuery("HikariPool-442");
        int int20 = hikariConfig11.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        int int23 = hikariConfig22.getAcquireRetries();
        hikariConfig22.setAcquireRetryDelay((long) 0);
        hikariConfig22.setReadOnly(true);
        hikariConfig22.setInitializationFailFast(true);
        java.lang.String str30 = hikariConfig22.getJdbcUrl();
        java.lang.String str31 = hikariConfig22.getJdbcUrl();
        hikariConfig22.setJdbcUrl("HikariPool-761");
        hikariConfig22.setCatalog("HikariPool-566");
        java.lang.String str36 = hikariConfig22.getCatalog();
        hikariConfig22.setJdbcUrl("HikariPool-151");
        java.lang.String str39 = hikariConfig22.getConnectionInitSql();
        java.util.Properties properties40 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.addDataSourceProperty("HikariPool-3494", (java.lang.Object) hikariConfig22);
        hikariConfig22.setReadOnly(false);
        java.lang.String str44 = hikariConfig22.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-14797", (java.lang.Object) hikariConfig22);
        hikariConfig22.setAcquireRetries((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-566" + "'", str36, "HikariPool-566");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-1637");
        int int14 = hikariConfig0.getAcquireIncrement();
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        int int4 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setCatalog("HikariPool-1636");
        hikariConfig0.setDataSourceClassName("HikariPool-8172");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionTimeout(100L);
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setConnectionInitSql("");
        hikariConfig3.setJdbcUrl("");
        hikariConfig3.setConnectionTestQuery("hi!");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        java.lang.String str16 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig3.setDataSourceProperties(properties19);
        hikariConfig0.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig25.setPoolName("HikariPool-3292");
        java.lang.String str28 = hikariConfig25.getDataSourceClassName();
        hikariConfig25.setJdbcUrl("HikariPool-7714");
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setTransactionIsolation("");
        javax.sql.DataSource dataSource36 = hikariConfig33.getDataSource();
        long long37 = hikariConfig33.getConnectionTimeout();
        int int38 = hikariConfig33.getTransactionIsolation();
        boolean boolean39 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setAutoCommit(true);
        hikariConfig33.setConnectionTimeout(600000L);
        long long44 = hikariConfig33.getLeakDetectionThreshold();
        java.lang.String str45 = hikariConfig33.getJdbcUrl();
        hikariConfig33.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig48.setConnectionInitSql("");
        boolean boolean51 = hikariConfig48.isJdbc4ConnectionTest();
        java.lang.String str52 = hikariConfig48.getCatalog();
        java.lang.String str53 = hikariConfig48.getConnectionTestQuery();
        hikariConfig48.setLeakDetectionThreshold((long) '4');
        hikariConfig48.setMaxLifetime(5000L);
        hikariConfig48.setAcquireRetries((int) (short) 1);
        java.util.Properties properties60 = hikariConfig48.getDataSourceProperties();
        java.lang.String str61 = hikariConfig48.getDataSourceClassName();
        java.util.Properties properties62 = hikariConfig48.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig33.setDataSourceProperties(properties62);
        java.lang.String str66 = hikariConfig33.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig25.addDataSourceProperty("HikariPool-56043", (java.lang.Object) str66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setCatalog("HikariPool-24138");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("");
        hikariConfig9.setJdbcUrl("");
        hikariConfig9.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(false);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        boolean boolean31 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str32 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetries((int) (byte) 100);
        hikariConfig0.setJdbcUrl("HikariPool-66910");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbcUrl("HikariPool-151");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        java.lang.String str17 = hikariConfig12.getConnectionTestQuery();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        int int22 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setJdbcUrl("hi!");
        hikariConfig21.setMaximumPoolSize((int) ' ');
        java.lang.String str27 = hikariConfig21.getConnectionTestQuery();
        hikariConfig21.setRegisterMbeans(true);
        boolean boolean30 = hikariConfig21.isJdbc4ConnectionTest();
        long long31 = hikariConfig21.getMaxLifetime();
        java.lang.String str32 = hikariConfig21.getDataSourceClassName();
        java.lang.String str33 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig21.setConnectionTestQuery("HikariPool-49448");
        hikariConfig1.addDataSourceProperty("HikariPool-29891", (java.lang.Object) hikariConfig21);
        hikariConfig21.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setPoolName("HikariPool-1636");
        int int11 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig0.isAutoCommit();
        java.lang.String str15 = hikariConfig0.getCatalog();
        long long16 = hikariConfig0.getMaxLifetime();
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout(750L);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        int int18 = hikariConfig0.getTransactionIsolation();
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        long long20 = hikariConfig0.getIdleTimeout();
        boolean boolean21 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-33750");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setJdbcUrl("");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig12.setDataSource(dataSource17);
        long long19 = hikariConfig12.getMaxLifetime();
        boolean boolean20 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setMaximumPoolSize((int) '#');
        java.lang.String str23 = hikariConfig12.getPoolName();
        hikariConfig12.setMinimumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig12.setDataSource(dataSource26);
        int int28 = hikariConfig12.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig12);
        java.util.Properties properties30 = hikariConfig12.getDataSourceProperties();
        hikariConfig12.setAcquireRetryDelay((long) 1);
        int int33 = hikariConfig12.getMinimumPoolSize();
        javax.sql.DataSource dataSource34 = hikariConfig12.getDataSource();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-70528" + "'", str23, "HikariPool-70528");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(dataSource34);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17406");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17406 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean8 = hikariConfig1.isReadOnly();
        boolean boolean9 = hikariConfig1.isReadOnly();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-22949");
        java.lang.String str18 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-70531" + "'", str18, "HikariPool-70531");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setConnectionInitSql("");
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setConnectionTestQuery("hi!");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        long long28 = hikariConfig24.getConnectionTimeout();
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setInitializationFailFast(false);
        java.util.Properties properties32 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig16.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig38.setAcquireRetries((int) (short) 1);
        boolean boolean41 = hikariConfig38.isReadOnly();
        int int42 = hikariConfig38.getAcquireRetries();
        boolean boolean43 = hikariConfig38.isInitializationFailFast();
        int int44 = hikariConfig38.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setTransactionIsolation("");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig7.setDataSource(dataSource10);
        hikariConfig7.setAutoCommit(false);
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setInitializationFailFast(false);
        long long18 = hikariConfig7.getMaxLifetime();
        java.lang.String str19 = hikariConfig7.getDataSourceClassName();
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-1177");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setAcquireRetryDelay((long) (short) 100);
        hikariConfig23.setMinimumPoolSize((int) (byte) 100);
        hikariConfig23.setJdbcUrl("hi!");
        java.util.Properties properties30 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setIdleTimeout((long) '#');
        java.util.Properties properties33 = hikariConfig23.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties33);
        hikariConfig5.setDataSourceProperties(properties33);
        int int36 = hikariConfig5.getAcquireRetries();
        hikariConfig5.setJdbcUrl("HikariPool-2875");
        java.lang.String str39 = hikariConfig5.getJdbcUrl();
        long long40 = hikariConfig5.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-2875" + "'", str39, "HikariPool-2875");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        int int10 = hikariConfig0.getAcquireRetries();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setMaximumPoolSize(1);
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-159");
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-1636");
        int int16 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-3107");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setReadOnly(false);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-41522");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("");
        hikariConfig9.setJdbcUrl("");
        hikariConfig9.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(false);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setConnectionInitSql("");
        boolean boolean36 = hikariConfig33.isJdbc4ConnectionTest();
        java.lang.String str37 = hikariConfig33.getCatalog();
        java.util.Properties properties38 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig0.setDataSourceProperties(properties38);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        long long43 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        boolean boolean46 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig7.getCatalog();
        java.lang.String str12 = hikariConfig7.getConnectionTestQuery();
        hikariConfig7.setLeakDetectionThreshold((long) '4');
        hikariConfig7.setRegisterMbeans(false);
        hikariConfig7.setAutoCommit(false);
        java.util.Properties properties19 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig22.setIdleTimeout((long) (byte) -1);
        java.lang.String str25 = hikariConfig22.getCatalog();
        hikariConfig22.setJdbcUrl("HikariPool-6541");
        java.util.Properties properties28 = hikariConfig22.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int32 = hikariConfig31.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.setIsolateInternalQueries(true);
        long long12 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23757");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23757 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig15.setIdleTimeout((long) (byte) -1);
        java.lang.String str18 = hikariConfig15.getCatalog();
        long long19 = hikariConfig15.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig15.getConnectionInitSql();
        int int21 = hikariConfig15.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        int int9 = hikariConfig1.getAcquireRetries();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setMaxLifetime(0L);
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setMaxLifetime((long) (short) 10);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig13.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str26 = hikariConfig25.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-23910");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-12404");
        hikariConfig1.setConnectionInitSql("HikariPool-6812");
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setTransactionIsolation("HikariPool-151");
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-158");
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setJdbcUrl("HikariPool-159");
        boolean boolean14 = hikariConfig1.isReadOnly();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-27723");
        hikariConfig0.setPoolName("HikariPool-16124");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setIsolateInternalQueries(true);
        int int22 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        int int25 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str28 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str31 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-70611" + "'", str31, "HikariPool-70611");
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.setPoolName("HikariPool-761");
        hikariConfig1.setDataSourceClassName("HikariPool-1076");
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-761" + "'", str18, "HikariPool-761");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getTransactionIsolation();
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str14 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setReadOnly(true);
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        boolean boolean18 = hikariConfig13.isReadOnly();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        int int20 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setCatalog("");
        boolean boolean23 = hikariConfig13.isRegisterMbeans();
        int int24 = hikariConfig13.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setCatalog("");
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig13.getCatalog();
        java.lang.String str18 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setLeakDetectionThreshold((long) '4');
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.setAutoCommit(false);
        java.util.Properties properties25 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig1.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int31 = hikariConfig30.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean23 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        int int11 = hikariConfig0.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        int int11 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        long long12 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setInitializationFailFast(true);
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        long long7 = hikariConfig1.getIdleTimeout();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setTransactionIsolation("HikariPool-4548");
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setDataSourceClassName("");
        java.lang.String str18 = hikariConfig13.getDataSourceClassName();
        long long19 = hikariConfig13.getMaxLifetime();
        boolean boolean20 = hikariConfig13.isRegisterMbeans();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setTransactionIsolation("");
        javax.sql.DataSource dataSource25 = hikariConfig22.getDataSource();
        long long26 = hikariConfig22.getConnectionTimeout();
        java.lang.String str27 = hikariConfig22.getCatalog();
        hikariConfig22.setInitializationFailFast(false);
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig13.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long37 = hikariConfig36.getLeakDetectionThreshold();
        java.util.Properties properties38 = hikariConfig36.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.lang.Class<?> wildcardClass42 = hikariConfig41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIdleTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-22139");
        hikariConfig1.setConnectionInitSql("HikariPool-20980");
        java.lang.String str21 = hikariConfig1.getCatalog();
        java.lang.String str22 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-70666" + "'", str22, "HikariPool-70666");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        java.lang.String str3 = hikariConfig0.getCatalog();
        hikariConfig0.setIdleTimeout(600000L);
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setJdbcUrl("HikariPool-6788");
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setTransactionIsolation("HikariPool-33552");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-70668" + "'", str2, "HikariPool-70668");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-21893");
        hikariConfig1.setConnectionInitSql("");
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setMaxLifetime(0L);
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        java.lang.String str17 = hikariConfig13.getDataSourceClassName();
        long long18 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.setAcquireRetries((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaximumPoolSize(0);
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-3431");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig12.getCatalog();
        hikariConfig12.setReadOnly(false);
        hikariConfig12.setCatalog("");
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setTransactionIsolation("");
        javax.sql.DataSource dataSource28 = hikariConfig25.getDataSource();
        long long29 = hikariConfig25.getConnectionTimeout();
        java.lang.String str30 = hikariConfig25.getCatalog();
        hikariConfig25.setInitializationFailFast(false);
        java.util.Properties properties33 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig38.setCatalog("HikariPool-919");
        hikariConfig38.setAcquireIncrement((int) '#');
        hikariConfig38.setAcquireRetryDelay(0L);
        hikariConfig38.setIdleTimeout((long) '4');
        int int47 = hikariConfig38.getAcquireIncrement();
        hikariConfig1.addDataSourceProperty("HikariPool-19157", (java.lang.Object) int47);
        long long49 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setTransactionIsolation("HikariPool-34059");
        hikariConfig1.setConnectionInitSql("HikariPool-21738");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 750L + "'", long49 == 750L);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setDataSourceClassName("HikariPool-760");
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-29096");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setTransactionIsolation("HikariPool-658");
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.setConnectionTestQuery("HikariPool-33552");
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        int int27 = hikariConfig21.getTransactionIsolation();
        boolean boolean28 = hikariConfig21.isJdbc4ConnectionTest();
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        hikariConfig1.setPoolName("HikariPool-4199");
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        int int38 = hikariConfig1.getTransactionIsolation();
        boolean boolean39 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str14 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig13.setReadOnly(true);
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setTransactionIsolation("HikariPool-566");
        hikariConfig13.setAutoCommit(true);
        java.lang.String str22 = hikariConfig13.getJdbcUrl();
        long long23 = hikariConfig13.getIdleTimeout();
        boolean boolean24 = hikariConfig13.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-102");
        hikariConfig0.setAcquireIncrement(10);
        hikariConfig0.setIdleTimeout((long) 0);
        long long20 = hikariConfig0.getAcquireRetryDelay();
        int int21 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setDataSourceClassName("HikariPool-761");
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-382");
        hikariConfig1.setConnectionTestQuery("HikariPool-2544");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-18652");
        java.lang.String str18 = hikariConfig1.getCatalog();
        int int19 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-21858");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-566");
        int int13 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-32100");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-32100' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getMaxLifetime();
        long long9 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        int int11 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-566");
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str8 = hikariConfig7.getCatalog();
        javax.sql.DataSource dataSource9 = hikariConfig7.getDataSource();
        hikariConfig7.setAutoCommit(false);
        hikariConfig7.setMaximumPoolSize(52);
        java.lang.String str14 = hikariConfig7.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-151");
        hikariConfig1.setDataSourceClassName("HikariPool-674");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setJdbcUrl("");
        hikariConfig26.setConnectionTestQuery("hi!");
        hikariConfig20.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig26);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setConnectionInitSql("");
        hikariConfig35.setJdbcUrl("");
        hikariConfig35.setConnectionTestQuery("hi!");
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setTransactionIsolation("");
        javax.sql.DataSource dataSource46 = hikariConfig43.getDataSource();
        long long47 = hikariConfig43.getConnectionTimeout();
        java.lang.String str48 = hikariConfig43.getCatalog();
        hikariConfig43.setInitializationFailFast(false);
        java.util.Properties properties51 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig35.setDataSourceProperties(properties51);
        hikariConfig20.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setLeakDetectionThreshold(32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.setTransactionIsolation("");
        javax.sql.DataSource dataSource8 = hikariConfig5.getDataSource();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("");
        hikariConfig11.setJdbcUrl("");
        hikariConfig11.setConnectionTestQuery("hi!");
        hikariConfig5.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig11);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setJdbcUrl("");
        hikariConfig20.setConnectionTestQuery("hi!");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setTransactionIsolation("");
        javax.sql.DataSource dataSource31 = hikariConfig28.getDataSource();
        long long32 = hikariConfig28.getConnectionTimeout();
        java.lang.String str33 = hikariConfig28.getCatalog();
        hikariConfig28.setInitializationFailFast(false);
        java.util.Properties properties36 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig20.setDataSourceProperties(properties36);
        hikariConfig5.setDataSourceProperties(properties36);
        hikariConfig1.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig42.setMaxLifetime((long) (byte) 10);
        hikariConfig42.setConnectionInitSql("HikariPool-3494");
        boolean boolean47 = hikariConfig42.isIsolateInternalQueries();
        boolean boolean48 = hikariConfig42.isReadOnly();
        java.lang.String str49 = hikariConfig42.getConnectionInitSql();
        javax.sql.DataSource dataSource50 = null;
        hikariConfig42.setDataSource(dataSource50);
        hikariConfig42.setRegisterMbeans(false);
        boolean boolean54 = hikariConfig42.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HikariPool-3494" + "'", str49, "HikariPool-3494");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-158", (java.lang.Object) (byte) 100);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbcUrl("HikariPool-158");
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        int int20 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setCatalog("HikariPool-627");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-45732");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        int int9 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        java.lang.String str3 = hikariConfig0.getCatalog();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize(1);
        hikariConfig0.setConnectionTestQuery("HikariPool-12480");
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-70754" + "'", str2, "HikariPool-70754");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        int int14 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        hikariConfig16.setCatalog("");
        hikariConfig16.setInitializationFailFast(false);
        hikariConfig16.setAutoCommit(true);
        java.lang.String str25 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig0.setDataSourceProperties(properties26);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setPoolName("HikariPool-70302");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAcquireRetryDelay((long) 32);
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement((int) '4');
        int int16 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int27 = hikariConfig1.getMaximumPoolSize();
        long long28 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setConnectionInitSql("");
        hikariConfig33.setJdbcUrl("");
        hikariConfig33.setConnectionTestQuery("hi!");
        long long40 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str43 = hikariConfig33.getConnectionCustomizerClassName();
        hikariConfig33.setConnectionTestQuery("HikariPool-998");
        java.lang.String str46 = hikariConfig33.getJdbcUrl();
        long long47 = hikariConfig33.getLeakDetectionThreshold();
        hikariConfig33.setRegisterMbeans(true);
        long long50 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        boolean boolean55 = hikariConfig54.isIsolateInternalQueries();
        hikariConfig54.setMaxLifetime((long) (short) 10);
        java.util.Properties properties58 = hikariConfig54.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig33.setDataSourceProperties(properties58);
        hikariConfig31.setDataSourceProperties(properties58);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 5000L + "'", long50 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        int int27 = hikariConfig21.getTransactionIsolation();
        boolean boolean28 = hikariConfig21.isJdbc4ConnectionTest();
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        java.lang.String str33 = hikariConfig32.getConnectionTestQuery();
        int int34 = hikariConfig32.getAcquireIncrement();
        hikariConfig32.setConnectionInitSql("HikariPool-998");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setCatalog("HikariPool-761");
        int int12 = hikariConfig1.getAcquireRetries();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-4548");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-151");
        hikariConfig1.setDataSourceClassName("HikariPool-674");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        int int19 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-919");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-919" + "'", str24, "HikariPool-919");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setTransactionIsolation("HikariPool-932");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setIsolateInternalQueries(true);
        int int12 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setConnectionInitSql("");
        boolean boolean17 = hikariConfig14.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig14.getCatalog();
        java.lang.String str19 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setLeakDetectionThreshold((long) '4');
        long long22 = hikariConfig14.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig23.setConnectionInitSql("");
        boolean boolean26 = hikariConfig23.isJdbc4ConnectionTest();
        java.lang.String str27 = hikariConfig23.getCatalog();
        java.lang.String str28 = hikariConfig23.getConnectionTestQuery();
        hikariConfig23.setLeakDetectionThreshold((long) '4');
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.setAutoCommit(false);
        java.util.Properties properties35 = hikariConfig23.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        boolean boolean38 = hikariConfig1.isReadOnly();
        hikariConfig1.setInitializationFailFast(true);
        int int41 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-37251");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int14 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setUseInstrumentation(true);
        hikariConfig13.setMaxLifetime((long) (byte) 1);
        hikariConfig13.setJdbc4ConnectionTest(false);
        long long21 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setCatalog("HikariPool-41768");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        long long14 = hikariConfig9.getIdleTimeout();
        hikariConfig9.setJdbcUrl("HikariPool-130");
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setJdbcUrl("hi!");
        boolean boolean23 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig17.getDataSourceClassName();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setJdbcUrl("");
        hikariConfig26.setConnectionTestQuery("hi!");
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setTransactionIsolation("");
        javax.sql.DataSource dataSource37 = hikariConfig34.getDataSource();
        long long38 = hikariConfig34.getConnectionTimeout();
        java.lang.String str39 = hikariConfig34.getCatalog();
        hikariConfig34.setInitializationFailFast(false);
        java.util.Properties properties42 = hikariConfig34.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig26.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        hikariConfig9.setDataSourceProperties(properties42);
        hikariConfig0.setDataSourceProperties(properties42);
        hikariConfig0.setAcquireRetryDelay(35L);
        boolean boolean52 = hikariConfig0.isRegisterMbeans();
        java.lang.String str53 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) 10);
        boolean boolean56 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-28128");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-55020");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-55020 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.validate();
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setReadOnly(true);
        int int14 = hikariConfig1.getAcquireIncrement();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setLeakDetectionThreshold(750L);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-566");
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) (-1));
        int int15 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTestQuery("HikariPool-658");
        java.lang.String str18 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-70808" + "'", str18, "HikariPool-70808");
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig14.setCatalog("HikariPool-919");
        hikariConfig14.setMinimumPoolSize(32);
        long long19 = hikariConfig14.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig14.getCatalog();
        java.lang.String str21 = hikariConfig14.getPoolName();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.setTransactionIsolation("");
        javax.sql.DataSource dataSource26 = hikariConfig23.getDataSource();
        long long27 = hikariConfig23.getConnectionTimeout();
        int int28 = hikariConfig23.getTransactionIsolation();
        boolean boolean29 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setAutoCommit(true);
        hikariConfig23.setDataSourceClassName("HikariPool-760");
        hikariConfig23.setMinimumPoolSize((int) (short) 0);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setConnectionInitSql("");
        hikariConfig37.setJdbcUrl("");
        javax.sql.DataSource dataSource42 = null;
        hikariConfig37.setDataSource(dataSource42);
        hikariConfig37.setInitializationFailFast(false);
        hikariConfig37.setAcquireRetries((int) (short) 10);
        java.lang.String str48 = hikariConfig37.getCatalog();
        int int49 = hikariConfig37.getMaximumPoolSize();
        boolean boolean50 = hikariConfig37.isIsolateInternalQueries();
        boolean boolean51 = hikariConfig37.isAutoCommit();
        java.lang.String str52 = hikariConfig37.getConnectionTestQuery();
        hikariConfig37.setConnectionTestQuery("HikariPool-5753");
        boolean boolean55 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setIsolateInternalQueries(true);
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.setTransactionIsolation("");
        javax.sql.DataSource dataSource62 = hikariConfig59.getDataSource();
        long long63 = hikariConfig59.getConnectionTimeout();
        hikariConfig59.setPoolName("HikariPool-382");
        hikariConfig59.setDataSourceClassName("");
        hikariConfig59.setConnectionTestQuery("HikariPool-3431");
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig70.setConnectionInitSql("");
        boolean boolean73 = hikariConfig70.isJdbc4ConnectionTest();
        java.lang.String str74 = hikariConfig70.getCatalog();
        hikariConfig70.setReadOnly(false);
        hikariConfig70.setCatalog("");
        java.util.Properties properties79 = hikariConfig70.getDataSourceProperties();
        hikariConfig59.setDataSourceProperties(properties79);
        hikariConfig37.setDataSourceProperties(properties79);
        javax.sql.DataSource dataSource82 = null;
        hikariConfig37.setDataSource(dataSource82);
        java.util.Properties properties84 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        hikariConfig23.setDataSourceProperties(properties84);
        hikariConfig14.setDataSourceProperties(properties84);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-919" + "'", str20, "HikariPool-919");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-70814" + "'", str21, "HikariPool-70814");
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5000L + "'", long27 == 5000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 5000L + "'", long63 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties84);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setReadOnly(false);
        hikariConfig13.setIsolateInternalQueries(true);
        hikariConfig13.setDataSourceClassName("HikariPool-16308");
        hikariConfig13.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbcUrl("HikariPool-1276");
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setCatalog("HikariPool-7557");
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("");
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean18 = hikariConfig0.isReadOnly();
        boolean boolean19 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-12602");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setAcquireRetryDelay(10L);
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-6260");
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        java.lang.String str14 = hikariConfig12.getPoolName();
        java.lang.String str15 = hikariConfig12.getCatalog();
        hikariConfig0.addDataSourceProperty("HikariPool-3114", (java.lang.Object) hikariConfig12);
        java.lang.String str17 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-70828" + "'", str14, "HikariPool-70828");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-102");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-159");
        boolean boolean20 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-2024");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25360");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-998");
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isReadOnly();
        java.lang.String str15 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setIsolateInternalQueries(false);
        java.util.Properties properties18 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig0.setDataSourceProperties(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24054");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24054 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-151");
        hikariConfig1.setDataSourceClassName("HikariPool-674");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        hikariConfig1.setMaxLifetime((long) 60);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean22 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay((long) 60);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        long long13 = hikariConfig12.getMaxLifetime();
        int int14 = hikariConfig12.getAcquireIncrement();
        long long15 = hikariConfig12.getIdleTimeout();
        long long16 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-13503", (java.lang.Object) hikariConfig12);
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-10327");
        hikariConfig0.setDataSourceClassName("HikariPool-25349");
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(true);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        int int19 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getIdleTimeout();
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-35821");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setLeakDetectionThreshold((-1L));
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setAcquireRetryDelay((long) (short) 100);
        hikariConfig17.setMinimumPoolSize((int) (byte) 100);
        hikariConfig17.setJdbcUrl("hi!");
        int int24 = hikariConfig17.getAcquireIncrement();
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int29 = hikariConfig28.getMaximumPoolSize();
        boolean boolean30 = hikariConfig28.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long9 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        hikariConfig0.setIsolateInternalQueries(false);
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setAcquireRetries(97);
        hikariConfig0.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setConnectionTestQuery("HikariPool-823");
        hikariConfig1.setConnectionTestQuery("HikariPool-823");
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaxLifetime((long) (short) 100);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        long long16 = hikariConfig1.getMaxLifetime();
        int int17 = hikariConfig1.getMaximumPoolSize();
        long long18 = hikariConfig1.getConnectionTimeout();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(35L);
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-20349");
        hikariConfig1.setMaximumPoolSize(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        long long4 = hikariConfig1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setRegisterMbeans(true);
        int int17 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isAutoCommit();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setAcquireRetryDelay((long) (short) 100);
        boolean boolean9 = hikariConfig6.isAutoCommit();
        java.lang.String str10 = hikariConfig6.getPoolName();
        java.lang.String str11 = hikariConfig6.getDataSourceClassName();
        long long12 = hikariConfig6.getConnectionTimeout();
        boolean boolean13 = hikariConfig6.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-7939", (java.lang.Object) hikariConfig6);
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isIsolateInternalQueries();
        hikariConfig19.setPoolName("HikariPool-960");
        hikariConfig19.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-22631", (java.lang.Object) hikariConfig19);
        hikariConfig19.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-70902" + "'", str10, "HikariPool-70902");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setLeakDetectionThreshold((long) '4');
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setAutoCommit(false);
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str24 = hikariConfig23.getPoolName();
        hikariConfig23.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-70907" + "'", str24, "HikariPool-70907");
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setTransactionIsolation("HikariPool-627");
        hikariConfig1.setMaxLifetime((long) '4');
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-70908" + "'", str12, "HikariPool-70908");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setConnectionInitSql("HikariPool-26244");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-70910" + "'", str7, "HikariPool-70910");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-658");
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setAcquireIncrement(3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-3097");
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-8249");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-6225");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-8249" + "'", str15, "HikariPool-8249");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setMaxLifetime(0L);
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        int int17 = hikariConfig13.getMinimumPoolSize();
        boolean boolean18 = hikariConfig13.isAutoCommit();
        hikariConfig13.setAcquireIncrement((int) (byte) 10);
        hikariConfig13.setJdbc4ConnectionTest(false);
        hikariConfig13.setConnectionInitSql("HikariPool-2024");
        hikariConfig13.addDataSourceProperty("HikariPool-2875", (java.lang.Object) 600000L);
        hikariConfig13.setTransactionIsolation("HikariPool-1177");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaxLifetime((long) (short) 100);
        int int12 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-67162");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.setCatalog("HikariPool-15999");
        hikariConfig1.setConnectionTestQuery("HikariPool-6621");
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(true);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        int int3 = hikariConfig0.getMaximumPoolSize();
        int int4 = hikariConfig0.getAcquireRetries();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        java.lang.String str9 = hikariConfig7.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-70920" + "'", str2, "HikariPool-70920");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-70921" + "'", str9, "HikariPool-70921");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig12.setReadOnly(false);
        hikariConfig12.setRegisterMbeans(true);
        long long17 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setPoolName("HikariPool-159");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4273");
        long long17 = hikariConfig1.getConnectionTimeout();
        long long18 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setPoolName("HikariPool-48113");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-151");
        hikariConfig1.setDataSourceClassName("HikariPool-674");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setJdbcUrl("");
        hikariConfig26.setConnectionTestQuery("hi!");
        hikariConfig20.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig26);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setConnectionInitSql("");
        hikariConfig35.setJdbcUrl("");
        hikariConfig35.setConnectionTestQuery("hi!");
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setTransactionIsolation("");
        javax.sql.DataSource dataSource46 = hikariConfig43.getDataSource();
        long long47 = hikariConfig43.getConnectionTimeout();
        java.lang.String str48 = hikariConfig43.getCatalog();
        hikariConfig43.setInitializationFailFast(false);
        java.util.Properties properties51 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig35.setDataSourceProperties(properties51);
        hikariConfig20.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig62.setConnectionTestQuery("HikariPool-13192");
        boolean boolean65 = hikariConfig62.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(5000L);
        boolean boolean10 = hikariConfig0.isAutoCommit();
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        int int14 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        int int10 = hikariConfig0.getAcquireRetries();
        int int11 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str15 = hikariConfig14.getJdbcUrl();
        hikariConfig14.setMinimumPoolSize(3);
        java.lang.String str18 = hikariConfig14.getJdbcUrl();
        java.lang.String str19 = hikariConfig14.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("");
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        long long17 = hikariConfig13.getConnectionTimeout();
        java.lang.String str18 = hikariConfig13.getCatalog();
        hikariConfig13.setInitializationFailFast(false);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig26.setConnectionInitSql("");
        boolean boolean29 = hikariConfig26.isJdbc4ConnectionTest();
        java.lang.String str30 = hikariConfig26.getCatalog();
        java.lang.String str31 = hikariConfig26.getConnectionTestQuery();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.setAutoCommit(false);
        java.util.Properties properties38 = hikariConfig26.getDataSourceProperties();
        hikariConfig26.setAutoCommit(false);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.setTransactionIsolation("");
        javax.sql.DataSource dataSource45 = hikariConfig42.getDataSource();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.setConnectionInitSql("");
        hikariConfig48.setJdbcUrl("");
        hikariConfig48.setConnectionTestQuery("hi!");
        hikariConfig42.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig48);
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig57.setConnectionInitSql("");
        hikariConfig57.setJdbcUrl("");
        hikariConfig57.setConnectionTestQuery("hi!");
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig65.setTransactionIsolation("");
        javax.sql.DataSource dataSource68 = hikariConfig65.getDataSource();
        long long69 = hikariConfig65.getConnectionTimeout();
        java.lang.String str70 = hikariConfig65.getCatalog();
        hikariConfig65.setInitializationFailFast(false);
        java.util.Properties properties73 = hikariConfig65.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties73);
        hikariConfig57.setDataSourceProperties(properties73);
        hikariConfig42.setDataSourceProperties(properties73);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties73);
        hikariConfig26.setDataSourceProperties(properties73);
        hikariConfig23.setDataSourceProperties(properties73);
        hikariConfig0.setDataSourceProperties(properties73);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties73);
        hikariConfig82.setCatalog("HikariPool-25805");
        long long85 = hikariConfig82.getAcquireRetryDelay();
        long long86 = hikariConfig82.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(dataSource45);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 5000L + "'", long69 == 5000L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 750L + "'", long85 == 750L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1800000L + "'", long86 == 1800000L);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        boolean boolean19 = hikariConfig7.isRegisterMbeans();
        long long20 = hikariConfig7.getIdleTimeout();
        long long21 = hikariConfig7.getMaxLifetime();
        java.util.Properties properties22 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setLeakDetectionThreshold((long) 0);
        java.lang.String str25 = hikariConfig7.getConnectionCustomizerClassName();
        int int26 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setIsolateInternalQueries(true);
        hikariConfig7.setMaximumPoolSize((int) (byte) 10);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-151" + "'", str25, "HikariPool-151");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        hikariConfig1.setConnectionTestQuery("HikariPool-1276");
        hikariConfig1.setIdleTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getCatalog();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-10327");
        hikariConfig0.setDataSourceClassName("HikariPool-25349");
        int int19 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireIncrement(60);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean17 = hikariConfig1.isAutoCommit();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setTransactionIsolation("");
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("");
        hikariConfig26.setJdbcUrl("");
        hikariConfig26.setConnectionTestQuery("hi!");
        hikariConfig20.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig26);
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig26.setConnectionTestQuery("HikariPool-159");
        boolean boolean38 = hikariConfig26.isRegisterMbeans();
        hikariConfig26.setConnectionCustomizerClassName("");
        hikariConfig26.setConnectionTestQuery("HikariPool-15097");
        hikariConfig1.addDataSourceProperty("HikariPool-67831", (java.lang.Object) hikariConfig26);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setJdbcUrl("hi!");
        hikariConfig12.setMaximumPoolSize((int) ' ');
        java.lang.String str18 = hikariConfig12.getConnectionTestQuery();
        hikariConfig12.setRegisterMbeans(true);
        boolean boolean21 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setReadOnly(false);
        hikariConfig0.addDataSourceProperty("HikariPool-1165", (java.lang.Object) hikariConfig12);
        hikariConfig12.setCatalog("HikariPool-1467");
        hikariConfig12.setJdbc4ConnectionTest(false);
        int int29 = hikariConfig12.getMinimumPoolSize();
        hikariConfig12.setConnectionTestQuery("HikariPool-8298");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4991");
        hikariConfig0.setJdbcUrl("HikariPool-9813");
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        java.lang.String str18 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setIdleTimeout(0L);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setCatalog("HikariPool-3808");
        int int13 = hikariConfig1.getMaximumPoolSize();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str15 = hikariConfig1.getCatalog();
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-3808" + "'", str15, "HikariPool-3808");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(5000L);
        hikariConfig0.setMaxLifetime((long) 32);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setTransactionIsolation("HikariPool-627");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-151" + "'", str12, "HikariPool-151");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setPoolName("HikariPool-159");
        hikariConfig1.setMaximumPoolSize(3);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        java.lang.String str18 = hikariConfig1.getJdbcUrl();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setRegisterMbeans(false);
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-14962");
        hikariConfig0.setTransactionIsolation("HikariPool-5015");
        int int13 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        hikariConfig0.setAutoCommit(false);
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetryDelay(97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        long long11 = hikariConfig1.getMaxLifetime();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        int int12 = hikariConfig1.getTransactionIsolation();
        int int13 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setTransactionIsolation("HikariPool-993");
        hikariConfig1.setCatalog("HikariPool-1676");
        hikariConfig1.setConnectionInitSql("HikariPool-998");
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setIdleTimeout(600000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-4907");
        hikariConfig0.setJdbcUrl("HikariPool-3097");
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-9799");
        hikariConfig1.setLeakDetectionThreshold((long) ' ');
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setConnectionInitSql("");
        hikariConfig10.setJdbcUrl("");
        hikariConfig10.setConnectionTestQuery("hi!");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setTransactionIsolation("");
        javax.sql.DataSource dataSource21 = hikariConfig18.getDataSource();
        long long22 = hikariConfig18.getConnectionTimeout();
        java.lang.String str23 = hikariConfig18.getCatalog();
        hikariConfig18.setInitializationFailFast(false);
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig10.setDataSourceProperties(properties26);
        hikariConfig10.setAcquireRetries((int) (short) 0);
        hikariConfig1.addDataSourceProperty("HikariPool-6788", (java.lang.Object) hikariConfig10);
        javax.sql.DataSource dataSource33 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(dataSource33);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2070");
        int int15 = hikariConfig1.getTransactionIsolation();
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        int int27 = hikariConfig21.getTransactionIsolation();
        boolean boolean28 = hikariConfig21.isJdbc4ConnectionTest();
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig32.setIsolateInternalQueries(false);
        hikariConfig32.setIdleTimeout((long) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setUseInstrumentation(true);
        long long10 = hikariConfig1.getMaxLifetime();
        java.lang.String str11 = hikariConfig1.getPoolName();
        int int12 = hikariConfig1.getMinimumPoolSize();
        long long13 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-71019" + "'", str11, "HikariPool-71019");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("");
        hikariConfig11.setJdbcUrl("");
        hikariConfig11.setConnectionTestQuery("hi!");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isReadOnly();
        java.lang.String str22 = hikariConfig20.getDataSourceClassName();
        hikariConfig20.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig11.addDataSourceProperty("HikariPool-158", (java.lang.Object) (byte) 100);
        int int26 = hikariConfig11.getMaximumPoolSize();
        hikariConfig11.setJdbcUrl("HikariPool-158");
        java.lang.String str29 = hikariConfig11.getCatalog();
        hikariConfig11.setConnectionInitSql("HikariPool-12515");
        hikariConfig1.addDataSourceProperty("HikariPool-40995", (java.lang.Object) "HikariPool-12515");
        boolean boolean33 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isReadOnly();
        java.lang.String str15 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean18 = hikariConfig13.isAutoCommit();
        long long19 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-1561", (java.lang.Object) hikariConfig13);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getConnectionCustomizerClassName();
        int int25 = hikariConfig23.getAcquireIncrement();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig23.setDataSource(dataSource26);
        hikariConfig23.setIdleTimeout((long) (short) 10);
        hikariConfig23.setConnectionTestQuery("");
        long long32 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.setAcquireIncrement((int) 'a');
        hikariConfig13.addDataSourceProperty("HikariPool-4356", (java.lang.Object) 'a');
        hikariConfig13.setLeakDetectionThreshold((long) 3);
        java.lang.String str38 = hikariConfig13.getConnectionCustomizerClassName();
        boolean boolean39 = hikariConfig13.isRegisterMbeans();
        java.lang.String str40 = hikariConfig13.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 750L + "'", long32 == 750L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-1164");
        java.lang.String str4 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-1164" + "'", str4, "HikariPool-1164");
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("hi!");
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-7880");
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        int int15 = hikariConfig1.getAcquireIncrement();
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        hikariConfig1.setMaximumPoolSize((int) '#');
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        int int21 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-71032" + "'", str15, "HikariPool-71032");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetries(0);
        int int10 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int18 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setReadOnly(true);
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        long long24 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime(10L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        long long8 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-7428");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-12155");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        int int4 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-969");
        hikariConfig0.setMinimumPoolSize((int) '#');
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setJdbcUrl("");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig13.setDataSource(dataSource18);
        long long20 = hikariConfig13.getMaxLifetime();
        boolean boolean21 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setMaximumPoolSize((int) '#');
        boolean boolean24 = hikariConfig13.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig13.setDataSource(dataSource25);
        hikariConfig0.addDataSourceProperty("HikariPool-29991", (java.lang.Object) hikariConfig13);
        hikariConfig0.setAcquireRetryDelay(600000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaximumPoolSize(100);
        long long11 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setTransactionIsolation("HikariPool-2937");
        hikariConfig0.setJdbcUrl("HikariPool-3110");
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-3110");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(true);
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        int int7 = hikariConfig6.getAcquireRetries();
        hikariConfig6.setJdbcUrl("hi!");
        hikariConfig6.setMaximumPoolSize((int) ' ');
        java.lang.String str12 = hikariConfig6.getConnectionTestQuery();
        hikariConfig6.setRegisterMbeans(true);
        boolean boolean15 = hikariConfig6.isJdbc4ConnectionTest();
        hikariConfig6.setReadOnly(false);
        hikariConfig6.setLeakDetectionThreshold((long) (short) 100);
        int int20 = hikariConfig6.getMinimumPoolSize();
        java.util.Properties properties21 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        int int23 = hikariConfig22.getAcquireRetries();
        hikariConfig22.setJdbcUrl("hi!");
        hikariConfig22.setAutoCommit(true);
        hikariConfig22.setIdleTimeout(1L);
        hikariConfig22.setConnectionTestQuery("hi!");
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isReadOnly();
        java.lang.String str35 = hikariConfig33.getDataSourceClassName();
        hikariConfig33.setJdbcUrl("hi!");
        boolean boolean38 = hikariConfig33.isReadOnly();
        hikariConfig33.setTransactionIsolation("HikariPool-158");
        hikariConfig33.setUseInstrumentation(false);
        java.util.Properties properties43 = hikariConfig33.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties43);
        hikariConfig6.setDataSourceProperties(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        java.util.Properties properties47 = hikariConfig46.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties47);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        hikariConfig3.setConnectionInitSql("");
        hikariConfig3.setJdbcUrl("");
        hikariConfig3.setConnectionTestQuery("hi!");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        java.lang.String str16 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig3.setDataSourceProperties(properties19);
        hikariConfig0.setDataSourceProperties(properties19);
        hikariConfig0.setTransactionIsolation("HikariPool-130");
        hikariConfig0.setMaximumPoolSize((int) '4');
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 60);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-52223");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        int int14 = hikariConfig0.getMaximumPoolSize();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-674");
        hikariConfig0.setAutoCommit(true);
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-12100");
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        boolean boolean23 = hikariConfig20.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig20.getCatalog();
        java.lang.String str25 = hikariConfig20.getConnectionTestQuery();
        hikariConfig20.setLeakDetectionThreshold((long) '4');
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.setAutoCommit(false);
        hikariConfig20.setTransactionIsolation("HikariPool-158");
        hikariConfig20.setLeakDetectionThreshold((-1L));
        int int36 = hikariConfig20.getMaximumPoolSize();
        hikariConfig20.setConnectionInitSql("");
        long long39 = hikariConfig20.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource40 = null;
        hikariConfig20.setDataSource(dataSource40);
        hikariConfig0.addDataSourceProperty("HikariPool-1428", (java.lang.Object) hikariConfig20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        int int5 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setConnectionInitSql("");
        boolean boolean9 = hikariConfig6.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig6.getCatalog();
        java.lang.String str11 = hikariConfig6.getCatalog();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.util.Properties properties13 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig0.setDataSourceProperties(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        int int7 = hikariConfig0.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-1339");
        hikariConfig1.setLeakDetectionThreshold(52L);
        java.lang.String str13 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        boolean boolean18 = hikariConfig15.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig15.getCatalog();
        hikariConfig15.setInitializationFailFast(true);
        hikariConfig15.setIdleTimeout((long) (byte) 1);
        hikariConfig15.setMaxLifetime(600000L);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getConnectionCustomizerClassName();
        java.lang.String str29 = hikariConfig27.getCatalog();
        hikariConfig27.setAcquireRetryDelay((long) '4');
        hikariConfig27.setConnectionCustomizerClassName("HikariPool-1068");
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        long long35 = hikariConfig34.getMaxLifetime();
        int int36 = hikariConfig34.getAcquireIncrement();
        long long37 = hikariConfig34.getIdleTimeout();
        hikariConfig34.setRegisterMbeans(false);
        java.util.Properties properties40 = hikariConfig34.getDataSourceProperties();
        hikariConfig27.setDataSourceProperties(properties40);
        hikariConfig15.setDataSourceProperties(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.lang.String str46 = hikariConfig45.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 600000L + "'", long37 == 600000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        int int9 = hikariConfig1.getTransactionIsolation();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-18324");
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        long long13 = hikariConfig1.getConnectionTimeout();
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((-1L));
        int int17 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.util.Properties properties1 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig2.setConnectionInitSql("");
        boolean boolean5 = hikariConfig2.isJdbc4ConnectionTest();
        hikariConfig2.setJdbcUrl("hi!");
        boolean boolean8 = hikariConfig2.isJdbc4ConnectionTest();
        java.lang.String str9 = hikariConfig2.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("");
        hikariConfig11.setJdbcUrl("");
        hikariConfig11.setConnectionTestQuery("hi!");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        javax.sql.DataSource dataSource22 = hikariConfig19.getDataSource();
        long long23 = hikariConfig19.getConnectionTimeout();
        java.lang.String str24 = hikariConfig19.getCatalog();
        hikariConfig19.setInitializationFailFast(false);
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig11.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig2.setDataSourceProperties(properties27);
        hikariConfig0.setDataSourceProperties(properties27);
        java.lang.String str34 = hikariConfig0.getConnectionTestQuery();
        int int35 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig36.setConnectionInitSql("");
        boolean boolean39 = hikariConfig36.isJdbc4ConnectionTest();
        java.lang.String str40 = hikariConfig36.getCatalog();
        java.lang.String str41 = hikariConfig36.getConnectionTestQuery();
        hikariConfig36.setLeakDetectionThreshold((long) '4');
        hikariConfig36.setRegisterMbeans(false);
        hikariConfig36.setAutoCommit(false);
        java.util.Properties properties48 = hikariConfig36.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig0.setDataSourceProperties(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties48);
        java.lang.String str54 = hikariConfig53.getPoolName();
        hikariConfig53.setPoolName("HikariPool-41582");
        java.lang.String str57 = hikariConfig53.getCatalog();
        boolean boolean58 = hikariConfig53.isAutoCommit();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties48);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "HikariPool-71085" + "'", str54, "HikariPool-71085");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-566");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-442");
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        javax.sql.DataSource dataSource19 = hikariConfig16.getDataSource();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setConnectionInitSql("");
        hikariConfig22.setJdbcUrl("");
        hikariConfig22.setConnectionTestQuery("hi!");
        hikariConfig16.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig22);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.setConnectionInitSql("");
        hikariConfig31.setJdbcUrl("");
        hikariConfig31.setConnectionTestQuery("hi!");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setTransactionIsolation("");
        javax.sql.DataSource dataSource42 = hikariConfig39.getDataSource();
        long long43 = hikariConfig39.getConnectionTimeout();
        java.lang.String str44 = hikariConfig39.getCatalog();
        hikariConfig39.setInitializationFailFast(false);
        java.util.Properties properties47 = hikariConfig39.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig31.setDataSourceProperties(properties47);
        hikariConfig16.setDataSourceProperties(properties47);
        hikariConfig12.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties47);
        java.lang.String str54 = hikariConfig53.getJdbcUrl();
        java.util.Properties properties55 = hikariConfig53.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.Class<?> wildcardClass58 = hikariConfig57.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-1676");
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.setConnectionInitSql("HikariPool-45645");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig12.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setIdleTimeout((-1L));
        hikariConfig1.setAcquireRetries(0);
        boolean boolean27 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("HikariPool-18877");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        hikariConfig0.setMaxLifetime(600000L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setPoolName("HikariPool-21237");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-27795");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-27795 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        java.lang.String str4 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setIsolateInternalQueries(false);
        int int9 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setIdleTimeout(750L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("HikariPool-993");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-993" + "'", str12, "HikariPool-993");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaxLifetime((long) (short) 100);
        boolean boolean12 = hikariConfig1.isReadOnly();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold(1800000L);
        hikariConfig1.setTransactionIsolation("HikariPool-22013");
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setCatalog("HikariPool-993");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-71113" + "'", str12, "HikariPool-71113");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        int int17 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setConnectionTestQuery("HikariPool-932");
        int int11 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireIncrement(1);
        java.lang.String str25 = hikariConfig7.getDataSourceClassName();
        long long26 = hikariConfig7.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 750L + "'", long26 == 750L);
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setIdleTimeout((-1L));
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-4631");
        long long16 = hikariConfig1.getConnectionTimeout();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-13251");
        hikariConfig1.setDataSourceClassName("HikariPool-33552");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setCatalog("HikariPool-1164");
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig18.setJdbcUrl("hi!");
        boolean boolean24 = hikariConfig18.isJdbc4ConnectionTest();
        long long25 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.setAcquireIncrement(100);
        hikariConfig18.setMaximumPoolSize(0);
        java.lang.String str30 = hikariConfig18.getJdbcUrl();
        boolean boolean31 = hikariConfig18.isReadOnly();
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) hikariConfig18);
        boolean boolean33 = hikariConfig13.isAutoCommit();
        hikariConfig13.setAcquireRetries((int) '#');
        hikariConfig0.addDataSourceProperty("HikariPool-69928", (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str6 = hikariConfig1.getPoolName();
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7971");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-71123" + "'", str6, "HikariPool-71123");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTimeout(600000L);
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig16.setConnectionInitSql("");
        boolean boolean19 = hikariConfig16.isJdbc4ConnectionTest();
        java.lang.String str20 = hikariConfig16.getCatalog();
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setLeakDetectionThreshold((long) '4');
        hikariConfig16.setMaxLifetime(5000L);
        hikariConfig16.setAcquireRetries((int) (short) 1);
        java.util.Properties properties28 = hikariConfig16.getDataSourceProperties();
        java.lang.String str29 = hikariConfig16.getDataSourceClassName();
        java.util.Properties properties30 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties30);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay(600000L);
        hikariConfig1.setConnectionTestQuery("HikariPool-919");
        hikariConfig1.setLeakDetectionThreshold(10L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setCatalog("HikariPool-1881");
        hikariConfig0.setJdbcUrl("HikariPool-2937");
        hikariConfig0.setAcquireRetryDelay((long) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isRegisterMbeans();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        int int19 = hikariConfig0.getAcquireRetries();
        int int20 = hikariConfig0.getAcquireIncrement();
        int int21 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireRetryDelay(10L);
        hikariConfig7.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig7.setConnectionTestQuery("HikariPool-2594");
        java.lang.String str29 = hikariConfig7.getJdbcUrl();
        int int30 = hikariConfig7.getTransactionIsolation();
        hikariConfig7.setUseInstrumentation(true);
        java.lang.String str33 = hikariConfig7.getDataSourceClassName();
        javax.sql.DataSource dataSource34 = hikariConfig7.getDataSource();
        hikariConfig7.setDataSourceClassName("HikariPool-13192");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource34);
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-35181");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-35181 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        boolean boolean16 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig14.setInitializationFailFast(true);
        hikariConfig14.setConnectionTestQuery("HikariPool-1636");
        java.lang.String str19 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setMinimumPoolSize((int) (byte) 0);
        hikariConfig14.setConnectionTimeout(5000L);
        boolean boolean24 = hikariConfig14.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isAutoCommit();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize(32);
        hikariConfig1.setConnectionInitSql("HikariPool-40563");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str17 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-8058");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(true);
        long long18 = hikariConfig1.getIdleTimeout();
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionInitSql("HikariPool-14442");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setAcquireRetries((int) '#');
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaxLifetime((long) '4');
        long long16 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("HikariPool-9045");
        hikariConfig0.setRegisterMbeans(true);
        long long21 = hikariConfig0.getConnectionTimeout();
        int int22 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str23 = hikariConfig0.getConnectionTestQuery();
        boolean boolean24 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIdleTimeout((-1L));
        long long8 = hikariConfig0.getMaxLifetime();
        int int9 = hikariConfig0.getAcquireRetries();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime(0L);
        boolean boolean13 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setConnectionInitSql("HikariPool-12515");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-18005");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getAcquireRetries();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        long long10 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        long long15 = hikariConfig0.getMaxLifetime();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isRegisterMbeans();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        int int19 = hikariConfig0.getAcquireRetries();
        int int20 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21219");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21219 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-50177");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-50177 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setJdbcUrl("HikariPool-2594");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setTransactionIsolation("HikariPool-44303");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("");
        hikariConfig9.setJdbcUrl("");
        hikariConfig9.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(false);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbcUrl("HikariPool-761");
        long long35 = hikariConfig0.getConnectionTimeout();
        long long36 = hikariConfig0.getMaxLifetime();
        long long37 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setJdbcUrl("HikariPool-8586");
        hikariConfig1.setCatalog("HikariPool-18688");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        int int7 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-69422");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-69422 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        hikariConfig0.setJdbcUrl("HikariPool-11716");
        hikariConfig0.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setPoolName("HikariPool-46726");
        boolean boolean25 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setDataSourceClassName("HikariPool-27138");
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        int int19 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setRegisterMbeans(false);
        long long6 = hikariConfig1.getMaxLifetime();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-71210" + "'", str8, "HikariPool-71210");
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.setMaxLifetime(0L);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMinimumPoolSize(35);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-71212" + "'", str9, "HikariPool-71212");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIdleTimeout(100L);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        int int12 = hikariConfig1.getTransactionIsolation();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig14.setCatalog("HikariPool-919");
        hikariConfig14.setMinimumPoolSize(32);
        long long19 = hikariConfig14.getAcquireRetryDelay();
        int int20 = hikariConfig14.getAcquireIncrement();
        boolean boolean21 = hikariConfig14.isIsolateInternalQueries();
        hikariConfig14.setAcquireRetryDelay(100L);
        long long24 = hikariConfig14.getLeakDetectionThreshold();
        boolean boolean25 = hikariConfig14.isReadOnly();
        hikariConfig14.setAcquireRetries((int) ' ');
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        long long14 = hikariConfig10.getConnectionTimeout();
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean28 = hikariConfig1.isInitializationFailFast();
        int int29 = hikariConfig1.getMaximumPoolSize();
        long long30 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setAcquireRetries(52);
        int int24 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout(3L);
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-3097");
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) 35);
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-23174");
        hikariConfig1.setConnectionTestQuery("HikariPool-19735");
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        long long22 = hikariConfig19.getLeakDetectionThreshold();
        hikariConfig19.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig19.setAcquireIncrement(100);
        hikariConfig19.setReadOnly(true);
        hikariConfig19.setJdbcUrl("HikariPool-151");
        hikariConfig19.setDataSourceClassName("HikariPool-674");
        java.lang.String str33 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setMaxLifetime((long) (short) -1);
        boolean boolean36 = hikariConfig19.isJdbc4ConnectionTest();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.setTransactionIsolation("");
        javax.sql.DataSource dataSource41 = hikariConfig38.getDataSource();
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.setConnectionInitSql("");
        hikariConfig44.setJdbcUrl("");
        hikariConfig44.setConnectionTestQuery("hi!");
        hikariConfig38.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig44);
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig53.setConnectionInitSql("");
        hikariConfig53.setJdbcUrl("");
        hikariConfig53.setConnectionTestQuery("hi!");
        java.util.Properties properties60 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig61.setTransactionIsolation("");
        javax.sql.DataSource dataSource64 = hikariConfig61.getDataSource();
        long long65 = hikariConfig61.getConnectionTimeout();
        java.lang.String str66 = hikariConfig61.getCatalog();
        hikariConfig61.setInitializationFailFast(false);
        java.util.Properties properties69 = hikariConfig61.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties69);
        hikariConfig53.setDataSourceProperties(properties69);
        hikariConfig38.setDataSourceProperties(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties69);
        hikariConfig19.setDataSourceProperties(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties69);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties69);
        hikariConfig1.setDataSourceProperties(properties69);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-674" + "'", str33, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(dataSource64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 5000L + "'", long65 == 5000L);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(properties69);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setPoolName("HikariPool-4091");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getMaxLifetime();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig17.isAutoCommit();
        javax.sql.DataSource dataSource22 = hikariConfig17.getDataSource();
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("hi!");
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(5000L);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-566");
        hikariConfig1.validate();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setMaxLifetime((long) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.lang.String str23 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setLeakDetectionThreshold((long) '4');
        hikariConfig18.setMaxLifetime(5000L);
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties30 = hikariConfig18.getDataSourceProperties();
        java.lang.String str31 = hikariConfig18.getDataSourceClassName();
        boolean boolean32 = hikariConfig18.isInitializationFailFast();
        java.util.Properties properties33 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig0.addDataSourceProperty("HikariPool-8650", (java.lang.Object) hikariConfig34);
        hikariConfig34.setIdleTimeout((long) 1);
        hikariConfig34.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setConnectionTestQuery("HikariPool-932");
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.setPoolName("HikariPool-159");
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-41559");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        java.lang.String str5 = hikariConfig0.getPoolName();
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbcUrl("HikariPool-47254");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-71280" + "'", str5, "HikariPool-71280");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-102");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-159");
        boolean boolean20 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        hikariConfig0.setConnectionTestQuery("HikariPool-65070");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long13 = hikariConfig1.getIdleTimeout();
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-3808");
        hikariConfig1.setConnectionTestQuery("HikariPool-919");
        long long13 = hikariConfig1.getIdleTimeout();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setAcquireRetryDelay((long) (short) 100);
        hikariConfig16.setMinimumPoolSize((int) (byte) 100);
        hikariConfig16.setJdbcUrl("hi!");
        int int23 = hikariConfig16.getAcquireIncrement();
        java.util.Properties properties24 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.setDataSourceProperties(properties24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setCatalog("");
        hikariConfig1.setCatalog("HikariPool-674");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str12 = hikariConfig11.getConnectionCustomizerClassName();
        int int13 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setConnectionCustomizerClassName("HikariPool-151");
        long long16 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.setMaxLifetime((long) 10);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig21.setUseInstrumentation(true);
        hikariConfig21.setMaxLifetime((long) (short) 100);
        java.lang.String str26 = hikariConfig21.getCatalog();
        hikariConfig21.setCatalog("HikariPool-35451");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-3097");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        hikariConfig1.setMaximumPoolSize(3);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setAutoCommit(false);
        hikariConfig10.setUseInstrumentation(false);
        hikariConfig10.setMaximumPoolSize(1);
        hikariConfig10.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig10.setAcquireRetries(32);
        int int21 = hikariConfig10.getTransactionIsolation();
        boolean boolean22 = hikariConfig10.isJdbc4ConnectionTest();
        int int23 = hikariConfig10.getAcquireRetries();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setAcquireRetryDelay((long) (short) 100);
        hikariConfig25.setMinimumPoolSize((int) (byte) 100);
        hikariConfig25.setJdbcUrl("hi!");
        java.util.Properties properties32 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig10.setDataSourceProperties(properties32);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        int int10 = hikariConfig1.getMaximumPoolSize();
        int int11 = hikariConfig1.getTransactionIsolation();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-43180");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-5014");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5014' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-69950");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-69950 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("HikariPool-993");
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-15364");
        hikariConfig1.setIdleTimeout((long) 3);
        long long16 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-71311" + "'", str11, "HikariPool-71311");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-71314" + "'", str15, "HikariPool-71314");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-998");
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.lang.String str23 = hikariConfig18.getConnectionTestQuery();
        long long24 = hikariConfig18.getAcquireRetryDelay();
        java.lang.String str25 = hikariConfig18.getJdbcUrl();
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-919");
        hikariConfig18.setInitializationFailFast(false);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.setConnectionInitSql("");
        hikariConfig31.setJdbcUrl("");
        hikariConfig31.setConnectionTestQuery("hi!");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setTransactionIsolation("");
        javax.sql.DataSource dataSource42 = hikariConfig39.getDataSource();
        long long43 = hikariConfig39.getConnectionTimeout();
        java.lang.String str44 = hikariConfig39.getCatalog();
        hikariConfig39.setInitializationFailFast(false);
        java.util.Properties properties47 = hikariConfig39.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig31.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig18.setDataSourceProperties(properties47);
        java.util.Properties properties54 = hikariConfig18.getDataSourceProperties();
        hikariConfig16.addDataSourceProperty("HikariPool-15580", (java.lang.Object) properties54);
        hikariConfig16.setMaximumPoolSize((int) (byte) 100);
        hikariConfig16.setPoolName("HikariPool-57904");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        boolean boolean10 = hikariConfig1.isReadOnly();
        int int11 = hikariConfig1.getTransactionIsolation();
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-71326" + "'", str17, "HikariPool-71326");
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean13 = hikariConfig1.isReadOnly();
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setTransactionIsolation("");
        hikariConfig6.setCatalog("");
        hikariConfig6.setMinimumPoolSize(100);
        java.lang.String str13 = hikariConfig6.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setConnectionInitSql("");
        boolean boolean17 = hikariConfig14.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig14.getCatalog();
        java.lang.String str19 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setLeakDetectionThreshold((long) '4');
        hikariConfig14.setMaxLifetime(5000L);
        hikariConfig14.setAcquireRetries((int) (short) 1);
        java.util.Properties properties26 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setTransactionIsolation("");
        javax.sql.DataSource dataSource32 = hikariConfig29.getDataSource();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setConnectionInitSql("");
        hikariConfig35.setJdbcUrl("");
        hikariConfig35.setConnectionTestQuery("hi!");
        hikariConfig29.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig35);
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.setConnectionInitSql("");
        hikariConfig44.setJdbcUrl("");
        hikariConfig44.setConnectionTestQuery("hi!");
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setTransactionIsolation("");
        javax.sql.DataSource dataSource55 = hikariConfig52.getDataSource();
        long long56 = hikariConfig52.getConnectionTimeout();
        java.lang.String str57 = hikariConfig52.getCatalog();
        hikariConfig52.setInitializationFailFast(false);
        java.util.Properties properties60 = hikariConfig52.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig44.setDataSourceProperties(properties60);
        hikariConfig29.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig14.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties60);
        hikariConfig6.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig1.setDataSourceProperties(properties60);
        hikariConfig1.setConnectionTestQuery("HikariPool-5901");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("HikariPool-56340");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 5000L + "'", long56 == 5000L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setCatalog("HikariPool-56043");
        hikariConfig0.setJdbcUrl("HikariPool-51106");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        boolean boolean10 = hikariConfig1.isReadOnly();
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setCatalog("HikariPool-11074");
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setTransactionIsolation("HikariPool-6951");
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.setDataSource(dataSource24);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setCatalog("HikariPool-1164");
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig5.setConnectionInitSql("");
        boolean boolean8 = hikariConfig5.isJdbc4ConnectionTest();
        hikariConfig5.setJdbcUrl("hi!");
        boolean boolean11 = hikariConfig5.isJdbc4ConnectionTest();
        long long12 = hikariConfig5.getLeakDetectionThreshold();
        hikariConfig5.setAcquireIncrement(100);
        hikariConfig5.setMaximumPoolSize(0);
        java.lang.String str17 = hikariConfig5.getJdbcUrl();
        boolean boolean18 = hikariConfig5.isReadOnly();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig5);
        hikariConfig5.setDataSourceClassName("HikariPool-627");
        int int22 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setPoolName("");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setConnectionTestQuery("HikariPool-26811");
        java.lang.String str11 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getMaxLifetime();
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = hikariConfig10.getDataSource();
        long long14 = hikariConfig10.getConnectionTimeout();
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setInitializationFailFast(false);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        hikariConfig1.setDataSourceClassName("HikariPool-1844");
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean30 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireRetryDelay(10L);
        hikariConfig7.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig7.setConnectionTestQuery("HikariPool-2594");
        hikariConfig7.setMaxLifetime(600000L);
        boolean boolean31 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setRegisterMbeans(false);
        hikariConfig7.setAutoCommit(true);
        hikariConfig7.setDataSourceClassName("HikariPool-14496");
        hikariConfig7.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig10.setAcquireIncrement((int) (byte) 1);
        java.lang.String str13 = hikariConfig10.getPoolName();
        boolean boolean14 = hikariConfig10.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-71368" + "'", str13, "HikariPool-71368");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        int int10 = hikariConfig1.getMaximumPoolSize();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaximumPoolSize(1);
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(false);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        int int8 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIsolateInternalQueries(false);
        long long7 = hikariConfig1.getConnectionTimeout();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAutoCommit(false);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-674");
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource25 = hikariConfig17.getDataSource();
        hikariConfig17.setAcquireRetryDelay(10L);
        hikariConfig17.setRegisterMbeans(true);
        hikariConfig0.addDataSourceProperty("HikariPool-3110", (java.lang.Object) true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaxLifetime((long) 10);
        java.lang.String str35 = hikariConfig0.getPoolName();
        java.lang.String str36 = hikariConfig0.getConnectionInitSql();
        boolean boolean37 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setAcquireIncrement((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-71383" + "'", str35, "HikariPool-71383");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-49449");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setConnectionInitSql("");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        hikariConfig10.setConnectionTestQuery("");
        hikariConfig10.setConnectionInitSql("HikariPool-382");
        hikariConfig1.addDataSourceProperty("HikariPool-2875", (java.lang.Object) hikariConfig10);
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetryDelay((long) '#');
        javax.sql.DataSource dataSource25 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37524");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37524 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setMaximumPoolSize(1);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setConnectionInitSql("");
        boolean boolean13 = hikariConfig10.isJdbc4ConnectionTest();
        java.lang.String str14 = hikariConfig10.getCatalog();
        java.lang.String str15 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.setLeakDetectionThreshold((long) '4');
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.setAutoCommit(false);
        java.util.Properties properties22 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean26 = hikariConfig25.isIsolateInternalQueries();
        long long27 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.setMinimumPoolSize(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 750L + "'", long27 == 750L);
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        long long4 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1745");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-56428");
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setCatalog("HikariPool-993");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-12428");
        long long22 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-71396" + "'", str12, "HikariPool-71396");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int27 = hikariConfig1.getAcquireIncrement();
        java.lang.String str28 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        int int14 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setConnectionInitSql("");
        hikariConfig16.setDataSourceClassName("");
        hikariConfig16.setConnectionCustomizerClassName("");
        long long23 = hikariConfig16.getLeakDetectionThreshold();
        int int24 = hikariConfig16.getAcquireIncrement();
        long long25 = hikariConfig16.getAcquireRetryDelay();
        java.util.Properties properties26 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig0.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int31 = hikariConfig30.getMaximumPoolSize();
        hikariConfig30.setMinimumPoolSize(52);
        hikariConfig30.setConnectionTestQuery("HikariPool-40449");
        hikariConfig30.setTransactionIsolation("HikariPool-2544");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setUseInstrumentation(false);
        hikariConfig7.setAutoCommit(false);
        int int12 = hikariConfig7.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setConnectionInitSql("");
        boolean boolean11 = hikariConfig8.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig8.getCatalog();
        hikariConfig8.setReadOnly(false);
        java.lang.String str15 = hikariConfig8.getConnectionInitSql();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setAcquireRetryDelay((long) (short) 100);
        hikariConfig17.setMinimumPoolSize((int) (byte) 100);
        hikariConfig17.setJdbcUrl("hi!");
        java.lang.String str24 = hikariConfig17.getJdbcUrl();
        java.lang.String str25 = hikariConfig17.getDataSourceClassName();
        boolean boolean26 = hikariConfig17.isRegisterMbeans();
        hikariConfig17.setPoolName("HikariPool-998");
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setTransactionIsolation("");
        boolean boolean37 = hikariConfig34.isInitializationFailFast();
        java.lang.String str38 = hikariConfig34.getCatalog();
        boolean boolean39 = hikariConfig34.isInitializationFailFast();
        boolean boolean40 = hikariConfig34.isAutoCommit();
        hikariConfig34.setAcquireIncrement(1);
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.setTransactionIsolation("");
        boolean boolean47 = hikariConfig44.isInitializationFailFast();
        hikariConfig44.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig50.setConnectionInitSql("");
        boolean boolean53 = hikariConfig50.isJdbc4ConnectionTest();
        java.lang.String str54 = hikariConfig50.getCatalog();
        hikariConfig50.setReadOnly(false);
        java.lang.String str57 = hikariConfig50.getConnectionInitSql();
        hikariConfig50.setIsolateInternalQueries(false);
        java.util.Properties properties60 = hikariConfig50.getDataSourceProperties();
        hikariConfig44.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig34.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig32.setDataSourceProperties(properties60);
        hikariConfig1.addDataSourceProperty("HikariPool-57187", (java.lang.Object) properties60);
        boolean boolean67 = hikariConfig1.isAutoCommit();
        int int68 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1881");
        int int15 = hikariConfig0.getAcquireRetries();
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        boolean boolean17 = hikariConfig0.isReadOnly();
        long long18 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setCatalog("HikariPool-2374");
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        int int18 = hikariConfig1.getAcquireIncrement();
        long long19 = hikariConfig1.getIdleTimeout();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-35332");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-35332 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig2 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig2.setConnectionInitSql("");
        boolean boolean5 = hikariConfig2.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig2.getCatalog();
        java.lang.String str7 = hikariConfig2.getConnectionTestQuery();
        hikariConfig2.setLeakDetectionThreshold((long) '4');
        long long10 = hikariConfig2.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        hikariConfig2.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.addDataSourceProperty("HikariPool-3107", (java.lang.Object) "HikariPool-1164");
        long long30 = hikariConfig26.getIdleTimeout();
        hikariConfig26.setAcquireRetryDelay(1800000L);
        hikariConfig26.setRegisterMbeans(true);
        boolean boolean35 = hikariConfig26.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig26.setDriverClassName("HikariPool-45638");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-45638' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIdleTimeout((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        int int19 = hikariConfig1.getMaximumPoolSize();
        int int20 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str21 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-9551");
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.setConnectionInitSql("");
        hikariConfig27.setJdbcUrl("");
        javax.sql.DataSource dataSource32 = null;
        hikariConfig27.setDataSource(dataSource32);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig27.setDataSource(dataSource34);
        hikariConfig27.setIdleTimeout((long) 3);
        java.lang.String str38 = hikariConfig27.getConnectionInitSql();
        long long39 = hikariConfig27.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-60639", (java.lang.Object) long39);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 750L + "'", long39 == 750L);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getMaxLifetime();
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setMaximumPoolSize(60);
        hikariConfig0.setJdbcUrl("HikariPool-40406");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(1L);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        int int19 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setMaxLifetime(0L);
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        java.lang.String str17 = hikariConfig13.getDataSourceClassName();
        java.lang.Class<?> wildcardClass18 = hikariConfig13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-761");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig13.setDataSource(dataSource14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMinimumPoolSize(100);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setLeakDetectionThreshold((long) '4');
        hikariConfig9.setMaxLifetime(5000L);
        hikariConfig9.setAcquireRetries((int) (short) 1);
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setConnectionInitSql("");
        hikariConfig30.setJdbcUrl("");
        hikariConfig30.setConnectionTestQuery("hi!");
        hikariConfig24.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig30);
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setConnectionInitSql("");
        hikariConfig39.setJdbcUrl("");
        hikariConfig39.setConnectionTestQuery("hi!");
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig47.setTransactionIsolation("");
        javax.sql.DataSource dataSource50 = hikariConfig47.getDataSource();
        long long51 = hikariConfig47.getConnectionTimeout();
        java.lang.String str52 = hikariConfig47.getCatalog();
        hikariConfig47.setInitializationFailFast(false);
        java.util.Properties properties55 = hikariConfig47.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig39.setDataSourceProperties(properties55);
        hikariConfig24.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig9.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties55);
        hikariConfig1.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties55);
        boolean boolean65 = hikariConfig64.isAutoCommit();
        hikariConfig64.setTransactionIsolation("");
        long long68 = hikariConfig64.getLeakDetectionThreshold();
        int int69 = hikariConfig64.getTransactionIsolation();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 5000L + "'", long51 == 5000L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setAutoCommit(false);
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig14.setCatalog("HikariPool-919");
        hikariConfig14.setMinimumPoolSize(32);
        long long19 = hikariConfig14.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig14.getCatalog();
        javax.sql.DataSource dataSource21 = hikariConfig14.getDataSource();
        hikariConfig14.setMaximumPoolSize((int) (short) 0);
        int int24 = hikariConfig14.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-919" + "'", str20, "HikariPool-919");
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setLeakDetectionThreshold((-1L));
        int int16 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        java.lang.String str20 = hikariConfig0.getCatalog();
        long long21 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setConnectionTimeout((long) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold(52L);
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) (-1));
        int int15 = hikariConfig0.getTransactionIsolation();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        int int14 = hikariConfig0.getTransactionIsolation();
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        java.lang.String str22 = hikariConfig17.getConnectionTestQuery();
        hikariConfig17.setLeakDetectionThreshold((long) '4');
        hikariConfig17.setMaxLifetime(5000L);
        hikariConfig17.setAcquireRetries((int) (short) 1);
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        boolean boolean30 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setConnectionTestQuery("HikariPool-998");
        long long33 = hikariConfig17.getMaxLifetime();
        hikariConfig17.setConnectionTestQuery("HikariPool-2907");
        hikariConfig17.setDataSourceClassName("HikariPool-6271");
        hikariConfig0.addDataSourceProperty("HikariPool-25607", (java.lang.Object) hikariConfig17);
        java.lang.Class<?> wildcardClass39 = hikariConfig17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-30561");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireIncrement(60);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        hikariConfig1.setAcquireRetryDelay(600000L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIdleTimeout(1800000L);
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(true);
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-55800");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("HikariPool-1068");
        hikariConfig1.setTransactionIsolation("HikariPool-4044");
        long long14 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) ' ');
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        int int21 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isReadOnly();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-66993");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setAutoCommit(false);
        hikariConfig0.addDataSourceProperty("HikariPool-102", (java.lang.Object) hikariConfig18);
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        int int24 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaximumPoolSize(35);
        boolean boolean27 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-151");
        hikariConfig7.setConnectionTestQuery("HikariPool-159");
        hikariConfig7.setCatalog("HikariPool-674");
        hikariConfig7.setUseInstrumentation(true);
        hikariConfig7.setAcquireRetryDelay(10L);
        hikariConfig7.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig7.setConnectionTestQuery("HikariPool-2594");
        java.lang.String str29 = hikariConfig7.getJdbcUrl();
        java.util.Properties properties30 = hikariConfig7.getDataSourceProperties();
        long long31 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setPoolName("HikariPool-6788");
        hikariConfig7.setMaxLifetime(0L);
        hikariConfig7.setAcquireRetryDelay(60L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setDataSourceClassName("HikariPool-29993");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("");
        hikariConfig9.setJdbcUrl("");
        hikariConfig9.setConnectionTestQuery("hi!");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        long long21 = hikariConfig17.getConnectionTimeout();
        java.lang.String str22 = hikariConfig17.getCatalog();
        hikariConfig17.setInitializationFailFast(false);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        boolean boolean31 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str32 = hikariConfig0.getConnectionInitSql();
        long long33 = hikariConfig0.getMaxLifetime();
        int int34 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1800000L + "'", long33 == 1800000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) '#');
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setConnectionInitSql("");
        boolean boolean18 = hikariConfig15.isJdbc4ConnectionTest();
        hikariConfig15.setJdbcUrl("hi!");
        boolean boolean21 = hikariConfig15.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig15.getJdbcUrl();
        boolean boolean23 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setRegisterMbeans(false);
        java.util.Properties properties26 = hikariConfig15.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionInitSql("HikariPool-159");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        int int16 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setAcquireRetryDelay((long) 32);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setJdbcUrl("");
        hikariConfig20.setConnectionTestQuery("hi!");
        hikariConfig14.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig20);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setConnectionInitSql("");
        hikariConfig29.setJdbcUrl("");
        hikariConfig29.setConnectionTestQuery("hi!");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setTransactionIsolation("");
        javax.sql.DataSource dataSource40 = hikariConfig37.getDataSource();
        long long41 = hikariConfig37.getConnectionTimeout();
        java.lang.String str42 = hikariConfig37.getCatalog();
        hikariConfig37.setInitializationFailFast(false);
        java.util.Properties properties45 = hikariConfig37.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig29.setDataSourceProperties(properties45);
        hikariConfig14.setDataSourceProperties(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig0.setDataSourceProperties(properties45);
        hikariConfig0.setAcquireRetryDelay((long) 32);
        hikariConfig0.setLeakDetectionThreshold((-1L));
        java.lang.String str58 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setConnectionInitSql("");
        boolean boolean12 = hikariConfig9.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig9.getCatalog();
        java.lang.String str14 = hikariConfig9.getConnectionTestQuery();
        hikariConfig9.setLeakDetectionThreshold((long) '4');
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setAutoCommit(false);
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        int int23 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setJdbcUrl("HikariPool-1908");
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setIdleTimeout(97L);
        boolean boolean32 = hikariConfig0.isReadOnly();
        int int33 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-1881");
        hikariConfig1.setDataSourceClassName("HikariPool-61539");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIdleTimeout((long) 10);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-21367");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int11 = hikariConfig10.getTransactionIsolation();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        hikariConfig10.setReadOnly(false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str15 = hikariConfig14.getJdbcUrl();
        boolean boolean16 = hikariConfig14.isIsolateInternalQueries();
        hikariConfig14.setMaxLifetime(100L);
        hikariConfig14.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isReadOnly();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setJdbcUrl("hi!");
        boolean boolean19 = hikariConfig14.isReadOnly();
        hikariConfig14.setTransactionIsolation("HikariPool-158");
        hikariConfig14.setUseInstrumentation(false);
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties24);
        java.lang.String str26 = hikariConfig0.getPoolName();
        java.lang.String str27 = hikariConfig0.getPoolName();
        long long28 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean29 = hikariConfig0.isIsolateInternalQueries();
        int int30 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-71528" + "'", str26, "HikariPool-71528");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-71528" + "'", str27, "HikariPool-71528");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 750L + "'", long28 == 750L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int20 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        int int20 = hikariConfig1.getMaximumPoolSize();
        int int21 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setInitializationFailFast(false);
        hikariConfig10.setIdleTimeout((long) (byte) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-1637", (java.lang.Object) hikariConfig10);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isReadOnly();
        java.lang.String str25 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig23.setMaximumPoolSize(0);
        boolean boolean30 = hikariConfig23.isReadOnly();
        hikariConfig23.setAcquireRetryDelay(100L);
        int int33 = hikariConfig23.getAcquireIncrement();
        boolean boolean34 = hikariConfig23.isIsolateInternalQueries();
        hikariConfig23.setJdbcUrl("HikariPool-8201");
        boolean boolean37 = hikariConfig23.isReadOnly();
        long long38 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig10.addDataSourceProperty("HikariPool-20980", (java.lang.Object) hikariConfig23);
        hikariConfig23.setMaxLifetime(60L);
        long long42 = hikariConfig23.getAcquireRetryDelay();
        java.lang.String str43 = hikariConfig23.getCatalog();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setMaxLifetime((long) 1);
        boolean boolean13 = hikariConfig10.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbcUrl("HikariPool-1276");
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setAcquireRetryDelay((long) (short) 100);
        hikariConfig14.setMinimumPoolSize((int) (byte) 100);
        hikariConfig14.setJdbcUrl("hi!");
        java.lang.String str21 = hikariConfig14.getJdbcUrl();
        java.lang.String str22 = hikariConfig14.getDataSourceClassName();
        boolean boolean23 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setPoolName("HikariPool-998");
        int int26 = hikariConfig14.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-26408", (java.lang.Object) int26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionInitSql("HikariPool-159");
        hikariConfig0.setDataSourceClassName("HikariPool-46762");
        hikariConfig0.setIsolateInternalQueries(false);
        int int19 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setMaxLifetime((long) (short) 100);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAcquireRetryDelay(60L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        boolean boolean10 = hikariConfig0.isReadOnly();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isReadOnly();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setJdbcUrl("hi!");
        boolean boolean19 = hikariConfig14.isReadOnly();
        hikariConfig14.setTransactionIsolation("HikariPool-158");
        hikariConfig14.setUseInstrumentation(false);
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties24);
        long long26 = hikariConfig0.getMaxLifetime();
        java.lang.String str27 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-761");
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        int int3 = hikariConfig0.getMaximumPoolSize();
        int int4 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireIncrement(97);
        hikariConfig0.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        hikariConfig1.setReadOnly(true);
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-64554");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str9 = hikariConfig1.getPoolName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-71551" + "'", str9, "HikariPool-71551");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setTransactionIsolation("");
        javax.sql.DataSource dataSource12 = hikariConfig9.getDataSource();
        long long13 = hikariConfig9.getConnectionTimeout();
        java.lang.String str14 = hikariConfig9.getCatalog();
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties17 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setAutoCommit(false);
        hikariConfig0.addDataSourceProperty("HikariPool-102", (java.lang.Object) hikariConfig18);
        boolean boolean22 = hikariConfig18.isIsolateInternalQueries();
        int int23 = hikariConfig18.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setCatalog("HikariPool-20439");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14434");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14434 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        int int11 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setAcquireRetryDelay((long) 0);
        hikariConfig10.setReadOnly(true);
        long long16 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.setIsolateInternalQueries(false);
        hikariConfig10.setIsolateInternalQueries(false);
        int int21 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setIdleTimeout(0L);
        hikariConfig0.addDataSourceProperty("HikariPool-1164", (java.lang.Object) hikariConfig10);
        int int25 = hikariConfig10.getAcquireRetries();
        java.lang.String str26 = hikariConfig10.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.util.Properties properties14 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setConnectionTestQuery("HikariPool-3343");
        java.lang.String str17 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setConnectionInitSql("HikariPool-21291");
        java.lang.String str20 = hikariConfig13.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setConnectionTestQuery("hi!");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig7);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-102");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize(1);
        int int23 = hikariConfig1.getTransactionIsolation();
        long long24 = hikariConfig1.getConnectionTimeout();
        long long25 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setJdbcUrl("HikariPool-53173");
        hikariConfig1.setDataSourceClassName("HikariPool-23990");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("HikariPool-1068");
        hikariConfig1.setMaxLifetime((long) (short) 100);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIdleTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setTransactionIsolation("HikariPool-1881");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2875");
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4991");
        hikariConfig0.setJdbcUrl("HikariPool-9813");
        hikariConfig0.setTransactionIsolation("HikariPool-16545");
        java.lang.String str19 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource20 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setConnectionInitSql("HikariPool-1177");
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setDataSourceClassName("HikariPool-566");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-1177");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7938");
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        int int11 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        int int12 = hikariConfig1.getAcquireRetries();
        long long13 = hikariConfig1.getIdleTimeout();
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-761");
        hikariConfig0.setCatalog("HikariPool-566");
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-151");
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig0.getConnectionInitSql();
        java.lang.String str24 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-566" + "'", str14, "HikariPool-566");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setPoolName("HikariPool-159");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4273");
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig1.isReadOnly();
        hikariConfig1.setMinimumPoolSize(3);
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-34725");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-34725 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
