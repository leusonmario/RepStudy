import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setDataSourceClassName("HikariPool-1561");
        hikariConfig1.setReadOnly(false);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setDataSourceClassName("HikariPool-40049");
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        hikariConfig10.setAutoCommit(false);
        int int17 = hikariConfig10.getTransactionIsolation();
        boolean boolean18 = hikariConfig10.isIsolateInternalQueries();
        int int19 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setAutoCommit(true);
        hikariConfig10.setAcquireIncrement(3);
        hikariConfig1.addDataSourceProperty("HikariPool-1604", (java.lang.Object) hikariConfig10);
        boolean boolean25 = hikariConfig10.isReadOnly();
        boolean boolean26 = hikariConfig10.isRegisterMbeans();
        int int27 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setAcquireIncrement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
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
        hikariConfig0.setConnectionInitSql("HikariPool-2875");
        hikariConfig0.setInitializationFailFast(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-36993");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-36993' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
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
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-39444");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
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
        hikariConfig1.setCatalog("HikariPool-38752");
        hikariConfig1.setCatalog("HikariPool-49001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-3808" + "'", str15, "HikariPool-3808");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionTestQuery("hi!");
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setTransactionIsolation("HikariPool-6810");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries(10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-2374");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2374' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        int int9 = hikariConfig1.getAcquireIncrement();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig14.setUseInstrumentation(false);
        hikariConfig14.setJdbcUrl("HikariPool-3097");
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig19.getCatalog();
        hikariConfig19.setReadOnly(false);
        java.lang.String str26 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setIsolateInternalQueries(false);
        java.util.Properties properties29 = hikariConfig19.getDataSourceProperties();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.setConnectionInitSql("");
        hikariConfig31.setDataSourceClassName("");
        hikariConfig31.setConnectionCustomizerClassName("");
        long long38 = hikariConfig31.getLeakDetectionThreshold();
        int int39 = hikariConfig31.getAcquireIncrement();
        long long40 = hikariConfig31.getAcquireRetryDelay();
        java.util.Properties properties41 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig19.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig14.setDataSourceProperties(properties41);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 750L + "'", long40 == 750L);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
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
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig26.setInitializationFailFast(true);
        hikariConfig26.setDataSourceClassName("HikariPool-1604");
        hikariConfig26.setAcquireRetryDelay((long) 32);
        boolean boolean33 = hikariConfig26.isIsolateInternalQueries();
        long long34 = hikariConfig26.getLeakDetectionThreshold();
        java.lang.String str35 = hikariConfig26.getPoolName();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-61392" + "'", str35, "HikariPool-61392");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-6213");
        hikariConfig1.setPoolName("HikariPool-50111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
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
        hikariConfig1.setReadOnly(false);
        int int16 = hikariConfig1.getMinimumPoolSize();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireIncrement(3);
        hikariConfig1.setAcquireRetryDelay((long) 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setConnectionTimeout(750L);
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setReadOnly(false);
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setIsolateInternalQueries(true);
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-61396" + "'", str8, "HikariPool-61396");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setDataSourceClassName("HikariPool-2491");
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setCatalog("HikariPool-58276");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-158");
        hikariConfig1.setConnectionTestQuery("HikariPool-1276");
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        int int13 = hikariConfig1.getAcquireIncrement();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
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
        int int15 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-17111");
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.lang.String str23 = hikariConfig18.getConnectionTestQuery();
        java.util.Properties properties24 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        boolean boolean28 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setDataSourceClassName("HikariPool-102");
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setConnectionInitSql("HikariPool-2070");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3808");
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-102" + "'", str17, "HikariPool-102");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setRegisterMbeans(true);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-19818");
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        hikariConfig0.setTransactionIsolation("HikariPool-2635");
        hikariConfig0.setJdbcUrl("HikariPool-30379");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-51587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-51587 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
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
        long long17 = hikariConfig1.getMaxLifetime();
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) (short) -1);
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
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig0.isReadOnly();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig0.isReadOnly();
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setPoolName("HikariPool-1636");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
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
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        int int9 = hikariConfig1.getTransactionIsolation();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setPoolName("HikariPool-19949");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        int int15 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getConnectionCustomizerClassName();
        java.lang.String str20 = hikariConfig18.getCatalog();
        hikariConfig18.setAcquireRetryDelay((long) '4');
        hikariConfig1.addDataSourceProperty("HikariPool-5116", (java.lang.Object) '4');
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        boolean boolean27 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMinimumPoolSize((int) ' ');
        long long11 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
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
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        java.lang.String str41 = hikariConfig40.getConnectionCustomizerClassName();
        int int42 = hikariConfig40.getAcquireIncrement();
        hikariConfig40.setConnectionCustomizerClassName("HikariPool-151");
        long long45 = hikariConfig40.getAcquireRetryDelay();
        java.lang.String str46 = hikariConfig40.getPoolName();
        java.lang.String str47 = hikariConfig40.getCatalog();
        java.lang.String str48 = hikariConfig40.getCatalog();
        long long49 = hikariConfig40.getIdleTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-5423", (java.lang.Object) long49);
        long long51 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 750L + "'", long45 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-61459" + "'", str46, "HikariPool-61459");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 600000L + "'", long49 == 600000L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 750L + "'", long51 == 750L);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
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
        int int16 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        int int18 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setPoolName("HikariPool-28366");
        java.lang.String str23 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
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
        hikariConfig0.setJdbcUrl("HikariPool-158");
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
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
        hikariConfig0.setConnectionInitSql("HikariPool-32141");
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
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
        hikariConfig1.setPoolName("HikariPool-9059");
        int int30 = hikariConfig1.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setTransactionIsolation("HikariPool-38753");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
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
        hikariConfig1.setConnectionInitSql("HikariPool-1076");
        int int18 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        int int22 = hikariConfig1.getAcquireRetries();
        long long23 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setCatalog("HikariPool-49794");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setJdbcUrl("hi!");
        boolean boolean15 = hikariConfig10.isReadOnly();
        hikariConfig10.setTransactionIsolation("HikariPool-158");
        hikariConfig10.setUseInstrumentation(false);
        java.util.Properties properties20 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig1.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.lang.String str24 = hikariConfig23.getJdbcUrl();
        hikariConfig23.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
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
        boolean boolean36 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
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
        hikariConfig12.setCatalog("HikariPool-8395");
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isIsolateInternalQueries();
        hikariConfig23.setMaxLifetime((long) (short) 10);
        java.util.Properties properties27 = hikariConfig23.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.util.Properties properties30 = hikariConfig29.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties30);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("HikariPool-3431");
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(750L);
        java.lang.String str24 = hikariConfig0.getDataSourceClassName();
        java.lang.String str25 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setConnectionTimeout(600000L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-59611");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-61492" + "'", str14, "HikariPool-61492");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-3431" + "'", str24, "HikariPool-3431");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-61492" + "'", str25, "HikariPool-61492");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
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
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.lang.String str23 = hikariConfig18.getConnectionTestQuery();
        hikariConfig18.setLeakDetectionThreshold((long) '4');
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.setAutoCommit(false);
        java.util.Properties properties30 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setJdbc4ConnectionTest(true);
        hikariConfig0.addDataSourceProperty("HikariPool-1908", (java.lang.Object) hikariConfig18);
        hikariConfig0.setMaximumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
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
        java.lang.String str17 = hikariConfig15.getCatalog();
        long long18 = hikariConfig15.getLeakDetectionThreshold();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setAutoCommit(false);
        hikariConfig30.setUseInstrumentation(false);
        hikariConfig30.setMaximumPoolSize(1);
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setTransactionIsolation("");
        javax.sql.DataSource dataSource42 = hikariConfig39.getDataSource();
        long long43 = hikariConfig39.getConnectionTimeout();
        java.lang.String str44 = hikariConfig39.getCatalog();
        hikariConfig39.setInitializationFailFast(false);
        boolean boolean47 = hikariConfig39.isInitializationFailFast();
        hikariConfig39.setDataSourceClassName("");
        java.lang.String str50 = hikariConfig39.getPoolName();
        hikariConfig30.addDataSourceProperty("HikariPool-566", (java.lang.Object) hikariConfig39);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str53 = hikariConfig52.getConnectionInitSql();
        hikariConfig52.setMaxLifetime((long) (short) 10);
        java.util.Properties properties56 = hikariConfig52.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig30.setDataSourceProperties(properties56);
        hikariConfig15.addDataSourceProperty("HikariPool-11038", (java.lang.Object) properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig60.setJdbcUrl("HikariPool-5403");
        java.lang.String str63 = hikariConfig60.getPoolName();
        hikariConfig60.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5000L + "'", long43 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-61501" + "'", str50, "HikariPool-61501");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties56);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "HikariPool-61504" + "'", str63, "HikariPool-61504");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-29368");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-61506" + "'", str12, "HikariPool-61506");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.setTransactionIsolation("");
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setCatalog("HikariPool-5812");
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.setAcquireRetryDelay(5000L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize(60);
        hikariConfig1.setConnectionInitSql("HikariPool-43654");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
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
        long long17 = hikariConfig1.getMaxLifetime();
        int int18 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setConnectionInitSql("");
        boolean boolean23 = hikariConfig20.isJdbc4ConnectionTest();
        java.lang.String str24 = hikariConfig20.getCatalog();
        java.lang.String str25 = hikariConfig20.getCatalog();
        java.lang.String str26 = hikariConfig20.getCatalog();
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setIdleTimeout((long) '#');
        hikariConfig20.setAutoCommit(false);
        hikariConfig1.addDataSourceProperty("HikariPool-7714", (java.lang.Object) false);
        boolean boolean34 = hikariConfig1.isIsolateInternalQueries();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setTransactionIsolation("");
        javax.sql.DataSource dataSource39 = null;
        hikariConfig36.setDataSource(dataSource39);
        boolean boolean41 = hikariConfig36.isJdbc4ConnectionTest();
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
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig36.setDataSourceProperties(properties51);
        java.lang.String str56 = hikariConfig36.getCatalog();
        long long57 = hikariConfig36.getAcquireRetryDelay();
        int int58 = hikariConfig36.getMaximumPoolSize();
        java.util.Properties properties59 = hikariConfig36.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig1.setDataSourceProperties(properties59);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 750L + "'", long57 == 750L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.lang.String str7 = hikariConfig0.getCatalog();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setConnectionTestQuery("HikariPool-28081");
        hikariConfig0.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize((int) '4');
        hikariConfig1.setReadOnly(true);
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
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
        hikariConfig13.setUseInstrumentation(true);
        hikariConfig13.setRegisterMbeans(false);
        boolean boolean20 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setConnectionInitSql("HikariPool-4794");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setConnectionInitSql("");
        boolean boolean27 = hikariConfig24.isJdbc4ConnectionTest();
        hikariConfig24.setJdbcUrl("hi!");
        boolean boolean30 = hikariConfig24.isJdbc4ConnectionTest();
        java.lang.String str31 = hikariConfig24.getJdbcUrl();
        boolean boolean32 = hikariConfig24.isRegisterMbeans();
        boolean boolean33 = hikariConfig24.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setConnectionInitSql("");
        boolean boolean38 = hikariConfig35.isJdbc4ConnectionTest();
        java.lang.String str39 = hikariConfig35.getCatalog();
        java.util.Properties properties40 = hikariConfig35.getDataSourceProperties();
        hikariConfig24.addDataSourceProperty("HikariPool-158", (java.lang.Object) hikariConfig35);
        hikariConfig35.setTransactionIsolation("HikariPool-7880");
        hikariConfig13.addDataSourceProperty("HikariPool-6029", (java.lang.Object) "HikariPool-7880");
        java.lang.String str45 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-8610");
        hikariConfig13.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        int int11 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        java.lang.String str11 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-61539" + "'", str11, "HikariPool-61539");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
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
        java.lang.String str29 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource30 = null;
        hikariConfig0.setDataSource(dataSource30);
        java.lang.String str32 = hikariConfig0.getPoolName();
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-61540" + "'", str32, "HikariPool-61540");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
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
        hikariConfig5.setReadOnly(false);
        hikariConfig5.setConnectionTestQuery("HikariPool-8833");
        hikariConfig5.setTransactionIsolation("HikariPool-8301");
        hikariConfig5.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
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
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig41.setConnectionInitSql("");
        boolean boolean44 = hikariConfig41.isJdbc4ConnectionTest();
        hikariConfig41.setJdbcUrl("hi!");
        boolean boolean47 = hikariConfig41.isJdbc4ConnectionTest();
        long long48 = hikariConfig41.getLeakDetectionThreshold();
        hikariConfig41.setJdbc4ConnectionTest(true);
        hikariConfig41.setAutoCommit(true);
        java.lang.String str53 = hikariConfig41.getJdbcUrl();
        java.lang.String str54 = hikariConfig41.getDataSourceClassName();
        java.lang.String str55 = hikariConfig41.getPoolName();
        java.lang.String str56 = hikariConfig41.getCatalog();
        hikariConfig39.addDataSourceProperty("HikariPool-19230", (java.lang.Object) hikariConfig41);
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        boolean boolean60 = hikariConfig59.isReadOnly();
        java.lang.String str61 = hikariConfig59.getDataSourceClassName();
        hikariConfig59.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean64 = hikariConfig59.isAutoCommit();
        long long65 = hikariConfig59.getLeakDetectionThreshold();
        boolean boolean66 = hikariConfig59.isAutoCommit();
        hikariConfig59.setTransactionIsolation("HikariPool-130");
        boolean boolean69 = hikariConfig59.isRegisterMbeans();
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig71.setTransactionIsolation("");
        boolean boolean74 = hikariConfig71.isInitializationFailFast();
        hikariConfig71.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig77.setConnectionInitSql("");
        boolean boolean80 = hikariConfig77.isJdbc4ConnectionTest();
        java.lang.String str81 = hikariConfig77.getCatalog();
        hikariConfig77.setReadOnly(false);
        java.lang.String str84 = hikariConfig77.getConnectionInitSql();
        hikariConfig77.setIsolateInternalQueries(false);
        java.util.Properties properties87 = hikariConfig77.getDataSourceProperties();
        hikariConfig71.setDataSourceProperties(properties87);
        hikariConfig59.setDataSourceProperties(properties87);
        hikariConfig59.setMaxLifetime((long) (short) -1);
        java.util.Properties properties92 = hikariConfig59.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig93 = new com.zaxxer.hikari.HikariConfig(properties92);
        com.zaxxer.hikari.HikariConfig hikariConfig94 = new com.zaxxer.hikari.HikariConfig(properties92);
        com.zaxxer.hikari.HikariConfig hikariConfig95 = new com.zaxxer.hikari.HikariConfig(properties92);
        hikariConfig41.setDataSourceProperties(properties92);
        hikariConfig41.setUseInstrumentation(true);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(str54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-61555" + "'", str55, "HikariPool-61555");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 100L + "'", long65 == 100L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(properties87);
        org.junit.Assert.assertNotNull(properties92);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean8 = hikariConfig1.isReadOnly();
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        hikariConfig0.setConnectionInitSql("HikariPool-19896");
        hikariConfig0.setAcquireIncrement((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setPoolName("HikariPool-4356");
        int int11 = hikariConfig1.getAcquireIncrement();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
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
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
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
        long long36 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-2594");
        java.lang.String str39 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-61571" + "'", str35, "HikariPool-61571");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 600000L + "'", long36 == 600000L);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-44810");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-44810 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
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
        hikariConfig5.setTransactionIsolation("HikariPool-14564");
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig5.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionInitSql("HikariPool-11512");
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setInitializationFailFast(true);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        long long7 = hikariConfig0.getIdleTimeout();
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-36250");
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
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
        int int17 = hikariConfig13.getAcquireRetries();
        java.lang.String str18 = hikariConfig13.getJdbcUrl();
        java.lang.String str19 = hikariConfig13.getPoolName();
        hikariConfig13.setDataSourceClassName("HikariPool-46579");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-61587" + "'", str19, "HikariPool-61587");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
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
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaximumPoolSize(1);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setJdbcUrl("HikariPool-923");
        hikariConfig0.setDataSourceClassName("HikariPool-2639");
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setTransactionIsolation("HikariPool-1177");
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionTestQuery("HikariPool-905");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setDataSourceClassName("HikariPool-14188");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: HikariPool-1177");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-130" + "'", str13, "HikariPool-130");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAcquireRetryDelay((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime((long) 0);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getConnectionCustomizerClassName();
        boolean boolean21 = hikariConfig19.isAutoCommit();
        hikariConfig19.setAcquireRetryDelay(100L);
        hikariConfig19.setPoolName("HikariPool-658");
        java.lang.Class<?> wildcardClass26 = hikariConfig19.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-4779", (java.lang.Object) wildcardClass26);
        long long28 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig1.setDataSource(dataSource29);
        long long31 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
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
        hikariConfig1.setAcquireRetries(3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig11.setAcquireRetryDelay((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setDriverClassName("HikariPool-42188");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-42188' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int14 = hikariConfig13.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize((int) '#');
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-3107");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig16.getConnectionInitSql();
        int int22 = hikariConfig16.getMaximumPoolSize();
        long long23 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.setRegisterMbeans(false);
        hikariConfig16.setIsolateInternalQueries(true);
        java.util.Properties properties28 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties28);
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        hikariConfig1.setConnectionInitSql("HikariPool-13436");
        java.lang.String str34 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-2875");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 750L + "'", long23 == 750L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        int int4 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-35072");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setDataSourceClassName("HikariPool-7785");
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setIdleTimeout((long) (-1));
        long long16 = hikariConfig1.getMaxLifetime();
        int int17 = hikariConfig1.getMaximumPoolSize();
        boolean boolean18 = hikariConfig1.isReadOnly();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-55645");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        java.lang.String str31 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("HikariPool-38697");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        hikariConfig1.setDataSourceClassName("HikariPool-6271");
        hikariConfig1.setJdbcUrl("HikariPool-12975");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
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
        java.lang.String str31 = hikariConfig0.getConnectionTestQuery();
        long long32 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTestQuery("HikariPool-39207");
        hikariConfig0.addDataSourceProperty("HikariPool-40165", (java.lang.Object) "HikariPool-29863");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-130");
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2374");
        boolean boolean17 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize(35);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-130" + "'", str13, "HikariPool-130");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
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
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("HikariPool-6810");
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAutoCommit(true);
        boolean boolean21 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37648");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37648 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
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
        hikariConfig1.setConnectionInitSql("HikariPool-1076");
        int int18 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setAcquireRetryDelay(1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        int int19 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setConnectionInitSql("HikariPool-20880");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-2937" + "'", str11, "HikariPool-2937");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setTransactionIsolation("");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        hikariConfig10.setAutoCommit(false);
        int int17 = hikariConfig10.getTransactionIsolation();
        boolean boolean18 = hikariConfig10.isIsolateInternalQueries();
        int int19 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setAutoCommit(true);
        hikariConfig10.setAcquireIncrement(3);
        hikariConfig1.addDataSourceProperty("HikariPool-1604", (java.lang.Object) hikariConfig10);
        boolean boolean25 = hikariConfig10.isReadOnly();
        int int26 = hikariConfig10.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
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
        hikariConfig15.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setConnectionInitSql("");
        boolean boolean21 = hikariConfig18.isJdbc4ConnectionTest();
        java.lang.String str22 = hikariConfig18.getCatalog();
        java.util.Properties properties23 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig15.setDataSourceProperties(properties26);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig15.setDataSource(dataSource31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        long long18 = hikariConfig14.getConnectionTimeout();
        java.lang.String str19 = hikariConfig14.getCatalog();
        long long20 = hikariConfig14.getConnectionTimeout();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig14.setDataSource(dataSource21);
        hikariConfig14.setReadOnly(true);
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str27 = hikariConfig14.getPoolName();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.setTransactionIsolation("");
        javax.sql.DataSource dataSource32 = null;
        hikariConfig29.setDataSource(dataSource32);
        boolean boolean34 = hikariConfig29.isJdbc4ConnectionTest();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setTransactionIsolation("");
        javax.sql.DataSource dataSource39 = hikariConfig36.getDataSource();
        long long40 = hikariConfig36.getConnectionTimeout();
        java.lang.String str41 = hikariConfig36.getCatalog();
        hikariConfig36.setInitializationFailFast(false);
        java.util.Properties properties44 = hikariConfig36.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig29.setDataSourceProperties(properties44);
        hikariConfig14.setDataSourceProperties(properties44);
        hikariConfig14.setPoolName("HikariPool-6471");
        hikariConfig0.addDataSourceProperty("HikariPool-9380", (java.lang.Object) "HikariPool-6471");
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-61687" + "'", str27, "HikariPool-61687");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
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
        boolean boolean21 = hikariConfig13.isAutoCommit();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setMaxLifetime((long) (short) 0);
        hikariConfig13.setAutoCommit(false);
        int int27 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig13.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        java.lang.String str14 = hikariConfig0.getPoolName();
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMinimumPoolSize(32);
        hikariConfig0.setRegisterMbeans(true);
        long long20 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-22534");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-61695" + "'", str14, "HikariPool-61695");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold(1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-3204");
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaxLifetime((long) ' ');
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold(52L);
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-130");
        hikariConfig1.setReadOnly(true);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        int int16 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
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
        java.lang.String str18 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("HikariPool-3292");
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize((int) '#');
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3097");
        hikariConfig0.setAcquireRetryDelay((long) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-998");
        int int13 = hikariConfig1.getAcquireRetries();
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-8441");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-998" + "'", str18, "HikariPool-998");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setIdleTimeout(100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
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
        boolean boolean32 = hikariConfig31.isRegisterMbeans();
        hikariConfig31.setDataSourceClassName("HikariPool-3540");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
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
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setAcquireRetryDelay(32L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
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
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isReadOnly();
        java.lang.String str19 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setJdbcUrl("hi!");
        boolean boolean22 = hikariConfig17.isReadOnly();
        hikariConfig17.setTransactionIsolation("HikariPool-158");
        hikariConfig17.setUseInstrumentation(false);
        java.util.Properties properties27 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig0.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
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
        long long20 = hikariConfig1.getIdleTimeout();
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMaxLifetime((long) 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-158" + "'", str21, "HikariPool-158");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-130");
        hikariConfig0.setReadOnly(false);
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(100);
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-1676");
        hikariConfig1.setAutoCommit(false);
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
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
        long long38 = hikariConfig37.getConnectionTimeout();
        int int39 = hikariConfig37.getMinimumPoolSize();
        boolean boolean40 = hikariConfig37.isReadOnly();
        boolean boolean41 = hikariConfig37.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
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
        java.lang.String str43 = hikariConfig42.getJdbcUrl();
        hikariConfig42.setPoolName("HikariPool-1636");
        int int46 = hikariConfig42.getAcquireRetries();
        boolean boolean47 = hikariConfig42.isReadOnly();
        java.lang.String str48 = hikariConfig42.getPoolName();
        java.lang.String str49 = hikariConfig42.getConnectionInitSql();
        java.lang.String str50 = hikariConfig42.getPoolName();
        hikariConfig42.setTransactionIsolation("HikariPool-13538");
        hikariConfig42.setMaximumPoolSize(1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-1636" + "'", str48, "HikariPool-1636");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-1636" + "'", str50, "HikariPool-1636");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
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
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setConnectionInitSql("HikariPool-923");
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold(60L);
        long long27 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-923" + "'", str24, "HikariPool-923");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
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
        int int35 = hikariConfig7.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
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
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setTransactionIsolation("");
        javax.sql.DataSource dataSource29 = hikariConfig26.getDataSource();
        long long30 = hikariConfig26.getConnectionTimeout();
        java.lang.String str31 = hikariConfig26.getCatalog();
        hikariConfig26.setMaxLifetime(5000L);
        int int34 = hikariConfig26.getAcquireRetries();
        long long35 = hikariConfig26.getLeakDetectionThreshold();
        long long36 = hikariConfig26.getIdleTimeout();
        long long37 = hikariConfig26.getLeakDetectionThreshold();
        java.lang.String str38 = hikariConfig26.getJdbcUrl();
        java.lang.String str39 = hikariConfig26.getDataSourceClassName();
        java.lang.String str40 = hikariConfig26.getJdbcUrl();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.setTransactionIsolation("");
        javax.sql.DataSource dataSource45 = hikariConfig42.getDataSource();
        long long46 = hikariConfig42.getConnectionTimeout();
        java.lang.String str47 = hikariConfig42.getCatalog();
        hikariConfig42.setInitializationFailFast(false);
        java.util.Properties properties50 = hikariConfig42.getDataSourceProperties();
        hikariConfig42.setJdbcUrl("HikariPool-151");
        long long53 = hikariConfig42.getMaxLifetime();
        long long54 = hikariConfig42.getLeakDetectionThreshold();
        int int55 = hikariConfig42.getAcquireRetries();
        java.util.Properties properties56 = hikariConfig42.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties56);
        hikariConfig1.setDataSourceProperties(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties56);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-919" + "'", str24, "HikariPool-919");
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 600000L + "'", long36 == 600000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(dataSource45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5000L + "'", long46 == 5000L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1800000L + "'", long53 == 1800000L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        int int10 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setIdleTimeout((long) 3);
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("HikariPool-14965");
        hikariConfig12.setMaximumPoolSize(97);
        long long17 = hikariConfig12.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
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
        hikariConfig12.setPoolName("HikariPool-37524");
        int int32 = hikariConfig12.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        long long8 = hikariConfig1.getMaxLifetime();
        int int9 = hikariConfig1.getMaximumPoolSize();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        boolean boolean11 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-23603");
        int int14 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isReadOnly();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        hikariConfig14.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean19 = hikariConfig14.isAutoCommit();
        long long20 = hikariConfig14.getLeakDetectionThreshold();
        boolean boolean21 = hikariConfig14.isAutoCommit();
        hikariConfig14.setTransactionIsolation("HikariPool-130");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isReadOnly();
        java.lang.String str28 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean31 = hikariConfig26.isAutoCommit();
        long long32 = hikariConfig26.getLeakDetectionThreshold();
        hikariConfig14.addDataSourceProperty("HikariPool-1561", (java.lang.Object) hikariConfig26);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.lang.String str37 = hikariConfig36.getConnectionCustomizerClassName();
        int int38 = hikariConfig36.getAcquireIncrement();
        javax.sql.DataSource dataSource39 = null;
        hikariConfig36.setDataSource(dataSource39);
        hikariConfig36.setIdleTimeout((long) (short) 10);
        hikariConfig36.setConnectionTestQuery("");
        long long45 = hikariConfig36.getAcquireRetryDelay();
        hikariConfig36.setAcquireIncrement((int) 'a');
        hikariConfig26.addDataSourceProperty("HikariPool-4356", (java.lang.Object) 'a');
        hikariConfig1.addDataSourceProperty("HikariPool-4087", (java.lang.Object) "HikariPool-4356");
        java.lang.String str50 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 750L + "'", long45 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-61811" + "'", str50, "HikariPool-61811");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3110");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-9308");
        int int13 = hikariConfig1.getTransactionIsolation();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-33499");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setCatalog("");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-17839");
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
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
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setReadOnly(true);
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-48720");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-48720 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
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
        java.util.Properties properties40 = hikariConfig0.getDataSourceProperties();
        int int41 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
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
        hikariConfig0.setConnectionInitSql("HikariPool-9268");
        hikariConfig0.setReadOnly(true);
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout(52L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTestQuery("HikariPool-26061");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMaximumPoolSize();
        int int6 = hikariConfig0.getMaximumPoolSize();
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        long long9 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1561");
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement(10);
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
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
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime(5000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        int int14 = hikariConfig12.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-22288");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-22288 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        int int9 = hikariConfig1.getAcquireIncrement();
        int int10 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
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
        hikariConfig11.setJdbc4ConnectionTest(true);
        java.lang.String str14 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig11.isAutoCommit();
        long long18 = hikariConfig11.getIdleTimeout();
        boolean boolean19 = hikariConfig11.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-1339");
        hikariConfig0.setAcquireIncrement(32);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8024");
        long long19 = hikariConfig0.getConnectionTimeout();
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long17 = hikariConfig16.getIdleTimeout();
        long long18 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setCatalog("HikariPool-9604");
        int int21 = hikariConfig16.getTransactionIsolation();
        javax.sql.DataSource dataSource22 = null;
        hikariConfig16.setDataSource(dataSource22);
        hikariConfig16.setInitializationFailFast(true);
        hikariConfig16.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        boolean boolean9 = hikariConfig1.isReadOnly();
        int int10 = hikariConfig1.getAcquireIncrement();
        int int11 = hikariConfig1.getAcquireRetries();
        int int12 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setJdbcUrl("HikariPool-45288");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        hikariConfig0.setCatalog("hi!");
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-6377");
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime(10L);
        hikariConfig1.setIdleTimeout(750L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
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
        hikariConfig0.setMaxLifetime((long) 32);
        hikariConfig0.setDataSourceClassName("HikariPool-32616");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-35075");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-35075 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-1636");
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        int int10 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
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
        hikariConfig7.setIdleTimeout(10L);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig23.setConnectionInitSql("");
        boolean boolean26 = hikariConfig23.isJdbc4ConnectionTest();
        java.lang.String str27 = hikariConfig23.getCatalog();
        java.lang.String str28 = hikariConfig23.getConnectionTestQuery();
        hikariConfig23.setLeakDetectionThreshold((long) '4');
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.setAutoCommit(false);
        hikariConfig23.setTransactionIsolation("HikariPool-158");
        int int37 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.setConnectionInitSql("");
        hikariConfig39.setDataSourceClassName("");
        hikariConfig39.setConnectionCustomizerClassName("");
        long long46 = hikariConfig39.getLeakDetectionThreshold();
        int int47 = hikariConfig39.getAcquireIncrement();
        long long48 = hikariConfig39.getAcquireRetryDelay();
        java.util.Properties properties49 = hikariConfig39.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig23.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig7.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig55.setAcquireRetryDelay(1800000L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 750L + "'", long48 == 750L);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-1636");
        hikariConfig0.setMaxLifetime(52L);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout((long) (short) 1);
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-56043");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.setPoolName("HikariPool-159");
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setCatalog("HikariPool-15632");
        hikariConfig15.setConnectionCustomizerClassName("HikariPool-21758");
        hikariConfig15.setMinimumPoolSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-61906" + "'", str2, "HikariPool-61906");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        java.lang.String str16 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.setJdbcUrl("HikariPool-151");
        long long22 = hikariConfig11.getMaxLifetime();
        long long23 = hikariConfig11.getLeakDetectionThreshold();
        int int24 = hikariConfig11.getAcquireRetries();
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig27.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
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
        hikariConfig13.setUseInstrumentation(true);
        hikariConfig13.setRegisterMbeans(false);
        boolean boolean20 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setConnectionInitSql("HikariPool-4794");
        boolean boolean23 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setAcquireIncrement((int) (short) 10);
        hikariConfig13.setConnectionTestQuery("HikariPool-50223");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
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
        javax.sql.DataSource dataSource56 = hikariConfig0.getDataSource();
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
        org.junit.Assert.assertNull(dataSource56);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setMaxLifetime((long) 60);
        boolean boolean13 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAutoCommit(false);
        long long16 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-51214");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-51214 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
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
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("HikariPool-1164");
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
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
        long long39 = hikariConfig1.getMaxLifetime();
        int int40 = hikariConfig1.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1800000L + "'", long39 == 1800000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
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
        hikariConfig13.setUseInstrumentation(true);
        hikariConfig13.setAcquireRetryDelay((long) (byte) 100);
        java.lang.String str20 = hikariConfig13.getCatalog();
        hikariConfig13.setTransactionIsolation("HikariPool-23151");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setTransactionIsolation("HikariPool-993");
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        long long13 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
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
        boolean boolean33 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
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
        hikariConfig17.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        int int6 = hikariConfig0.getAcquireRetries();
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-1676");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        int int6 = hikariConfig0.getAcquireRetries();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaxLifetime(52L);
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("HikariPool-26408");
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setIdleTimeout((long) (short) 10);
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setDataSourceClassName("HikariPool-11279");
        long long13 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-11279" + "'", str14, "HikariPool-11279");
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-923");
        hikariConfig0.setMaxLifetime(3L);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
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
        boolean boolean28 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setPoolName("HikariPool-15580");
        java.lang.String str31 = hikariConfig0.getPoolName();
        hikariConfig0.setTransactionIsolation("HikariPool-12935");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-15580" + "'", str31, "HikariPool-15580");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties13);
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        java.lang.String str19 = hikariConfig17.getConnectionCustomizerClassName();
        hikariConfig17.setConnectionCustomizerClassName("HikariPool-26057");
        javax.sql.DataSource dataSource22 = null;
        hikariConfig17.setDataSource(dataSource22);
        hikariConfig17.setAcquireIncrement((int) ' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        java.lang.String str30 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setJdbcUrl("HikariPool-16515");
        int int33 = hikariConfig1.getAcquireIncrement();
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
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
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
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbcUrl("HikariPool-9156");
        boolean boolean30 = hikariConfig0.isRegisterMbeans();
        java.lang.String str31 = hikariConfig0.getConnectionTestQuery();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("");
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-47848");
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setReadOnly(false);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
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
        hikariConfig1.setDataSourceClassName("");
        int int14 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(32L);
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
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
        hikariConfig26.setMaxLifetime(0L);
        java.lang.String str29 = hikariConfig26.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str31 = hikariConfig30.getConnectionInitSql();
        hikariConfig30.setMaxLifetime((long) (short) 10);
        java.util.Properties properties34 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig26.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        java.lang.String str39 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-48040");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-48040 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbcUrl("HikariPool-823");
        hikariConfig1.setConnectionTestQuery("HikariPool-10397");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        boolean boolean7 = hikariConfig1.isReadOnly();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-7218");
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("HikariPool-52996");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setTransactionIsolation("HikariPool-760");
        hikariConfig0.setJdbcUrl("HikariPool-23635");
        hikariConfig0.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
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
        long long24 = hikariConfig23.getLeakDetectionThreshold();
        java.lang.String str25 = hikariConfig23.getJdbcUrl();
        hikariConfig23.setUseInstrumentation(false);
        boolean boolean28 = hikariConfig23.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
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
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource18 = hikariConfig13.getDataSource();
        boolean boolean19 = hikariConfig13.isAutoCommit();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig13.setDataSource(dataSource20);
        boolean boolean22 = hikariConfig13.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-2900");
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setJdbcUrl("");
        boolean boolean22 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource23 = hikariConfig1.getDataSource();
        long long24 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setConnectionTestQuery("HikariPool-442");
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-923");
        boolean boolean12 = hikariConfig0.isAutoCommit();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        int int17 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getAcquireIncrement();
        boolean boolean21 = hikariConfig19.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig11);
        long long25 = hikariConfig11.getAcquireRetryDelay();
        java.lang.String str26 = hikariConfig11.getJdbcUrl();
        hikariConfig11.setMaximumPoolSize((int) '4');
        hikariConfig11.setAcquireRetries(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionInitSql("HikariPool-1908");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-1908" + "'", str15, "HikariPool-1908");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setLeakDetectionThreshold(52L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
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
        java.lang.String str17 = hikariConfig15.getCatalog();
        long long18 = hikariConfig15.getLeakDetectionThreshold();
        java.lang.String str19 = hikariConfig15.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
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
        hikariConfig1.setIdleTimeout((long) 1);
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str15 = hikariConfig14.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setConnectionInitSql("HikariPool-382");
        hikariConfig0.setTransactionIsolation("HikariPool-55787");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
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
        hikariConfig14.setRegisterMbeans(true);
        hikariConfig14.setAcquireRetryDelay((long) (short) 0);
        boolean boolean19 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setAcquireIncrement((int) (byte) 10);
        long long22 = hikariConfig14.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        int int12 = hikariConfig1.getMaximumPoolSize();
        int int13 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setLeakDetectionThreshold((long) (short) 1);
        long long18 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        long long10 = hikariConfig1.getIdleTimeout();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-62064" + "'", str7, "HikariPool-62064");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-41655");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-41655 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
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
        int int18 = hikariConfig13.getAcquireIncrement();
        boolean boolean19 = hikariConfig13.isInitializationFailFast();
        long long20 = hikariConfig13.getMaxLifetime();
        long long21 = hikariConfig13.getConnectionTimeout();
        long long22 = hikariConfig13.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean13 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-28999");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-28999' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-442");
        long long11 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout(10L);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetryDelay(0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        int int19 = hikariConfig15.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-5245", (java.lang.Object) hikariConfig15);
        boolean boolean21 = hikariConfig15.isJdbc4ConnectionTest();
        hikariConfig15.setJdbc4ConnectionTest(false);
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        long long25 = hikariConfig15.getIdleTimeout();
        hikariConfig15.setTransactionIsolation("HikariPool-51801");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25360 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIdleTimeout((long) 0);
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-10634");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        hikariConfig0.setAcquireIncrement(97);
        hikariConfig0.setIdleTimeout((long) 60);
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setReadOnly(true);
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getAcquireIncrement();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-62086" + "'", str13, "HikariPool-62086");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        boolean boolean5 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
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
        long long38 = hikariConfig37.getConnectionTimeout();
        int int39 = hikariConfig37.getMinimumPoolSize();
        hikariConfig37.setAcquireRetries(0);
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.setTransactionIsolation("");
        java.lang.String str46 = hikariConfig43.getConnectionCustomizerClassName();
        java.lang.String str47 = hikariConfig43.getPoolName();
        hikariConfig43.setUseInstrumentation(false);
        hikariConfig43.setReadOnly(false);
        hikariConfig43.setConnectionInitSql("HikariPool-9813");
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig55.setAcquireRetryDelay((long) (short) 100);
        boolean boolean58 = hikariConfig55.isAutoCommit();
        hikariConfig55.setPoolName("HikariPool-159");
        long long61 = hikariConfig55.getMaxLifetime();
        hikariConfig55.setUseInstrumentation(true);
        java.util.Properties properties64 = hikariConfig55.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig43.setDataSourceProperties(properties64);
        hikariConfig37.setDataSourceProperties(properties64);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-62095" + "'", str47, "HikariPool-62095");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1800000L + "'", long61 == 1800000L);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
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
        hikariConfig1.setMinimumPoolSize(35);
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getAcquireRetries();
        java.lang.Class<?> wildcardClass17 = hikariConfig15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1908");
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
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
        hikariConfig0.setRegisterMbeans(false);
        long long18 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig0.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-21008");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-21008' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.setMaxLifetime(750L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setPoolName("hi!");
        long long10 = hikariConfig1.getIdleTimeout();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetryDelay(97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-9875");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        long long8 = hikariConfig6.getConnectionTimeout();
        boolean boolean9 = hikariConfig6.isReadOnly();
        int int10 = hikariConfig6.getAcquireRetries();
        hikariConfig6.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAcquireIncrement((int) 'a');
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        boolean boolean21 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-159");
        boolean boolean7 = hikariConfig1.isReadOnly();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        long long18 = hikariConfig14.getConnectionTimeout();
        java.lang.String str19 = hikariConfig14.getCatalog();
        hikariConfig14.setInitializationFailFast(false);
        java.util.Properties properties22 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        java.lang.String str27 = hikariConfig1.getPoolName();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-62128" + "'", str27, "HikariPool-62128");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbcUrl("HikariPool-151");
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setAcquireRetryDelay((long) (short) 100);
        hikariConfig13.setDataSourceClassName("HikariPool-8773");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
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
        boolean boolean17 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setConnectionTestQuery("HikariPool-1467");
        boolean boolean20 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig13.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
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
        java.lang.String str19 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("HikariPool-1164");
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay(1L);
        java.lang.String str25 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setTransactionIsolation("HikariPool-15999");
        hikariConfig0.setConnectionInitSql("HikariPool-15804");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(false);
        int int17 = hikariConfig0.getAcquireIncrement();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setConnectionTestQuery("HikariPool-17608");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
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
        java.lang.String str43 = hikariConfig42.getJdbcUrl();
        java.util.Properties properties44 = hikariConfig42.getDataSourceProperties();
        hikariConfig42.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource47 = hikariConfig42.getDataSource();
        hikariConfig42.setAutoCommit(true);
        hikariConfig42.setJdbcUrl("HikariPool-35999");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(dataSource47);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
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
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-56490");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
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
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-62157" + "'", str11, "HikariPool-62157");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setDataSourceClassName("HikariPool-102");
        hikariConfig1.setTransactionIsolation("HikariPool-1636");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setReadOnly(true);
        long long17 = hikariConfig1.getConnectionTimeout();
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-62158" + "'", str18, "HikariPool-62158");
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-761");
        java.lang.String str12 = hikariConfig0.getPoolName();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        long long14 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-62159" + "'", str12, "HikariPool-62159");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
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
        int int15 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setTransactionIsolation("HikariPool-761");
        int int18 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setInitializationFailFast(true);
        boolean boolean21 = hikariConfig10.isRegisterMbeans();
        java.lang.String str22 = hikariConfig10.getPoolName();
        int int23 = hikariConfig10.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-62161" + "'", str22, "HikariPool-62161");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize(0);
        long long13 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        hikariConfig1.setAutoCommit(false);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(0);
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.setUseInstrumentation(false);
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        int int11 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig9.setDataSource(dataSource12);
        hikariConfig9.setIdleTimeout((long) (short) 10);
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig0.addDataSourceProperty("HikariPool-158", (java.lang.Object) hikariConfig9);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setAcquireRetries(0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setCatalog("HikariPool-1745");
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-62172" + "'", str9, "HikariPool-62172");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setConnectionInitSql("");
        hikariConfig19.setDataSourceClassName("");
        java.lang.String str24 = hikariConfig19.getDataSourceClassName();
        long long25 = hikariConfig19.getMaxLifetime();
        boolean boolean26 = hikariConfig19.isRegisterMbeans();
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
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig19.setDataSourceProperties(properties36);
        hikariConfig17.setDataSourceProperties(properties36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
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
        boolean boolean33 = hikariConfig0.isReadOnly();
        hikariConfig0.setCatalog("HikariPool-9021");
        int int36 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str37 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
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
        hikariConfig0.setConnectionInitSql("HikariPool-2875");
        long long19 = hikariConfig0.getConnectionTimeout();
        boolean boolean20 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
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
        hikariConfig11.setJdbc4ConnectionTest(true);
        java.lang.String str14 = hikariConfig11.getCatalog();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setConnectionTestQuery("HikariPool-6737");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setTransactionIsolation("HikariPool-1164");
        hikariConfig1.setConnectionTestQuery("HikariPool-50414");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long17 = hikariConfig16.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.setConnectionTimeout(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
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
        java.lang.String str27 = hikariConfig7.getConnectionInitSql();
        hikariConfig7.setAcquireRetryDelay(97L);
        boolean boolean30 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig7.setConnectionTestQuery("HikariPool-1636");
        long long33 = hikariConfig7.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-151" + "'", str25, "HikariPool-151");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1800000L + "'", long33 == 1800000L);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18719");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18719 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireIncrement(1);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        boolean boolean14 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setConnectionInitSql("");
        boolean boolean20 = hikariConfig17.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig17.getCatalog();
        hikariConfig17.setReadOnly(false);
        java.lang.String str24 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setIsolateInternalQueries(false);
        java.util.Properties properties27 = hikariConfig17.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.lang.String str32 = hikariConfig31.getConnectionCustomizerClassName();
        hikariConfig31.setDataSourceClassName("HikariPool-18043");
        hikariConfig31.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
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
        java.lang.String str30 = hikariConfig1.getJdbcUrl();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
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
        java.lang.String str15 = hikariConfig14.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource16 = hikariConfig14.getDataSource();
        hikariConfig14.setMinimumPoolSize(32);
        hikariConfig14.setUseInstrumentation(false);
        hikariConfig14.setRegisterMbeans(true);
        hikariConfig14.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-43270");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-43270' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-62231" + "'", str12, "HikariPool-62231");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("");
        hikariConfig0.setPoolName("HikariPool-28128");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
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
        hikariConfig42.setAcquireIncrement(32);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIdleTimeout((long) 'a');
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-39882");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
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
        hikariConfig1.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        int int5 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-11579");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-62247" + "'", str10, "HikariPool-62247");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-442");
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay((long) 35);
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-23597");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-23597" + "'", str20, "HikariPool-23597");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
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
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.setDataSource(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig0.getPoolName();
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-37338");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-62253" + "'", str9, "HikariPool-62253");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        int int11 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long14 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
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
        hikariConfig5.setReadOnly(false);
        hikariConfig5.setUseInstrumentation(true);
        hikariConfig5.setIdleTimeout((long) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize(32);
        long long10 = hikariConfig0.getIdleTimeout();
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        int int5 = hikariConfig0.getMinimumPoolSize();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-1636");
        hikariConfig0.setMaxLifetime(52L);
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.setAcquireRetryDelay((long) '#');
        hikariConfig1.setTransactionIsolation("HikariPool-10071");
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        long long17 = hikariConfig16.getMaxLifetime();
        java.lang.String str18 = hikariConfig16.getDataSourceClassName();
        int int19 = hikariConfig16.getAcquireRetries();
        boolean boolean20 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-14506", (java.lang.Object) hikariConfig16);
        boolean boolean22 = hikariConfig16.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-62272" + "'", str8, "HikariPool-62272");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
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
        hikariConfig10.setMinimumPoolSize(35);
        hikariConfig10.setJdbc4ConnectionTest(true);
        boolean boolean30 = hikariConfig10.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
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
        hikariConfig13.setConnectionInitSql("HikariPool-760");
        hikariConfig13.setLeakDetectionThreshold((long) 100);
        int int18 = hikariConfig13.getMaximumPoolSize();
        long long19 = hikariConfig13.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
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
        int int18 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        boolean boolean22 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setMaxLifetime(0L);
        hikariConfig20.setJdbcUrl("hi!");
        int int27 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setTransactionIsolation("HikariPool-17630");
        hikariConfig20.setLeakDetectionThreshold(0L);
        hikariConfig0.addDataSourceProperty("HikariPool-38143", (java.lang.Object) 0L);
        boolean boolean33 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-1339");
        hikariConfig1.setDataSourceClassName("HikariPool-19870");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        javax.sql.DataSource dataSource2 = null;
        hikariConfig1.setDataSource(dataSource2);
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setConnectionInitSql("");
        boolean boolean10 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setJdbcUrl("hi!");
        hikariConfig7.setPoolName("HikariPool-382");
        hikariConfig7.setMaxLifetime((long) 35);
        long long17 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setDataSourceClassName("HikariPool-1177");
        java.util.Properties properties20 = hikariConfig7.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties20);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-59626");
        java.lang.String str24 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setAcquireRetryDelay(100L);
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig13.getCatalog();
        java.lang.String str18 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setIdleTimeout((-1L));
        hikariConfig13.setConnectionInitSql("HikariPool-7022");
        int int23 = hikariConfig13.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-47309", (java.lang.Object) hikariConfig13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isReadOnly();
        java.lang.String str13 = hikariConfig11.getDataSourceClassName();
        hikariConfig11.setJdbcUrl("hi!");
        boolean boolean16 = hikariConfig11.isReadOnly();
        hikariConfig11.setTransactionIsolation("HikariPool-158");
        hikariConfig11.setUseInstrumentation(false);
        java.util.Properties properties21 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        long long23 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-51396");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setReadOnly(true);
        int int12 = hikariConfig0.getTransactionIsolation();
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-62294" + "'", str9, "HikariPool-62294");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setReadOnly(true);
        long long15 = hikariConfig0.getAcquireRetryDelay();
        int int16 = hikariConfig0.getAcquireRetries();
        java.lang.String str17 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-62295" + "'", str17, "HikariPool-62295");
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setMinimumPoolSize(35);
        hikariConfig0.setAcquireIncrement(35);
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
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
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
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
        boolean boolean21 = hikariConfig13.isAutoCommit();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        boolean boolean23 = hikariConfig13.isJdbc4ConnectionTest();
        int int24 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setLeakDetectionThreshold((long) (short) 0);
        boolean boolean27 = hikariConfig13.isReadOnly();
        java.lang.String str28 = hikariConfig13.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-62299" + "'", str28, "HikariPool-62299");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig12.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-62301" + "'", str23, "HikariPool-62301");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-158");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
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
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean28 = hikariConfig27.isRegisterMbeans();
        hikariConfig0.addDataSourceProperty("HikariPool-11512", (java.lang.Object) boolean28);
        java.lang.String str30 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-158" + "'", str10, "HikariPool-158");
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIsolateInternalQueries(false);
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaxLifetime((long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
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
        long long21 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig17.setDataSourceClassName("HikariPool-20032");
        hikariConfig17.setMaxLifetime((long) (byte) -1);
        hikariConfig17.setReadOnly(true);
        int int24 = hikariConfig17.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
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
        hikariConfig1.setAcquireIncrement(32);
        boolean boolean34 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
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
        java.lang.String str31 = hikariConfig1.getConnectionTestQuery();
        int int32 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource33 = hikariConfig1.getDataSource();
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNull(dataSource33);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setPoolName("HikariPool-382");
        hikariConfig0.setJdbcUrl("HikariPool-151");
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-2635");
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setConnectionInitSql("");
        hikariConfig17.setJdbcUrl("");
        javax.sql.DataSource dataSource22 = null;
        hikariConfig17.setDataSource(dataSource22);
        hikariConfig17.setInitializationFailFast(false);
        hikariConfig17.setAcquireRetries((int) (short) 10);
        java.lang.String str28 = hikariConfig17.getCatalog();
        int int29 = hikariConfig17.getMaximumPoolSize();
        hikariConfig17.setAcquireRetryDelay(600000L);
        hikariConfig17.setAcquireIncrement((int) '4');
        java.lang.String str34 = hikariConfig17.getCatalog();
        hikariConfig17.setJdbc4ConnectionTest(false);
        hikariConfig0.addDataSourceProperty("HikariPool-3343", (java.lang.Object) hikariConfig17);
        hikariConfig17.setTransactionIsolation("HikariPool-15798");
        hikariConfig17.setPoolName("HikariPool-24941");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        hikariConfig1.setDataSourceClassName("HikariPool-6271");
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-3097");
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbcUrl("HikariPool-41860");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
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
        int int38 = hikariConfig37.getMinimumPoolSize();
        int int39 = hikariConfig37.getMaximumPoolSize();
        hikariConfig37.setAcquireIncrement(97);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
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
        javax.sql.DataSource dataSource28 = hikariConfig0.getDataSource();
        boolean boolean29 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        long long12 = hikariConfig1.getMaxLifetime();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1177");
        hikariConfig1.setIdleTimeout(97L);
        hikariConfig1.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        int int11 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig9.setDataSource(dataSource12);
        hikariConfig9.setIdleTimeout((long) (short) 10);
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig0.addDataSourceProperty("HikariPool-158", (java.lang.Object) hikariConfig9);
        long long19 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean25 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        long long15 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig12.setAcquireIncrement(100);
        hikariConfig12.setReadOnly(true);
        hikariConfig12.setJdbcUrl("HikariPool-151");
        java.lang.String str24 = hikariConfig12.getPoolName();
        int int25 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.setRegisterMbeans(true);
        hikariConfig12.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.util.Properties properties31 = hikariConfig30.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties31);
        java.util.Properties properties33 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-29048");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-62379" + "'", str10, "HikariPool-62379");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-62380" + "'", str24, "HikariPool-62380");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) 10);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setIdleTimeout(35L);
        hikariConfig10.setLeakDetectionThreshold((long) '4');
        hikariConfig10.setConnectionInitSql("HikariPool-38839");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str12 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setInitializationFailFast(false);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        int int11 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str17 = hikariConfig0.getPoolName();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        int int19 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-62403" + "'", str17, "HikariPool-62403");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        int int6 = hikariConfig5.getAcquireRetries();
        hikariConfig5.setAcquireRetryDelay((long) 0);
        java.lang.String str9 = hikariConfig5.getConnectionCustomizerClassName();
        int int10 = hikariConfig5.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getCatalog();
        java.lang.String str17 = hikariConfig11.getCatalog();
        java.util.Properties properties18 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig5.setDataSourceProperties(properties18);
        hikariConfig1.setDataSourceProperties(properties18);
        hikariConfig1.setPoolName("HikariPool-8669");
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
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
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-55350");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-55350 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig13.getCatalog();
        java.lang.String str18 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setLeakDetectionThreshold((long) '4');
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.setAutoCommit(false);
        java.util.Properties properties25 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setAutoCommit(false);
        boolean boolean28 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setConnectionInitSql("HikariPool-102");
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-159");
        boolean boolean33 = hikariConfig13.isReadOnly();
        java.util.Properties properties34 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.addDataSourceProperty("HikariPool-1745", (java.lang.Object) properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        int int40 = hikariConfig38.getMinimumPoolSize();
        long long41 = hikariConfig38.getLeakDetectionThreshold();
        hikariConfig38.setMinimumPoolSize(10);
        int int44 = hikariConfig38.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 750L + "'", long39 == 750L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-56455");
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
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str12 = hikariConfig11.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12155");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12155 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        javax.sql.DataSource dataSource15 = hikariConfig12.getDataSource();
        long long16 = hikariConfig12.getConnectionTimeout();
        java.lang.String str17 = hikariConfig12.getCatalog();
        hikariConfig12.setInitializationFailFast(false);
        java.util.Properties properties20 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig25.setCatalog("HikariPool-919");
        hikariConfig25.setMinimumPoolSize(32);
        long long30 = hikariConfig25.getAcquireRetryDelay();
        int int31 = hikariConfig25.getAcquireIncrement();
        boolean boolean32 = hikariConfig25.isIsolateInternalQueries();
        int int33 = hikariConfig25.getAcquireIncrement();
        java.lang.String str34 = hikariConfig25.getConnectionInitSql();
        java.util.Properties properties35 = hikariConfig25.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 750L + "'", long30 == 750L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-9875");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setTransactionIsolation("");
        javax.sql.DataSource dataSource15 = hikariConfig12.getDataSource();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setConnectionInitSql("");
        hikariConfig18.setJdbcUrl("");
        hikariConfig18.setConnectionTestQuery("hi!");
        hikariConfig12.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig18);
        java.lang.String str26 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.lang.String str31 = hikariConfig12.getConnectionInitSql();
        int int32 = hikariConfig12.getAcquireIncrement();
        hikariConfig1.addDataSourceProperty("HikariPool-12100", (java.lang.Object) hikariConfig12);
        hikariConfig12.setRegisterMbeans(true);
        hikariConfig12.setConnectionTestQuery("HikariPool-43974");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-62453" + "'", str7, "HikariPool-62453");
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        int int14 = hikariConfig1.getMinimumPoolSize();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
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
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long17 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setAcquireRetryDelay(100L);
        long long6 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime(750L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setMaxLifetime((long) (short) 100);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        int int12 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
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
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig18.setMaximumPoolSize(0);
        java.lang.String str21 = hikariConfig18.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold(52L);
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireRetries(52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout(600000L);
        javax.sql.DataSource dataSource23 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-51776");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        hikariConfig1.setAcquireRetryDelay((long) 97);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-1076");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        java.lang.Class<?> wildcardClass8 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
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
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-151");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3114");
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-130");
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setConnectionInitSql("");
        boolean boolean11 = hikariConfig8.isJdbc4ConnectionTest();
        hikariConfig8.setJdbcUrl("hi!");
        boolean boolean14 = hikariConfig8.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig8.getDataSourceClassName();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setConnectionInitSql("");
        hikariConfig17.setJdbcUrl("");
        hikariConfig17.setConnectionTestQuery("hi!");
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
        hikariConfig17.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig8.setDataSourceProperties(properties33);
        hikariConfig0.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbcUrl("HikariPool-151");
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getAcquireRetries();
        int int15 = hikariConfig13.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
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
        hikariConfig5.setIsolateInternalQueries(false);
        int int22 = hikariConfig5.getAcquireRetries();
        java.lang.String str23 = hikariConfig5.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-62495" + "'", str23, "HikariPool-62495");
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
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
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig33.setTransactionIsolation("");
        long long36 = hikariConfig33.getLeakDetectionThreshold();
        hikariConfig33.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig33.setAcquireIncrement(100);
        hikariConfig33.setReadOnly(true);
        hikariConfig33.setJdbcUrl("HikariPool-151");
        hikariConfig33.setDataSourceClassName("HikariPool-674");
        java.lang.String str47 = hikariConfig33.getDataSourceClassName();
        hikariConfig33.setMaxLifetime((long) (short) -1);
        boolean boolean50 = hikariConfig33.isJdbc4ConnectionTest();
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setTransactionIsolation("");
        javax.sql.DataSource dataSource55 = hikariConfig52.getDataSource();
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig58.setConnectionInitSql("");
        hikariConfig58.setJdbcUrl("");
        hikariConfig58.setConnectionTestQuery("hi!");
        hikariConfig52.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig58);
        java.util.Properties properties66 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig67.setConnectionInitSql("");
        hikariConfig67.setJdbcUrl("");
        hikariConfig67.setConnectionTestQuery("hi!");
        java.util.Properties properties74 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties74);
        hikariConfig75.setTransactionIsolation("");
        javax.sql.DataSource dataSource78 = hikariConfig75.getDataSource();
        long long79 = hikariConfig75.getConnectionTimeout();
        java.lang.String str80 = hikariConfig75.getCatalog();
        hikariConfig75.setInitializationFailFast(false);
        java.util.Properties properties83 = hikariConfig75.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties83);
        hikariConfig67.setDataSourceProperties(properties83);
        hikariConfig52.setDataSourceProperties(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig88 = new com.zaxxer.hikari.HikariConfig(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig89 = new com.zaxxer.hikari.HikariConfig(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig90 = new com.zaxxer.hikari.HikariConfig(properties83);
        hikariConfig33.setDataSourceProperties(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig92 = new com.zaxxer.hikari.HikariConfig(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig93 = new com.zaxxer.hikari.HikariConfig(properties83);
        hikariConfig31.setDataSourceProperties(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig95 = new com.zaxxer.hikari.HikariConfig(properties83);
        com.zaxxer.hikari.HikariConfig hikariConfig96 = new com.zaxxer.hikari.HikariConfig(properties83);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig96.setDriverClassName("HikariPool-11342");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11342' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-674" + "'", str47, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNull(dataSource78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 5000L + "'", long79 == 5000L);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(properties83);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
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
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        int int23 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setCatalog("HikariPool-37274");
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4836");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4836 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTestQuery("HikariPool-30186");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        hikariConfig0.setCatalog("HikariPool-9604");
        long long9 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-62539" + "'", str2, "HikariPool-62539");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
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
        boolean boolean17 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setConnectionTestQuery("HikariPool-2070");
        hikariConfig13.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig13.setDataSourceClassName("HikariPool-28203");
        java.lang.Class<?> wildcardClass24 = hikariConfig13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setDataSourceClassName("HikariPool-1908");
        hikariConfig11.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setJdbcUrl("HikariPool-38554");
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-38554" + "'", str16, "HikariPool-38554");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
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
        java.lang.String str21 = hikariConfig13.getCatalog();
        hikariConfig13.setConnectionInitSql("HikariPool-3107");
        long long24 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-158");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-6844");
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setRegisterMbeans(false);
        long long24 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
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
        javax.sql.DataSource dataSource22 = hikariConfig0.getDataSource();
        hikariConfig0.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig28.setConnectionInitSql("");
        hikariConfig28.setJdbcUrl("");
        hikariConfig28.setConnectionTestQuery("hi!");
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setTransactionIsolation("");
        javax.sql.DataSource dataSource39 = hikariConfig36.getDataSource();
        long long40 = hikariConfig36.getConnectionTimeout();
        java.lang.String str41 = hikariConfig36.getCatalog();
        hikariConfig36.setInitializationFailFast(false);
        java.util.Properties properties44 = hikariConfig36.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig28.setDataSourceProperties(properties44);
        hikariConfig25.setDataSourceProperties(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig0.setDataSourceProperties(properties44);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5000L + "'", long40 == 5000L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean4 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setReadOnly(false);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionTimeout(600000L);
        boolean boolean12 = hikariConfig9.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20626");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20626 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        boolean boolean13 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        int int2 = hikariConfig0.getAcquireIncrement();
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        boolean boolean9 = hikariConfig0.isReadOnly();
        java.lang.String str10 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 600000L + "'", long3 == 600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
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
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetries(10);
        int int31 = hikariConfig0.getAcquireIncrement();
        java.lang.String str32 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource33 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-17891");
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-62588" + "'", str26, "HikariPool-62588");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(dataSource33);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
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
        java.lang.String str14 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
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
        hikariConfig0.setIdleTimeout((long) 52);
        java.lang.String str16 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("HikariPool-34168");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getMaximumPoolSize();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
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
        boolean boolean13 = hikariConfig0.isReadOnly();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-382");
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbcUrl("HikariPool-11388");
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
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
        javax.sql.DataSource dataSource26 = hikariConfig0.getDataSource();
        long long27 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setReadOnly(false);
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setIdleTimeout((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
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
        hikariConfig0.setIdleTimeout(100L);
        long long19 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries((int) (short) 10);
        java.lang.String str22 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-36768");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-36768' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
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
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        long long25 = hikariConfig21.getConnectionTimeout();
        java.lang.String str26 = hikariConfig21.getCatalog();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        hikariConfig21.setJdbcUrl("HikariPool-151");
        long long32 = hikariConfig21.getMaxLifetime();
        long long33 = hikariConfig21.getLeakDetectionThreshold();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setTransactionIsolation("");
        javax.sql.DataSource dataSource38 = hikariConfig35.getDataSource();
        long long39 = hikariConfig35.getConnectionTimeout();
        java.lang.String str40 = hikariConfig35.getCatalog();
        hikariConfig35.setInitializationFailFast(false);
        java.util.Properties properties43 = hikariConfig35.getDataSourceProperties();
        hikariConfig35.setUseInstrumentation(true);
        java.util.Properties properties46 = hikariConfig35.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties46);
        hikariConfig1.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig49.setTransactionIsolation("HikariPool-4836");
        java.lang.String str52 = hikariConfig49.getPoolName();
        long long53 = hikariConfig49.getMaxLifetime();
        hikariConfig49.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties46);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "HikariPool-62640" + "'", str52, "HikariPool-62640");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1800000L + "'", long53 == 1800000L);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        java.lang.String str12 = hikariConfig1.getCatalog();
        boolean boolean13 = hikariConfig1.isReadOnly();
        long long14 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setAcquireRetryDelay((long) (short) 100);
        hikariConfig16.setMinimumPoolSize((int) (byte) 100);
        hikariConfig16.setCatalog("");
        hikariConfig16.setCatalog("HikariPool-674");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.lang.String str27 = hikariConfig26.getConnectionCustomizerClassName();
        int int28 = hikariConfig26.getAcquireIncrement();
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-151");
        long long31 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.setMaxLifetime((long) 10);
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 750L + "'", long31 == 750L);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setMaximumPoolSize(1);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay((long) 35);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-25982");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-25982' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
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
        hikariConfig0.setAutoCommit(false);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setConnectionInitSql("HikariPool-20880");
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
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int25 = hikariConfig24.getAcquireRetries();
        java.lang.String str26 = hikariConfig24.getDataSourceClassName();
        long long27 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig0.addDataSourceProperty("HikariPool-49960", (java.lang.Object) hikariConfig24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 750L + "'", long27 == 750L);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-674");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig11);
        boolean boolean25 = hikariConfig0.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setMinimumPoolSize((int) '#');
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
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
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setCatalog("HikariPool-22013");
        long long20 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1881");
        hikariConfig0.setAcquireRetries((int) '#');
        boolean boolean17 = hikariConfig0.isReadOnly();
        int int18 = hikariConfig0.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        javax.sql.DataSource dataSource22 = hikariConfig19.getDataSource();
        java.lang.String str23 = hikariConfig19.getDataSourceClassName();
        long long24 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setUseInstrumentation(false);
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties27);
        int int29 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
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
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-4587");
        hikariConfig1.setConnectionInitSql("HikariPool-22996");
        hikariConfig1.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(1L);
        hikariConfig0.setConnectionTestQuery("hi!");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isReadOnly();
        java.lang.String str13 = hikariConfig11.getDataSourceClassName();
        hikariConfig11.setJdbcUrl("hi!");
        boolean boolean16 = hikariConfig11.isReadOnly();
        hikariConfig11.setTransactionIsolation("HikariPool-158");
        hikariConfig11.setUseInstrumentation(false);
        java.util.Properties properties21 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig26.setReadOnly(false);
        hikariConfig26.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
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
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig12.setAcquireRetries(3);
        int int29 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement((int) ' ');
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        hikariConfig0.setMaxLifetime((long) 60);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        boolean boolean15 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        java.util.Properties properties19 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("HikariPool-34266");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
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
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        javax.sql.DataSource dataSource22 = hikariConfig19.getDataSource();
        long long23 = hikariConfig19.getConnectionTimeout();
        java.lang.String str24 = hikariConfig19.getCatalog();
        hikariConfig19.setInitializationFailFast(false);
        boolean boolean27 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setDataSourceClassName("");
        java.lang.String str30 = hikariConfig19.getPoolName();
        hikariConfig10.addDataSourceProperty("HikariPool-566", (java.lang.Object) hikariConfig19);
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-3808");
        boolean boolean34 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean35 = hikariConfig10.isAutoCommit();
        java.lang.String str36 = hikariConfig10.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-62677" + "'", str30, "HikariPool-62677");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-158");
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setUseInstrumentation(false);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        int int18 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        java.lang.String str4 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-2937");
        hikariConfig0.setAcquireRetries((int) (short) 0);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbcUrl("HikariPool-7786");
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        long long8 = hikariConfig1.getMaxLifetime();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        hikariConfig1.setConnectionInitSql("HikariPool-11358");
        hikariConfig1.setPoolName("HikariPool-32138");
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
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
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str62 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-33297");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-58363");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-58363' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-674" + "'", str15, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "HikariPool-674" + "'", str62, "HikariPool-674");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionTimeout(600000L);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setMaxLifetime((long) (short) 10);
        java.util.Properties properties16 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        hikariConfig1.setInitializationFailFast(false);
        int int20 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str21 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setCatalog("HikariPool-61261");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setTransactionIsolation("HikariPool-6810");
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setCatalog("HikariPool-60974");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setJdbcUrl("hi!");
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-17630");
        hikariConfig0.setIdleTimeout(1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMinimumPoolSize(100);
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-19382");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setAcquireRetries(60);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-102");
        hikariConfig0.setRegisterMbeans(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-9068");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3494");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long18 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        int int28 = hikariConfig27.getAcquireRetries();
        hikariConfig27.setJdbcUrl("hi!");
        hikariConfig27.setMaximumPoolSize((int) ' ');
        java.lang.String str33 = hikariConfig27.getConnectionTestQuery();
        hikariConfig27.setRegisterMbeans(true);
        boolean boolean36 = hikariConfig27.isJdbc4ConnectionTest();
        hikariConfig27.setReadOnly(false);
        hikariConfig27.setLeakDetectionThreshold((long) (short) 100);
        int int41 = hikariConfig27.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setPoolName("HikariPool-8389");
        hikariConfig0.addDataSourceProperty("HikariPool-7532", (java.lang.Object) hikariConfig27);
        java.lang.Class<?> wildcardClass46 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-49377");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-49377 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.util.Properties properties14 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbcUrl("HikariPool-41027");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
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
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
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
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isReadOnly();
        java.lang.String str29 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setJdbcUrl("hi!");
        boolean boolean32 = hikariConfig27.isReadOnly();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig27.setDataSource(dataSource33);
        boolean boolean35 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setReadOnly(false);
        hikariConfig1.addDataSourceProperty("HikariPool-1604", (java.lang.Object) hikariConfig27);
        hikariConfig27.setIdleTimeout(1800000L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTestQuery("HikariPool-1339");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold(750L);
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1339" + "'", str11, "HikariPool-1339");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setUseInstrumentation(false);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
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
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setPoolName("HikariPool-16880");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setDataSourceClassName("HikariPool-760");
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
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
        int int15 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setTransactionIsolation("HikariPool-13425");
        hikariConfig10.setPoolName("HikariPool-42392");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str9 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setMaxLifetime(0L);
        java.lang.String str27 = hikariConfig24.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        hikariConfig28.setMaxLifetime((long) (short) 10);
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig24.setDataSourceProperties(properties32);
        hikariConfig0.addDataSourceProperty("HikariPool-919", (java.lang.Object) hikariConfig24);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-151");
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1800000L + "'", long1 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig30.setDriverClassName("HikariPool-29607");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-29607' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-36146");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-36146 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
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
        boolean boolean26 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("HikariPool-6225");
        java.lang.String str31 = hikariConfig0.getConnectionCustomizerClassName();
        int int32 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
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
        boolean boolean17 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setConnectionTestQuery("HikariPool-2070");
        hikariConfig13.setMinimumPoolSize(0);
        boolean boolean22 = hikariConfig13.isAutoCommit();
        int int23 = hikariConfig13.getAcquireRetries();
        boolean boolean24 = hikariConfig13.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
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
        hikariConfig1.setTransactionIsolation("HikariPool-2491");
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.setTransactionIsolation("");
        hikariConfig22.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig22.getConnectionInitSql();
        hikariConfig22.setJdbcUrl("");
        hikariConfig22.setReadOnly(false);
        int int32 = hikariConfig22.getMinimumPoolSize();
        hikariConfig22.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str36 = hikariConfig35.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig37.setConnectionInitSql("");
        boolean boolean40 = hikariConfig37.isJdbc4ConnectionTest();
        java.lang.String str41 = hikariConfig37.getCatalog();
        java.lang.String str42 = hikariConfig37.getConnectionTestQuery();
        hikariConfig37.setLeakDetectionThreshold((long) '4');
        long long45 = hikariConfig37.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig46.setConnectionInitSql("");
        boolean boolean49 = hikariConfig46.isJdbc4ConnectionTest();
        java.lang.String str50 = hikariConfig46.getCatalog();
        java.lang.String str51 = hikariConfig46.getConnectionTestQuery();
        hikariConfig46.setLeakDetectionThreshold((long) '4');
        hikariConfig46.setRegisterMbeans(false);
        hikariConfig46.setAutoCommit(false);
        java.util.Properties properties58 = hikariConfig46.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties58);
        hikariConfig35.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig22.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig1.setDataSourceProperties(properties58);
        hikariConfig1.setInitializationFailFast(true);
        int int68 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-62760" + "'", str12, "HikariPool-62760");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 750L + "'", long45 == 750L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setDataSourceClassName("");
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-1877");
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold(0L);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean10 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
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
        int int17 = hikariConfig13.getAcquireRetries();
        java.util.Properties properties18 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setReadOnly(true);
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-62781" + "'", str12, "HikariPool-62781");
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setPoolName("HikariPool-7217");
        hikariConfig1.setConnectionInitSql("");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig11.setConnectionInitSql("");
        boolean boolean14 = hikariConfig11.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig11.getCatalog();
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.setIdleTimeout((long) (byte) -1);
        java.lang.String str29 = hikariConfig26.getCatalog();
        hikariConfig26.setJdbcUrl("HikariPool-6541");
        java.util.Properties properties32 = hikariConfig26.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setPoolName("");
        hikariConfig1.setInitializationFailFast(false);
        int int12 = hikariConfig1.getAcquireRetries();
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
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
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isReadOnly();
        java.lang.String str29 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setJdbcUrl("hi!");
        boolean boolean32 = hikariConfig27.isReadOnly();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig27.setDataSource(dataSource33);
        boolean boolean35 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setReadOnly(false);
        hikariConfig1.addDataSourceProperty("HikariPool-1604", (java.lang.Object) hikariConfig27);
        hikariConfig27.setMaxLifetime((long) 10);
        java.lang.String str41 = hikariConfig27.getConnectionInitSql();
        hikariConfig27.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19063");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19063 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
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
        long long27 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig0.setDataSource(dataSource28);
        hikariConfig0.setConnectionInitSql("HikariPool-9268");
        hikariConfig0.setIdleTimeout((long) (byte) 100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-62800" + "'", str26, "HikariPool-62800");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
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
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("");
        boolean boolean16 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setMaxLifetime(100L);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig19.setConnectionInitSql("");
        boolean boolean22 = hikariConfig19.isJdbc4ConnectionTest();
        java.lang.String str23 = hikariConfig19.getCatalog();
        hikariConfig19.setReadOnly(false);
        java.lang.String str26 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setIsolateInternalQueries(false);
        java.util.Properties properties29 = hikariConfig19.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        hikariConfig1.setMaxLifetime((long) (short) -1);
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        int int35 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(true);
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-30458");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-30458' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
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
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionInitSql("HikariPool-58111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
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
        int int14 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
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
        hikariConfig14.setRegisterMbeans(true);
        hikariConfig14.setAcquireRetryDelay((long) (short) 0);
        hikariConfig14.setCatalog("HikariPool-9977");
        hikariConfig14.setCatalog("HikariPool-32141");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMinimumPoolSize(0);
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setTransactionIsolation("HikariPool-37814");
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        int int6 = hikariConfig1.getTransactionIsolation();
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setReadOnly(false);
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
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
        java.lang.String str44 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(dataSource25);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-62822" + "'", str35, "HikariPool-62822");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
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
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("HikariPool-17728");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isReadOnly();
        java.lang.String str18 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setJdbcUrl("hi!");
        boolean boolean21 = hikariConfig16.isReadOnly();
        hikariConfig1.addDataSourceProperty("HikariPool-3800", (java.lang.Object) boolean21);
        hikariConfig1.setPoolName("HikariPool-2827");
        java.lang.String str25 = hikariConfig1.getJdbcUrl();
        long long26 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireIncrement(32);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("");
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setDataSourceClassName("HikariPool-1993");
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        int int15 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-43493");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-43493 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-4919");
        hikariConfig1.setPoolName("HikariPool-2465");
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
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
        hikariConfig1.setDataSourceClassName("HikariPool-46426");
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
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
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTestQuery("hi!");
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setAutoCommit(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        long long7 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
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
        hikariConfig0.setCatalog("HikariPool-6319");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIsolateInternalQueries(false);
        int int20 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
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
        int int25 = hikariConfig7.getMaximumPoolSize();
        hikariConfig7.setAutoCommit(true);
        java.lang.String str28 = hikariConfig7.getJdbcUrl();
        int int29 = hikariConfig7.getAcquireRetries();
        javax.sql.DataSource dataSource30 = hikariConfig7.getDataSource();
        java.lang.String str31 = hikariConfig7.getCatalog();
        int int32 = hikariConfig7.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-674" + "'", str31, "HikariPool-674");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-10656");
        long long13 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        int int28 = hikariConfig27.getAcquireRetries();
        hikariConfig27.setJdbcUrl("hi!");
        hikariConfig27.setMaximumPoolSize((int) ' ');
        java.lang.String str33 = hikariConfig27.getConnectionTestQuery();
        hikariConfig27.setRegisterMbeans(true);
        boolean boolean36 = hikariConfig27.isJdbc4ConnectionTest();
        hikariConfig27.setReadOnly(false);
        hikariConfig27.setLeakDetectionThreshold((long) (short) 100);
        int int41 = hikariConfig27.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setPoolName("HikariPool-8389");
        hikariConfig0.addDataSourceProperty("HikariPool-7532", (java.lang.Object) hikariConfig27);
        hikariConfig0.setJdbcUrl("HikariPool-9827");
        int int48 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbcUrl("HikariPool-761");
        java.lang.String str12 = hikariConfig0.getPoolName();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-31908");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-62879" + "'", str12, "HikariPool-62879");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
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
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str24 = hikariConfig23.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-21373");
        hikariConfig1.setTransactionIsolation("HikariPool-54338");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setCatalog("HikariPool-26702");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setDataSourceClassName("HikariPool-102");
        hikariConfig1.setAutoCommit(true);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        boolean boolean14 = hikariConfig1.isReadOnly();
        java.lang.String str15 = hikariConfig1.getCatalog();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        int int17 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-151");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((long) 10);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-761");
        hikariConfig10.setConnectionTestQuery("");
        java.lang.String str15 = hikariConfig10.getPoolName();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setTransactionIsolation("");
        hikariConfig17.setCatalog("");
        hikariConfig17.setMinimumPoolSize(100);
        java.lang.String str24 = hikariConfig17.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setConnectionInitSql("");
        boolean boolean28 = hikariConfig25.isJdbc4ConnectionTest();
        java.lang.String str29 = hikariConfig25.getCatalog();
        java.lang.String str30 = hikariConfig25.getConnectionTestQuery();
        hikariConfig25.setLeakDetectionThreshold((long) '4');
        hikariConfig25.setMaxLifetime(5000L);
        hikariConfig25.setAcquireRetries((int) (short) 1);
        java.util.Properties properties37 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig40.setTransactionIsolation("");
        javax.sql.DataSource dataSource43 = hikariConfig40.getDataSource();
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig46.setConnectionInitSql("");
        hikariConfig46.setJdbcUrl("");
        hikariConfig46.setConnectionTestQuery("hi!");
        hikariConfig40.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig46);
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig55.setConnectionInitSql("");
        hikariConfig55.setJdbcUrl("");
        hikariConfig55.setConnectionTestQuery("hi!");
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig63.setTransactionIsolation("");
        javax.sql.DataSource dataSource66 = hikariConfig63.getDataSource();
        long long67 = hikariConfig63.getConnectionTimeout();
        java.lang.String str68 = hikariConfig63.getCatalog();
        hikariConfig63.setInitializationFailFast(false);
        java.util.Properties properties71 = hikariConfig63.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig55.setDataSourceProperties(properties71);
        hikariConfig40.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig25.addDataSourceProperty("HikariPool-102", (java.lang.Object) properties71);
        hikariConfig17.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig10.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties71);
        long long85 = hikariConfig84.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-62894" + "'", str15, "HikariPool-62894");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNull(dataSource66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 5000L + "'", long67 == 5000L);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 5000L + "'", long85 == 5000L);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str3 = hikariConfig1.getCatalog();
        hikariConfig1.setAutoCommit(false);
        long long6 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        boolean boolean9 = hikariConfig7.isInitializationFailFast();
        long long10 = hikariConfig7.getAcquireRetryDelay();
        hikariConfig7.setAcquireRetries(100);
        hikariConfig7.setMinimumPoolSize(0);
        boolean boolean15 = hikariConfig7.isRegisterMbeans();
        boolean boolean16 = hikariConfig7.isRegisterMbeans();
        java.lang.String str17 = hikariConfig7.getPoolName();
        hikariConfig7.setCatalog("HikariPool-8441");
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setTransactionIsolation("");
        javax.sql.DataSource dataSource24 = null;
        hikariConfig21.setDataSource(dataSource24);
        hikariConfig21.setAutoCommit(false);
        hikariConfig21.setUseInstrumentation(true);
        hikariConfig21.setDataSourceClassName("");
        javax.sql.DataSource dataSource32 = hikariConfig21.getDataSource();
        java.lang.String str33 = hikariConfig21.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig34.setConnectionInitSql("");
        boolean boolean37 = hikariConfig34.isJdbc4ConnectionTest();
        java.lang.String str38 = hikariConfig34.getCatalog();
        java.lang.String str39 = hikariConfig34.getConnectionTestQuery();
        hikariConfig34.setLeakDetectionThreshold((long) '4');
        long long42 = hikariConfig34.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig43.setConnectionInitSql("");
        boolean boolean46 = hikariConfig43.isJdbc4ConnectionTest();
        java.lang.String str47 = hikariConfig43.getCatalog();
        java.lang.String str48 = hikariConfig43.getConnectionTestQuery();
        hikariConfig43.setLeakDetectionThreshold((long) '4');
        hikariConfig43.setRegisterMbeans(false);
        hikariConfig43.setAutoCommit(false);
        java.util.Properties properties55 = hikariConfig43.getDataSourceProperties();
        hikariConfig34.setDataSourceProperties(properties55);
        hikariConfig21.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig58.setConnectionInitSql("");
        boolean boolean61 = hikariConfig58.isJdbc4ConnectionTest();
        java.lang.String str62 = hikariConfig58.getCatalog();
        java.lang.String str63 = hikariConfig58.getConnectionTestQuery();
        hikariConfig58.setLeakDetectionThreshold((long) '4');
        hikariConfig58.setRegisterMbeans(false);
        hikariConfig58.setAutoCommit(false);
        java.util.Properties properties70 = hikariConfig58.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig71.setMaxLifetime(0L);
        java.lang.String str74 = hikariConfig71.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str76 = hikariConfig75.getConnectionInitSql();
        hikariConfig75.setMaxLifetime((long) (short) 10);
        java.util.Properties properties79 = hikariConfig75.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig71.setDataSourceProperties(properties79);
        hikariConfig21.setDataSourceProperties(properties79);
        hikariConfig7.setDataSourceProperties(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setTransactionIsolation("HikariPool-48159");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-62911" + "'", str17, "HikariPool-62911");
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 750L + "'", long42 == 750L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
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
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.setReadOnly(true);
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-761" + "'", str19, "HikariPool-761");
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setIdleTimeout((long) 0);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        long long13 = hikariConfig1.getIdleTimeout();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18151");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18151 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireRetryDelay((long) '4');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3107");
        hikariConfig1.setIsolateInternalQueries(false);
        long long14 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-3204");
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setCatalog("HikariPool-14643");
        long long14 = hikariConfig0.getIdleTimeout();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("HikariPool-55081");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
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
        hikariConfig13.setJdbcUrl("HikariPool-1844");
        javax.sql.DataSource dataSource17 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("HikariPool-12993");
        java.lang.String str20 = hikariConfig13.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-12993" + "'", str20, "HikariPool-12993");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource3 = null;
        hikariConfig0.setDataSource(dataSource3);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireRetries();
        int int8 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setConnectionInitSql("");
        boolean boolean13 = hikariConfig10.isJdbc4ConnectionTest();
        java.lang.String str14 = hikariConfig10.getCatalog();
        java.lang.String str15 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.setLeakDetectionThreshold((long) '4');
        hikariConfig10.setMaxLifetime(5000L);
        int int20 = hikariConfig10.getMinimumPoolSize();
        javax.sql.DataSource dataSource21 = hikariConfig10.getDataSource();
        hikariConfig0.addDataSourceProperty("HikariPool-566", (java.lang.Object) hikariConfig10);
        hikariConfig10.setAutoCommit(false);
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig10.getConnectionCustomizerClassName();
        int int28 = hikariConfig10.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.lang.String str5 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize(35);
        java.lang.String str8 = hikariConfig1.getPoolName();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-62934" + "'", str8, "HikariPool-62934");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
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
        long long28 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setDataSourceClassName("HikariPool-5645");
        hikariConfig13.setMaxLifetime(100L);
        long long33 = hikariConfig13.getLeakDetectionThreshold();
        java.lang.String str34 = hikariConfig13.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setAutoCommit(false);
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime(5000L);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setTransactionIsolation("HikariPool-919");
        boolean boolean19 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-58381");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        hikariConfig1.setReadOnly(false);
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) 35);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) 3);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-62941" + "'", str9, "HikariPool-62941");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setCatalog("");
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setConnectionTestQuery("HikariPool-5245");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        hikariConfig0.setCatalog("");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-1636");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        int int18 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-14313");
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.setDataSource(dataSource21);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.setTransactionIsolation("");
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig24.getConnectionInitSql();
        hikariConfig24.setJdbcUrl("");
        hikariConfig24.setReadOnly(false);
        int int34 = hikariConfig24.getMinimumPoolSize();
        hikariConfig24.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str38 = hikariConfig37.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig39.setConnectionInitSql("");
        boolean boolean42 = hikariConfig39.isJdbc4ConnectionTest();
        java.lang.String str43 = hikariConfig39.getCatalog();
        java.lang.String str44 = hikariConfig39.getConnectionTestQuery();
        hikariConfig39.setLeakDetectionThreshold((long) '4');
        long long47 = hikariConfig39.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig48.setConnectionInitSql("");
        boolean boolean51 = hikariConfig48.isJdbc4ConnectionTest();
        java.lang.String str52 = hikariConfig48.getCatalog();
        java.lang.String str53 = hikariConfig48.getConnectionTestQuery();
        hikariConfig48.setLeakDetectionThreshold((long) '4');
        hikariConfig48.setRegisterMbeans(false);
        hikariConfig48.setAutoCommit(false);
        java.util.Properties properties60 = hikariConfig48.getDataSourceProperties();
        hikariConfig39.setDataSourceProperties(properties60);
        hikariConfig37.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig24.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig0.setDataSourceProperties(properties60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 750L + "'", long47 == 750L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
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
        hikariConfig0.setMaxLifetime((long) (-1));
        java.lang.String str29 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-52085");
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig32.setConnectionInitSql("");
        boolean boolean35 = hikariConfig32.isJdbc4ConnectionTest();
        java.lang.String str36 = hikariConfig32.getCatalog();
        java.lang.String str37 = hikariConfig32.getConnectionTestQuery();
        hikariConfig32.setLeakDetectionThreshold((long) '4');
        hikariConfig32.setRegisterMbeans(false);
        hikariConfig32.setAutoCommit(false);
        java.util.Properties properties44 = hikariConfig32.getDataSourceProperties();
        hikariConfig32.setAutoCommit(false);
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.setTransactionIsolation("");
        javax.sql.DataSource dataSource51 = hikariConfig48.getDataSource();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig54.setConnectionInitSql("");
        hikariConfig54.setJdbcUrl("");
        hikariConfig54.setConnectionTestQuery("hi!");
        hikariConfig48.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig54);
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig63.setConnectionInitSql("");
        hikariConfig63.setJdbcUrl("");
        hikariConfig63.setConnectionTestQuery("hi!");
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig71.setTransactionIsolation("");
        javax.sql.DataSource dataSource74 = hikariConfig71.getDataSource();
        long long75 = hikariConfig71.getConnectionTimeout();
        java.lang.String str76 = hikariConfig71.getCatalog();
        hikariConfig71.setInitializationFailFast(false);
        java.util.Properties properties79 = hikariConfig71.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties79);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig63.setDataSourceProperties(properties79);
        hikariConfig48.setDataSourceProperties(properties79);
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig32.setDataSourceProperties(properties79);
        hikariConfig0.setDataSourceProperties(properties79);
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
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-62962" + "'", str26, "HikariPool-62962");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-62962" + "'", str29, "HikariPool-62962");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(dataSource51);
        org.junit.Assert.assertNull(dataSource74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 5000L + "'", long75 == 5000L);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
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
        long long38 = hikariConfig37.getConnectionTimeout();
        java.lang.String str39 = hikariConfig37.getJdbcUrl();
        long long40 = hikariConfig37.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("hi!");
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setTransactionIsolation("");
        javax.sql.DataSource dataSource14 = hikariConfig11.getDataSource();
        long long15 = hikariConfig11.getConnectionTimeout();
        int int16 = hikariConfig11.getTransactionIsolation();
        boolean boolean17 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setAutoCommit(true);
        hikariConfig11.setConnectionTimeout(600000L);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        hikariConfig22.setMaxLifetime((long) (short) 10);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        boolean boolean34 = hikariConfig32.isAutoCommit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-28253");
        hikariConfig0.setMaxLifetime((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionCustomizerClassName();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("");
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        long long18 = hikariConfig14.getConnectionTimeout();
        int int19 = hikariConfig14.getTransactionIsolation();
        boolean boolean20 = hikariConfig14.isInitializationFailFast();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig14.setDataSource(dataSource21);
        boolean boolean23 = hikariConfig14.isJdbc4ConnectionTest();
        int int24 = hikariConfig14.getMinimumPoolSize();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isReadOnly();
        java.lang.String str28 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean31 = hikariConfig26.isAutoCommit();
        long long32 = hikariConfig26.getLeakDetectionThreshold();
        hikariConfig26.setDataSourceClassName("HikariPool-158");
        hikariConfig26.setConnectionTimeout((long) (short) 100);
        hikariConfig26.setMaxLifetime((long) (byte) 1);
        java.util.Properties properties39 = hikariConfig26.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties39);
        hikariConfig1.addDataSourceProperty("HikariPool-42487", (java.lang.Object) hikariConfig14);
        java.lang.String str42 = hikariConfig14.getPoolName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(properties39);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HikariPool-62992" + "'", str42, "HikariPool-62992");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
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
        hikariConfig0.setCatalog("HikariPool-7714");
        hikariConfig0.setConnectionInitSql("HikariPool-7162");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
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
        int int15 = hikariConfig1.getMinimumPoolSize();
        boolean boolean16 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        long long5 = hikariConfig1.getConnectionTimeout();
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17902");
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        boolean boolean15 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.lang.String str8 = hikariConfig1.getJdbcUrl();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-7217");
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        long long15 = hikariConfig1.getConnectionTimeout();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        int int17 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-25091");
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
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
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-14795");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-42747");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-42747 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setMaximumPoolSize((int) ' ');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getMaxLifetime();
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        long long12 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 'a');
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        java.lang.String str8 = hikariConfig1.getCatalog();
        int int9 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-40545");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-40545 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-102");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        boolean boolean16 = hikariConfig13.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig13.getCatalog();
        java.lang.String str18 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.setLeakDetectionThreshold((long) '4');
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.setAutoCommit(false);
        java.util.Properties properties25 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setAutoCommit(false);
        boolean boolean28 = hikariConfig13.isIsolateInternalQueries();
        hikariConfig13.setConnectionInitSql("HikariPool-102");
        hikariConfig13.setConnectionCustomizerClassName("HikariPool-159");
        boolean boolean33 = hikariConfig13.isReadOnly();
        java.util.Properties properties34 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.addDataSourceProperty("HikariPool-1745", (java.lang.Object) properties34);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        int int12 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setJdbcUrl("hi!");
        hikariConfig11.setAutoCommit(true);
        hikariConfig11.setIdleTimeout(1L);
        hikariConfig11.setMaximumPoolSize(1);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        boolean boolean24 = hikariConfig21.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig21.getCatalog();
        java.lang.String str26 = hikariConfig21.getConnectionTestQuery();
        hikariConfig21.setLeakDetectionThreshold((long) '4');
        hikariConfig21.setRegisterMbeans(false);
        hikariConfig21.setAutoCommit(false);
        java.util.Properties properties33 = hikariConfig21.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties33);
        hikariConfig0.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-31032");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-31032' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbcUrl("HikariPool-130");
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-25993");
        hikariConfig0.setIdleTimeout(600000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setJdbcUrl("");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-39345");
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setJdbcUrl("hi!");
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isReadOnly();
        java.lang.String str12 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setJdbcUrl("hi!");
        boolean boolean15 = hikariConfig10.isReadOnly();
        hikariConfig10.setTransactionIsolation("HikariPool-158");
        hikariConfig10.setUseInstrumentation(false);
        java.util.Properties properties20 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig1.setDataSourceProperties(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties20);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long25 = hikariConfig24.getConnectionTimeout();
        hikariConfig24.setAcquireRetries((int) (byte) 0);
        long long28 = hikariConfig24.getConnectionTimeout();
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-16417");
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
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
        java.lang.String str17 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-63031" + "'", str17, "HikariPool-63031");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-102");
        int int7 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setTransactionIsolation("HikariPool-993");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        long long14 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setDataSourceClassName("hi!");
        hikariConfig13.setConnectionInitSql("HikariPool-151");
        hikariConfig1.addDataSourceProperty("HikariPool-442", (java.lang.Object) "HikariPool-151");
        hikariConfig1.setLeakDetectionThreshold(1L);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        boolean boolean24 = hikariConfig22.isInitializationFailFast();
        long long25 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource28 = hikariConfig22.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setConnectionInitSql("");
        boolean boolean32 = hikariConfig29.isJdbc4ConnectionTest();
        hikariConfig29.setJdbcUrl("hi!");
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 750L + "'", long25 == 750L);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
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
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.setJdbc4ConnectionTest(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig18.setDriverClassName("HikariPool-18285");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-18285' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setConnectionInitSql("");
        boolean boolean11 = hikariConfig8.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig8.getCatalog();
        java.lang.String str13 = hikariConfig8.getConnectionTestQuery();
        hikariConfig8.setLeakDetectionThreshold((long) '4');
        hikariConfig8.setRegisterMbeans(false);
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setTransactionIsolation("HikariPool-158");
        hikariConfig8.setLeakDetectionThreshold((-1L));
        hikariConfig0.addDataSourceProperty("HikariPool-1881", (java.lang.Object) (-1L));
        int int25 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1881");
        hikariConfig0.setAcquireRetries((int) '#');
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime(52L);
        hikariConfig0.setMinimumPoolSize(97);
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("hi!");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireIncrement(100);
        java.lang.String str10 = hikariConfig0.getCatalog();
        hikariConfig0.setDataSourceClassName("HikariPool-1177");
        int int13 = hikariConfig0.getMaximumPoolSize();
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isReadOnly();
        java.lang.String str3 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean6 = hikariConfig1.isAutoCommit();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setDataSourceClassName("HikariPool-1276");
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaximumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-36467");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-36467 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
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
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties35);
    }
}
