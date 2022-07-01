import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1900");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1900 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setConnectionInitSql("HikariPool-391");
        long long21 = hikariConfig5.getMaxLifetime();
        java.lang.Class<?> wildcardClass22 = hikariConfig5.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str17 = hikariConfig1.getCatalog();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-8166" + "'", str14, "HikariPool-8166");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        boolean boolean7 = hikariConfig1.isAutoCommit();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-4434");
        hikariConfig1.setAcquireRetryDelay(1L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        int int5 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-4210");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        hikariConfig12.setAcquireRetryDelay(1L);
        hikariConfig12.setConnectionTimeout(600000L);
        javax.sql.DataSource dataSource20 = hikariConfig12.getDataSource();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        boolean boolean26 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str27 = hikariConfig22.getDataSourceClassName();
        boolean boolean28 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str29 = hikariConfig22.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setAcquireIncrement((int) '#');
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-587");
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        hikariConfig1.setConnectionTimeout(1800000L);
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        hikariConfig1.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-859");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-859 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        hikariConfig10.setAcquireRetryDelay((long) 'a');
        java.lang.String str18 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig10.getDataSourceProperties();
        hikariConfig10.setAutoCommit(false);
        hikariConfig10.setInitializationFailFast(false);
        int int24 = hikariConfig10.getMinimumPoolSize();
        hikariConfig10.setInitializationFailFast(false);
        boolean boolean27 = hikariConfig10.isJdbc4ConnectionTest();
        java.util.Properties properties28 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean31 = hikariConfig30.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2304");
        long long12 = hikariConfig1.getConnectionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getPoolName();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        int int14 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-4733");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-8216" + "'", str12, "HikariPool-8216");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig17.getDataSourceProperties();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.util.Properties properties29 = hikariConfig28.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties29);
        java.lang.String str31 = hikariConfig17.getCatalog();
        long long32 = hikariConfig17.getConnectionTimeout();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        int int38 = hikariConfig34.getAcquireRetries();
        long long39 = hikariConfig34.getMaxLifetime();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        javax.sql.DataSource dataSource43 = null;
        hikariConfig41.setDataSource(dataSource43);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isInitializationFailFast();
        hikariConfig46.setInitializationFailFast(true);
        boolean boolean50 = hikariConfig46.isJdbc4ConnectionTest();
        long long51 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setPoolName("hi!");
        hikariConfig46.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties56 = hikariConfig46.getDataSourceProperties();
        hikariConfig41.setDataSourceProperties(properties56);
        hikariConfig34.setDataSourceProperties(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig17.setDataSourceProperties(properties56);
        hikariConfig1.setDataSourceProperties(properties56);
        long long62 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireIncrement(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1800000L + "'", long39 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 5000L + "'", long51 == 5000L);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1800000L + "'", long62 == 1800000L);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-1450");
        hikariConfig1.setUseInstrumentation(false);
        int int12 = hikariConfig1.getAcquireIncrement();
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-1450" + "'", str13, "HikariPool-1450");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6059");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6059 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireIncrement((int) '4');
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setLeakDetectionThreshold((long) '4');
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setAcquireIncrement((int) '4');
        hikariConfig15.setIdleTimeout((long) (short) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-4434", (java.lang.Object) hikariConfig15);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig15.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (short) 100);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.util.Properties properties28 = hikariConfig27.getDataSourceProperties();
        int int29 = hikariConfig27.getTransactionIsolation();
        long long30 = hikariConfig27.getIdleTimeout();
        java.lang.String str31 = hikariConfig27.getConnectionInitSql();
        int int32 = hikariConfig27.getMaximumPoolSize();
        hikariConfig27.setConnectionTestQuery("HikariPool-391");
        hikariConfig1.addDataSourceProperty("HikariPool-2188", (java.lang.Object) hikariConfig27);
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        long long38 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5000L + "'", long38 == 5000L);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        int int32 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setPoolName("HikariPool-1867");
        hikariConfig1.setLeakDetectionThreshold(1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-700");
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        hikariConfig1.setMaxLifetime(0L);
        int int55 = hikariConfig1.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-143");
        hikariConfig0.setConnectionInitSql("HikariPool-4560");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setDataSourceClassName("HikariPool-1538");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3944");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3944 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setIdleTimeout((long) 60);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-8350" + "'", str5, "HikariPool-8350");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout(100L);
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setDataSourceClassName("HikariPool-7180");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6278");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6278 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime(0L);
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long11 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        boolean boolean16 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig14.setRegisterMbeans(true);
        hikariConfig14.setIdleTimeout((long) '4');
        java.lang.String str24 = hikariConfig14.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-3749", (java.lang.Object) hikariConfig14);
        boolean boolean26 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setMaximumPoolSize(100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        hikariConfig1.setCatalog("HikariPool-3119");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setIdleTimeout(600000L);
        long long26 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold(5000L);
        hikariConfig1.setTransactionIsolation("HikariPool-7114");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5000L + "'", long26 == 5000L);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        int int18 = hikariConfig1.getMinimumPoolSize();
        int int19 = hikariConfig1.getAcquireRetries();
        boolean boolean20 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-7208");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireIncrement(10);
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionInitSql("HikariPool-3749");
        boolean boolean26 = hikariConfig1.isAutoCommit();
        boolean boolean27 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.String str32 = hikariConfig31.getConnectionInitSql();
        boolean boolean33 = hikariConfig31.isJdbc4ConnectionTest();
        hikariConfig31.setAcquireRetries((int) ' ');
        boolean boolean36 = hikariConfig31.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig31.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5594");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5594 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-477");
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        int int14 = hikariConfig1.getMaximumPoolSize();
        int int15 = hikariConfig1.getAcquireRetries();
        int int16 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6595");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6595 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-414");
        int int9 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        int int18 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        int int19 = hikariConfig1.getAcquireRetries();
        int int20 = hikariConfig1.getAcquireRetries();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout(1L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isRegisterMbeans();
        java.lang.String str9 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-8619" + "'", str9, "HikariPool-8619");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-393");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-8636" + "'", str14, "HikariPool-8636");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.setDataSource(dataSource14);
        hikariConfig10.setAcquireRetryDelay((long) 'a');
        java.lang.String str18 = hikariConfig10.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig10.getConnectionInitSql();
        long long20 = hikariConfig10.getLeakDetectionThreshold();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long25 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        int int30 = hikariConfig28.getAcquireIncrement();
        java.lang.String str31 = hikariConfig28.getConnectionCustomizerClassName();
        hikariConfig28.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig28.setDataSource(dataSource34);
        hikariConfig28.setMaximumPoolSize(0);
        hikariConfig10.addDataSourceProperty("HikariPool-2136", (java.lang.Object) hikariConfig28);
        hikariConfig1.addDataSourceProperty("HikariPool-4404", (java.lang.Object) hikariConfig10);
        java.lang.String str40 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireIncrement(1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        hikariConfig1.setIdleTimeout((long) 100);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig16.getCatalog();
        int int23 = hikariConfig16.getMinimumPoolSize();
        java.lang.String str24 = hikariConfig16.getCatalog();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setJdbc4ConnectionTest(false);
        boolean boolean28 = hikariConfig16.isInitializationFailFast();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        int int34 = hikariConfig30.getAcquireRetries();
        long long35 = hikariConfig30.getMaxLifetime();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        javax.sql.DataSource dataSource39 = null;
        hikariConfig37.setDataSource(dataSource39);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        boolean boolean46 = hikariConfig42.isJdbc4ConnectionTest();
        long long47 = hikariConfig42.getConnectionTimeout();
        hikariConfig42.setPoolName("hi!");
        hikariConfig42.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties52 = hikariConfig42.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties52);
        hikariConfig30.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig16.setDataSourceProperties(properties52);
        int int58 = hikariConfig16.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-414", (java.lang.Object) int58);
        long long60 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-609");
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8617");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8617 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6595");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig22.setDataSource(dataSource24);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        boolean boolean31 = hikariConfig27.isJdbc4ConnectionTest();
        long long32 = hikariConfig27.getConnectionTimeout();
        hikariConfig27.setPoolName("hi!");
        hikariConfig27.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties37 = hikariConfig27.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties37);
        hikariConfig15.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        int int43 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireIncrement(100);
        int int14 = hikariConfig1.getMinimumPoolSize();
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        long long7 = hikariConfig1.getMaxLifetime();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout((long) '4');
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig11.setAcquireIncrement((int) (short) -1);
        boolean boolean18 = hikariConfig11.isRegisterMbeans();
        java.lang.Class<?> wildcardClass19 = hikariConfig11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean24 = hikariConfig23.isRegisterMbeans();
        int int25 = hikariConfig23.getMinimumPoolSize();
        int int26 = hikariConfig23.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionInitSql("HikariPool-609");
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetries(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        int int24 = hikariConfig1.getAcquireRetries();
        int int25 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setAcquireRetryDelay(1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean27 = hikariConfig26.isJdbc4ConnectionTest();
        hikariConfig26.setIdleTimeout((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig26.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((long) ' ');
        hikariConfig1.setAutoCommit(true);
        java.lang.String str21 = hikariConfig1.getCatalog();
        int int22 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (-1.0d));
        int int13 = hikariConfig1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-594");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig18.setDataSource(dataSource22);
        java.lang.String str24 = hikariConfig18.getCatalog();
        int int25 = hikariConfig18.getMinimumPoolSize();
        hikariConfig18.setTransactionIsolation("");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        javax.sql.DataSource dataSource33 = null;
        hikariConfig29.setDataSource(dataSource33);
        hikariConfig29.setAcquireRetryDelay((long) 'a');
        java.lang.String str37 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties38 = hikariConfig29.getDataSourceProperties();
        hikariConfig29.setAutoCommit(false);
        int int41 = hikariConfig29.getMaximumPoolSize();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isInitializationFailFast();
        hikariConfig43.setInitializationFailFast(true);
        int int47 = hikariConfig43.getAcquireRetries();
        long long48 = hikariConfig43.getMaxLifetime();
        hikariConfig43.setMaxLifetime((long) (short) 0);
        long long51 = hikariConfig43.getIdleTimeout();
        boolean boolean52 = hikariConfig43.isRegisterMbeans();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        boolean boolean55 = hikariConfig54.isInitializationFailFast();
        hikariConfig54.setLeakDetectionThreshold((long) '4');
        java.lang.String str58 = hikariConfig54.getConnectionCustomizerClassName();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        boolean boolean61 = hikariConfig60.isInitializationFailFast();
        hikariConfig60.setInitializationFailFast(true);
        javax.sql.DataSource dataSource64 = null;
        hikariConfig60.setDataSource(dataSource64);
        hikariConfig60.setAcquireRetryDelay((long) 'a');
        java.lang.String str68 = hikariConfig60.getConnectionCustomizerClassName();
        java.util.Properties properties69 = hikariConfig60.getDataSourceProperties();
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        java.util.Properties properties72 = hikariConfig71.getDataSourceProperties();
        hikariConfig60.setDataSourceProperties(properties72);
        hikariConfig54.setDataSourceProperties(properties72);
        hikariConfig43.setDataSourceProperties(properties72);
        hikariConfig29.setDataSourceProperties(properties72);
        hikariConfig18.setDataSourceProperties(properties72);
        hikariConfig1.setDataSourceProperties(properties72);
        hikariConfig1.setRegisterMbeans(false);
        int int81 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1800000L + "'", long48 == 1800000L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 600000L + "'", long51 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-391");
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig1.getPoolName();
        int int8 = hikariConfig1.getAcquireIncrement();
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(1);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(false);
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig1.getCatalog();
        int int19 = hikariConfig1.getMaximumPoolSize();
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-8825" + "'", str7, "HikariPool-8825");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-391" + "'", str14, "HikariPool-391");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-594");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-594 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        int int10 = hikariConfig1.getMinimumPoolSize();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        int int12 = hikariConfig1.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        int int5 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-3821");
        java.lang.Class<?> wildcardClass8 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6984");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-1465");
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setUseInstrumentation(true);
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setLeakDetectionThreshold(1L);
        hikariConfig1.setIdleTimeout((long) 100);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig16.getCatalog();
        int int23 = hikariConfig16.getMinimumPoolSize();
        java.lang.String str24 = hikariConfig16.getCatalog();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.setJdbc4ConnectionTest(false);
        boolean boolean28 = hikariConfig16.isInitializationFailFast();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        int int34 = hikariConfig30.getAcquireRetries();
        long long35 = hikariConfig30.getMaxLifetime();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
        javax.sql.DataSource dataSource39 = null;
        hikariConfig37.setDataSource(dataSource39);
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean43 = hikariConfig42.isInitializationFailFast();
        hikariConfig42.setInitializationFailFast(true);
        boolean boolean46 = hikariConfig42.isJdbc4ConnectionTest();
        long long47 = hikariConfig42.getConnectionTimeout();
        hikariConfig42.setPoolName("hi!");
        hikariConfig42.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties52 = hikariConfig42.getDataSourceProperties();
        hikariConfig37.setDataSourceProperties(properties52);
        hikariConfig30.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig16.setDataSourceProperties(properties52);
        int int58 = hikariConfig16.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-414", (java.lang.Object) int58);
        java.lang.String str60 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties61 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-414");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-8908" + "'", str12, "HikariPool-8908");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2188");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2188 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6984");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6984 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int25 = hikariConfig1.getAcquireRetries();
        boolean boolean26 = hikariConfig1.isRegisterMbeans();
        java.lang.String str27 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2304");
        hikariConfig1.setDataSourceClassName("HikariPool-8908");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setIdleTimeout((long) (short) 1);
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        hikariConfig38.setInitializationFailFast(true);
        int int42 = hikariConfig38.getAcquireRetries();
        long long43 = hikariConfig38.getMaxLifetime();
        hikariConfig38.setMaxLifetime((long) (short) 0);
        java.lang.String str46 = hikariConfig38.getDataSourceClassName();
        hikariConfig38.setDataSourceClassName("HikariPool-1902");
        java.util.Properties properties49 = hikariConfig38.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties49);
        int int51 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        long long20 = hikariConfig11.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 600000L + "'", long20 == 600000L);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setCatalog("HikariPool-7396");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        int int20 = hikariConfig18.getTransactionIsolation();
        long long21 = hikariConfig18.getIdleTimeout();
        hikariConfig18.setMaximumPoolSize((int) (byte) 100);
        long long24 = hikariConfig18.getMaxLifetime();
        boolean boolean25 = hikariConfig18.isAutoCommit();
        hikariConfig18.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-5149", (java.lang.Object) (byte) 10);
        java.lang.String str29 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 600000L + "'", long21 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-8980" + "'", str29, "HikariPool-8980");
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6413");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6413 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetries(3);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        boolean boolean20 = hikariConfig1.isAutoCommit();
        java.lang.String str21 = hikariConfig1.getCatalog();
        int int22 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("HikariPool-6786", (java.lang.Object) "HikariPool-8057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8334");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8334 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setPoolName("HikariPool-674");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTimeout(5000L);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setCatalog("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        int int13 = hikariConfig1.getTransactionIsolation();
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5204");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setAcquireRetryDelay(1L);
        hikariConfig11.setAcquireIncrement((int) 'a');
        long long19 = hikariConfig11.getMaxLifetime();
        int int20 = hikariConfig11.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        hikariConfig23.setAcquireRetryDelay(1L);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig23.setAcquireRetryDelay((long) 10);
        hikariConfig11.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-143", (java.lang.Object) hikariConfig11);
        java.lang.String str35 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-9050" + "'", str35, "HikariPool-9050");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setDataSourceClassName("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties37);
        int int43 = hikariConfig42.getTransactionIsolation();
        boolean boolean44 = hikariConfig42.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig1.setConnectionTestQuery("HikariPool-2833");
        hikariConfig1.setMaximumPoolSize(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(true);
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig1.getCatalog();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        boolean boolean5 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAutoCommit(true);
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireIncrement((int) '4');
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setLeakDetectionThreshold((long) '4');
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setAcquireIncrement((int) '4');
        hikariConfig15.setIdleTimeout((long) (short) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-4434", (java.lang.Object) hikariConfig15);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        long long12 = hikariConfig1.getMaxLifetime();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4560");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4560 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean5 = hikariConfig1.isRegisterMbeans();
        java.lang.String str6 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        java.lang.String str24 = hikariConfig7.getConnectionInitSql();
        int int25 = hikariConfig7.getAcquireRetries();
        java.lang.String str26 = hikariConfig7.getConnectionCustomizerClassName();
        java.lang.String str27 = hikariConfig7.getCatalog();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        hikariConfig29.setAcquireRetryDelay(1L);
        boolean boolean35 = hikariConfig29.isAutoCommit();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        java.util.Properties properties38 = hikariConfig37.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties38);
        hikariConfig7.setDataSourceProperties(properties38);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig7.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        int int16 = hikariConfig0.getTransactionIsolation();
        long long17 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig0.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        int int13 = hikariConfig1.getAcquireIncrement();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-609");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        int int12 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-9254" + "'", str10, "HikariPool-9254");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTestQuery("HikariPool-594");
        hikariConfig23.setCatalog("HikariPool-1964");
        hikariConfig23.setTransactionIsolation("HikariPool-3544");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str20 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2424");
        hikariConfig1.setAutoCommit(true);
        java.lang.String str25 = hikariConfig1.getCatalog();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig28.isJdbc4ConnectionTest();
        java.lang.String str33 = hikariConfig28.getDataSourceClassName();
        long long34 = hikariConfig28.getConnectionTimeout();
        hikariConfig28.setConnectionTestQuery("HikariPool-700");
        java.lang.String str37 = hikariConfig28.getCatalog();
        hikariConfig28.setIdleTimeout(1800000L);
        hikariConfig1.addDataSourceProperty("HikariPool-4523", (java.lang.Object) 1800000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-9269" + "'", str20, "HikariPool-9269");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5000L + "'", long34 == 5000L);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8754");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8754 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5693");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5693 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        hikariConfig1.setConnectionTestQuery("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7114");
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        long long15 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setPoolName("hi!");
        hikariConfig10.setAcquireIncrement((int) (byte) 100);
        long long20 = hikariConfig10.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-663", (java.lang.Object) hikariConfig10);
        long long22 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setAcquireIncrement((int) ' ');
        java.lang.String str25 = hikariConfig10.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8584");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8584 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("");
        int int12 = hikariConfig1.getAcquireRetries();
        int int13 = hikariConfig1.getAcquireRetries();
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.setAcquireRetryDelay(1L);
        hikariConfig10.setAcquireIncrement((int) (byte) 100);
        int int18 = hikariConfig10.getTransactionIsolation();
        int int19 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setMaximumPoolSize((int) (byte) 1);
        java.lang.String str22 = hikariConfig10.getDataSourceClassName();
        java.util.Properties properties23 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.addDataSourceProperty("HikariPool-3727", (java.lang.Object) hikariConfig24);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig0.setDataSource(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-587");
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setDataSourceClassName("HikariPool-5062");
        java.lang.Class<?> wildcardClass23 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        boolean boolean13 = hikariConfig1.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(100);
        hikariConfig1.addDataSourceProperty("HikariPool-1009", (java.lang.Object) "HikariPool-963");
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-963");
        hikariConfig1.setPoolName("");
        java.lang.Class<?> wildcardClass29 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getConnectionTimeout();
        java.lang.String str19 = hikariConfig17.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7435");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7435 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setAcquireRetryDelay(600000L);
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-393");
        boolean boolean8 = hikariConfig1.isAutoCommit();
        int int9 = hikariConfig1.getMinimumPoolSize();
        int int10 = hikariConfig1.getMinimumPoolSize();
        int int11 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setMaxLifetime(0L);
        hikariConfig1.setAcquireRetryDelay(0L);
        hikariConfig1.setAcquireRetries(0);
        java.lang.Class<?> wildcardClass51 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setCatalog("HikariPool-1535");
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-5412");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6756");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6756 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1964");
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-3858");
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setAcquireRetries(60);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        int int16 = hikariConfig1.getAcquireIncrement();
        long long17 = hikariConfig1.getIdleTimeout();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-477");
        long long22 = hikariConfig1.getIdleTimeout();
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties24 = hikariConfig1.getDataSourceProperties();
        java.lang.Class<?> wildcardClass25 = properties24.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        hikariConfig1.setPoolName("HikariPool-2107");
        java.lang.String str27 = hikariConfig1.getConnectionInitSql();
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.Class<?> wildcardClass29 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setAcquireRetries(1);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getLeakDetectionThreshold();
        hikariConfig15.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig15.setAcquireRetryDelay((-1L));
        java.util.Properties properties21 = hikariConfig15.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.setAcquireRetryDelay(600000L);
        int int25 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setMaximumPoolSize(100);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        long long20 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2833");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireRetryDelay(600000L);
        hikariConfig1.setPoolName("HikariPool-1455");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-7373");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8800");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8800 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setLeakDetectionThreshold(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        java.lang.String str14 = hikariConfig8.getCatalog();
        int int15 = hikariConfig8.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig8.getCatalog();
        long long17 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.setJdbc4ConnectionTest(false);
        boolean boolean20 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        boolean boolean23 = hikariConfig8.isAutoCommit();
        hikariConfig8.setInitializationFailFast(true);
        hikariConfig8.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) hikariConfig8);
        boolean boolean29 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        java.lang.String str32 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        int int13 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig11.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig11.getCatalog();
        hikariConfig1.addDataSourceProperty("HikariPool-143", (java.lang.Object) hikariConfig11);
        hikariConfig1.setMaxLifetime((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setUseInstrumentation(false);
        int int9 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionInitSql("HikariPool-414");
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIdleTimeout(5000L);
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setPoolName("hi!");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.setTransactionIsolation("");
        hikariConfig19.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        hikariConfig25.setAcquireRetryDelay(1L);
        boolean boolean31 = hikariConfig25.isAutoCommit();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties34 = hikariConfig33.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties34);
        hikariConfig19.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig38.setUseInstrumentation(true);
        java.util.Properties properties41 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig38.setDataSourceProperties(properties41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        hikariConfig23.setAcquireRetryDelay((long) 'a');
        java.lang.String str31 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig34.setConnectionTimeout((long) (short) 0);
        hikariConfig34.setAcquireRetries((int) ' ');
        boolean boolean39 = hikariConfig34.isAutoCommit();
        hikariConfig1.addDataSourceProperty("HikariPool-3086", (java.lang.Object) hikariConfig34);
        javax.sql.DataSource dataSource41 = hikariConfig34.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(dataSource41);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.util.Properties properties18 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties18);
        long long20 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMaxLifetime((-1L));
        java.lang.String str23 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-10039" + "'", str23, "HikariPool-10039");
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setMinimumPoolSize(60);
        long long15 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionInitSql("HikariPool-391");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTimeout(5000L);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setMaximumPoolSize(10);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setTransactionIsolation("");
        int int19 = hikariConfig16.getAcquireIncrement();
        long long20 = hikariConfig16.getLeakDetectionThreshold();
        java.util.Properties properties21 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-5960", (java.lang.Object) hikariConfig16);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        hikariConfig7.setLeakDetectionThreshold((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setAcquireRetryDelay(1L);
        hikariConfig11.setAcquireIncrement((int) 'a');
        long long19 = hikariConfig11.getMaxLifetime();
        int int20 = hikariConfig11.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        hikariConfig23.setAcquireRetryDelay(1L);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig23.setAcquireRetryDelay((long) 10);
        hikariConfig11.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-143", (java.lang.Object) hikariConfig11);
        hikariConfig1.setTransactionIsolation("HikariPool-5192");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int19 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isRegisterMbeans();
        int int24 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setUseInstrumentation(true);
        int int27 = hikariConfig22.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1462", (java.lang.Object) int27);
        hikariConfig1.setConnectionTestQuery("HikariPool-414");
        hikariConfig1.setTransactionIsolation("HikariPool-9729");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setMaximumPoolSize(100);
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-3727");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(100);
        hikariConfig1.addDataSourceProperty("HikariPool-1009", (java.lang.Object) "HikariPool-963");
        hikariConfig1.setIdleTimeout((long) 60);
        hikariConfig1.setCatalog("HikariPool-4530");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.Class<?> wildcardClass29 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str20 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2424");
        hikariConfig1.setAutoCommit(true);
        java.lang.String str25 = hikariConfig1.getCatalog();
        java.lang.Class<?> wildcardClass26 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-10155" + "'", str20, "HikariPool-10155");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        hikariConfig7.setAcquireRetryDelay(1L);
        boolean boolean13 = hikariConfig7.isAutoCommit();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.util.Properties properties16 = hikariConfig15.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties16);
        hikariConfig1.setDataSourceProperties(properties16);
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig1.getCatalog();
        long long23 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        hikariConfig13.setAcquireRetryDelay(1L);
        hikariConfig13.setMaximumPoolSize((int) '#');
        hikariConfig13.setAcquireRetryDelay((long) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        boolean boolean24 = hikariConfig1.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setAcquireIncrement(100);
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(true);
        int int19 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        long long13 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-143");
        int int6 = hikariConfig0.getAcquireIncrement();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        int int8 = hikariConfig1.getMinimumPoolSize();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2304");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2304 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig22.setDataSource(dataSource24);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        hikariConfig27.setInitializationFailFast(true);
        boolean boolean31 = hikariConfig27.isJdbc4ConnectionTest();
        long long32 = hikariConfig27.getConnectionTimeout();
        hikariConfig27.setPoolName("hi!");
        hikariConfig27.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties37 = hikariConfig27.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties37);
        hikariConfig15.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        int int43 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str44 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        java.lang.String str33 = hikariConfig29.getConnectionTestQuery();
        hikariConfig29.setDataSourceClassName("");
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        hikariConfig38.setInitializationFailFast(true);
        int int42 = hikariConfig38.getAcquireRetries();
        long long43 = hikariConfig38.getMaxLifetime();
        hikariConfig38.setMaxLifetime((long) (short) 0);
        long long46 = hikariConfig38.getIdleTimeout();
        boolean boolean47 = hikariConfig38.isRegisterMbeans();
        long long48 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig29.addDataSourceProperty("HikariPool-184", (java.lang.Object) long48);
        java.lang.String str50 = hikariConfig29.getCatalog();
        hikariConfig29.setUseInstrumentation(true);
        hikariConfig29.setAutoCommit(true);
        java.lang.String str55 = hikariConfig29.getConnectionCustomizerClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-5933", (java.lang.Object) hikariConfig29);
        long long57 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 600000L + "'", long46 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.lang.String str25 = hikariConfig16.getConnectionInitSql();
        hikariConfig16.setDataSourceClassName("");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        javax.sql.DataSource dataSource33 = null;
        hikariConfig29.setDataSource(dataSource33);
        hikariConfig29.setAcquireRetryDelay((long) 'a');
        java.lang.String str37 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties38 = hikariConfig29.getDataSourceProperties();
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        java.util.Properties properties41 = hikariConfig40.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties41);
        hikariConfig16.setDataSourceProperties(properties41);
        long long44 = hikariConfig16.getLeakDetectionThreshold();
        java.util.Properties properties45 = hikariConfig16.getDataSourceProperties();
        java.lang.String str46 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        boolean boolean49 = hikariConfig48.isInitializationFailFast();
        hikariConfig48.setInitializationFailFast(true);
        boolean boolean52 = hikariConfig48.isJdbc4ConnectionTest();
        long long53 = hikariConfig48.getConnectionTimeout();
        hikariConfig48.setPoolName("hi!");
        hikariConfig48.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties58 = hikariConfig48.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig16.setDataSourceProperties(properties58);
        javax.sql.DataSource dataSource61 = null;
        hikariConfig16.setDataSource(dataSource61);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-8855", (java.lang.Object) dataSource61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5000L + "'", long53 == 5000L);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("hi!");
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig8.setDataSource(dataSource12);
        hikariConfig8.setAcquireRetryDelay((long) 'a');
        java.lang.String str16 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setAutoCommit(false);
        hikariConfig8.setInitializationFailFast(false);
        int int22 = hikariConfig8.getMaximumPoolSize();
        boolean boolean23 = hikariConfig8.isRegisterMbeans();
        hikariConfig1.addDataSourceProperty("HikariPool-587", (java.lang.Object) boolean23);
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        long long26 = hikariConfig1.getMaxLifetime();
        boolean boolean27 = hikariConfig1.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(35);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        java.lang.String str27 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold(0L);
        int int30 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass31 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-184" + "'", str27, "HikariPool-184");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties6 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(true);
        boolean boolean12 = hikariConfig8.isJdbc4ConnectionTest();
        long long13 = hikariConfig8.getConnectionTimeout();
        hikariConfig8.setPoolName("hi!");
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties18 = hikariConfig8.getDataSourceProperties();
        hikariConfig8.setMinimumPoolSize((int) (byte) 1);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        java.lang.String str26 = hikariConfig22.getConnectionTestQuery();
        boolean boolean27 = hikariConfig22.isRegisterMbeans();
        hikariConfig22.setDataSourceClassName("hi!");
        hikariConfig22.setConnectionInitSql("");
        java.lang.String str32 = hikariConfig22.getCatalog();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        hikariConfig34.setAcquireRetryDelay((long) 'a');
        java.lang.String str42 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties43 = hikariConfig34.getDataSourceProperties();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        boolean boolean46 = hikariConfig45.isInitializationFailFast();
        hikariConfig45.setInitializationFailFast(true);
        javax.sql.DataSource dataSource49 = null;
        hikariConfig45.setDataSource(dataSource49);
        hikariConfig45.setAcquireRetryDelay((long) 'a');
        java.lang.String str53 = hikariConfig45.getConnectionCustomizerClassName();
        java.util.Properties properties54 = hikariConfig45.getDataSourceProperties();
        hikariConfig34.setDataSourceProperties(properties54);
        hikariConfig22.setDataSourceProperties(properties54);
        hikariConfig8.setDataSourceProperties(properties54);
        hikariConfig1.setDataSourceProperties(properties54);
        java.lang.String str59 = hikariConfig1.getCatalog();
        int int60 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 60 + "'", int60 == 60);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str15 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-184");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-627");
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-2407");
        int int16 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setPoolName("");
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetryDelay((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setDataSourceClassName("HikariPool-2407");
        long long7 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        hikariConfig1.setConnectionTestQuery("HikariPool-2833");
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIdleTimeout((long) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.util.Properties properties24 = hikariConfig23.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties24);
        int int26 = hikariConfig12.getMinimumPoolSize();
        java.lang.String str27 = hikariConfig12.getDataSourceClassName();
        javax.sql.DataSource dataSource28 = hikariConfig12.getDataSource();
        int int29 = hikariConfig12.getMinimumPoolSize();
        int int30 = hikariConfig12.getAcquireRetries();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig12.setDataSource(dataSource31);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-6672", (java.lang.Object) dataSource31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        hikariConfig16.setAcquireRetryDelay(1L);
        hikariConfig16.setAcquireIncrement((int) (byte) 100);
        int int24 = hikariConfig16.getTransactionIsolation();
        int int25 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setIdleTimeout((long) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-4554", (java.lang.Object) hikariConfig16);
        long long29 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getMaxLifetime();
        java.lang.String str8 = hikariConfig6.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setPoolName("HikariPool-3780");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str11 = hikariConfig1.getCatalog();
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setConnectionInitSql("");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.setDataSource(dataSource26);
        boolean boolean28 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-10523" + "'", str10, "HikariPool-10523");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-10523" + "'", str11, "HikariPool-10523");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(true);
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        boolean boolean19 = hikariConfig1.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.setMaxLifetime(0L);
        hikariConfig26.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setConnectionTestQuery("HikariPool-6938");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str33 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        hikariConfig1.setRegisterMbeans(true);
        int int38 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIdleTimeout(0L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-10639" + "'", str33, "HikariPool-10639");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.getCatalog();
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        int int8 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-10642" + "'", str5, "HikariPool-10642");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7720");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7720 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setAcquireRetries(60);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        int int16 = hikariConfig1.getAcquireIncrement();
        long long17 = hikariConfig1.getIdleTimeout();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        int int19 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str26 = hikariConfig15.getConnectionInitSql();
        hikariConfig11.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig15);
        long long28 = hikariConfig11.getAcquireRetryDelay();
        int int29 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        hikariConfig1.setAcquireRetryDelay(1800000L);
        java.lang.String str35 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-4238");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        int int12 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        int int13 = hikariConfig1.getTransactionIsolation();
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireIncrement((int) (byte) 0);
        boolean boolean17 = hikariConfig1.isAutoCommit();
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setInitializationFailFast(true);
        java.lang.String str13 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.setInitializationFailFast(false);
        int int30 = hikariConfig16.getMaximumPoolSize();
        boolean boolean31 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setJdbc4ConnectionTest(true);
        java.lang.String str34 = hikariConfig16.getConnectionTestQuery();
        java.lang.String str35 = hikariConfig16.getPoolName();
        hikariConfig9.addDataSourceProperty("HikariPool-1244", (java.lang.Object) str35);
        int int37 = hikariConfig9.getAcquireRetries();
        hikariConfig9.setTransactionIsolation("HikariPool-3424");
        hikariConfig9.setCatalog("HikariPool-1244");
        hikariConfig9.setPoolName("HikariPool-2734");
        java.util.Properties properties44 = hikariConfig9.getDataSourceProperties();
        java.lang.Class<?> wildcardClass45 = hikariConfig9.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-10682" + "'", str35, "HikariPool-10682");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-1566");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str53 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-907");
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        int int19 = hikariConfig1.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-4550");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4588");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig12.getCatalog();
        int int19 = hikariConfig12.getMinimumPoolSize();
        hikariConfig12.setTransactionIsolation("");
        hikariConfig1.addDataSourceProperty("HikariPool-1566", (java.lang.Object) hikariConfig12);
        hikariConfig12.setLeakDetectionThreshold((long) ' ');
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean27 = hikariConfig26.isRegisterMbeans();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-1644");
        java.util.Properties properties32 = hikariConfig26.getDataSourceProperties();
        hikariConfig12.addDataSourceProperty("HikariPool-594", (java.lang.Object) hikariConfig26);
        java.lang.String str34 = hikariConfig12.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        hikariConfig1.setConnectionTestQuery("HikariPool-10604");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setTransactionIsolation("hi!");
        java.util.Properties properties12 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig1.setDataSourceProperties(properties12);
        hikariConfig1.setAutoCommit(false);
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireIncrement((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (short) 0);
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getLeakDetectionThreshold();
        hikariConfig14.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setPoolName("hi!");
        int int18 = hikariConfig1.getTransactionIsolation();
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setCatalog("HikariPool-1535");
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAcquireIncrement((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        int int6 = hikariConfig1.getAcquireIncrement();
        long long7 = hikariConfig1.getAcquireRetryDelay();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-9279", obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTimeout(5000L);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        int int16 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.setAutoCommit(false);
        hikariConfig9.setInitializationFailFast(false);
        int int23 = hikariConfig9.getMaximumPoolSize();
        boolean boolean24 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-663", (java.lang.Object) hikariConfig9);
        javax.sql.DataSource dataSource28 = hikariConfig9.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig9.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource28);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        int int14 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int16 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setConnectionInitSql("HikariPool-7483");
        hikariConfig9.setConnectionTimeout(0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean30 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-1644");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-1974");
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout(0L);
        int int15 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionTestQuery("HikariPool-9254");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        int int16 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str8 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setLeakDetectionThreshold((long) '4');
        int int15 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setMaximumPoolSize((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hikariConfig11.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-674", (java.lang.Object) hikariConfig11);
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-674");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-9589");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-442");
        long long20 = hikariConfig1.getMaxLifetime();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str22 = hikariConfig1.getCatalog();
        java.lang.String str23 = hikariConfig1.getPoolName();
        java.lang.String str24 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-442" + "'", str22, "HikariPool-442");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-10925" + "'", str23, "HikariPool-10925");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        long long15 = hikariConfig1.getMaxLifetime();
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setAcquireRetryDelay(1L);
        hikariConfig11.setAcquireIncrement((int) 'a');
        long long19 = hikariConfig11.getMaxLifetime();
        int int20 = hikariConfig11.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        hikariConfig23.setAcquireRetryDelay(1L);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig23.setAcquireRetryDelay((long) 10);
        hikariConfig11.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-143", (java.lang.Object) hikariConfig11);
        java.util.Properties properties35 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setDataSourceProperties(properties35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setConnectionTestQuery("HikariPool-442");
        hikariConfig1.setConnectionTestQuery("HikariPool-6549");
        long long20 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setCatalog("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        int int11 = hikariConfig1.getAcquireRetries();
        int int12 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setIdleTimeout((long) '4');
        hikariConfig11.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig11.setDataSource(dataSource16);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionTestQuery("HikariPool-2862");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-414");
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAcquireRetryDelay((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.setTransactionIsolation("HikariPool-3821");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        int int8 = hikariConfig1.getTransactionIsolation();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        int int14 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-5061");
        int int18 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setPoolName("HikariPool-477");
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("HikariPool-627");
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5174");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5174 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setIdleTimeout((-1L));
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        java.lang.String str22 = hikariConfig7.getDataSourceClassName();
        hikariConfig7.setConnectionCustomizerClassName("");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) "");
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        int int34 = hikariConfig30.getAcquireRetries();
        boolean boolean35 = hikariConfig30.isRegisterMbeans();
        java.util.Properties properties36 = hikariConfig30.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.setConnectionCustomizerClassName("HikariPool-2528");
        java.lang.String str40 = hikariConfig37.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-5651", (java.lang.Object) str40);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties36);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-11119" + "'", str40, "HikariPool-11119");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(true);
        int int12 = hikariConfig1.getAcquireRetries();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig15.setDataSource(dataSource19);
        hikariConfig15.setAcquireRetryDelay((long) 'a');
        java.lang.String str23 = hikariConfig15.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig15.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.setDataSourceProperties(properties24);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-8791");
        hikariConfig1.setIdleTimeout((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setDataSourceClassName("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig42.setAcquireRetryDelay(10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-2246");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setInitializationFailFast(true);
        javax.sql.DataSource dataSource45 = null;
        hikariConfig41.setDataSource(dataSource45);
        java.lang.String str47 = hikariConfig41.getCatalog();
        int int48 = hikariConfig41.getMinimumPoolSize();
        boolean boolean49 = hikariConfig41.isJdbc4ConnectionTest();
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        boolean boolean53 = hikariConfig52.isInitializationFailFast();
        hikariConfig52.setInitializationFailFast(true);
        javax.sql.DataSource dataSource56 = null;
        hikariConfig52.setDataSource(dataSource56);
        java.lang.String str58 = hikariConfig52.getCatalog();
        int int59 = hikariConfig52.getMinimumPoolSize();
        hikariConfig52.setTransactionIsolation("");
        hikariConfig41.addDataSourceProperty("HikariPool-1566", (java.lang.Object) hikariConfig52);
        hikariConfig41.setInitializationFailFast(false);
        hikariConfig41.setAcquireIncrement(0);
        java.util.Properties properties67 = hikariConfig41.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-6888", (java.lang.Object) hikariConfig41);
        java.lang.String str69 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(properties67);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "HikariPool-11172" + "'", str69, "HikariPool-11172");
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isAutoCommit();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        java.lang.String str22 = hikariConfig7.getDataSourceClassName();
        hikariConfig7.setConnectionCustomizerClassName("");
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) "");
        long long26 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-6028");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5778");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5778 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig13.setDataSource(dataSource17);
        hikariConfig13.setAcquireRetryDelay((long) 'a');
        java.lang.String str21 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        hikariConfig13.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig36.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        java.lang.String str40 = hikariConfig34.getCatalog();
        int int41 = hikariConfig34.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig34.getCatalog();
        long long43 = hikariConfig34.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setAcquireIncrement(100);
        int int47 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig34);
        hikariConfig34.setMinimumPoolSize((int) (short) 100);
        java.lang.String str51 = hikariConfig34.getConnectionCustomizerClassName();
        java.util.Properties properties52 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig34.setDataSourceProperties(properties52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.String str33 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        long long36 = hikariConfig1.getConnectionTimeout();
        java.lang.String str37 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setMaxLifetime(600000L);
        java.lang.String str42 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-11219" + "'", str33, "HikariPool-11219");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5000L + "'", long36 == 5000L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setIdleTimeout((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("");
        hikariConfig1.setConnectionTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long24 = hikariConfig23.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig23.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setConnectionTimeout(1800000L);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4588");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4588 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        java.lang.String str34 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass35 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        long long17 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setMaxLifetime(0L);
        java.lang.Class<?> wildcardClass47 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        hikariConfig11.setAcquireRetryDelay((long) 'a');
        java.lang.String str19 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties20 = hikariConfig11.getDataSourceProperties();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig22.setDataSource(dataSource26);
        hikariConfig22.setAcquireRetryDelay((long) 'a');
        java.lang.String str30 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig22.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties31);
        hikariConfig1.setDataSourceProperties(properties31);
        hikariConfig1.setTransactionIsolation("HikariPool-3119");
        hikariConfig1.setCatalog("HikariPool-5061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties2 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig(properties2);
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        hikariConfig3.setInitializationFailFast(true);
        hikariConfig3.setAcquireRetryDelay(1L);
        boolean boolean9 = hikariConfig3.isAutoCommit();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.util.Properties properties12 = hikariConfig11.getDataSourceProperties();
        hikariConfig3.setDataSourceProperties(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setCatalog("HikariPool-2120");
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setMinimumPoolSize(100);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTimeout(5000L);
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-674");
        hikariConfig1.setAcquireRetryDelay(1800000L);
        hikariConfig1.setCatalog("HikariPool-2913");
        java.lang.Class<?> wildcardClass20 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        long long53 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean54 = hikariConfig1.isInitializationFailFast();
        long long55 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1800000L + "'", long55 == 1800000L);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-1465");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        int int27 = hikariConfig20.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig20.getCatalog();
        long long29 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setJdbc4ConnectionTest(false);
        boolean boolean32 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        boolean boolean35 = hikariConfig20.isAutoCommit();
        hikariConfig20.setInitializationFailFast(true);
        hikariConfig20.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-594", (java.lang.Object) hikariConfig20);
        hikariConfig1.setCatalog("HikariPool-7258");
        java.lang.String str43 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-11477" + "'", str15, "HikariPool-11477");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-7258" + "'", str43, "HikariPool-7258");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1639");
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        long long32 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime(0L);
        java.lang.String str35 = hikariConfig1.getCatalog();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource38 = hikariConfig1.getDataSource();
        java.lang.String str39 = hikariConfig1.getConnectionCustomizerClassName();
        int int40 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600000L + "'", long32 == 600000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setCatalog("HikariPool-3407");
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.setDataSourceClassName("HikariPool-9423");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaximumPoolSize(10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10777");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10777 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setTransactionIsolation("HikariPool-143");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1009");
        hikariConfig1.setMaxLifetime((long) (-1));
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8908");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8908 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        int int6 = hikariConfig1.getAcquireIncrement();
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        int int8 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-11559" + "'", str12, "HikariPool-11559");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-1314");
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMaximumPoolSize((int) '#');
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-9655");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setAcquireIncrement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.setAcquireIncrement(3);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        boolean boolean28 = hikariConfig27.isInitializationFailFast();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig27.setDataSource(dataSource29);
        hikariConfig27.setMinimumPoolSize(100);
        hikariConfig27.setMaxLifetime(52L);
        hikariConfig1.addDataSourceProperty("HikariPool-2120", (java.lang.Object) 52L);
        hikariConfig1.setIdleTimeout(600000L);
        java.lang.String str38 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-11630" + "'", str38, "HikariPool-11630");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.lang.String str10 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-11639" + "'", str15, "HikariPool-11639");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long24 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str27 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str29 = hikariConfig1.getDataSourceClassName();
        int int30 = hikariConfig1.getAcquireRetries();
        int int31 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-481" + "'", str29, "HikariPool-481");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either jdbc4ConnectionTest must be enabled or a connectionTestQuery must be specified.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setConnectionInitSql("");
        java.lang.String str25 = hikariConfig15.getCatalog();
        boolean boolean26 = hikariConfig15.isInitializationFailFast();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) boolean26);
        long long28 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setRegisterMbeans(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3904");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3904 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        java.lang.String str4 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionInitSql("HikariPool-1150");
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.setConnectionInitSql("HikariPool-627");
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1951");
        long long9 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        boolean boolean23 = hikariConfig18.isRegisterMbeans();
        hikariConfig18.setIdleTimeout((long) '#');
        hikariConfig1.addDataSourceProperty("HikariPool-6820", (java.lang.Object) hikariConfig18);
        int int27 = hikariConfig18.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        long long27 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties28 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.Class<?> wildcardClass30 = properties28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600000L + "'", long27 == 600000L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        int int5 = hikariConfig1.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        hikariConfig12.setAcquireRetryDelay(1L);
        hikariConfig12.setConnectionTimeout(600000L);
        javax.sql.DataSource dataSource20 = hikariConfig12.getDataSource();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(true);
        boolean boolean26 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str27 = hikariConfig22.getDataSourceClassName();
        boolean boolean28 = hikariConfig22.isJdbc4ConnectionTest();
        java.lang.String str29 = hikariConfig22.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig22.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setMaximumPoolSize(60);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("HikariPool-3285");
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-6131");
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-3529");
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-393");
        int int17 = hikariConfig1.getAcquireIncrement();
        long long18 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionInitSql("HikariPool-7634");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-11775" + "'", str14, "HikariPool-11775");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setRegisterMbeans(true);
        int int21 = hikariConfig5.getMinimumPoolSize();
        int int22 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setPoolName("HikariPool-3904");
        hikariConfig5.setAutoCommit(true);
        boolean boolean27 = hikariConfig5.isInitializationFailFast();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.setRegisterMbeans(false);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties7 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setInitializationFailFast(true);
        java.lang.String str13 = hikariConfig9.getDataSourceClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.setInitializationFailFast(false);
        int int30 = hikariConfig16.getMaximumPoolSize();
        boolean boolean31 = hikariConfig16.isRegisterMbeans();
        hikariConfig16.setJdbc4ConnectionTest(true);
        java.lang.String str34 = hikariConfig16.getConnectionTestQuery();
        java.lang.String str35 = hikariConfig16.getPoolName();
        hikariConfig9.addDataSourceProperty("HikariPool-1244", (java.lang.Object) str35);
        hikariConfig9.setTransactionIsolation("HikariPool-3059");
        hikariConfig9.setConnectionCustomizerClassName("HikariPool-8579");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-11810" + "'", str35, "HikariPool-11810");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setCatalog("HikariPool-143");
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        hikariConfig1.setRegisterMbeans(true);
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig17.getDataSourceProperties();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.util.Properties properties29 = hikariConfig28.getDataSourceProperties();
        hikariConfig17.setDataSourceProperties(properties29);
        java.lang.String str31 = hikariConfig17.getCatalog();
        long long32 = hikariConfig17.getConnectionTimeout();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        int int38 = hikariConfig34.getAcquireRetries();
        long long39 = hikariConfig34.getMaxLifetime();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        javax.sql.DataSource dataSource43 = null;
        hikariConfig41.setDataSource(dataSource43);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isInitializationFailFast();
        hikariConfig46.setInitializationFailFast(true);
        boolean boolean50 = hikariConfig46.isJdbc4ConnectionTest();
        long long51 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setPoolName("hi!");
        hikariConfig46.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties56 = hikariConfig46.getDataSourceProperties();
        hikariConfig41.setDataSourceProperties(properties56);
        hikariConfig34.setDataSourceProperties(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig17.setDataSourceProperties(properties56);
        hikariConfig1.setDataSourceProperties(properties56);
        long long62 = hikariConfig1.getMaxLifetime();
        java.lang.String str63 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5000L + "'", long32 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1800000L + "'", long39 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 5000L + "'", long51 == 5000L);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1800000L + "'", long62 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "HikariPool-11848" + "'", str63, "HikariPool-11848");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        int int12 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean22 = hikariConfig1.isAutoCommit();
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-963");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-963" + "'", str10, "HikariPool-963");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        int int16 = hikariConfig1.getMaximumPoolSize();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-3544");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-700");
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass21 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4013");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4013 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3811");
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize(1);
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setCatalog("HikariPool-2114");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setUseInstrumentation(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig5.getAcquireRetryDelay();
        java.lang.String str19 = hikariConfig5.getConnectionInitSql();
        hikariConfig5.setRegisterMbeans(true);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-859");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1195");
        hikariConfig1.setUseInstrumentation(true);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-6499", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2407");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2407 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setMinimumPoolSize((int) '#');
        int int10 = hikariConfig1.getAcquireRetries();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setPoolName("HikariPool-184");
        hikariConfig1.setDataSourceClassName("HikariPool-1341");
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setDataSourceClassName("HikariPool-3100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        int int27 = hikariConfig20.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig20.getCatalog();
        long long29 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.setConnectionTestQuery("HikariPool-143");
        hikariConfig20.setIdleTimeout((long) (byte) 10);
        java.lang.String str34 = hikariConfig20.getPoolName();
        hikariConfig20.setLeakDetectionThreshold((long) (short) 10);
        hikariConfig20.setMinimumPoolSize(100);
        hikariConfig20.setMinimumPoolSize(0);
        hikariConfig1.addDataSourceProperty("HikariPool-4130", (java.lang.Object) hikariConfig20);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-12063" + "'", str34, "HikariPool-12063");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setCatalog("HikariPool-143");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6716");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-414");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-477");
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setMinimumPoolSize((int) (byte) 1);
        int int26 = hikariConfig13.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) hikariConfig13);
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource30 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-12071" + "'", str10, "HikariPool-12071");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        hikariConfig1.setAcquireRetries(10);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.setDataSource(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3606");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3606 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str10 = hikariConfig1.getCatalog();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        java.lang.String str18 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setDataSourceClassName("");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        int int27 = hikariConfig23.getAcquireRetries();
        long long28 = hikariConfig23.getMaxLifetime();
        hikariConfig23.setMaxLifetime((long) (short) 0);
        long long31 = hikariConfig23.getIdleTimeout();
        boolean boolean32 = hikariConfig23.isRegisterMbeans();
        long long33 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig14.addDataSourceProperty("HikariPool-184", (java.lang.Object) long33);
        javax.sql.DataSource dataSource35 = null;
        hikariConfig14.setDataSource(dataSource35);
        hikariConfig14.setCatalog("HikariPool-674");
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setLeakDetectionThreshold((long) '4');
        java.lang.String str45 = hikariConfig41.getConnectionCustomizerClassName();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        boolean boolean48 = hikariConfig47.isInitializationFailFast();
        hikariConfig47.setInitializationFailFast(true);
        javax.sql.DataSource dataSource51 = null;
        hikariConfig47.setDataSource(dataSource51);
        hikariConfig47.setAcquireRetryDelay((long) 'a');
        java.lang.String str55 = hikariConfig47.getConnectionCustomizerClassName();
        java.util.Properties properties56 = hikariConfig47.getDataSourceProperties();
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        java.util.Properties properties59 = hikariConfig58.getDataSourceProperties();
        hikariConfig47.setDataSourceProperties(properties59);
        hikariConfig41.setDataSourceProperties(properties59);
        java.lang.String str62 = hikariConfig41.getDataSourceClassName();
        hikariConfig41.setConnectionCustomizerClassName("");
        boolean boolean65 = hikariConfig41.isRegisterMbeans();
        hikariConfig41.setMaxLifetime(0L);
        int int68 = hikariConfig41.getMinimumPoolSize();
        hikariConfig14.addDataSourceProperty("HikariPool-1964", (java.lang.Object) int68);
        java.lang.String str70 = hikariConfig14.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-2528", (java.lang.Object) str70);
        hikariConfig1.setPoolName("HikariPool-7034");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 600000L + "'", long31 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        hikariConfig11.setAcquireRetryDelay(1L);
        hikariConfig11.setAcquireIncrement((int) 'a');
        long long19 = hikariConfig11.getMaxLifetime();
        int int20 = hikariConfig11.getMaximumPoolSize();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        hikariConfig23.setAcquireRetryDelay(1L);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig23.setAcquireRetryDelay((long) 10);
        hikariConfig11.addDataSourceProperty("HikariPool-481", (java.lang.Object) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-143", (java.lang.Object) hikariConfig11);
        int int35 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        java.lang.String str24 = hikariConfig7.getConnectionInitSql();
        int int25 = hikariConfig7.getAcquireRetries();
        long long26 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-4383");
        hikariConfig1.setAcquireRetryDelay(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetryDelay((long) 100);
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionInitSql("HikariPool-7984");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        long long20 = hikariConfig1.getMaxLifetime();
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-4601");
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        hikariConfig1.setLeakDetectionThreshold((long) 35);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-9378");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireRetryDelay(52L);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setInitializationFailFast(false);
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.setDataSourceClassName("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig30.setDataSource(dataSource34);
        hikariConfig30.setAcquireRetryDelay((long) 'a');
        java.lang.String str38 = hikariConfig30.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig30.getDataSourceProperties();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.util.Properties properties42 = hikariConfig41.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties42);
        hikariConfig17.setDataSourceProperties(properties42);
        long long45 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setInitializationFailFast(true);
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        boolean boolean51 = hikariConfig50.isInitializationFailFast();
        hikariConfig50.setInitializationFailFast(true);
        javax.sql.DataSource dataSource54 = null;
        hikariConfig50.setDataSource(dataSource54);
        java.lang.String str56 = hikariConfig50.getCatalog();
        int int57 = hikariConfig50.getMinimumPoolSize();
        java.lang.String str58 = hikariConfig50.getCatalog();
        long long59 = hikariConfig50.getLeakDetectionThreshold();
        java.lang.String str60 = hikariConfig50.getConnectionInitSql();
        hikariConfig50.setAcquireIncrement(100);
        int int63 = hikariConfig50.getMinimumPoolSize();
        hikariConfig17.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig50);
        int int65 = hikariConfig50.getMaximumPoolSize();
        hikariConfig50.setConnectionInitSql("");
        hikariConfig1.addDataSourceProperty("HikariPool-2107", (java.lang.Object) "");
        long long69 = hikariConfig1.getConnectionTimeout();
        java.lang.String str70 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5000L + "'", long45 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 60 + "'", int65 == 60);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 5000L + "'", long69 == 5000L);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig1.isRegisterMbeans();
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        int int34 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str35 = hikariConfig1.getConnectionInitSql();
        long long36 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setTransactionIsolation("HikariPool-1843");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: HikariPool-1843");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-859");
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7715");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7715 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setInitializationFailFast(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig17.setDataSource(dataSource21);
        hikariConfig17.setAcquireRetryDelay((long) 'a');
        java.lang.String str25 = hikariConfig17.getConnectionCustomizerClassName();
        java.lang.String str26 = hikariConfig17.getConnectionInitSql();
        boolean boolean27 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.setMaxLifetime((long) (short) 1);
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) (short) 1);
        hikariConfig1.setMaximumPoolSize(10);
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str34 = hikariConfig1.getCatalog();
        int int35 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4530");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4530 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9254");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9254 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaximumPoolSize(0);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig16.setDataSource(dataSource20);
        hikariConfig16.setAcquireRetryDelay((long) 'a');
        java.lang.String str24 = hikariConfig16.getConnectionCustomizerClassName();
        java.util.Properties properties25 = hikariConfig16.getDataSourceProperties();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.util.Properties properties28 = hikariConfig27.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties28);
        int int30 = hikariConfig16.getMinimumPoolSize();
        java.util.Properties properties31 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-3100", (java.lang.Object) hikariConfig16);
        java.lang.Class<?> wildcardClass33 = hikariConfig16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setDataSourceClassName("hi!");
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-7885");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-12367" + "'", str12, "HikariPool-12367");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        hikariConfig1.setAcquireRetries(35);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        hikariConfig20.setCatalog("");
        hikariConfig20.setConnectionTestQuery("");
        long long30 = hikariConfig20.getIdleTimeout();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        int int36 = hikariConfig32.getAcquireRetries();
        long long37 = hikariConfig32.getMaxLifetime();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig39.setDataSource(dataSource41);
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        boolean boolean45 = hikariConfig44.isInitializationFailFast();
        hikariConfig44.setInitializationFailFast(true);
        boolean boolean48 = hikariConfig44.isJdbc4ConnectionTest();
        long long49 = hikariConfig44.getConnectionTimeout();
        hikariConfig44.setPoolName("hi!");
        hikariConfig44.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties54 = hikariConfig44.getDataSourceProperties();
        hikariConfig39.setDataSourceProperties(properties54);
        hikariConfig32.setDataSourceProperties(properties54);
        hikariConfig20.setDataSourceProperties(properties54);
        hikariConfig1.setDataSourceProperties(properties54);
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1800000L + "'", long37 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5000L + "'", long49 == 5000L);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 100);
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        boolean boolean35 = hikariConfig34.isInitializationFailFast();
        hikariConfig34.setInitializationFailFast(true);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig34.setDataSource(dataSource38);
        java.lang.String str40 = hikariConfig34.getCatalog();
        int int41 = hikariConfig34.getMinimumPoolSize();
        java.lang.String str42 = hikariConfig34.getCatalog();
        long long43 = hikariConfig34.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig34.getConnectionInitSql();
        hikariConfig34.setAcquireIncrement(100);
        int int47 = hikariConfig34.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-1195", (java.lang.Object) hikariConfig34);
        int int49 = hikariConfig34.getMaximumPoolSize();
        int int50 = hikariConfig34.getTransactionIsolation();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isInitializationFailFast();
        hikariConfig53.setLeakDetectionThreshold((long) '4');
        java.lang.String str57 = hikariConfig53.getConnectionCustomizerClassName();
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        boolean boolean60 = hikariConfig59.isInitializationFailFast();
        hikariConfig59.setInitializationFailFast(true);
        javax.sql.DataSource dataSource63 = null;
        hikariConfig59.setDataSource(dataSource63);
        hikariConfig59.setAcquireRetryDelay((long) 'a');
        java.lang.String str67 = hikariConfig59.getConnectionCustomizerClassName();
        java.util.Properties properties68 = hikariConfig59.getDataSourceProperties();
        java.util.Properties properties69 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties69);
        java.util.Properties properties71 = hikariConfig70.getDataSourceProperties();
        hikariConfig59.setDataSourceProperties(properties71);
        hikariConfig53.setDataSourceProperties(properties71);
        hikariConfig53.setConnectionInitSql("hi!");
        java.lang.String str76 = hikariConfig53.getConnectionInitSql();
        java.util.Properties properties78 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties78);
        java.util.Properties properties80 = hikariConfig79.getDataSourceProperties();
        int int81 = hikariConfig79.getTransactionIsolation();
        long long82 = hikariConfig79.getIdleTimeout();
        java.lang.String str83 = hikariConfig79.getConnectionInitSql();
        int int84 = hikariConfig79.getMaximumPoolSize();
        hikariConfig79.setConnectionTestQuery("HikariPool-391");
        hikariConfig53.addDataSourceProperty("HikariPool-2188", (java.lang.Object) hikariConfig79);
        hikariConfig53.setAcquireRetries((int) (byte) 1);
        int int90 = hikariConfig53.getMinimumPoolSize();
        hikariConfig34.addDataSourceProperty("HikariPool-4383", (java.lang.Object) hikariConfig53);
        hikariConfig53.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 600000L + "'", long82 == 600000L);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 60 + "'", int84 == 60);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        int int18 = hikariConfig1.getMinimumPoolSize();
        int int19 = hikariConfig1.getAcquireRetries();
        boolean boolean20 = hikariConfig1.isAutoCommit();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setLeakDetectionThreshold((long) '4');
        int int27 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setAcquireRetries(0);
        int int30 = hikariConfig23.getAcquireRetries();
        hikariConfig1.addDataSourceProperty("HikariPool-5382", (java.lang.Object) int30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        int int10 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-3780");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        int int19 = hikariConfig15.getAcquireRetries();
        long long20 = hikariConfig15.getMaxLifetime();
        hikariConfig15.setMaxLifetime((long) (short) 0);
        long long23 = hikariConfig15.getIdleTimeout();
        boolean boolean24 = hikariConfig15.isRegisterMbeans();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setLeakDetectionThreshold((long) '4');
        java.lang.String str30 = hikariConfig26.getConnectionCustomizerClassName();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.setInitializationFailFast(true);
        javax.sql.DataSource dataSource36 = null;
        hikariConfig32.setDataSource(dataSource36);
        hikariConfig32.setAcquireRetryDelay((long) 'a');
        java.lang.String str40 = hikariConfig32.getConnectionCustomizerClassName();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig15.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionInitSql("HikariPool-934");
        long long53 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1341");
        int int15 = hikariConfig1.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        java.lang.String str23 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setAcquireRetryDelay(1L);
        hikariConfig9.setMaximumPoolSize((int) '#');
        java.lang.String str17 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setConnectionInitSql("HikariPool-442");
        hikariConfig1.addDataSourceProperty("HikariPool-2934", (java.lang.Object) "HikariPool-442");
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        int int23 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-12478" + "'", str6, "HikariPool-12478");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-2681");
        long long12 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("HikariPool-11782");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setMaxLifetime((long) (short) 1);
        hikariConfig1.setTransactionIsolation("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setAcquireRetries(0);
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-393");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        hikariConfig1.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setInitializationFailFast(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig24.setDataSource(dataSource28);
        hikariConfig24.setAcquireRetryDelay((long) 'a');
        java.lang.String str32 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties33 = hikariConfig24.getDataSourceProperties();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties36 = hikariConfig35.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties36);
        java.lang.String str38 = hikariConfig24.getCatalog();
        long long39 = hikariConfig24.getConnectionTimeout();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.setInitializationFailFast(true);
        int int45 = hikariConfig41.getAcquireRetries();
        long long46 = hikariConfig41.getMaxLifetime();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        boolean boolean49 = hikariConfig48.isInitializationFailFast();
        javax.sql.DataSource dataSource50 = null;
        hikariConfig48.setDataSource(dataSource50);
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        boolean boolean54 = hikariConfig53.isInitializationFailFast();
        hikariConfig53.setInitializationFailFast(true);
        boolean boolean57 = hikariConfig53.isJdbc4ConnectionTest();
        long long58 = hikariConfig53.getConnectionTimeout();
        hikariConfig53.setPoolName("hi!");
        hikariConfig53.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties63 = hikariConfig53.getDataSourceProperties();
        hikariConfig48.setDataSourceProperties(properties63);
        hikariConfig41.setDataSourceProperties(properties63);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties63);
        hikariConfig24.setDataSourceProperties(properties63);
        hikariConfig24.setMaxLifetime(0L);
        hikariConfig24.setConnectionInitSql("HikariPool-477");
        hikariConfig24.setPoolName("HikariPool-888");
        hikariConfig1.addDataSourceProperty("HikariPool-9294", (java.lang.Object) "HikariPool-888");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5000L + "'", long39 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1800000L + "'", long46 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 5000L + "'", long58 == 5000L);
        org.junit.Assert.assertNotNull(properties63);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setDataSourceClassName("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        hikariConfig25.setInitializationFailFast(true);
        javax.sql.DataSource dataSource29 = null;
        hikariConfig25.setDataSource(dataSource29);
        hikariConfig25.setAcquireRetryDelay((long) 'a');
        java.lang.String str33 = hikariConfig25.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig25.getDataSourceProperties();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.util.Properties properties37 = hikariConfig36.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties37);
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig1.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig41.setAcquireIncrement(60);
        boolean boolean44 = hikariConfig41.isJdbc4ConnectionTest();
        hikariConfig41.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setAcquireRetryDelay((long) 'a');
        java.lang.String str17 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig9.getDataSourceProperties();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.util.Properties properties21 = hikariConfig20.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties21);
        java.lang.String str23 = hikariConfig9.getCatalog();
        long long24 = hikariConfig9.getConnectionTimeout();
        int int25 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setIdleTimeout((long) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-1009", (java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-12546" + "'", str13, "HikariPool-12546");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setAcquireRetries((int) (short) 10);
        hikariConfig1.setPoolName("HikariPool-6728");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setTransactionIsolation("HikariPool-594");
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        long long15 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        long long18 = hikariConfig1.getIdleTimeout();
        int int19 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        long long8 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionTestQuery("HikariPool-3180");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setCatalog("");
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(35);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-3624");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        long long18 = hikariConfig1.getAcquireRetryDelay();
        int int19 = hikariConfig1.getAcquireRetries();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str21 = hikariConfig1.getCatalog();
        java.util.Properties properties22 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setTransactionIsolation("HikariPool-5672");
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        hikariConfig15.setInitializationFailFast(true);
        java.lang.String str19 = hikariConfig15.getConnectionTestQuery();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setDataSourceClassName("hi!");
        hikariConfig15.setConnectionInitSql("");
        java.lang.String str25 = hikariConfig15.getCatalog();
        boolean boolean26 = hikariConfig15.isInitializationFailFast();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) boolean26);
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean30 = hikariConfig1.isInitializationFailFast();
        java.lang.String str31 = hikariConfig1.getConnectionInitSql();
        int int32 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.setIdleTimeout((long) (-1));
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        long long8 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(true);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig11.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig11.getCatalog();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig11.setDataSource(dataSource18);
        int int20 = hikariConfig11.getMaximumPoolSize();
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-1009", (java.lang.Object) true);
        java.lang.String str24 = hikariConfig1.getConnectionTestQuery();
        java.lang.Class<?> wildcardClass25 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaxLifetime((long) (short) 100);
        long long18 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(true);
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setDataSourceClassName("HikariPool-1009");
        hikariConfig1.setConnectionTimeout(2147483647L);
        int int22 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        int int10 = hikariConfig1.getAcquireIncrement();
        int int11 = hikariConfig1.getAcquireRetries();
        int int12 = hikariConfig1.getTransactionIsolation();
        int int13 = hikariConfig1.getAcquireIncrement();
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        long long15 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        java.lang.String str18 = hikariConfig5.getCatalog();
        hikariConfig5.setConnectionTestQuery("HikariPool-4733");
        hikariConfig5.setLeakDetectionThreshold((long) 100);
        long long23 = hikariConfig5.getMaxLifetime();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setConnectionInitSql("HikariPool-184");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(true);
        java.lang.String str33 = hikariConfig29.getConnectionTestQuery();
        hikariConfig29.setDataSourceClassName("");
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        hikariConfig38.setInitializationFailFast(true);
        int int42 = hikariConfig38.getAcquireRetries();
        long long43 = hikariConfig38.getMaxLifetime();
        hikariConfig38.setMaxLifetime((long) (short) 0);
        long long46 = hikariConfig38.getIdleTimeout();
        boolean boolean47 = hikariConfig38.isRegisterMbeans();
        long long48 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig29.addDataSourceProperty("HikariPool-184", (java.lang.Object) long48);
        java.lang.String str50 = hikariConfig29.getCatalog();
        hikariConfig29.setUseInstrumentation(true);
        hikariConfig29.setAutoCommit(true);
        java.lang.String str55 = hikariConfig29.getConnectionCustomizerClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-5933", (java.lang.Object) hikariConfig29);
        hikariConfig1.setTransactionIsolation("HikariPool-3321");
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 600000L + "'", long46 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long24 = hikariConfig23.getLeakDetectionThreshold();
        long long25 = hikariConfig23.getLeakDetectionThreshold();
        int int26 = hikariConfig23.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6355");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6355 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        int int6 = hikariConfig1.getTransactionIsolation();
        long long7 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIdleTimeout((long) 1);
        long long11 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8628");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8628 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        int int3 = hikariConfig1.getTransactionIsolation();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean32 = hikariConfig1.isRegisterMbeans();
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("HikariPool-8063");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5000L + "'", long29 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        hikariConfig20.setAcquireRetryDelay((long) 'a');
        java.lang.String str28 = hikariConfig20.getConnectionCustomizerClassName();
        java.lang.String str29 = hikariConfig20.getConnectionInitSql();
        boolean boolean30 = hikariConfig20.isRegisterMbeans();
        java.lang.String str31 = hikariConfig20.getCatalog();
        java.util.Properties properties32 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceClassName("HikariPool-5962");
        java.lang.String str37 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-12798" + "'", str37, "HikariPool-12798");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        int int31 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setMaxLifetime((long) 0);
        boolean boolean36 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTimeout((long) (short) 0);
        hikariConfig23.setAcquireRetries((int) ' ');
        hikariConfig23.setMinimumPoolSize((int) (short) 1);
        long long30 = hikariConfig23.getIdleTimeout();
        int int31 = hikariConfig23.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 600000L + "'", long30 == 600000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-143");
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5382");
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig8.setDataSource(dataSource10);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.setInitializationFailFast(true);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        long long18 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setPoolName("hi!");
        hikariConfig13.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.setIdleTimeout((long) (byte) 1);
        java.lang.String str29 = hikariConfig26.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig26.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        long long15 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-11630", (java.lang.Object) "HikariPool-1743");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5000L + "'", long18 == 5000L);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.setCatalog("hi!");
        boolean boolean17 = hikariConfig1.isAutoCommit();
        int int18 = hikariConfig1.getTransactionIsolation();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-5061");
        long long22 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-888");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-888 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setMinimumPoolSize((int) '#');
        hikariConfig1.setDataSourceClassName("");
        long long9 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setTransactionIsolation("HikariPool-11119");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.setDataSource(dataSource23);
        long long25 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(35);
        hikariConfig1.setAcquireRetryDelay(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getPoolName();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionInitSql("HikariPool-2424");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-12951" + "'", str12, "HikariPool-12951");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-1465");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-1867");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setAcquireRetryDelay(1L);
        hikariConfig9.setMaximumPoolSize((int) '#');
        java.lang.String str17 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.setConnectionInitSql("HikariPool-442");
        hikariConfig1.addDataSourceProperty("HikariPool-2934", (java.lang.Object) "HikariPool-442");
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        boolean boolean22 = hikariConfig1.isAutoCommit();
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-12973" + "'", str6, "HikariPool-12973");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout(52L);
        hikariConfig1.setAcquireRetries(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        hikariConfig1.setConnectionInitSql("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        int int22 = hikariConfig18.getAcquireRetries();
        long long23 = hikariConfig18.getMaxLifetime();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        javax.sql.DataSource dataSource27 = null;
        hikariConfig25.setDataSource(dataSource27);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.setInitializationFailFast(true);
        boolean boolean34 = hikariConfig30.isJdbc4ConnectionTest();
        long long35 = hikariConfig30.getConnectionTimeout();
        hikariConfig30.setPoolName("hi!");
        hikariConfig30.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties40 = hikariConfig30.getDataSourceProperties();
        hikariConfig25.setDataSourceProperties(properties40);
        hikariConfig18.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.setDataSourceProperties(properties40);
        hikariConfig1.setTransactionIsolation("");
        int int47 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        javax.sql.DataSource dataSource50 = null;
        hikariConfig1.setDataSource(dataSource50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setAcquireRetryDelay((long) (short) 1);
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-663");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(true);
        hikariConfig16.setAcquireRetryDelay(1L);
        hikariConfig16.setConnectionTimeout(600000L);
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-143");
        java.lang.String str26 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties27 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties27);
        java.lang.String str29 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-700");
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-4049");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-13008" + "'", str12, "HikariPool-13008");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getPoolName();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setCatalog("HikariPool-6585");
        long long16 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-13026" + "'", str12, "HikariPool-13026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 600000L + "'", long16 == 600000L);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2473");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11774");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11774 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.util.Properties properties10 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        int int10 = hikariConfig1.getAcquireRetries();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMinimumPoolSize(3);
        hikariConfig1.setAcquireIncrement(100);
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setPoolName("HikariPool-3493");
        int int25 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean30 = hikariConfig1.isInitializationFailFast();
        java.lang.String str31 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAcquireIncrement((int) (short) 0);
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        hikariConfig1.setIdleTimeout(52L);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.util.Properties properties2 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        hikariConfig5.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig5.setDataSource(dataSource9);
        hikariConfig5.setAcquireRetryDelay((long) 'a');
        java.lang.String str13 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig5.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig5);
        hikariConfig1.setDataSourceClassName("hi!");
        long long20 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        java.lang.String str22 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-481");
        hikariConfig1.setInitializationFailFast(true);
        long long29 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean30 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        long long32 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setLeakDetectionThreshold((long) '4');
        java.lang.String str16 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        hikariConfig18.setInitializationFailFast(true);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig18.setDataSource(dataSource22);
        hikariConfig18.setAcquireRetryDelay((long) 'a');
        java.lang.String str26 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties27 = hikariConfig18.getDataSourceProperties();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.util.Properties properties30 = hikariConfig29.getDataSourceProperties();
        hikariConfig18.setDataSourceProperties(properties30);
        hikariConfig12.setDataSourceProperties(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        boolean boolean34 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean35 = hikariConfig1.isRegisterMbeans();
        java.lang.String str36 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setPoolName("HikariPool-627");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.String str16 = hikariConfig1.getPoolName();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-627" + "'", str16, "HikariPool-627");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-184");
        long long9 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        int int13 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setPoolName("HikariPool-700");
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-10436");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 600000L + "'", long6 == 600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        java.lang.String str22 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        hikariConfig28.setInitializationFailFast(true);
        javax.sql.DataSource dataSource32 = null;
        hikariConfig28.setDataSource(dataSource32);
        hikariConfig28.setAcquireRetryDelay((long) 'a');
        java.lang.String str36 = hikariConfig28.getConnectionCustomizerClassName();
        java.lang.String str37 = hikariConfig28.getConnectionInitSql();
        hikariConfig28.setDataSourceClassName("");
        hikariConfig28.setPoolName("HikariPool-627");
        java.util.Properties properties42 = hikariConfig28.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties42);
        hikariConfig1.setMinimumPoolSize(60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setConnectionTestQuery("HikariPool-2114");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-2114" + "'", str16, "HikariPool-2114");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-13150" + "'", str17, "HikariPool-13150");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setAcquireRetryDelay((long) '4');
        long long16 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-442");
        hikariConfig1.setCatalog("HikariPool-627");
        long long22 = hikariConfig1.getMaxLifetime();
        long long23 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600000L + "'", long23 == 600000L);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setTransactionIsolation("");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        boolean boolean7 = hikariConfig6.isInitializationFailFast();
        hikariConfig6.setInitializationFailFast(true);
        java.lang.String str10 = hikariConfig6.getConnectionTestQuery();
        hikariConfig6.setConnectionCustomizerClassName("");
        java.util.Properties properties13 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        hikariConfig1.setAcquireRetryDelay((long) 60);
        java.lang.String str20 = hikariConfig1.getPoolName();
        long long21 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-13174" + "'", str20, "HikariPool-13174");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5000L + "'", long21 == 5000L);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str9 = hikariConfig1.getCatalog();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) (-1));
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        hikariConfig1.setMinimumPoolSize((int) '4');
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-13223" + "'", str11, "HikariPool-13223");
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setPoolName("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getAcquireRetryDelay();
        int int14 = hikariConfig12.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setPoolName("HikariPool-1199");
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setDataSourceClassName("HikariPool-393");
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        long long11 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1341");
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-393" + "'", str10, "HikariPool-393");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.setInitializationFailFast(true);
        int int14 = hikariConfig10.getAcquireRetries();
        long long15 = hikariConfig10.getMaxLifetime();
        hikariConfig10.setMaxLifetime((long) (short) 0);
        long long18 = hikariConfig10.getIdleTimeout();
        boolean boolean19 = hikariConfig10.isRegisterMbeans();
        long long20 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-184", (java.lang.Object) long20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.setDataSource(dataSource22);
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        java.lang.String str26 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-1206");
        hikariConfig1.setConnectionInitSql("HikariPool-11120");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-13257" + "'", str26, "HikariPool-13257");
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-3548");
        boolean boolean12 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        boolean boolean12 = hikariConfig10.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig10.setDataSource(dataSource13);
        long long15 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties16);
        long long18 = hikariConfig1.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 600000L + "'", long18 == 600000L);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        hikariConfig12.setInitializationFailFast(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig12.setDataSource(dataSource16);
        hikariConfig12.setAcquireRetryDelay((long) 'a');
        java.lang.String str20 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionTimeout((long) (short) 0);
        hikariConfig23.setAcquireRetries((int) ' ');
        hikariConfig23.setMaxLifetime((long) 10);
        hikariConfig23.setCatalog("HikariPool-3039");
        int int32 = hikariConfig23.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setInitializationFailFast(true);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.setDataSource(dataSource11);
        hikariConfig7.setAcquireRetryDelay((long) 'a');
        java.lang.String str15 = hikariConfig7.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig7.getDataSourceProperties();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.util.Properties properties19 = hikariConfig18.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties19);
        int int21 = hikariConfig7.getMinimumPoolSize();
        int int22 = hikariConfig7.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-477", (java.lang.Object) hikariConfig7);
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int26 = hikariConfig1.getAcquireRetries();
        int int27 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) false);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setDataSourceClassName("hi!");
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-594");
        int int14 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-13313" + "'", str11, "HikariPool-13313");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig14.setDataSource(dataSource18);
        hikariConfig14.setAcquireRetryDelay((long) 'a');
        java.lang.String str22 = hikariConfig14.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig14.getDataSourceProperties();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.util.Properties properties26 = hikariConfig25.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-393");
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str35 = hikariConfig1.getCatalog();
        int int36 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setPoolName("HikariPool-4668");
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireRetryDelay(1L);
        hikariConfig1.setConnectionTimeout(600000L);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        long long15 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getConnectionTimeout();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str15 = hikariConfig1.getCatalog();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("hi!");
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str11 = hikariConfig1.getCatalog();
        java.lang.String str12 = hikariConfig1.getPoolName();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2833");
        int int16 = hikariConfig1.getAcquireRetries();
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-13348" + "'", str12, "HikariPool-13348");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getConnectionTimeout();
        int int17 = hikariConfig1.getTransactionIsolation();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        int int21 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5000L + "'", long16 == 5000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTimeout(1800000L);
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        java.lang.String str7 = hikariConfig1.getCatalog();
        int int8 = hikariConfig1.getTransactionIsolation();
        int int9 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        long long11 = hikariConfig1.getMaxLifetime();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-12606");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        int int5 = hikariConfig1.getAcquireRetries();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long9 = hikariConfig1.getIdleTimeout();
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        long long11 = hikariConfig1.getMaxLifetime();
        int int12 = hikariConfig1.getTransactionIsolation();
        java.lang.String str13 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.util.Properties properties13 = hikariConfig12.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties13);
        int int15 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireIncrement((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-1150");
        long long21 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        boolean boolean24 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setInitializationFailFast(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig23.setDataSource(dataSource27);
        java.lang.String str29 = hikariConfig23.getCatalog();
        int int30 = hikariConfig23.getMinimumPoolSize();
        boolean boolean31 = hikariConfig23.isJdbc4ConnectionTest();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        boolean boolean34 = hikariConfig33.isInitializationFailFast();
        hikariConfig33.setInitializationFailFast(true);
        hikariConfig33.setAcquireRetryDelay(1L);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        boolean boolean41 = hikariConfig40.isInitializationFailFast();
        hikariConfig40.setTransactionIsolation("hi!");
        java.util.Properties properties44 = hikariConfig40.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig33.setDataSourceProperties(properties44);
        hikariConfig23.setDataSourceProperties(properties44);
        hikariConfig1.setDataSourceProperties(properties44);
        hikariConfig1.setAcquireRetryDelay(10L);
        java.lang.String str51 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaximumPoolSize((int) '4');
        boolean boolean54 = hikariConfig1.isAutoCommit();
        java.util.Properties properties55 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        long long6 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireIncrement(100);
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setPoolName("HikariPool-143");
        hikariConfig1.setPoolName("HikariPool-700");
        int int15 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(true);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig20.setDataSource(dataSource24);
        java.lang.String str26 = hikariConfig20.getCatalog();
        int int27 = hikariConfig20.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig20.getCatalog();
        long long29 = hikariConfig20.getLeakDetectionThreshold();
        boolean boolean30 = hikariConfig20.isRegisterMbeans();
        long long31 = hikariConfig20.getMaxLifetime();
        java.lang.String str32 = hikariConfig20.getConnectionTestQuery();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig20);
        hikariConfig20.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1800000L + "'", long31 == 1800000L);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isRegisterMbeans();
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-3861");
        hikariConfig0.setAcquireRetryDelay(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }
}
