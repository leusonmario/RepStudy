import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
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
        hikariConfig0.setCatalog("HikariPool-3150");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-53958");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-68268" + "'", str7, "HikariPool-68268");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
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
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.setConnectionCustomizerClassName("");
        boolean boolean16 = hikariConfig10.isReadOnly();
        long long17 = hikariConfig10.getMaxLifetime();
        long long18 = hikariConfig10.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isJdbc4ConnectionTest();
        long long21 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setJdbcUrl("");
        java.lang.String str24 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig10.setDataSourceProperties(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setConnectionInitSql("");
        hikariConfig35.setConnectionInitSql("hi!");
        java.lang.String str40 = hikariConfig35.getConnectionCustomizerClassName();
        hikariConfig35.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean44 = hikariConfig43.isJdbc4ConnectionTest();
        long long45 = hikariConfig43.getConnectionTimeout();
        hikariConfig43.setJdbcUrl("");
        java.lang.String str48 = hikariConfig43.getConnectionCustomizerClassName();
        java.util.Properties properties49 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig35.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig33.setDataSourceProperties(properties49);
        hikariConfig31.setDataSourceProperties(properties49);
        hikariConfig0.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
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
        int int15 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        int int17 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setConnectionInitSql("");
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties22 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setIdleTimeout(750L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
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
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-510");
        hikariConfig0.setAcquireRetries((int) (short) 10);
        hikariConfig0.setCatalog("HikariPool-573");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setReadOnly(false);
        int int12 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-49234");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-49234 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
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
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        int int15 = hikariConfig0.getTransactionIsolation();
        int int16 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement(1);
        hikariConfig0.setMinimumPoolSize((int) '4');
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
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
        hikariConfig23.setIdleTimeout((long) (short) 1);
        boolean boolean54 = hikariConfig23.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
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
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAcquireRetryDelay(600000L);
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime((long) 60);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setReadOnly(false);
        long long11 = hikariConfig0.getMaxLifetime();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-24055");
        hikariConfig0.setAcquireRetryDelay(750L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        long long12 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        long long12 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setJdbcUrl("");
        javax.sql.DataSource dataSource15 = hikariConfig10.getDataSource();
        boolean boolean16 = hikariConfig10.isReadOnly();
        hikariConfig10.addDataSourceProperty("HikariPool-11479", (java.lang.Object) "HikariPool-16800");
        hikariConfig10.setConnectionInitSql("HikariPool-14852");
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setConnectionInitSql("");
        hikariConfig22.setConnectionInitSql("hi!");
        java.lang.String str27 = hikariConfig22.getConnectionCustomizerClassName();
        hikariConfig22.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean31 = hikariConfig30.isJdbc4ConnectionTest();
        hikariConfig30.setReadOnly(false);
        hikariConfig30.setDataSourceClassName("");
        java.lang.String str36 = hikariConfig30.getCatalog();
        hikariConfig30.setAutoCommit(false);
        long long39 = hikariConfig30.getMaxLifetime();
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties40);
        hikariConfig10.setDataSourceProperties(properties40);
        hikariConfig0.setDataSourceProperties(properties40);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1800000L + "'", long39 == 1800000L);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        hikariConfig0.setIdleTimeout((long) 1);
        hikariConfig0.setPoolName("HikariPool-30410");
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
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
        java.lang.String str20 = hikariConfig12.getPoolName();
        hikariConfig12.setMinimumPoolSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-68312" + "'", str20, "HikariPool-68312");
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setCatalog("");
        boolean boolean23 = hikariConfig20.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-11326", (java.lang.Object) hikariConfig20);
        hikariConfig0.setTransactionIsolation("HikariPool-13856");
        hikariConfig0.setLeakDetectionThreshold(32L);
        int int29 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isJdbc4ConnectionTest();
        hikariConfig31.setReadOnly(false);
        hikariConfig31.setConnectionInitSql("hi!");
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str39 = hikariConfig31.getJdbcUrl();
        hikariConfig31.setTransactionIsolation("HikariPool-250");
        hikariConfig31.setIsolateInternalQueries(false);
        long long44 = hikariConfig31.getAcquireRetryDelay();
        java.lang.String str45 = hikariConfig31.getPoolName();
        int int46 = hikariConfig31.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("HikariPool-2812", (java.lang.Object) hikariConfig31);
        hikariConfig31.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 750L + "'", long44 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-68317" + "'", str45, "HikariPool-68317");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
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
        hikariConfig1.setMinimumPoolSize(3);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isJdbc4ConnectionTest();
        long long20 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setJdbcUrl("");
        javax.sql.DataSource dataSource23 = hikariConfig18.getDataSource();
        hikariConfig18.setTransactionIsolation("HikariPool-514");
        boolean boolean26 = hikariConfig18.isIsolateInternalQueries();
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-2282");
        java.lang.String str29 = hikariConfig18.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-2037", (java.lang.Object) str29);
        java.lang.String str31 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-68320" + "'", str29, "HikariPool-68320");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
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
        hikariConfig0.setPoolName("HikariPool-19527");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(1);
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        int int13 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
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
        int int12 = hikariConfig9.getMaximumPoolSize();
        java.lang.String str13 = hikariConfig9.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setAcquireRetries(52);
        hikariConfig0.setAcquireIncrement(60);
        int int15 = hikariConfig0.getMinimumPoolSize();
        boolean boolean16 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionInitSql("HikariPool-52215");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
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
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str22 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        int int25 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-6653" + "'", str22, "HikariPool-6653");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
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
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) '4');
        int int12 = hikariConfig0.getMaximumPoolSize();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaxLifetime(1800000L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-26112");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-26112' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
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
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig0.setIdleTimeout((long) '4');
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        long long20 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setIsolateInternalQueries(true);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.setConnectionTimeout(100L);
        hikariConfig13.setJdbcUrl("HikariPool-1042");
        java.util.Properties properties29 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-12658", (java.lang.Object) hikariConfig13);
        java.lang.String str31 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean34 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getPoolName();
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        int int10 = hikariConfig0.getAcquireIncrement();
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-19436");
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-68338" + "'", str7, "HikariPool-68338");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
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
        int int12 = hikariConfig9.getTransactionIsolation();
        boolean boolean13 = hikariConfig9.isIsolateInternalQueries();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig9.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetries(3);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 3);
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        int int17 = hikariConfig0.getAcquireIncrement();
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68343" + "'", str6, "HikariPool-68343");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
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
        long long12 = hikariConfig0.getIdleTimeout();
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean14 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
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
        long long13 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-2535");
        hikariConfig0.setTransactionIsolation("HikariPool-13846");
        int int18 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(5000L);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setPoolName("HikariPool-16520");
        hikariConfig0.setDataSourceClassName("HikariPool-11423");
        int int19 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
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
        int int15 = hikariConfig0.getMinimumPoolSize();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        java.lang.String str17 = hikariConfig0.getPoolName();
        hikariConfig0.setCatalog("HikariPool-65825");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-68354" + "'", str17, "HikariPool-68354");
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-61531");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        boolean boolean9 = hikariConfig7.isReadOnly();
        javax.sql.DataSource dataSource10 = hikariConfig7.getDataSource();
        boolean boolean11 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(false);
        hikariConfig7.setRegisterMbeans(false);
        hikariConfig7.setMaxLifetime((long) ' ');
        int int18 = hikariConfig7.getMaximumPoolSize();
        long long19 = hikariConfig7.getAcquireRetryDelay();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig7.setDataSource(dataSource20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        boolean boolean24 = hikariConfig22.isReadOnly();
        int int25 = hikariConfig22.getAcquireIncrement();
        java.lang.String str26 = hikariConfig22.getDataSourceClassName();
        hikariConfig22.setConnectionTimeout((long) 0);
        hikariConfig22.setAcquireRetries(60);
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setConnectionInitSql("");
        hikariConfig35.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean41 = hikariConfig40.isJdbc4ConnectionTest();
        long long42 = hikariConfig40.getConnectionTimeout();
        hikariConfig40.setJdbcUrl("");
        java.lang.String str45 = hikariConfig40.getConnectionCustomizerClassName();
        java.util.Properties properties46 = hikariConfig40.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig35.setDataSourceProperties(properties46);
        hikariConfig22.setDataSourceProperties(properties46);
        hikariConfig7.setDataSourceProperties(properties46);
        hikariConfig7.setUseInstrumentation(false);
        hikariConfig7.setReadOnly(false);
        hikariConfig0.addDataSourceProperty("HikariPool-11072", (java.lang.Object) false);
        boolean boolean56 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5000L + "'", long42 == 5000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
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
        hikariConfig0.setMinimumPoolSize(1);
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        int int23 = hikariConfig0.getMinimumPoolSize();
        long long24 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        boolean boolean16 = hikariConfig14.isReadOnly();
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        boolean boolean18 = hikariConfig14.isInitializationFailFast();
        int int19 = hikariConfig14.getAcquireRetries();
        hikariConfig0.addDataSourceProperty("HikariPool-1744", (java.lang.Object) int19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        hikariConfig22.setReadOnly(false);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetries(1);
        hikariConfig22.setAcquireIncrement((int) (short) 100);
        hikariConfig22.addDataSourceProperty("HikariPool-1301", (java.lang.Object) 60);
        hikariConfig22.setTransactionIsolation("HikariPool-1143");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) "HikariPool-1143");
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setConnectionInitSql("HikariPool-3266");
        hikariConfig0.setMaximumPoolSize((int) '4');
        int int44 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
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
        long long13 = hikariConfig0.getIdleTimeout();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        long long11 = hikariConfig0.getMaxLifetime();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
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
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        int int14 = hikariConfig0.getMinimumPoolSize();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12992");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12992 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2522");
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIdleTimeout((long) 35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
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
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int23 = hikariConfig0.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass24 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
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
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.setJdbcUrl("HikariPool-2747");
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        long long9 = hikariConfig0.getMaxLifetime();
        int int10 = hikariConfig0.getTransactionIsolation();
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireRetries(52);
        hikariConfig0.setConnectionInitSql("HikariPool-7895");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getCatalog();
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setLeakDetectionThreshold(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig12.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str29 = hikariConfig28.getDataSourceClassName();
        long long30 = hikariConfig28.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMaxLifetime((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
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
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout((long) 0);
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-1707");
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        int int14 = hikariConfig12.getMinimumPoolSize();
        boolean boolean15 = hikariConfig12.isIsolateInternalQueries();
        hikariConfig12.setIdleTimeout((long) (short) 10);
        java.lang.String str18 = hikariConfig12.getPoolName();
        hikariConfig12.setMinimumPoolSize(3);
        hikariConfig12.setMaxLifetime((long) '#');
        long long23 = hikariConfig12.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        boolean boolean26 = hikariConfig24.isReadOnly();
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        int int28 = hikariConfig24.getMaximumPoolSize();
        boolean boolean29 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setLeakDetectionThreshold(0L);
        long long32 = hikariConfig24.getMaxLifetime();
        hikariConfig24.setReadOnly(false);
        java.util.Properties properties35 = hikariConfig24.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties35);
        hikariConfig0.addDataSourceProperty("HikariPool-1579", (java.lang.Object) hikariConfig12);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig39.setConnectionInitSql("");
        hikariConfig39.setConnectionInitSql("hi!");
        java.lang.String str44 = hikariConfig39.getConnectionCustomizerClassName();
        boolean boolean45 = hikariConfig39.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean48 = hikariConfig47.isJdbc4ConnectionTest();
        int int49 = hikariConfig47.getMinimumPoolSize();
        hikariConfig47.setAutoCommit(true);
        int int52 = hikariConfig47.getMaximumPoolSize();
        hikariConfig39.addDataSourceProperty("HikariPool-250", (java.lang.Object) int52);
        hikariConfig39.setDataSourceClassName("HikariPool-377");
        int int56 = hikariConfig39.getTransactionIsolation();
        long long57 = hikariConfig39.getIdleTimeout();
        hikariConfig39.setJdbcUrl("HikariPool-6653");
        hikariConfig12.addDataSourceProperty("HikariPool-2967", (java.lang.Object) hikariConfig39);
        hikariConfig39.setConnectionTestQuery("HikariPool-10785");
        hikariConfig39.setJdbcUrl("HikariPool-38867");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-68393" + "'", str18, "HikariPool-68393");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 600000L + "'", long57 == 600000L);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getPoolName();
        long long11 = hikariConfig0.getConnectionTimeout();
        int int12 = hikariConfig0.getTransactionIsolation();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68397" + "'", str10, "HikariPool-68397");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        hikariConfig0.setConnectionTimeout(5000L);
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) 97);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        boolean boolean13 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-829" + "'", str12, "HikariPool-829");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setPoolName("HikariPool-902");
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int9 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        java.lang.String str12 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getCatalog();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-6458");
        hikariConfig0.setConnectionTestQuery("HikariPool-64879");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setIdleTimeout(60L);
        long long13 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMinimumPoolSize();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setInitializationFailFast(false);
        long long14 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setTransactionIsolation("HikariPool-54766");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-211" + "'", str11, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setPoolName("HikariPool-37453");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireIncrement(35);
        long long15 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        java.lang.Class<?> wildcardClass25 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isReadOnly();
        int int13 = hikariConfig10.getAcquireIncrement();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig10.getCatalog();
        long long17 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig0.addDataSourceProperty("HikariPool-5463", (java.lang.Object) hikariConfig10);
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
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
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig51.setMinimumPoolSize((int) ' ');
        hikariConfig51.setRegisterMbeans(true);
        hikariConfig51.setAcquireRetries((int) '4');
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
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("");
        long long10 = hikariConfig0.getIdleTimeout();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(97L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        long long10 = hikariConfig0.getMaxLifetime();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("HikariPool-51698");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setIdleTimeout(1800000L);
        hikariConfig0.setUseInstrumentation(true);
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
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setConnectionInitSql("hi!");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig21.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isJdbc4ConnectionTest();
        long long31 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setJdbcUrl("");
        java.lang.String str34 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig21.setDataSourceProperties(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1733");
        int int43 = hikariConfig1.getAcquireRetries();
        int int44 = hikariConfig1.getTransactionIsolation();
        java.lang.String str45 = hikariConfig1.getDataSourceClassName();
        int int46 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setTransactionIsolation("HikariPool-42909");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
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
        hikariConfig0.setDataSourceClassName("HikariPool-7783");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-250");
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-68438" + "'", str13, "HikariPool-68438");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        hikariConfig9.setReadOnly(false);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        long long15 = hikariConfig9.getLeakDetectionThreshold();
        hikariConfig9.setAcquireRetries(60);
        hikariConfig9.setDataSourceClassName("HikariPool-370");
        hikariConfig9.setAutoCommit(true);
        hikariConfig0.addDataSourceProperty("HikariPool-13334", (java.lang.Object) hikariConfig9);
        java.util.Properties properties23 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-15088");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str27 = hikariConfig26.getCatalog();
        boolean boolean28 = hikariConfig26.isInitializationFailFast();
        int int29 = hikariConfig26.getMaximumPoolSize();
        hikariConfig26.setPoolName("HikariPool-1042");
        hikariConfig26.setIdleTimeout((long) 52);
        hikariConfig26.setAcquireRetryDelay(100L);
        java.util.Properties properties36 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig39.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long8 = hikariConfig0.getIdleTimeout();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-68452" + "'", str9, "HikariPool-68452");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        boolean boolean8 = hikariConfig0.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties15 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig0.setDataSourceProperties(properties15);
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1511");
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-12946");
        boolean boolean25 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isJdbc4ConnectionTest();
        hikariConfig26.setReadOnly(false);
        hikariConfig26.setConnectionInitSql("hi!");
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str34 = hikariConfig26.getJdbcUrl();
        hikariConfig26.setTransactionIsolation("HikariPool-250");
        hikariConfig26.setIsolateInternalQueries(false);
        java.lang.String str39 = hikariConfig26.getDataSourceClassName();
        java.lang.String str40 = hikariConfig26.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean42 = hikariConfig41.isJdbc4ConnectionTest();
        hikariConfig41.setReadOnly(false);
        hikariConfig41.setDataSourceClassName("");
        hikariConfig41.setCatalog("");
        hikariConfig41.setAutoCommit(true);
        hikariConfig41.setIdleTimeout((long) 60);
        hikariConfig41.setReadOnly(false);
        hikariConfig41.setConnectionTestQuery("HikariPool-6653");
        java.util.Properties properties57 = hikariConfig41.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties57);
        hikariConfig0.setDataSourceProperties(properties57);
        boolean boolean60 = hikariConfig0.isInitializationFailFast();
        long long61 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 750L + "'", long61 == 750L);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
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
        hikariConfig0.setMinimumPoolSize(97);
        int int20 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(true);
        long long25 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setDataSourceClassName("HikariPool-2711");
        int int11 = hikariConfig0.getTransactionIsolation();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetryDelay(100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-2711" + "'", str13, "HikariPool-2711");
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-55222");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-55222 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize(3);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setJdbcUrl("HikariPool-15387");
        hikariConfig1.setMaxLifetime(97L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAutoCommit(true);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-43143");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-68463" + "'", str11, "HikariPool-68463");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
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
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long21 = hikariConfig0.getAcquireRetryDelay();
        long long22 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getAcquireRetries();
        java.lang.String str9 = hikariConfig7.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        long long18 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setIsolateInternalQueries(true);
        hikariConfig11.setAutoCommit(false);
        boolean boolean23 = hikariConfig11.isRegisterMbeans();
        java.util.Properties properties24 = hikariConfig11.getDataSourceProperties();
        hikariConfig7.addDataSourceProperty("HikariPool-1324", (java.lang.Object) properties24);
        hikariConfig7.setInitializationFailFast(false);
        long long28 = hikariConfig7.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(false);
        boolean boolean12 = hikariConfig0.isReadOnly();
        hikariConfig0.setDataSourceClassName("HikariPool-30729");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        boolean boolean19 = hikariConfig17.isReadOnly();
        int int20 = hikariConfig17.getAcquireIncrement();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        java.lang.String str23 = hikariConfig17.getCatalog();
        long long24 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setConnectionInitSql("hi!");
        int int27 = hikariConfig17.getAcquireIncrement();
        hikariConfig17.setMaxLifetime((long) 0);
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.setCatalog("HikariPool-1230");
        hikariConfig17.setConnectionTimeout((long) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str37 = hikariConfig36.getConnectionInitSql();
        long long38 = hikariConfig36.getMaxLifetime();
        boolean boolean39 = hikariConfig36.isInitializationFailFast();
        hikariConfig36.setReadOnly(true);
        boolean boolean42 = hikariConfig36.isAutoCommit();
        hikariConfig36.setLeakDetectionThreshold(1L);
        hikariConfig36.setConnectionCustomizerClassName("");
        java.lang.String str47 = hikariConfig36.getCatalog();
        int int48 = hikariConfig36.getAcquireIncrement();
        int int49 = hikariConfig36.getAcquireRetries();
        hikariConfig36.setMinimumPoolSize(0);
        java.util.Properties properties52 = hikariConfig36.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties52);
        long long54 = hikariConfig17.getMaxLifetime();
        hikariConfig0.addDataSourceProperty("HikariPool-6899", (java.lang.Object) hikariConfig17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 750L + "'", long24 == 750L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
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
        hikariConfig0.setJdbcUrl("HikariPool-4969");
        boolean boolean20 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str23 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
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
        boolean boolean16 = hikariConfig9.isAutoCommit();
        boolean boolean17 = hikariConfig9.isIsolateInternalQueries();
        hikariConfig9.setMaxLifetime((long) 32);
        hikariConfig9.setTransactionIsolation("HikariPool-19227");
        hikariConfig9.setDataSourceClassName("HikariPool-12963");
        hikariConfig9.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-68475" + "'", str15, "HikariPool-68475");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getPoolName();
        long long11 = hikariConfig0.getConnectionTimeout();
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-12491");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68476" + "'", str10, "HikariPool-68476");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setAcquireRetries(1);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("HikariPool-53684");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-250");
        hikariConfig0.setMaximumPoolSize(1);
        hikariConfig0.setTransactionIsolation("HikariPool-1104");
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setCatalog("HikariPool-29544");
        hikariConfig0.setJdbcUrl("hi!");
        long long21 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isJdbc4ConnectionTest();
        long long25 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setJdbcUrl("");
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties29 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setJdbc4ConnectionTest(false);
        hikariConfig23.setIsolateInternalQueries(false);
        hikariConfig23.setAcquireRetries((int) '#');
        long long36 = hikariConfig23.getConnectionTimeout();
        java.lang.String str37 = hikariConfig23.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("", (java.lang.Object) str37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout((long) 10);
        hikariConfig0.setAcquireRetryDelay(100L);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionTestQuery("HikariPool-67977");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-68482" + "'", str13, "HikariPool-68482");
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-370");
        hikariConfig0.setAutoCommit(false);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.setReadOnly(false);
        hikariConfig14.setDataSourceClassName("");
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isJdbc4ConnectionTest();
        hikariConfig21.setReadOnly(false);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig21.setDataSource(dataSource25);
        long long27 = hikariConfig21.getLeakDetectionThreshold();
        hikariConfig14.addDataSourceProperty("hi!", (java.lang.Object) long27);
        boolean boolean29 = hikariConfig14.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-24202", (java.lang.Object) hikariConfig14);
        boolean boolean31 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-19417");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
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
        hikariConfig0.setCatalog("HikariPool-2322");
        java.util.Properties properties29 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
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
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
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
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        hikariConfig0.setRegisterMbeans(true);
        int int10 = hikariConfig0.getTransactionIsolation();
        int int11 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getTransactionIsolation();
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement(100);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMaxLifetime(10L);
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("HikariPool-38203");
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.Class<?> wildcardClass10 = hikariConfig9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
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
        java.lang.String str27 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(600000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        int int12 = hikariConfig0.getTransactionIsolation();
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
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
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        hikariConfig0.setConnectionTestQuery("HikariPool-8284");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
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
        int int15 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-11767");
        boolean boolean19 = hikariConfig0.isAutoCommit();
        hikariConfig0.setCatalog("HikariPool-23878");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        int int3 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime(100L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-14643");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setMaxLifetime((-1L));
        java.lang.String str8 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2824");
        hikariConfig0.setRegisterMbeans(true);
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        hikariConfig0.setIdleTimeout((long) 60);
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-68504" + "'", str8, "HikariPool-68504");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
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
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetryDelay((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
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
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setTransactionIsolation("HikariPool-57241");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10558");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10558 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
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
        hikariConfig1.setMaxLifetime((long) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-68510" + "'", str12, "HikariPool-68510");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-68510" + "'", str16, "HikariPool-68510");
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        hikariConfig7.setIsolateInternalQueries(false);
        hikariConfig7.setMaxLifetime(0L);
        boolean boolean13 = hikariConfig7.isInitializationFailFast();
        java.lang.String str14 = hikariConfig7.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-14265");
        int int18 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-2845");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.lang.String str23 = hikariConfig22.getCatalog();
        long long24 = hikariConfig22.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        int int26 = hikariConfig25.getAcquireRetries();
        hikariConfig25.setConnectionInitSql("");
        hikariConfig25.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig25.setAutoCommit(true);
        hikariConfig25.setConnectionTestQuery("HikariPool-137");
        long long35 = hikariConfig25.getIdleTimeout();
        int int36 = hikariConfig25.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        boolean boolean39 = hikariConfig37.isReadOnly();
        int int40 = hikariConfig37.getAcquireIncrement();
        hikariConfig37.setConnectionTestQuery("hi!");
        hikariConfig37.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig37.setAutoCommit(true);
        java.util.Properties properties47 = hikariConfig37.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties47);
        hikariConfig22.setDataSourceProperties(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig50.setConnectionTestQuery("HikariPool-10304");
        boolean boolean53 = hikariConfig50.isReadOnly();
        hikariConfig0.addDataSourceProperty("HikariPool-32622", (java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 600000L + "'", long35 == 600000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        long long13 = hikariConfig0.getIdleTimeout();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-4439");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setPoolName("HikariPool-902");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setDataSourceClassName("HikariPool-1409");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
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
        hikariConfig0.setMinimumPoolSize(1);
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        java.lang.String str20 = hikariConfig0.getDataSourceClassName();
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        long long24 = hikariConfig0.getIdleTimeout();
        long long25 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 600000L + "'", long24 == 600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 600000L + "'", long25 == 600000L);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        int int6 = hikariConfig0.getMaximumPoolSize();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetries(3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize(3);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
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
        javax.sql.DataSource dataSource24 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-8690");
        boolean boolean27 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-15305");
        boolean boolean30 = hikariConfig0.isIsolateInternalQueries();
        int int31 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIdleTimeout(1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setConnectionInitSql("HikariPool-1579");
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2322");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-1579" + "'", str6, "HikariPool-1579");
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        int int8 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("HikariPool-3533");
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-2167");
        hikariConfig0.setJdbcUrl("HikariPool-8411");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-62931");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
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
        int int22 = hikariConfig0.getAcquireRetries();
        java.lang.Class<?> wildcardClass23 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setJdbcUrl("HikariPool-27347");
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-5162");
        hikariConfig0.setDataSourceClassName("HikariPool-29821");
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
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
        hikariConfig1.setJdbcUrl("HikariPool-2434");
        java.lang.String str21 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetries(10);
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        java.lang.String str25 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        hikariConfig1.setMaximumPoolSize(97);
        hikariConfig1.setPoolName("HikariPool-34043");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
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
        hikariConfig0.setCatalog("HikariPool-17472");
        hikariConfig0.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
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
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        boolean boolean19 = hikariConfig0.isAutoCommit();
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-30924");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
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
        long long13 = hikariConfig0.getIdleTimeout();
        int int14 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(2147483647L);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str8 = hikariConfig0.getPoolName();
        hikariConfig0.setPoolName("");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-68546" + "'", str8, "HikariPool-68546");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("HikariPool-1236");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        int int14 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig13.setAutoCommit(true);
        hikariConfig13.setConnectionTestQuery("HikariPool-137");
        long long23 = hikariConfig13.getIdleTimeout();
        int int24 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setPoolName("HikariPool-447");
        java.lang.String str27 = hikariConfig13.getConnectionInitSql();
        long long28 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.setInitializationFailFast(true);
        long long31 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("HikariPool-13598", (java.lang.Object) long31);
        long long33 = hikariConfig0.getMaxLifetime();
        java.lang.String str34 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1800000L + "'", long33 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-68547" + "'", str34, "HikariPool-68547");
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        boolean boolean12 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("HikariPool-42531");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setIdleTimeout((long) 52);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-17559");
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10630");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10630 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getMaxLifetime();
        java.lang.String str15 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setIdleTimeout((long) (-1));
        long long18 = hikariConfig12.getConnectionTimeout();
        int int19 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("HikariPool-1361");
        hikariConfig12.setDataSourceClassName("HikariPool-1042");
        hikariConfig10.addDataSourceProperty("HikariPool-10638", (java.lang.Object) hikariConfig12);
        boolean boolean25 = hikariConfig10.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-37284");
        hikariConfig0.setMaxLifetime((long) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        int int12 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setAutoCommit(true);
        boolean boolean15 = hikariConfig10.isAutoCommit();
        hikariConfig10.setDataSourceClassName("HikariPool-33307");
        hikariConfig10.setMinimumPoolSize((int) (short) 10);
        hikariConfig10.setMaxLifetime(10L);
        hikariConfig0.addDataSourceProperty("HikariPool-31390", (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
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
        int int16 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-5162");
        java.lang.String str19 = hikariConfig0.getPoolName();
        boolean boolean20 = hikariConfig0.isReadOnly();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-68558" + "'", str19, "HikariPool-68558");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
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
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setCatalog("HikariPool-9172");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str24 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-29042");
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.setDataSource(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-68563" + "'", str24, "HikariPool-68563");
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long16 = hikariConfig15.getLeakDetectionThreshold();
        long long17 = hikariConfig15.getIdleTimeout();
        java.lang.String str18 = hikariConfig15.getJdbcUrl();
        hikariConfig15.setDataSourceClassName("HikariPool-15277");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-41296");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
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
        hikariConfig0.setTransactionIsolation("HikariPool-4029");
        hikariConfig0.setIdleTimeout((long) 97);
        hikariConfig0.setCatalog("HikariPool-11051");
        int int20 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.getAcquireIncrement();
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-3952");
        hikariConfig0.setTransactionIsolation("HikariPool-23282");
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68570" + "'", str6, "HikariPool-68570");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-3952" + "'", str16, "HikariPool-3952");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
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
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        int int20 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4919");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-21606");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8822");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long25 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2147483647L + "'", long25 == 2147483647L);
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        java.lang.String str3 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAutoCommit(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        int int7 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-30342");
        hikariConfig0.setMinimumPoolSize(1);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        int int13 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
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
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-1059");
        long long5 = hikariConfig0.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setInitializationFailFast(false);
        long long14 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("");
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setDataSourceClassName("HikariPool-24418");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-211" + "'", str11, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        long long4 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        long long20 = hikariConfig13.getMaxLifetime();
        hikariConfig13.setIsolateInternalQueries(true);
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.setConnectionTimeout(100L);
        hikariConfig13.setJdbcUrl("HikariPool-1042");
        java.util.Properties properties29 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-12658", (java.lang.Object) hikariConfig13);
        java.lang.String str31 = hikariConfig0.getJdbcUrl();
        boolean boolean32 = hikariConfig0.isInitializationFailFast();
        long long33 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 750L + "'", long33 == 750L);
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
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
        hikariConfig0.setCatalog("HikariPool-1062");
        int int17 = hikariConfig0.getMaximumPoolSize();
        long long18 = hikariConfig0.getMaxLifetime();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-564" + "'", str20, "HikariPool-564");
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
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
        long long14 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setPoolName("HikariPool-13335");
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-57305");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-57305 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
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
        int int12 = hikariConfig9.getMaximumPoolSize();
        int int13 = hikariConfig9.getMaximumPoolSize();
        hikariConfig9.setPoolName("HikariPool-6403");
        hikariConfig9.setAcquireIncrement(10);
        boolean boolean18 = hikariConfig9.isAutoCommit();
        java.util.Properties properties19 = hikariConfig9.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        hikariConfig0.setAcquireRetries((int) '#');
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setPoolName("HikariPool-11100");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        long long8 = hikariConfig0.getConnectionTimeout();
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        int int8 = hikariConfig0.getAcquireIncrement();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setRegisterMbeans(false);
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireIncrement(35);
        java.lang.String str15 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-68596" + "'", str15, "HikariPool-68596");
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getPoolName();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3266");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68599" + "'", str10, "HikariPool-68599");
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
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
        javax.sql.DataSource dataSource22 = null;
        hikariConfig0.setDataSource(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
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
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        hikariConfig0.setUseInstrumentation(false);
        long long13 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbcUrl("HikariPool-8274");
        java.lang.Class<?> wildcardClass16 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIdleTimeout(5000L);
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setReadOnly(false);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-12560");
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetries(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setMaxLifetime(60L);
        long long13 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay(1800000L);
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
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
        int int15 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-29582");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
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
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout(2147483647L);
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean12 = hikariConfig0.isReadOnly();
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
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
        hikariConfig0.setIdleTimeout((long) 'a');
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        java.lang.String str20 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-68612" + "'", str20, "HikariPool-68612");
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setConnectionTestQuery("HikariPool-514");
        hikariConfig0.setMaxLifetime((long) 52);
        hikariConfig0.setDataSourceClassName("HikariPool-2746");
        hikariConfig0.setPoolName("HikariPool-32871");
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-1605");
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-447");
        hikariConfig0.setJdbcUrl("HikariPool-211");
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-2990");
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("HikariPool-19882");
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str23 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-447" + "'", str23, "HikariPool-447");
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.lang.String str10 = hikariConfig0.getPoolName();
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(750L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68615" + "'", str10, "HikariPool-68615");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        long long4 = hikariConfig0.getMaxLifetime();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setConnectionTestQuery("HikariPool-3519");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setIdleTimeout((long) (short) 100);
        hikariConfig0.setConnectionInitSql("HikariPool-2848");
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setCatalog("HikariPool-51519");
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
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
        long long20 = hikariConfig0.getConnectionTimeout();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483647L + "'", long20 == 2147483647L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        long long7 = hikariConfig0.getMaxLifetime();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setConnectionInitSql("HikariPool-27695");
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
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
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
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
        hikariConfig7.setInitializationFailFast(true);
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        long long16 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setCatalog("");
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-211");
        hikariConfig7.setCatalog("HikariPool-3477");
        java.lang.String str14 = hikariConfig7.getCatalog();
        int int15 = hikariConfig7.getMinimumPoolSize();
        hikariConfig7.setMaximumPoolSize((int) ' ');
        java.util.Properties properties18 = hikariConfig7.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-3477" + "'", str14, "HikariPool-3477");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries((int) '#');
        long long13 = hikariConfig0.getConnectionTimeout();
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
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
        long long17 = hikariConfig0.getConnectionTimeout();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        int int19 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
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
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        long long14 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-137" + "'", str13, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig12.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig29.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
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
        hikariConfig0.setIdleTimeout((long) 52);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-68643" + "'", str7, "HikariPool-68643");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str14 = hikariConfig0.getCatalog();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
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
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMinimumPoolSize(32);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMinimumPoolSize(0);
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        long long26 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
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
        hikariConfig0.setAcquireIncrement(3);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout(52L);
        long long12 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setDataSourceClassName("HikariPool-17181");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        boolean boolean26 = hikariConfig24.isReadOnly();
        hikariConfig24.setJdbcUrl("");
        java.lang.String str29 = hikariConfig24.getCatalog();
        hikariConfig24.setReadOnly(true);
        boolean boolean32 = hikariConfig24.isJdbc4ConnectionTest();
        hikariConfig24.setRegisterMbeans(true);
        hikariConfig24.setTransactionIsolation("HikariPool-4438");
        long long37 = hikariConfig24.getLeakDetectionThreshold();
        java.lang.String str38 = hikariConfig24.getCatalog();
        java.lang.String str39 = hikariConfig24.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-64527", (java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-801");
        hikariConfig0.setJdbcUrl("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2438");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2438' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay(0L);
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
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
        hikariConfig0.setConnectionInitSql("HikariPool-8474");
        java.lang.String str22 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str23 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize(97);
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-48734");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-48734' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        int int10 = hikariConfig0.getMinimumPoolSize();
        long long11 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
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
        long long53 = hikariConfig0.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize(3);
        int int10 = hikariConfig1.getMinimumPoolSize();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6819");
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIdleTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
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
        hikariConfig8.setAcquireRetries((int) (short) 10);
        hikariConfig8.setIsolateInternalQueries(true);
        hikariConfig8.setMaxLifetime(52L);
        java.lang.String str40 = hikariConfig8.getCatalog();
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
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
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
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime((long) (short) 100);
        java.lang.String str17 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setAcquireIncrement(100);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getMaxLifetime();
        boolean boolean15 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setReadOnly(true);
        boolean boolean18 = hikariConfig12.isAutoCommit();
        hikariConfig12.setLeakDetectionThreshold(1L);
        hikariConfig12.setConnectionCustomizerClassName("");
        java.lang.String str23 = hikariConfig12.getCatalog();
        int int24 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setJdbc4ConnectionTest(true);
        java.lang.String str27 = hikariConfig12.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean29 = hikariConfig28.isJdbc4ConnectionTest();
        long long30 = hikariConfig28.getConnectionTimeout();
        hikariConfig28.setJdbcUrl("");
        java.lang.String str33 = hikariConfig28.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig28.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties34);
        java.lang.String str36 = hikariConfig12.getCatalog();
        hikariConfig12.setAcquireRetries(3);
        javax.sql.DataSource dataSource39 = null;
        hikariConfig12.setDataSource(dataSource39);
        hikariConfig0.addDataSourceProperty("HikariPool-28562", (java.lang.Object) hikariConfig12);
        hikariConfig0.setCatalog("HikariPool-61813");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5000L + "'", long30 == 5000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        boolean boolean4 = hikariConfig0.isIsolateInternalQueries();
        long long5 = hikariConfig0.getMaxLifetime();
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireIncrement((int) 'a');
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setRegisterMbeans(true);
        boolean boolean10 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetryDelay((long) 35);
        int int13 = hikariConfig0.getTransactionIsolation();
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.setCatalog("");
        boolean boolean23 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setReadOnly(true);
        java.lang.String str26 = hikariConfig19.getJdbcUrl();
        boolean boolean27 = hikariConfig19.isIsolateInternalQueries();
        boolean boolean28 = hikariConfig19.isRegisterMbeans();
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.setReadOnly(false);
        hikariConfig0.addDataSourceProperty("HikariPool-10809", (java.lang.Object) false);
        hikariConfig0.setIsolateInternalQueries(false);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean37 = hikariConfig36.isJdbc4ConnectionTest();
        hikariConfig36.setMaxLifetime((long) '4');
        hikariConfig36.setRegisterMbeans(true);
        int int42 = hikariConfig36.getTransactionIsolation();
        boolean boolean43 = hikariConfig36.isReadOnly();
        long long44 = hikariConfig36.getAcquireRetryDelay();
        java.util.Properties properties45 = hikariConfig36.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties45);
        hikariConfig0.setAcquireIncrement(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 750L + "'", long44 == 750L);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
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
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        java.lang.String str35 = hikariConfig0.getCatalog();
        hikariConfig0.setDataSourceClassName("HikariPool-43893");
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
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireIncrement();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        int int13 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setTransactionIsolation("HikariPool-1969");
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-6131");
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        long long18 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setIsolateInternalQueries(true);
        hikariConfig11.setAutoCommit(false);
        java.util.Properties properties23 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
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
        int int14 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-1863");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setIdleTimeout((long) (short) 100);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        int int12 = hikariConfig0.getAcquireRetries();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str14 = hikariConfig0.getPoolName();
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-43354");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-68687" + "'", str14, "HikariPool-68687");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
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
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-13339");
        hikariConfig0.setIdleTimeout((-1L));
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        long long24 = hikariConfig22.getMaxLifetime();
        boolean boolean25 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setReadOnly(true);
        boolean boolean28 = hikariConfig22.isAutoCommit();
        hikariConfig22.setLeakDetectionThreshold(1L);
        hikariConfig22.setConnectionCustomizerClassName("");
        java.lang.String str33 = hikariConfig22.getCatalog();
        int int34 = hikariConfig22.getAcquireIncrement();
        int int35 = hikariConfig22.getAcquireRetries();
        hikariConfig22.setDataSourceClassName("HikariPool-377");
        boolean boolean38 = hikariConfig22.isInitializationFailFast();
        boolean boolean39 = hikariConfig22.isIsolateInternalQueries();
        hikariConfig22.setConnectionTestQuery("HikariPool-3955");
        boolean boolean42 = hikariConfig22.isIsolateInternalQueries();
        boolean boolean43 = hikariConfig22.isIsolateInternalQueries();
        java.util.Properties properties44 = hikariConfig22.getDataSourceProperties();
        hikariConfig0.addDataSourceProperty("HikariPool-19412", (java.lang.Object) properties44);
        hikariConfig0.setMaximumPoolSize(60);
        java.lang.String str48 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setLeakDetectionThreshold((long) 3);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig7.setDataSource(dataSource10);
        hikariConfig7.setTransactionIsolation("HikariPool-17076");
        hikariConfig7.setLeakDetectionThreshold((long) 97);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        java.lang.String str25 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig20.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties26);
        hikariConfig17.setRegisterMbeans(true);
        boolean boolean30 = hikariConfig17.isJdbc4ConnectionTest();
        java.util.Properties properties31 = hikariConfig17.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireIncrement((int) '#');
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionTestQuery("HikariPool-23305");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-16851");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setDataSourceClassName("HikariPool-67863");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68694" + "'", str10, "HikariPool-68694");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        hikariConfig0.setAcquireIncrement(1);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setUseInstrumentation(false);
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setCatalog("HikariPool-5628");
        hikariConfig0.setMaximumPoolSize(52);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        java.lang.String str16 = hikariConfig14.getDataSourceClassName();
        int int17 = hikariConfig14.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("HikariPool-12733", (java.lang.Object) hikariConfig14);
        hikariConfig0.setMaxLifetime((long) (short) -1);
        hikariConfig0.setTransactionIsolation("HikariPool-16230");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
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
        hikariConfig0.setPoolName("HikariPool-3741");
        hikariConfig0.setIdleTimeout((long) (short) -1);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
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
        int int18 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        long long20 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4278");
        long long23 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
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
        boolean boolean14 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetryDelay((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setJdbcUrl("HikariPool-31371");
        boolean boolean13 = hikariConfig0.isAutoCommit();
        long long14 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime((long) 52);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setConnectionInitSql("HikariPool-801");
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setIdleTimeout((long) 60);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68714" + "'", str6, "HikariPool-68714");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
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
        hikariConfig0.setRegisterMbeans(true);
        int int20 = hikariConfig0.getAcquireRetries();
        boolean boolean21 = hikariConfig0.isIsolateInternalQueries();
        int int22 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        long long2 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setPoolName("HikariPool-1361");
        hikariConfig0.setConnectionInitSql("HikariPool-24787");
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig9.setDataSource(dataSource11);
        hikariConfig9.setReadOnly(false);
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig0.addDataSourceProperty("HikariPool-8687", (java.lang.Object) true);
        hikariConfig0.setJdbcUrl("HikariPool-6654");
        int int20 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isJdbc4ConnectionTest();
        long long23 = hikariConfig21.getConnectionTimeout();
        hikariConfig21.setJdbcUrl("");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties27 = hikariConfig21.getDataSourceProperties();
        hikariConfig21.setJdbc4ConnectionTest(false);
        hikariConfig21.setMaxLifetime(5000L);
        hikariConfig21.setCatalog("");
        int int34 = hikariConfig21.getAcquireRetries();
        hikariConfig21.setCatalog("HikariPool-4579");
        int int37 = hikariConfig21.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str39 = hikariConfig38.getConnectionInitSql();
        long long40 = hikariConfig38.getMaxLifetime();
        java.lang.String str41 = hikariConfig38.getDataSourceClassName();
        hikariConfig38.setIdleTimeout((long) (-1));
        hikariConfig38.setMaxLifetime((-1L));
        java.lang.String str46 = hikariConfig38.getPoolName();
        hikariConfig38.setConnectionCustomizerClassName("HikariPool-2824");
        boolean boolean49 = hikariConfig38.isAutoCommit();
        java.util.Properties properties50 = hikariConfig38.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean52 = hikariConfig51.isJdbc4ConnectionTest();
        long long53 = hikariConfig51.getConnectionTimeout();
        boolean boolean54 = hikariConfig51.isIsolateInternalQueries();
        hikariConfig51.setJdbcUrl("");
        java.lang.String str57 = hikariConfig51.getJdbcUrl();
        javax.sql.DataSource dataSource58 = null;
        hikariConfig51.setDataSource(dataSource58);
        java.util.Properties properties60 = hikariConfig51.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig38.setDataSourceProperties(properties60);
        hikariConfig21.setDataSourceProperties(properties60);
        hikariConfig0.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1800000L + "'", long40 == 1800000L);
        org.junit.Assert.assertNull(str41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-68722" + "'", str46, "HikariPool-68722");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5000L + "'", long53 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
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
        boolean boolean13 = hikariConfig0.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.setReadOnly(false);
        hikariConfig14.setDataSourceClassName("");
        java.lang.String str20 = hikariConfig14.getCatalog();
        hikariConfig14.setAutoCommit(false);
        boolean boolean23 = hikariConfig14.isJdbc4ConnectionTest();
        java.util.Properties properties24 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
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
        java.lang.String str15 = hikariConfig0.getCatalog();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        javax.sql.DataSource dataSource21 = hikariConfig18.getDataSource();
        int int22 = hikariConfig18.getMaximumPoolSize();
        int int23 = hikariConfig18.getAcquireRetries();
        int int24 = hikariConfig18.getMaximumPoolSize();
        long long25 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.setAcquireIncrement((int) ' ');
        java.util.Properties properties28 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setJdbc4ConnectionTest(true);
        hikariConfig0.addDataSourceProperty("HikariPool-20533", (java.lang.Object) hikariConfig18);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
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
        hikariConfig1.setAcquireIncrement(100);
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
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
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
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTestQuery("HikariPool-1143");
        hikariConfig0.setTransactionIsolation("HikariPool-1631");
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.setMaxLifetime((long) 32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-68738" + "'", str14, "HikariPool-68738");
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
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
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.getMaximumPoolSize();
        long long18 = hikariConfig1.getConnectionTimeout();
        int int19 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-68740" + "'", str11, "HikariPool-68740");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
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
        java.lang.String str18 = hikariConfig0.getCatalog();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        int int21 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setIdleTimeout((long) (short) 100);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        int int12 = hikariConfig0.getAcquireRetries();
        long long13 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str14 = hikariConfig0.getPoolName();
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-68743" + "'", str14, "HikariPool-68743");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
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
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement(1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionInitSql("HikariPool-250");
        java.lang.String str4 = hikariConfig0.getConnectionInitSql();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-250" + "'", str4, "HikariPool-250");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-4858");
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-26065");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setLeakDetectionThreshold((long) (short) 1);
        int int12 = hikariConfig9.getMinimumPoolSize();
        hikariConfig9.setMinimumPoolSize((int) (short) 0);
        java.lang.String str15 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setAcquireRetries(0);
        hikariConfig9.setAutoCommit(true);
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
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
        int int13 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
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
        int int17 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMaxLifetime((long) 52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
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
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        long long20 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-57669");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-57669' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout(52L);
        hikariConfig0.setAcquireRetryDelay(52L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        int int6 = hikariConfig0.getTransactionIsolation();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-15277");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-15277" + "'", str10, "HikariPool-15277");
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        int int12 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(10);
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMaxLifetime(1800000L);
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
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
        hikariConfig0.setDataSourceClassName("HikariPool-10117");
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68757" + "'", str6, "HikariPool-68757");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("HikariPool-8865");
        int int11 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test18775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18775");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetries((int) ' ');
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18776");
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
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-42541");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-68760" + "'", str12, "HikariPool-68760");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-68760" + "'", str16, "HikariPool-68760");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18777");
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
        long long24 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMaxLifetime(750L);
        int int27 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test18778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireIncrement(60);
        java.lang.String str8 = hikariConfig0.getPoolName();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-68768" + "'", str8, "HikariPool-68768");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        long long9 = hikariConfig0.getIdleTimeout();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test18780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18780");
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str35 = hikariConfig34.getConnectionInitSql();
        long long36 = hikariConfig34.getMaxLifetime();
        boolean boolean37 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setReadOnly(true);
        boolean boolean40 = hikariConfig34.isAutoCommit();
        hikariConfig34.setLeakDetectionThreshold(1L);
        hikariConfig34.setConnectionCustomizerClassName("");
        java.lang.String str45 = hikariConfig34.getCatalog();
        int int46 = hikariConfig34.getAcquireIncrement();
        int int47 = hikariConfig34.getAcquireRetries();
        hikariConfig34.setPoolName("HikariPool-211");
        hikariConfig34.setAcquireIncrement(32);
        java.lang.String str52 = hikariConfig34.getCatalog();
        hikariConfig34.setMaximumPoolSize(3);
        hikariConfig17.addDataSourceProperty("HikariPool-24861", (java.lang.Object) hikariConfig34);
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test18781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18781");
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
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long18 = hikariConfig0.getIdleTimeout();
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18782");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-32717");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test18783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18783");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setIdleTimeout(0L);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18784");
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
        hikariConfig0.setReadOnly(false);
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("HikariPool-46957");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18785");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-573");
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test18786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.setAcquireRetryDelay((long) 1);
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18787");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setCatalog("");
        java.lang.String str10 = hikariConfig7.getJdbcUrl();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig14.setTransactionIsolation("HikariPool-27703");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18789");
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
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setCatalog("HikariPool-44651");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18790");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18791");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTimeout(2147483647L);
        hikariConfig0.setPoolName("HikariPool-2167");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
    }

    @Test
    public void test18792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18792");
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
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18793");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setJdbcUrl("");
        hikariConfig7.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test18794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18794");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAutoCommit(false);
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        long long11 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test18795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18795");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        int int9 = hikariConfig0.getAcquireIncrement();
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18796");
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
        hikariConfig0.setMinimumPoolSize(10);
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test18797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18797");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long16 = hikariConfig0.getConnectionTimeout();
        int int17 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        java.lang.String str19 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-68803" + "'", str19, "HikariPool-68803");
    }

    @Test
    public void test18798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18798");
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
        hikariConfig19.setDataSourceClassName("HikariPool-26154");
        hikariConfig19.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig19.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test18799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18799");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setTransactionIsolation("HikariPool-377");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18800");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        int int17 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setConnectionInitSql("");
        hikariConfig16.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties22 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig0.setDataSourceProperties(properties22);
        hikariConfig0.setConnectionInitSql("HikariPool-1143");
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setJdbcUrl("HikariPool-17962");
        hikariConfig0.setMaximumPoolSize(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test18801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18801");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setLeakDetectionThreshold((long) 100);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaximumPoolSize(32);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18802");
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
        int int14 = hikariConfig0.getAcquireIncrement();
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25879");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test18803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-19153");
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setCatalog("HikariPool-44612");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18804");
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
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-5811");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-20931");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-28744");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-28744' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getConnectionCustomizerClassName();
        int int12 = hikariConfig8.getMaximumPoolSize();
        int int13 = hikariConfig8.getMaximumPoolSize();
        long long14 = hikariConfig8.getMaxLifetime();
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        hikariConfig8.setAcquireRetryDelay(600000L);
        hikariConfig8.setUseInstrumentation(false);
        hikariConfig8.setUseInstrumentation(true);
        hikariConfig1.addDataSourceProperty("HikariPool-1863", (java.lang.Object) true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.setDataSource(dataSource24);
        hikariConfig1.setJdbcUrl("HikariPool-3073");
        boolean boolean28 = hikariConfig1.isAutoCommit();
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str30 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test18806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMinimumPoolSize(3);
        boolean boolean9 = hikariConfig0.isReadOnly();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-24666");
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18807");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-5162");
        hikariConfig0.setDataSourceClassName("HikariPool-29821");
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test18808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18808");
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
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38374");
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test18809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18809");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(false);
        long long5 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test18810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18810");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetries(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18811");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        javax.sql.DataSource dataSource22 = hikariConfig21.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test18812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18812");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetries((int) ' ');
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean12 = hikariConfig0.isReadOnly();
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireRetryDelay(1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18813");
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
        java.lang.String str15 = hikariConfig9.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig9.setDataSource(dataSource11);
        hikariConfig9.setReadOnly(false);
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig0.addDataSourceProperty("HikariPool-8687", (java.lang.Object) true);
        hikariConfig0.setJdbcUrl("HikariPool-6654");
        java.lang.Class<?> wildcardClass20 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int8 = hikariConfig7.getAcquireRetries();
        java.lang.String str9 = hikariConfig7.getCatalog();
        long long10 = hikariConfig7.getIdleTimeout();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test18816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18816");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean20 = hikariConfig19.isJdbc4ConnectionTest();
        long long21 = hikariConfig19.getConnectionTimeout();
        hikariConfig19.setJdbcUrl("");
        java.lang.String str24 = hikariConfig19.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig19.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties25);
        hikariConfig16.setAcquireRetries(10);
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setJdbc4ConnectionTest(true);
        hikariConfig0.addDataSourceProperty("HikariPool-4493", (java.lang.Object) hikariConfig16);
        hikariConfig0.setConnectionTestQuery("HikariPool-38384");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test18817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        long long8 = hikariConfig0.getConnectionTimeout();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18818");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        boolean boolean15 = hikariConfig0.isReadOnly();
        long long16 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-10993");
        int int19 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-42098");
        hikariConfig0.setAutoCommit(false);
        java.lang.String str24 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-137" + "'", str24, "HikariPool-137");
    }

    @Test
    public void test18819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18819");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("");
        int int7 = hikariConfig0.getAcquireIncrement();
        long long8 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setPoolName("HikariPool-23071");
        int int15 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test18820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-6211");
        hikariConfig0.setAcquireIncrement((int) 'a');
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18821");
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
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test18822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18822");
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
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setConnectionInitSql("hi!");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig21.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isJdbc4ConnectionTest();
        long long31 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setJdbcUrl("");
        java.lang.String str34 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig21.setDataSourceProperties(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1733");
        int int43 = hikariConfig1.getAcquireRetries();
        boolean boolean44 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        int int47 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource48 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-55845");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertNull(dataSource48);
    }

    @Test
    public void test18823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18823");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        int int15 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setInitializationFailFast(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        hikariConfig0.setAcquireRetryDelay(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test18824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18824");
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
        hikariConfig9.setMinimumPoolSize(10);
        hikariConfig9.setMaximumPoolSize((int) 'a');
        hikariConfig9.setMinimumPoolSize(100);
        boolean boolean24 = hikariConfig9.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test18825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18825");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-12368");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test18826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18826");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        int int15 = hikariConfig13.getMinimumPoolSize();
        hikariConfig13.setTransactionIsolation("");
        boolean boolean18 = hikariConfig13.isRegisterMbeans();
        int int19 = hikariConfig13.getAcquireIncrement();
        boolean boolean20 = hikariConfig13.isAutoCommit();
        hikariConfig13.setTransactionIsolation("HikariPool-370");
        hikariConfig13.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        long long28 = hikariConfig26.getIdleTimeout();
        java.lang.String str29 = hikariConfig26.getConnectionTestQuery();
        hikariConfig26.setAutoCommit(true);
        long long32 = hikariConfig26.getConnectionTimeout();
        hikariConfig13.addDataSourceProperty("HikariPool-6654", (java.lang.Object) long32);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean40 = hikariConfig39.isJdbc4ConnectionTest();
        long long41 = hikariConfig39.getConnectionTimeout();
        hikariConfig39.setJdbcUrl("");
        java.lang.String str44 = hikariConfig39.getConnectionCustomizerClassName();
        java.util.Properties properties45 = hikariConfig39.getDataSourceProperties();
        hikariConfig36.setDataSourceProperties(properties45);
        java.lang.String str47 = hikariConfig36.getConnectionTestQuery();
        hikariConfig36.setReadOnly(false);
        hikariConfig36.setConnectionTimeout(0L);
        hikariConfig36.setReadOnly(false);
        hikariConfig36.setAcquireIncrement((int) (short) 1);
        long long56 = hikariConfig36.getAcquireRetryDelay();
        hikariConfig36.setLeakDetectionThreshold((long) 0);
        hikariConfig13.addDataSourceProperty("", (java.lang.Object) hikariConfig36);
        java.util.Properties properties60 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean64 = hikariConfig63.isInitializationFailFast();
        boolean boolean65 = hikariConfig63.isReadOnly();
        int int66 = hikariConfig63.getAcquireIncrement();
        javax.sql.DataSource dataSource67 = null;
        hikariConfig63.setDataSource(dataSource67);
        java.lang.String str69 = hikariConfig63.getCatalog();
        long long70 = hikariConfig63.getAcquireRetryDelay();
        int int71 = hikariConfig63.getMinimumPoolSize();
        hikariConfig63.setIsolateInternalQueries(true);
        hikariConfig63.setRegisterMbeans(true);
        int int76 = hikariConfig63.getMinimumPoolSize();
        hikariConfig63.setIdleTimeout((long) (-1));
        boolean boolean79 = hikariConfig63.isAutoCommit();
        hikariConfig63.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.addDataSourceProperty("HikariPool-18019", (java.lang.Object) (byte) 1);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 600000L + "'", long28 == 600000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5000L + "'", long41 == 5000L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 750L + "'", long56 == 750L);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 750L + "'", long70 == 750L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test18828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18828");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        long long9 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isJdbc4ConnectionTest();
        long long16 = hikariConfig14.getConnectionTimeout();
        java.lang.String str17 = hikariConfig14.getJdbcUrl();
        long long18 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str23 = hikariConfig14.getCatalog();
        boolean boolean24 = hikariConfig14.isJdbc4ConnectionTest();
        java.util.Properties properties25 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.setDataSourceProperties(properties25);
        long long28 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 750L + "'", long18 == 750L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
    }

    @Test
    public void test18829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18829");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test18830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18830");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18831");
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
        int int13 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test18832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18832");
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
        hikariConfig0.setCatalog("HikariPool-3562");
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.setCatalog("HikariPool-18157");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18834");
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
        hikariConfig0.setLeakDetectionThreshold(1800000L);
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test18835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18835");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18836");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setMaxLifetime((long) 1);
        java.lang.String str17 = hikariConfig9.getJdbcUrl();
        hikariConfig9.setJdbc4ConnectionTest(false);
        hikariConfig9.setJdbcUrl("HikariPool-137");
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig22.setDataSource(dataSource24);
        boolean boolean26 = hikariConfig22.isJdbc4ConnectionTest();
        hikariConfig22.setAutoCommit(false);
        javax.sql.DataSource dataSource29 = hikariConfig22.getDataSource();
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        int int33 = hikariConfig0.getAcquireRetries();
        int int34 = hikariConfig0.getMaximumPoolSize();
        int int35 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-11215");
        boolean boolean38 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str39 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test18837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18837");
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
        hikariConfig0.setTransactionIsolation("HikariPool-10624");
        hikariConfig0.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test18838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18838");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-1143");
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setMaxLifetime((long) '4');
        int int17 = hikariConfig13.getAcquireRetries();
        hikariConfig13.setConnectionTimeout(750L);
        int int20 = hikariConfig13.getTransactionIsolation();
        long long21 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setConnectionTestQuery("HikariPool-12533");
        int int24 = hikariConfig13.getAcquireRetries();
        hikariConfig0.addDataSourceProperty("HikariPool-20186", (java.lang.Object) int24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 750L + "'", long21 == 750L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test18839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18839");
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
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setConnectionTestQuery("HikariPool-829");
        long long17 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionInitSql("HikariPool-18953");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test18840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-370");
        hikariConfig1.setPoolName("HikariPool-1707");
        long long7 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test18841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18841");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18842");
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
        hikariConfig0.setLeakDetectionThreshold(600000L);
        hikariConfig0.setJdbcUrl("HikariPool-8698");
        boolean boolean21 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str22 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-68904" + "'", str22, "HikariPool-68904");
    }

    @Test
    public void test18843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18843");
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
        long long15 = hikariConfig0.getIdleTimeout();
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        long long17 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 750L + "'", long17 == 750L);
    }

    @Test
    public void test18844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18844");
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
        hikariConfig0.setMinimumPoolSize((int) 'a');
        int int19 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test18845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18845");
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
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str31 = hikariConfig30.getConnectionInitSql();
        long long32 = hikariConfig30.getMaxLifetime();
        java.lang.String str33 = hikariConfig30.getDataSourceClassName();
        hikariConfig30.setIdleTimeout((long) (-1));
        java.lang.String str36 = hikariConfig30.getConnectionTestQuery();
        int int37 = hikariConfig30.getMaximumPoolSize();
        hikariConfig30.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig30.setConnectionInitSql("HikariPool-801");
        java.util.Properties properties42 = hikariConfig30.getDataSourceProperties();
        hikariConfig30.setUseInstrumentation(false);
        java.lang.Class<?> wildcardClass45 = hikariConfig30.getClass();
        hikariConfig9.addDataSourceProperty("HikariPool-35916", (java.lang.Object) wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test18846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18846");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setConnectionInitSql("HikariPool-1104");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("HikariPool-16194");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18847");
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
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionInitSql("HikariPool-20976");
        hikariConfig0.setCatalog("HikariPool-17076");
        javax.sql.DataSource dataSource32 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test18848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18848");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18849");
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
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("");
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18850");
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
        hikariConfig0.setAcquireRetryDelay(10L);
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMinimumPoolSize(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test18851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18851");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-68920" + "'", str7, "HikariPool-68920");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18852");
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
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setRegisterMbeans(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test18853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18853");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setAcquireIncrement((int) 'a');
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getMaxLifetime();
        boolean boolean14 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setReadOnly(true);
        boolean boolean17 = hikariConfig11.isAutoCommit();
        hikariConfig11.setLeakDetectionThreshold(1L);
        hikariConfig11.setConnectionCustomizerClassName("");
        long long22 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.setTransactionIsolation("HikariPool-137");
        hikariConfig11.setInitializationFailFast(false);
        hikariConfig11.setConnectionTimeout(2147483647L);
        java.lang.String str29 = hikariConfig11.getConnectionInitSql();
        javax.sql.DataSource dataSource30 = hikariConfig11.getDataSource();
        int int31 = hikariConfig11.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("HikariPool-2167", (java.lang.Object) hikariConfig11);
        long long33 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig11.setIsolateInternalQueries(true);
        long long38 = hikariConfig11.getConnectionTimeout();
        boolean boolean39 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setAcquireIncrement((int) (byte) 100);
        hikariConfig11.setDataSourceClassName("HikariPool-67792");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1800000L + "'", long33 == 1800000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2147483647L + "'", long38 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test18854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18854");
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
        int int76 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setIsolateInternalQueries(true);
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test18855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18855");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setJdbcUrl("HikariPool-7462");
        hikariConfig6.setTransactionIsolation("HikariPool-36991");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test18856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18856");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setLeakDetectionThreshold((-1L));
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18857");
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
        hikariConfig0.setLeakDetectionThreshold((long) 60);
        java.lang.String str21 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        int int24 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test18858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18858");
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
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-211" + "'", str15, "HikariPool-211");
    }

    @Test
    public void test18859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18859");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-20037");
        hikariConfig0.setJdbcUrl("HikariPool-36874");
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18860");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        hikariConfig0.setDataSourceClassName("HikariPool-20443");
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test18861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18861");
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
        javax.sql.DataSource dataSource16 = hikariConfig9.getDataSource();
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig9.setAcquireRetries((int) 'a');
        java.util.Properties properties21 = hikariConfig9.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test18862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18862");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionInitSql("HikariPool-5734");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18863");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-137" + "'", str6, "HikariPool-137");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18864");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setUseInstrumentation(false);
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test18865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18865");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        int int4 = hikariConfig0.getTransactionIsolation();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        boolean boolean6 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18866");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setUseInstrumentation(false);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetries((int) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-41855");
        int int19 = hikariConfig0.getTransactionIsolation();
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test18867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18867");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMaxLifetime(10L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test18868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18868");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test18869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18869");
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
        long long12 = hikariConfig0.getIdleTimeout();
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean17 = hikariConfig16.isJdbc4ConnectionTest();
        long long18 = hikariConfig16.getConnectionTimeout();
        hikariConfig16.setJdbcUrl("");
        java.lang.String str21 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.setUseInstrumentation(true);
        boolean boolean24 = hikariConfig16.isInitializationFailFast();
        boolean boolean25 = hikariConfig16.isIsolateInternalQueries();
        int int26 = hikariConfig16.getTransactionIsolation();
        hikariConfig0.addDataSourceProperty("HikariPool-30696", (java.lang.Object) hikariConfig16);
        hikariConfig16.setInitializationFailFast(false);
        java.lang.String str30 = hikariConfig16.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-68958" + "'", str30, "HikariPool-68958");
    }

    @Test
    public void test18870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18870");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        hikariConfig0.setMaxLifetime((long) 97);
        boolean boolean13 = hikariConfig0.isAutoCommit();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18871");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-66173");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-66173 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setCatalog("");
        boolean boolean23 = hikariConfig20.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-11326", (java.lang.Object) hikariConfig20);
        hikariConfig0.setTransactionIsolation("HikariPool-13856");
        hikariConfig0.setLeakDetectionThreshold(32L);
        int int29 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isJdbc4ConnectionTest();
        hikariConfig31.setReadOnly(false);
        hikariConfig31.setConnectionInitSql("hi!");
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str39 = hikariConfig31.getJdbcUrl();
        hikariConfig31.setTransactionIsolation("HikariPool-250");
        hikariConfig31.setIsolateInternalQueries(false);
        long long44 = hikariConfig31.getAcquireRetryDelay();
        java.lang.String str45 = hikariConfig31.getPoolName();
        int int46 = hikariConfig31.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("HikariPool-2812", (java.lang.Object) hikariConfig31);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 750L + "'", long44 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-68964" + "'", str45, "HikariPool-68964");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test18873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18873");
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
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        long long16 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-68965" + "'", str10, "HikariPool-68965");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test18874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18874");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        long long11 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test18875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18875");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        boolean boolean15 = hikariConfig13.isReadOnly();
        javax.sql.DataSource dataSource16 = hikariConfig13.getDataSource();
        int int17 = hikariConfig13.getAcquireIncrement();
        hikariConfig13.setRegisterMbeans(true);
        hikariConfig13.setCatalog("HikariPool-575");
        java.lang.String str22 = hikariConfig13.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-7535", (java.lang.Object) hikariConfig13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18876");
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
        hikariConfig0.setJdbcUrl("HikariPool-9057");
        long long19 = hikariConfig0.getConnectionTimeout();
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        hikariConfig0.setAcquireRetryDelay((long) '4');
        java.lang.String str6 = hikariConfig0.getPoolName();
        long long7 = hikariConfig0.getIdleTimeout();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-32246");
        hikariConfig0.setConnectionTestQuery("HikariPool-17355");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-68970" + "'", str6, "HikariPool-68970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18878");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(600000L);
        long long8 = hikariConfig0.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test18879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18879");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireIncrement(60);
        java.lang.String str8 = hikariConfig0.getPoolName();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-68972" + "'", str8, "HikariPool-68972");
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test18880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18880");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-4807");
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setTransactionIsolation("HikariPool-32818");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-137" + "'", str15, "HikariPool-137");
    }

    @Test
    public void test18881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18881");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        long long7 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-6576");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test18882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18882");
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
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        int int16 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-68981" + "'", str12, "HikariPool-68981");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18883");
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
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test18884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18884");
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
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        boolean boolean19 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-14139");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setLeakDetectionThreshold(600000L);
        javax.sql.DataSource dataSource26 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig0.setDataSource(dataSource27);
        int int29 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test18885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18885");
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
        hikariConfig25.setReadOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig25.setAcquireIncrement((int) (byte) 0);
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
    public void test18886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18886");
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
        java.lang.String str14 = hikariConfig9.getDataSourceClassName();
        int int15 = hikariConfig9.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test18887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-370");
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.setMinimumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test18888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18888");
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
        hikariConfig0.setAcquireIncrement(32);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test18889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18889");
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
        int int20 = hikariConfig0.getAcquireIncrement();
        int int21 = hikariConfig0.getTransactionIsolation();
        int int22 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig0.setPoolName("HikariPool-17572");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test18890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18890");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setJdbcUrl("HikariPool-47645");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18891");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getMaxLifetime();
        int int7 = hikariConfig0.getAcquireIncrement();
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireIncrement((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test18892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18892");
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
        int int11 = hikariConfig9.getAcquireIncrement();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setCatalog("HikariPool-510");
        java.util.Properties properties16 = hikariConfig9.getDataSourceProperties();
        long long17 = hikariConfig9.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig9.isReadOnly();
        boolean boolean19 = hikariConfig9.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18893");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig8.setAcquireRetryDelay(600000L);
        hikariConfig8.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig8.setDriverClassName("HikariPool-39864");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-39864' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test18894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18894");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setReadOnly(true);
        long long14 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18895");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test18896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18896");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.addDataSourceProperty("HikariPool-1301", (java.lang.Object) 60);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1605");
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean17 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18897");
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
        hikariConfig0.setIdleTimeout(1800000L);
        hikariConfig0.setPoolName("HikariPool-5865");
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18898");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setConnectionInitSql("");
        boolean boolean17 = hikariConfig9.isAutoCommit();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isJdbc4ConnectionTest();
        long long20 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setJdbcUrl("");
        java.lang.String str23 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig9.setDataSourceProperties(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig0.setDataSource(dataSource29);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        boolean boolean33 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-69015" + "'", str7, "HikariPool-69015");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test18899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18899");
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
        java.lang.String str14 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-69021" + "'", str14, "HikariPool-69021");
    }

    @Test
    public void test18900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18900");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("HikariPool-13429");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-16504");
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-16504" + "'", str12, "HikariPool-16504");
    }

    @Test
    public void test18901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18901");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime(0L);
        int int15 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-11965");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11965' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test18902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18902");
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
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setMaximumPoolSize(10);
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18903");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        hikariConfig0.setConnectionTestQuery("HikariPool-7535");
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int20 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test18904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18904");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setTransactionIsolation("");
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        long long13 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("HikariPool-6131");
        hikariConfig0.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test18905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18905");
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
        hikariConfig0.setDataSourceClassName("HikariPool-1059");
        boolean boolean27 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean28 = hikariConfig0.isRegisterMbeans();
        boolean boolean29 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test18906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18906");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setIsolateInternalQueries(true);
        int int7 = hikariConfig0.getAcquireIncrement();
        int int8 = hikariConfig0.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        java.lang.String str13 = hikariConfig9.getDataSourceClassName();
        long long14 = hikariConfig9.getConnectionTimeout();
        java.lang.String str15 = hikariConfig9.getCatalog();
        java.util.Properties properties16 = hikariConfig9.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        boolean boolean22 = hikariConfig20.isReadOnly();
        int int23 = hikariConfig20.getAcquireIncrement();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        long long27 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.setConnectionInitSql("hi!");
        int int30 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setCatalog("HikariPool-211");
        int int33 = hikariConfig20.getTransactionIsolation();
        long long34 = hikariConfig20.getMaxLifetime();
        hikariConfig18.addDataSourceProperty("HikariPool-8690", (java.lang.Object) long34);
        java.lang.String str36 = hikariConfig18.getPoolName();
        java.lang.String str37 = hikariConfig18.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 750L + "'", long27 == 750L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1800000L + "'", long34 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-69033" + "'", str36, "HikariPool-69033");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test18907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18907");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.getTransactionIsolation();
        int int9 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test18908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18908");
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
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireIncrement(100);
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-3519" + "'", str20, "HikariPool-3519");
    }

    @Test
    public void test18909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18909");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setMaximumPoolSize((int) '4');
        long long9 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("HikariPool-10351");
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18910");
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
        hikariConfig0.setAcquireIncrement(35);
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        hikariConfig0.setPoolName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaxLifetime((long) 0);
        hikariConfig0.setConnectionInitSql("HikariPool-5275");
        hikariConfig0.setMinimumPoolSize(60);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18912");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold(100L);
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig0.setDataSourceProperties(properties18);
        boolean boolean26 = hikariConfig0.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-829");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test18913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18913");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setRegisterMbeans(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18914");
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
        boolean boolean30 = hikariConfig1.isIsolateInternalQueries();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test18915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18915");
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
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        boolean boolean15 = hikariConfig0.isReadOnly();
        long long16 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test18916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18916");
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
        java.lang.String str13 = hikariConfig9.getJdbcUrl();
        hikariConfig9.setPoolName("");
        java.lang.String str16 = hikariConfig9.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18917");
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
        int int17 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbcUrl("HikariPool-36084");
        hikariConfig0.setLeakDetectionThreshold(3L);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test18918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18918");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        hikariConfig0.setAcquireRetries((int) '#');
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10534");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10534' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18919");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int17 = hikariConfig0.getMaximumPoolSize();
        int int18 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIdleTimeout((long) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test18920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18920");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        long long4 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireIncrement(52);
        hikariConfig0.setConnectionTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test18921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-447");
        hikariConfig0.setJdbcUrl("HikariPool-211");
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-2990");
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        boolean boolean23 = hikariConfig21.isReadOnly();
        javax.sql.DataSource dataSource24 = hikariConfig21.getDataSource();
        boolean boolean25 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(false);
        hikariConfig21.setRegisterMbeans(false);
        hikariConfig21.setMaxLifetime((long) ' ');
        hikariConfig21.setMaxLifetime((long) (byte) 100);
        java.lang.String str34 = hikariConfig21.getConnectionInitSql();
        boolean boolean35 = hikariConfig21.isJdbc4ConnectionTest();
        boolean boolean36 = hikariConfig21.isJdbc4ConnectionTest();
        java.lang.String str37 = hikariConfig21.getJdbcUrl();
        java.util.Properties properties38 = hikariConfig21.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test18922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-69067" + "'", str6, "HikariPool-69067");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18923");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str5 = hikariConfig0.getPoolName();
        hikariConfig0.setRegisterMbeans(true);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        boolean boolean10 = hikariConfig0.isReadOnly();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireRetryDelay((long) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-69068" + "'", str5, "HikariPool-69068");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18924");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime((long) 1);
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test18925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        hikariConfig7.setMaxLifetime((long) '4');
        int int11 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setJdbcUrl("HikariPool-829");
        long long14 = hikariConfig7.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        int int18 = hikariConfig15.getAcquireIncrement();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        java.lang.String str21 = hikariConfig15.getCatalog();
        long long22 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.setConnectionInitSql("hi!");
        int int25 = hikariConfig15.getAcquireIncrement();
        int int26 = hikariConfig15.getAcquireIncrement();
        hikariConfig15.setMinimumPoolSize(3);
        java.util.Properties properties29 = hikariConfig15.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties29);
        java.lang.String str31 = hikariConfig7.getCatalog();
        hikariConfig7.setJdbcUrl("HikariPool-11288");
        java.lang.String str34 = hikariConfig7.getJdbcUrl();
        hikariConfig0.addDataSourceProperty("HikariPool-2708", (java.lang.Object) str34);
        hikariConfig0.setPoolName("HikariPool-23282");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-11288" + "'", str34, "HikariPool-11288");
    }

    @Test
    public void test18926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18927");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        boolean boolean9 = hikariConfig0.isReadOnly();
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-69078" + "'", str10, "HikariPool-69078");
    }

    @Test
    public void test18928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18928");
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
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries();
        int int23 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str27 = hikariConfig26.getConnectionInitSql();
        long long28 = hikariConfig26.getMaxLifetime();
        java.lang.String str29 = hikariConfig26.getConnectionCustomizerClassName();
        int int30 = hikariConfig26.getMinimumPoolSize();
        java.lang.String str31 = hikariConfig26.getConnectionCustomizerClassName();
        hikariConfig26.setLeakDetectionThreshold((long) '#');
        hikariConfig26.setReadOnly(false);
        hikariConfig26.setRegisterMbeans(true);
        hikariConfig26.setIsolateInternalQueries(false);
        int int40 = hikariConfig26.getMaximumPoolSize();
        java.util.Properties properties41 = hikariConfig26.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties41);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test18929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18929");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIdleTimeout(2147483647L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18930");
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
        hikariConfig9.setJdbcUrl("HikariPool-25680");
        hikariConfig9.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18931");
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
        int int21 = hikariConfig0.getAcquireIncrement();
        long long22 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test18932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18932");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setIdleTimeout(1800000L);
        java.lang.Class<?> wildcardClass10 = hikariConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18933");
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
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean24 = hikariConfig0.isAutoCommit();
        boolean boolean25 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-10668");
        java.lang.String str28 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test18934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18934");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setConnectionInitSql("HikariPool-5333");
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18935");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setInitializationFailFast(true);
        long long11 = hikariConfig0.getConnectionTimeout();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3491");
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(true);
        int int18 = hikariConfig0.getAcquireRetries();
        long long19 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-3491" + "'", str15, "HikariPool-3491");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test18936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18936");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("HikariPool-1361");
        hikariConfig0.setDataSourceClassName("HikariPool-1042");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setConnectionInitSql("hi!");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig12.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        int int21 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig20.setAutoCommit(true);
        hikariConfig20.setConnectionTestQuery("HikariPool-137");
        long long30 = hikariConfig20.getIdleTimeout();
        int int31 = hikariConfig20.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        boolean boolean34 = hikariConfig32.isReadOnly();
        int int35 = hikariConfig32.getAcquireIncrement();
        hikariConfig32.setConnectionTestQuery("hi!");
        hikariConfig32.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig32.setAutoCommit(true);
        java.util.Properties properties42 = hikariConfig32.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties42);
        java.lang.String str44 = hikariConfig20.getConnectionCustomizerClassName();
        hikariConfig12.addDataSourceProperty("HikariPool-370", (java.lang.Object) hikariConfig20);
        java.util.Properties properties46 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties46);
        java.lang.String str48 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireRetries(10);
        hikariConfig0.setCatalog("HikariPool-27471");
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test18937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18937");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setIdleTimeout((long) (short) 100);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        int int12 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getMaxLifetime();
        boolean boolean18 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setReadOnly(true);
        boolean boolean21 = hikariConfig15.isAutoCommit();
        hikariConfig15.setLeakDetectionThreshold(1L);
        hikariConfig15.setConnectionCustomizerClassName("");
        java.lang.String str26 = hikariConfig15.getCatalog();
        int int27 = hikariConfig15.getAcquireIncrement();
        hikariConfig15.setJdbc4ConnectionTest(true);
        java.lang.String str30 = hikariConfig15.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean32 = hikariConfig31.isJdbc4ConnectionTest();
        long long33 = hikariConfig31.getConnectionTimeout();
        hikariConfig31.setJdbcUrl("");
        java.lang.String str36 = hikariConfig31.getConnectionCustomizerClassName();
        java.util.Properties properties37 = hikariConfig31.getDataSourceProperties();
        hikariConfig15.setDataSourceProperties(properties37);
        hikariConfig14.setDataSourceProperties(properties37);
        java.lang.String str40 = hikariConfig14.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 5000L + "'", long33 == 5000L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test18938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18938");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-2747");
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-7638");
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        int int21 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionTestQuery("hi!");
        hikariConfig18.setCatalog("HikariPool-137");
        hikariConfig18.setInitializationFailFast(true);
        hikariConfig18.setDataSourceClassName("hi!");
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig30.setConnectionInitSql("");
        hikariConfig30.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean36 = hikariConfig35.isJdbc4ConnectionTest();
        long long37 = hikariConfig35.getConnectionTimeout();
        hikariConfig35.setJdbcUrl("");
        java.lang.String str40 = hikariConfig35.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig30.setDataSourceProperties(properties41);
        hikariConfig18.setDataSourceProperties(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        javax.sql.DataSource dataSource46 = hikariConfig0.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5000L + "'", long37 == 5000L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(dataSource46);
    }

    @Test
    public void test18939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18939");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18940");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-447");
        hikariConfig0.setJdbcUrl("HikariPool-211");
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-2990");
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-447" + "'", str21, "HikariPool-447");
    }

    @Test
    public void test18941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18941");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(true);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test18942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        hikariConfig0.setMaxLifetime(600000L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5443");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setDataSourceClassName("HikariPool-6956");
        hikariConfig0.setCatalog("HikariPool-12733");
        hikariConfig0.setReadOnly(true);
        java.lang.String str24 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-30796");
        boolean boolean27 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test18943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18943");
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
        int int14 = hikariConfig0.getAcquireIncrement();
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.setDataSourceClassName("HikariPool-13931");
        hikariConfig0.setJdbcUrl("HikariPool-61575");
        hikariConfig0.setMaxLifetime((long) 97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test18944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18944");
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
        int int15 = hikariConfig14.getMinimumPoolSize();
        long long16 = hikariConfig14.getConnectionTimeout();
        boolean boolean17 = hikariConfig14.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18945");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int6 = hikariConfig0.getAcquireIncrement();
        int int7 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test18947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18947");
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
        hikariConfig0.setPoolName("HikariPool-19738");
        hikariConfig0.setConnectionTestQuery("HikariPool-67840");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        long long8 = hikariConfig0.getAcquireRetryDelay();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18949");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(false);
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-52226");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-69128" + "'", str6, "HikariPool-69128");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test18950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18950");
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
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("HikariPool-14001");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setDataSourceClassName("HikariPool-19776");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test18951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18951");
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
        long long17 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
    }

    @Test
    public void test18952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18952");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAutoCommit(false);
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18953");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        int int6 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test18954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        int int9 = hikariConfig8.getAcquireRetries();
        hikariConfig8.setConnectionInitSql("");
        hikariConfig8.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig8.setAutoCommit(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig8.setDataSource(dataSource16);
        long long18 = hikariConfig8.getIdleTimeout();
        hikariConfig8.setPoolName("HikariPool-1059");
        hikariConfig8.setCatalog("HikariPool-1915");
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig23.setDataSource(dataSource25);
        boolean boolean27 = hikariConfig23.isJdbc4ConnectionTest();
        hikariConfig23.setAutoCommit(false);
        javax.sql.DataSource dataSource30 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionCustomizerClassName("HikariPool-1063");
        java.util.Properties properties33 = hikariConfig23.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties33);
        hikariConfig0.setDataSourceProperties(properties33);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig0.setDataSource(dataSource36);
        long long38 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test18955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18955");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("HikariPool-5734");
        hikariConfig0.setAcquireRetryDelay(1L);
        java.lang.String str15 = hikariConfig0.getPoolName();
        long long16 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-69137" + "'", str15, "HikariPool-69137");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test18956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18956");
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
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean20 = hikariConfig1.isReadOnly();
        hikariConfig1.setMaxLifetime((long) 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18957");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setPoolName("HikariPool-3533");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4457");
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionTimeout(1800000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18958");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long13 = hikariConfig0.getConnectionTimeout();
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18959");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18961");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-3741");
        boolean boolean17 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18962");
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
        boolean boolean16 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMinimumPoolSize(10);
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetries(10);
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        long long24 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
    }

    @Test
    public void test18963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setLeakDetectionThreshold(52L);
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setAcquireIncrement((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18964");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getCatalog();
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setCatalog("HikariPool-11149");
        java.lang.String str13 = hikariConfig0.getCatalog();
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-11149" + "'", str13, "HikariPool-11149");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18965");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getMaxLifetime();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("HikariPool-3952");
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.setMaximumPoolSize(1);
        int int13 = hikariConfig0.getAcquireIncrement();
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        java.lang.String str17 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-69148" + "'", str17, "HikariPool-69148");
    }

    @Test
    public void test18966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18966");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAutoCommit(false);
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        hikariConfig0.setPoolName("HikariPool-3587");
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test18967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18967");
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
        int int12 = hikariConfig9.getMaximumPoolSize();
        int int13 = hikariConfig9.getMaximumPoolSize();
        boolean boolean14 = hikariConfig9.isReadOnly();
        hikariConfig9.setCatalog("HikariPool-4293");
        hikariConfig9.setConnectionCustomizerClassName("HikariPool-1229");
        boolean boolean19 = hikariConfig9.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18968");
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
        long long35 = hikariConfig0.getConnectionTimeout();
        long long36 = hikariConfig0.getConnectionTimeout();
        long long37 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass38 = hikariConfig0.getClass();
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
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-69154" + "'", str34, "HikariPool-69154");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test18969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18969");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test18970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str5 = hikariConfig0.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-69160" + "'", str5, "HikariPool-69160");
    }

    @Test
    public void test18971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18971");
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
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMaxLifetime(100L);
        hikariConfig0.setPoolName("HikariPool-16009");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-1059" + "'", str9, "HikariPool-1059");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setUseInstrumentation(true);
        long long11 = hikariConfig0.getMaxLifetime();
        int int12 = hikariConfig0.getTransactionIsolation();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setPoolName("HikariPool-10945");
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-69162" + "'", str6, "HikariPool-69162");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18973");
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
        long long36 = hikariConfig20.getMaxLifetime();
        java.lang.String str37 = hikariConfig20.getConnectionInitSql();
        javax.sql.DataSource dataSource38 = null;
        hikariConfig20.setDataSource(dataSource38);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig20.setDriverClassName("HikariPool-23063");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-23063' could not be loaded");
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test18974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-11216");
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18975");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18976");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setUseInstrumentation(false);
        int int7 = hikariConfig0.getMinimumPoolSize();
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbcUrl("HikariPool-6578");
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test18977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18977");
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
        int int15 = hikariConfig0.getTransactionIsolation();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        long long19 = hikariConfig0.getIdleTimeout();
        long long20 = hikariConfig0.getMaxLifetime();
        int int21 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setDataSourceClassName("HikariPool-6899");
        java.lang.String str24 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) 35);
        java.lang.String str27 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 600000L + "'", long19 == 600000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-137" + "'", str27, "HikariPool-137");
    }

    @Test
    public void test18978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18978");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-69176" + "'", str6, "HikariPool-69176");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18979");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("HikariPool-5239");
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-15091");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18980");
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
        boolean boolean19 = hikariConfig0.isReadOnly();
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18981");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isReadOnly();
        int int11 = hikariConfig8.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        java.lang.String str14 = hikariConfig8.getCatalog();
        long long15 = hikariConfig8.getAcquireRetryDelay();
        int int16 = hikariConfig8.getMaximumPoolSize();
        long long17 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.setJdbc4ConnectionTest(false);
        int int20 = hikariConfig8.getMaximumPoolSize();
        int int21 = hikariConfig8.getAcquireIncrement();
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) int21);
        hikariConfig0.setRegisterMbeans(false);
        long long25 = hikariConfig0.getConnectionTimeout();
        boolean boolean26 = hikariConfig0.isReadOnly();
        boolean boolean27 = hikariConfig0.isAutoCommit();
        java.lang.String str28 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5000L + "'", long25 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test18982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18982");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test18983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18983");
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
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        long long13 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test18984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18984");
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
        hikariConfig13.setLeakDetectionThreshold((long) 1);
        boolean boolean18 = hikariConfig13.isJdbc4ConnectionTest();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test18985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-6653");
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long19 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.setPoolName("HikariPool-53030");
        boolean boolean22 = hikariConfig18.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18986");
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
        java.lang.String str16 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18987");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setTransactionIsolation("HikariPool-902");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        int int16 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.setDataSource(dataSource19);
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test18988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18988");
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
        int int19 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        int int22 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.setAutoCommit(true);
        hikariConfig20.setUseInstrumentation(false);
        int int27 = hikariConfig20.getMinimumPoolSize();
        long long28 = hikariConfig20.getMaxLifetime();
        hikariConfig20.setTransactionIsolation("HikariPool-17791");
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig0.setDataSourceProperties(properties31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test18989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18989");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setJdbcUrl("HikariPool-573");
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-211" + "'", str10, "HikariPool-211");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18990");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-447");
        hikariConfig0.setJdbcUrl("HikariPool-211");
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-2990");
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-18595");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18991");
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
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean27 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource28 = null;
        hikariConfig0.setDataSource(dataSource28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test18992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18992");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test18993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18993");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-7700");
        hikariConfig0.setAcquireRetryDelay(2147483647L);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18994");
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
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18995");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout((long) 97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test18996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18996");
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
        hikariConfig15.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig15.setIsolateInternalQueries(true);
        int int30 = hikariConfig15.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test18997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18997");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig17.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig17.isJdbc4ConnectionTest();
        hikariConfig17.setAutoCommit(false);
        hikariConfig17.setMaxLifetime(0L);
        long long26 = hikariConfig17.getIdleTimeout();
        boolean boolean27 = hikariConfig17.isInitializationFailFast();
        java.util.Properties properties28 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 600000L + "'", long26 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test18998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18998");
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
        long long15 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireIncrement(3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test18999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18999");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay(10L);
        java.lang.String str6 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-69212" + "'", str6, "HikariPool-69212");
    }

    @Test
    public void test19000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test19000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setConnectionInitSql("HikariPool-211");
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        boolean boolean18 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}
